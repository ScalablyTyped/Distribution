package typings.reactRangeslider.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[js.Function1[/* value */ Double, js.UndefOr[String | Double]]] = js.native
  var handleLabel: js.UndefOr[String] = js.native
  var labels: js.UndefOr[NumberDictionary[String]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onChangeComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onChangeStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var orientation: js.UndefOr[String] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
  var value: Double = js.native
}

object SliderProps {
  @scala.inline
  def apply(value: Double): SliderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFormat(value: /* value */ Double => js.UndefOr[String | Double]): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHandleLabel(value: String): Self = this.set("handleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleLabel: Self = this.set("handleLabel", js.undefined)
    @scala.inline
    def setLabels(value: NumberDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeComplete(value: /* value */ Double => Unit): Self = this.set("onChangeComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeComplete: Self = this.set("onChangeComplete", js.undefined)
    @scala.inline
    def setOnChangeStart(value: /* value */ Double => Unit): Self = this.set("onChangeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeStart: Self = this.set("onChangeStart", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

