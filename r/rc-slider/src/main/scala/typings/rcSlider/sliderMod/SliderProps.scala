package typings.rcSlider.sliderMod

import typings.rcSlider.anon.AriaLabel
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends js.Object {
  var ariaLabelForHandle: js.UndefOr[String] = js.native
  var ariaLabelledByForHandle: js.UndefOr[String] = js.native
  var ariaValueTextFormatterForHandle: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minimumTrackStyle: js.UndefOr[CSSProperties] = js.native
  var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var startPoint: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  def handle(props: AriaLabel): ReactElement = js.native
}

object SliderProps {
  @scala.inline
  def apply(handle: AriaLabel => ReactElement): SliderProps = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
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
    def setHandle(value: AriaLabel => ReactElement): Self = this.set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def setAriaLabelForHandle(value: String): Self = this.set("ariaLabelForHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelForHandle: Self = this.set("ariaLabelForHandle", js.undefined)
    @scala.inline
    def setAriaLabelledByForHandle(value: String): Self = this.set("ariaLabelledByForHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledByForHandle: Self = this.set("ariaLabelledByForHandle", js.undefined)
    @scala.inline
    def setAriaValueTextFormatterForHandle(value: String): Self = this.set("ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaValueTextFormatterForHandle: Self = this.set("ariaValueTextFormatterForHandle", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinimumTrackStyle(value: CSSProperties): Self = this.set("minimumTrackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackStyle: Self = this.set("minimumTrackStyle", js.undefined)
    @scala.inline
    def setOnAfterChange(value: /* value */ Double => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnBeforeChange(value: /* value */ Double => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setStartPoint(value: Double): Self = this.set("startPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPoint: Self = this.set("startPoint", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

