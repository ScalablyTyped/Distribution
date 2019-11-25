package typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerMod

import typings.moment.momentMod.Moment
import typings.momentDashRange.momentDashRangeMod.DateRange
import typings.momentDashRange.momentDashRangeMod.MomentRange
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SFC
import typings.reactDashDaterangeDashPicker.Anon_CalendarFormat
import typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerStrings.range
import typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerStrings.single
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T]
  extends typings.react.reactMod.Props[T] {
  var bemBlock: js.UndefOr[String] = js.undefined
  var bemNamespace: js.UndefOr[String] = js.undefined
  var dateStates: js.UndefOr[js.Array[DateState]] = js.undefined
  var defaultState: js.UndefOr[String] = js.undefined
  var disableNavigation: js.UndefOr[Boolean] = js.undefined
  // Use Number Literal Types after TypeScript 2.0 GA released.
  var firstOfWeek: js.UndefOr[Double] = js.undefined
   // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
  var helpMessage: js.UndefOr[String] = js.undefined
  var initialDate: js.UndefOr[Date] = js.undefined
  var initialFromValue: js.UndefOr[Boolean] = js.undefined
  var initialMonth: js.UndefOr[Double] = js.undefined
  var initialRange: js.UndefOr[js.Object] = js.undefined
  var initialYear: js.UndefOr[Double] = js.undefined
  var maximumDate: js.UndefOr[Date] = js.undefined
  var minimumDate: js.UndefOr[Date] = js.undefined
  var numberOfCalendars: js.UndefOr[Double] = js.undefined
  var onHighlightDate: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onHighlightRange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ OnSelectCallbackParam, Unit]] = js.undefined
  var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRange with Anon_CalendarFormat, Unit]] = js.undefined
  var paginationArrowComponent: js.UndefOr[
    (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
  ] = js.undefined
  var selectedLabel: js.UndefOr[String] = js.undefined
  var selectionType: js.UndefOr[single | range] = js.undefined
  var showLegend: js.UndefOr[Boolean] = js.undefined
  var singleDateRange: js.UndefOr[Boolean] = js.undefined
  var stateDefinitions: js.UndefOr[StateDefinitions] = js.undefined
  var value: js.UndefOr[(MomentRange with Anon_CalendarFormat) | DateRange | Moment] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](
    bemBlock: String = null,
    bemNamespace: String = null,
    children: ReactNode = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: Int | Double = null,
    helpMessage: String = null,
    initialDate: Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: Int | Double = null,
    initialRange: js.Object = null,
    initialYear: Int | Double = null,
    key: Key = null,
    maximumDate: Date = null,
    minimumDate: Date = null,
    numberOfCalendars: Int | Double = null,
    onHighlightDate: /* date */ Date => Unit = null,
    onHighlightRange: /* date */ Date => Unit = null,
    onSelect: /* value */ OnSelectCallbackParam => Unit = null,
    onSelectStart: /* value */ MomentRange with Anon_CalendarFormat => Unit = null,
    paginationArrowComponent: (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]] = null,
    ref: LegacyRef[T] = null,
    selectedLabel: String = null,
    selectionType: single | range = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: (MomentRange with Anon_CalendarFormat) | DateRange | Moment = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal()
    if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.asInstanceOf[js.Any])
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1(onHighlightDate))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1(onHighlightRange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1(onSelectStart))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

