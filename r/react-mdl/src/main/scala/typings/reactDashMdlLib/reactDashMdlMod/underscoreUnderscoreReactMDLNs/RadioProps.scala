package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[Radio]
     with RippleComponent {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | scala.Double
}

object RadioProps {
  @scala.inline
  def apply(
    value: java.lang.String | scala.Double,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[Radio] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    RippleComponent: RippleComponent = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    name: java.lang.String = null,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[Radio] = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[RadioProps]
  }
}

