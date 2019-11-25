package typings.sanctuary.sanctuaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchObj extends js.Object {
  var groups: js.Array[Maybe[String]]
  var `match`: String
}

object MatchObj {
  @scala.inline
  def apply(groups: js.Array[Maybe[String]], `match`: String): MatchObj = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchObj]
  }
}

