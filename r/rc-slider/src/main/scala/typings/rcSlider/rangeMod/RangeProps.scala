package typings.rcSlider.rangeMod

import typings.rcSlider.anon.AriaLabel
import typings.rcSlider.anon.Label
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeProps extends js.Object {
  var allowCross: js.UndefOr[Boolean] = js.native
  var ariaLabelGroupForHandles: js.UndefOr[String] = js.native
  var ariaLabelledByGroupForHandles: js.UndefOr[String] = js.native
  var ariaValueTextFormatterGroupForHandles: js.UndefOr[String] = js.native
  var count: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[js.Array[Double]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var handle: js.Function1[/* props */ AriaLabel, ReactElement] = js.native
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var marks: js.UndefOr[Record[Double, ReactNode | Label]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var pushable: Boolean = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Array[Double]] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object RangeProps {
  @scala.inline
  def apply(handle: /* props */ AriaLabel => ReactElement, pushable: Boolean): RangeProps = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), pushable = pushable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
  @scala.inline
  implicit class RangePropsOps[Self <: RangeProps] (val x: Self) extends AnyVal {
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
    def setHandle(value: /* props */ AriaLabel => ReactElement): Self = this.set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def setPushable(value: Boolean): Self = this.set("pushable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowCross(value: Boolean): Self = this.set("allowCross", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCross: Self = this.set("allowCross", js.undefined)
    @scala.inline
    def setAriaLabelGroupForHandles(value: String): Self = this.set("ariaLabelGroupForHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelGroupForHandles: Self = this.set("ariaLabelGroupForHandles", js.undefined)
    @scala.inline
    def setAriaLabelledByGroupForHandles(value: String): Self = this.set("ariaLabelledByGroupForHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledByGroupForHandles: Self = this.set("ariaLabelledByGroupForHandles", js.undefined)
    @scala.inline
    def setAriaValueTextFormatterGroupForHandles(value: String): Self = this.set("ariaValueTextFormatterGroupForHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaValueTextFormatterGroupForHandles: Self = this.set("ariaValueTextFormatterGroupForHandles", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: Double*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[Double]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
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
    def setMarks(value: Record[Double, ReactNode | Label]): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnAfterChange(value: /* value */ js.Array[Double] => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnBeforeChange(value: /* value */ js.Array[Double] => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
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
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

