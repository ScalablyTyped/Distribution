package typings
package rcDashCalendarLib.rcDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dateInputPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var dateRender: js.UndefOr[
    js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* value */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean]] = js.undefined
  var disabledTime: js.UndefOr[js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, js.Object]] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[/* date */ momentLib.momentMod.momentNs.Moment, /* mode */ Mode, scala.Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderSidebar: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var selectedValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var showDateInput: js.UndefOr[scala.Boolean] = js.undefined
  var showOk: js.UndefOr[scala.Boolean] = js.undefined
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekNumber: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var timePicker: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

