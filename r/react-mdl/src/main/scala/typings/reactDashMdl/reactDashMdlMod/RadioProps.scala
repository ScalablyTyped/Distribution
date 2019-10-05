package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends MDLHTMLAttributes
     with DOMAttributes[Radio]
     with RippleComponent {
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: String | Double
}

object RadioProps {
  @scala.inline
  def apply(
    value: String | Double,
    DOMAttributes: DOMAttributes[Radio] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    RippleComponent: RippleComponent = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    onChange: FormEvent[Radio] => Unit = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, RippleComponent)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RadioProps]
  }
}

