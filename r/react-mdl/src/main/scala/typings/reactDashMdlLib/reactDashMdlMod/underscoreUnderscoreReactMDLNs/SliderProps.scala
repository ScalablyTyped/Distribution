package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends MDLHTMLAttributes
     with reactLib.reactMod.ReactNs.DOMAttributes[Slider] {
  @JSName("max")
  var max_SliderProps: scala.Double
  @JSName("min")
  var min_SliderProps: scala.Double
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    max: scala.Double,
    min: scala.Double,
    DOMAttributes: reactLib.reactMod.ReactNs.DOMAttributes[Slider] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    onChange: reactLib.reactMod.ReactNs.FormEventHandler[Slider] = null,
    value: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

