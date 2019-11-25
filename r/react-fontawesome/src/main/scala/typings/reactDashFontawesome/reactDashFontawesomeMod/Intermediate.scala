package typings.reactDashFontawesome.reactDashFontawesomeMod

import typings.react.reactMod.AllHTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intermediate extends AllHTMLAttributes[HTMLElement] {
  @JSName("size")
  var size_Intermediate: js.UndefOr[js.Any] = js.undefined
}

object Intermediate {
  @scala.inline
  def apply(AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null, size: js.Any = null): Intermediate = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intermediate]
  }
}

