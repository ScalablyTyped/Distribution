package typings
package reactDashFontawesomeLib.reactDashFontawesomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intermediate
  extends reactLib.reactMod.AllHTMLAttributes[stdLib.HTMLElement] {
  @JSName("size")
  var size_Intermediate: js.UndefOr[js.Any] = js.undefined
}

object Intermediate {
  @scala.inline
  def apply(
    AllHTMLAttributes: reactLib.reactMod.AllHTMLAttributes[stdLib.HTMLElement] = null,
    size: js.Any = null
  ): Intermediate = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Intermediate]
  }
}

