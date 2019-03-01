package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderRowProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
   // string | JSX.Element
  var hideSpacer: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.undefined
}

object HeaderRowProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    hideSpacer: js.UndefOr[scala.Boolean] = js.undefined,
    title: js.Any = null
  ): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(hideSpacer)) __obj.updateDynamic("hideSpacer")(hideSpacer)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HeaderRowProps]
  }
}

