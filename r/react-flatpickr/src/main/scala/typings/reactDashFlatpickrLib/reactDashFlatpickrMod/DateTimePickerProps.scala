package typings
package reactDashFlatpickrLib.reactDashFlatpickrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof std.Partial<std.HTMLInputElement>, 'value'> ]: std.Partial<std.HTMLInputElement>[P]} */ trait DateTimePickerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onClose: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onDayCreate: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onMonthChange: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onOpen: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onReady: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onValueUpdate: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var onYearChange: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook] = js.undefined
  var options: js.UndefOr[flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Options] = js.undefined
  var render: js.UndefOr[
    js.Function2[
      /* props */ Omit[
        DateTimePickerProps, 
        reactDashFlatpickrLib.reactDashFlatpickrLibStrings.options | reactDashFlatpickrLib.reactDashFlatpickrLibStrings.render
      ], 
      /* ref */ js.Function1[/* node */ stdLib.HTMLInputElement, scala.Unit], 
      reactLib.reactMod.ReactElement
    ]
  ] = js.undefined
  var value: js.UndefOr[
    java.lang.String | stdLib.Date | scala.Double | (js.Array[java.lang.String | stdLib.Date | scala.Double])
  ] = js.undefined
}

object DateTimePickerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: java.lang.String = null,
    onChange: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onClose: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onDayCreate: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onMonthChange: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onOpen: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onReady: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onValueUpdate: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    onYearChange: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Hook = null,
    options: flatpickrLib.flatpickrMod.flatpickrNs.OptionsNs.Options = null,
    render: (/* props */ Omit[
      DateTimePickerProps, 
      reactDashFlatpickrLib.reactDashFlatpickrLibStrings.options | reactDashFlatpickrLib.reactDashFlatpickrLibStrings.render
    ], /* ref */ js.Function1[/* node */ stdLib.HTMLInputElement, scala.Unit]) => reactLib.reactMod.ReactElement = null,
    value: java.lang.String | stdLib.Date | scala.Double | (js.Array[java.lang.String | stdLib.Date | scala.Double]) = null
  ): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onDayCreate != null) __obj.updateDynamic("onDayCreate")(onDayCreate)
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(onMonthChange)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onValueUpdate != null) __obj.updateDynamic("onValueUpdate")(onValueUpdate)
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(onYearChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerProps]
  }
}

