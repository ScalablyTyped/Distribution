package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T]
  extends reactLib.reactMod.ReactNs.Props[T] {
  var bemBlock: js.UndefOr[java.lang.String] = js.undefined
  var bemNamespace: js.UndefOr[java.lang.String] = js.undefined
  var dateStates: js.UndefOr[js.Array[DateState]] = js.undefined
  var defaultState: js.UndefOr[java.lang.String] = js.undefined
  var disableNavigation: js.UndefOr[scala.Boolean] = js.undefined
  // Use Number Literal Types after TypeScript 2.0 GA released.
  var firstOfWeek: js.UndefOr[scala.Double] = js.undefined
   // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
  var helpMessage: js.UndefOr[java.lang.String] = js.undefined
  var initialDate: js.UndefOr[stdLib.Date] = js.undefined
  var initialFromValue: js.UndefOr[scala.Boolean] = js.undefined
  var initialMonth: js.UndefOr[scala.Double] = js.undefined
  var initialRange: js.UndefOr[js.Object] = js.undefined
  var initialYear: js.UndefOr[scala.Double] = js.undefined
  var maximumDate: js.UndefOr[stdLib.Date] = js.undefined
  var minimumDate: js.UndefOr[stdLib.Date] = js.undefined
  var numberOfCalendars: js.UndefOr[scala.Double] = js.undefined
  var onHighlightDate: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onHighlightRange: js.UndefOr[js.Function1[/* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, scala.Unit]] = js.undefined
  var onSelectStart: js.UndefOr[
    js.Function1[/* value */ momentDashRangeLib.momentDashRangeMod.MomentRangeExtends, scala.Unit]
  ] = js.undefined
  var paginationArrowComponent: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[PaginationArrowProps[js.Object], reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[PaginationArrowProps[js.Object]]
  ] = js.undefined
  var selectedLabel: js.UndefOr[java.lang.String] = js.undefined
  var selectionType: js.UndefOr[
    reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.single | reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.range
  ] = js.undefined
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  var singleDateRange: js.UndefOr[scala.Boolean] = js.undefined
  var stateDefinitions: js.UndefOr[StateDefinitions] = js.undefined
  var value: js.UndefOr[
    momentDashRangeLib.momentDashRangeMod.MomentRangeExtends | momentDashRangeLib.momentDashRangeMod.DateRange | momentLib.momentMod.momentNs.Moment
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](
    bemBlock: java.lang.String = null,
    bemNamespace: java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    dateStates: js.Array[DateState] = null,
    defaultState: java.lang.String = null,
    disableNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    firstOfWeek: scala.Int | scala.Double = null,
    helpMessage: java.lang.String = null,
    initialDate: stdLib.Date = null,
    initialFromValue: js.UndefOr[scala.Boolean] = js.undefined,
    initialMonth: scala.Int | scala.Double = null,
    initialRange: js.Object = null,
    initialYear: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    maximumDate: stdLib.Date = null,
    minimumDate: stdLib.Date = null,
    numberOfCalendars: scala.Int | scala.Double = null,
    onHighlightDate: js.Function1[/* date */ stdLib.Date, scala.Unit] = null,
    onHighlightRange: js.Function1[/* date */ stdLib.Date, scala.Unit] = null,
    onSelect: js.Function1[/* value */ OnSelectCallbackParam, scala.Unit] = null,
    onSelectStart: js.Function1[/* value */ momentDashRangeLib.momentDashRangeMod.MomentRangeExtends, scala.Unit] = null,
    paginationArrowComponent: (reactLib.reactMod.ReactNs.ComponentClass[PaginationArrowProps[js.Object], reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.SFC[PaginationArrowProps[js.Object]] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[T] = null,
    selectedLabel: java.lang.String = null,
    selectionType: reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.single | reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerLibStrings.range = null,
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    singleDateRange: js.UndefOr[scala.Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: momentDashRangeLib.momentDashRangeMod.MomentRangeExtends | momentDashRangeLib.momentDashRangeMod.DateRange | momentLib.momentMod.momentNs.Moment = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal()
    if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock)
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates)
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState)
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation)
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage)
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate)
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue)
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange)
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate)
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate)
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(onHighlightDate)
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(onHighlightRange)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(onSelectStart)
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange)
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

