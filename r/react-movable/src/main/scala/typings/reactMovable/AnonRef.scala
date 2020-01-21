package typings.reactMovable

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var ref: RefObject[_]
}

object AnonRef {
  @scala.inline
  def apply(ref: RefObject[_]): AnonRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}

