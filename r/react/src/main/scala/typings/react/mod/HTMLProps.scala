package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T]

object HTMLProps {
  @scala.inline
  def apply[T](AllHTMLAttributes: AllHTMLAttributes[T] = null, ClassAttributes: ClassAttributes[T] = null): HTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[HTMLProps[T]]
  }
}

