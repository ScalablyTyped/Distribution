package typings.slate

import typings.slate.mod.ObjectAndType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatchArray extends js.Object {
  var `match`: ObjectAndType | js.Array[ObjectAndType]
}

object AnonMatchArray {
  @scala.inline
  def apply(`match`: ObjectAndType | js.Array[ObjectAndType]): AnonMatchArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatchArray]
  }
}

