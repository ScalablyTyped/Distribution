package typings
package sanctuaryLib.sanctuaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchObj extends js.Object {
  var groups: js.Array[Maybe[java.lang.String]]
  var `match`: java.lang.String
}

object MatchObj {
  @scala.inline
  def apply(groups: js.Array[Maybe[java.lang.String]], `match`: java.lang.String): MatchObj = {
    val __obj = js.Dynamic.literal(groups = groups)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[MatchObj]
  }
}

