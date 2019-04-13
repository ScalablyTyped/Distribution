package typings
package reactDashFaLib.reactDashFaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fake intermediate interface to remove typing on size, as the typing
// is overrided by react-fa
trait SizeOverrideHTMLProps[T]
  extends reactLib.reactMod.HTMLProps[T] {
  @JSName("size")
  var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.undefined
}

object SizeOverrideHTMLProps {
  @scala.inline
  def apply[T](HTMLProps: reactLib.reactMod.HTMLProps[T] = null, size: js.Any = null): SizeOverrideHTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
  }
}

