package typings.rbx

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsElementType extends js.Object {
  var as: ElementType[_]
}

object AnonAsElementType {
  @scala.inline
  def apply(as: ElementType[_]): AnonAsElementType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsElementType]
  }
}

