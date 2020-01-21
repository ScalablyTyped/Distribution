package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGProps[T]
  extends SVGAttributes[T]
     with ClassAttributes[T]

object SVGProps {
  @scala.inline
  def apply[T](ClassAttributes: ClassAttributes[T] = null, SVGAttributes: SVGAttributes[T] = null): SVGProps[T] = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    __obj.asInstanceOf[SVGProps[T]]
  }
}

