package typings.slate

import typings.slate.slateMod.ObjectAndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatchArray extends js.Object {
  var `match`: ObjectAndType | js.Array[ObjectAndType]
}

object Anon_MatchArray {
  @scala.inline
  def apply(`match`: ObjectAndType | js.Array[ObjectAndType]): Anon_MatchArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MatchArray]
  }
}

