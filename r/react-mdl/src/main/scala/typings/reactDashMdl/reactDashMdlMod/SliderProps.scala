package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends MDLHTMLAttributes
     with DOMAttributes[Slider] {
  @JSName("max")
  var max_SliderProps: Double
  @JSName("min")
  var min_SliderProps: Double
  var value: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    DOMAttributes: DOMAttributes[Slider] = null,
    MDLHTMLAttributes: MDLHTMLAttributes = null,
    onChange: FormEvent[Slider] => Unit = null,
    value: Int | Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    js.Dynamic.global.Object.assign(__obj, MDLHTMLAttributes)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

