package typings.reactDashFa.reactDashFaMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fake intermediate interface to remove typing on size, as the typing
// is overrided by react-fa
trait SizeOverrideHTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("size")
  var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.undefined
}

object SizeOverrideHTMLProps {
  @scala.inline
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    size: js.Any = null
  ): SizeOverrideHTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
  }
}

