package typings.reactDaterangePicker.mod

import typings.moment.mod.Moment
import typings.momentRange.mod.DateRange
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.reactDaterangePicker.anon.MomentRangeNoneinpMomentI
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps[T]
  extends typings.react.mod.Props[T] {
  var bemBlock: js.UndefOr[String] = js.undefined
  var bemNamespace: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
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
  /**
    * @default moment().locale()
    */
  var locale: js.UndefOr[String] = js.undefined
  var maximumDate: js.UndefOr[Date] = js.undefined
  var minimumDate: js.UndefOr[Date] = js.undefined
  var numberOfCalendars: js.UndefOr[Double] = js.undefined
  var onHighlightDate: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onHighlightRange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.undefined
  var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRangeNoneinpMomentI, Unit]] = js.undefined
  var paginationArrowComponent: js.UndefOr[
    (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
  ] = js.undefined
  var selectedLabel: js.UndefOr[String] = js.undefined
  var showLegend: js.UndefOr[Boolean] = js.undefined
  var singleDateRange: js.UndefOr[Boolean] = js.undefined
  var stateDefinitions: js.UndefOr[StateDefinitions] = js.undefined
  var value: js.UndefOr[MomentRangeNoneinpMomentI | DateRange | Moment] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply[T](
    bemBlock: String = null,
    bemNamespace: String = null,
    children: ReactNode = null,
    className: String = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: js.UndefOr[Double] = js.undefined,
    helpMessage: String = null,
    initialDate: Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: js.UndefOr[Double] = js.undefined,
    initialRange: js.Object = null,
    initialYear: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    locale: String = null,
    maximumDate: Date = null,
    minimumDate: Date = null,
    numberOfCalendars: js.UndefOr[Double] = js.undefined,
    onHighlightDate: /* date */ Date => Unit = null,
    onHighlightRange: /* date */ Date => Unit = null,
    onSelectStart: /* value */ MomentRangeNoneinpMomentI => Unit = null,
    paginationArrowComponent: (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]] = null,
    ref: js.UndefOr[Null | LegacyRef[T]] = js.undefined,
    selectedLabel: String = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: MomentRangeNoneinpMomentI | DateRange | Moment = null
  ): BaseProps[T] = {
    val __obj = js.Dynamic.literal()
    if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstOfWeek)) __obj.updateDynamic("firstOfWeek")(firstOfWeek.get.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialMonth)) __obj.updateDynamic("initialMonth")(initialMonth.get.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (!js.isUndefined(initialYear)) __obj.updateDynamic("initialYear")(initialYear.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfCalendars)) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.get.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1(onHighlightDate))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1(onHighlightRange))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1(onSelectStart))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.get.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps[T]]
  }
}

