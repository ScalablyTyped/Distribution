package typings.rbx.anon

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsElementType extends js.Object {
  var as: ElementType[_]
}

object AsElementType {
  @scala.inline
  def apply(as: ElementType[_]): AsElementType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsElementType]
  }
}

