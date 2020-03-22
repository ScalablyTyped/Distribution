package typings.rcTimePicker

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-time-picker.rc-time-picker.TimePickerProps> */
trait PartialTimePickerProps extends js.Object {
  var addon: js.UndefOr[js.Function1[/* timepicker */ this.type, Element]] = js.undefined
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var clearText: js.UndefOr[String] = js.undefined
  var defaultOpenValue: js.UndefOr[Moment] = js.undefined
  var defaultValue: js.UndefOr[Moment] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputIcon: js.UndefOr[ReactNode] = js.undefined
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* state */ AnonOpen, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* state */ AnonOpen, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var showHour: js.UndefOr[Boolean] = js.undefined
  var showMinute: js.UndefOr[Boolean] = js.undefined
  var showSecond: js.UndefOr[Boolean] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object PartialTimePickerProps {
  @scala.inline
  def apply(
    addon: PartialTimePickerProps => Element = null,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearIcon: ReactNode = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    defaultValue: Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* hour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => js.Array[Double] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    id: String = null,
    inputIcon: ReactNode = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    minuteStep: Int | Double = null,
    onChange: /* value */ Moment => Unit = null,
    onClose: /* state */ AnonOpen => Unit = null,
    onOpen: /* state */ AnonOpen => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    placement: String = null,
    popupClassName: String = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    transitionName: String = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null
  ): PartialTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(js.Any.fromFunction1(addon))
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText.asInstanceOf[js.Any])
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputIcon != null) __obj.updateDynamic("inputIcon")(inputIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTimePickerProps]
  }
}

