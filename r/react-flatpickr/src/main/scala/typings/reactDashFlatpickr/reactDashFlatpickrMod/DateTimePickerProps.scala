package typings.reactDashFlatpickr.reactDashFlatpickrMod

import typings.flatpickr.distTypesInstanceMod.Instance
import typings.flatpickr.flatpickrMod.flatpickr.Options.Hook
import typings.flatpickr.flatpickrMod.flatpickr.Options.Options
import typings.react.reactMod.ReactElement
import typings.reactDashFlatpickr.reactDashFlatpickrStrings.options
import typings.reactDashFlatpickr.reactDashFlatpickrStrings.render
import typings.std.Date
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof std.Partial<std.HTMLInputElement>, 'value'> ]: std.Partial<std.HTMLInputElement>[P]} */ trait DateTimePickerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[Hook] = js.undefined
  var onClose: js.UndefOr[Hook] = js.undefined
  var onDayCreate: js.UndefOr[Hook] = js.undefined
  var onMonthChange: js.UndefOr[Hook] = js.undefined
  var onOpen: js.UndefOr[Hook] = js.undefined
  var onReady: js.UndefOr[Hook] = js.undefined
  var onValueUpdate: js.UndefOr[Hook] = js.undefined
  var onYearChange: js.UndefOr[Hook] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var render: js.UndefOr[
    js.Function2[
      /* props */ Omit[
        DateTimePickerProps, 
        options | typings.reactDashFlatpickr.reactDashFlatpickrStrings.render
      ], 
      /* ref */ js.Function1[/* node */ HTMLInputElement, Unit], 
      ReactElement
    ]
  ] = js.undefined
  var value: js.UndefOr[String | Date | Double | (js.Array[String | Date | Double])] = js.undefined
}

object DateTimePickerProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: String = null,
    onChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onClose: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onDayCreate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onMonthChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onOpen: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onReady: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onValueUpdate: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    onYearChange: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit = null,
    options: Options = null,
    render: (/* props */ Omit[DateTimePickerProps, options | render], /* ref */ js.Function1[/* node */ HTMLInputElement, Unit]) => ReactElement = null,
    value: String | Date | Double | (js.Array[String | Date | Double]) = null
  ): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction4(onClose))
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(js.Any.fromFunction4(onDayCreate))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction4(onMonthChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction4(onOpen))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction4(onReady))
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(js.Any.fromFunction4(onValueUpdate))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction4(onYearChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerProps]
  }
}

