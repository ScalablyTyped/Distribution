package typings.reactDaterangePicker.mod

import typings.moment.mod.Moment
import typings.momentRange.mod.DateRange
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.SFC
import typings.reactDaterangePicker.anon.MomentRangeNoneinpundefin
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps[T]
  extends typings.react.mod.Props[T] {
  var bemBlock: js.UndefOr[String] = js.native
  var bemNamespace: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var dateStates: js.UndefOr[js.Array[DateState]] = js.native
  var defaultState: js.UndefOr[String] = js.native
  var disableNavigation: js.UndefOr[Boolean] = js.native
  // Use Number Literal Types after TypeScript 2.0 GA released.
  var firstOfWeek: js.UndefOr[Double] = js.native
   // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
  var helpMessage: js.UndefOr[String] = js.native
  var initialDate: js.UndefOr[Date] = js.native
  var initialFromValue: js.UndefOr[Boolean] = js.native
  var initialMonth: js.UndefOr[Double] = js.native
  var initialRange: js.UndefOr[js.Object] = js.native
  var initialYear: js.UndefOr[Double] = js.native
  /**
    * @default moment().locale()
    */
  var locale: js.UndefOr[String] = js.native
  var maximumDate: js.UndefOr[Date] = js.native
  var minimumDate: js.UndefOr[Date] = js.native
  var numberOfCalendars: js.UndefOr[Double] = js.native
  var onHighlightDate: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  var onHighlightRange: js.UndefOr[js.Function1[/* date */ Date, Unit]] = js.native
  var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRangeNoneinpundefin, Unit]] = js.native
  var paginationArrowComponent: js.UndefOr[
    (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
  ] = js.native
  var selectedLabel: js.UndefOr[String] = js.native
  var showLegend: js.UndefOr[Boolean] = js.native
  var singleDateRange: js.UndefOr[Boolean] = js.native
  var stateDefinitions: js.UndefOr[StateDefinitions] = js.native
  var value: js.UndefOr[MomentRangeNoneinpundefin | DateRange | Moment] = js.native
}

object BaseProps {
  @scala.inline
  def apply[T](): BaseProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps[T]]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps[_], T] (val x: Self with BaseProps[T]) extends AnyVal {
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
    def setBemBlock(value: String): Self = this.set("bemBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBemBlock: Self = this.set("bemBlock", js.undefined)
    @scala.inline
    def setBemNamespace(value: String): Self = this.set("bemNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBemNamespace: Self = this.set("bemNamespace", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDateStatesVarargs(value: DateState*): Self = this.set("dateStates", js.Array(value :_*))
    @scala.inline
    def setDateStates(value: js.Array[DateState]): Self = this.set("dateStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateStates: Self = this.set("dateStates", js.undefined)
    @scala.inline
    def setDefaultState(value: String): Self = this.set("defaultState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultState: Self = this.set("defaultState", js.undefined)
    @scala.inline
    def setDisableNavigation(value: Boolean): Self = this.set("disableNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableNavigation: Self = this.set("disableNavigation", js.undefined)
    @scala.inline
    def setFirstOfWeek(value: Double): Self = this.set("firstOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstOfWeek: Self = this.set("firstOfWeek", js.undefined)
    @scala.inline
    def setHelpMessage(value: String): Self = this.set("helpMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpMessage: Self = this.set("helpMessage", js.undefined)
    @scala.inline
    def setInitialDate(value: Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    @scala.inline
    def setInitialFromValue(value: Boolean): Self = this.set("initialFromValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFromValue: Self = this.set("initialFromValue", js.undefined)
    @scala.inline
    def setInitialMonth(value: Double): Self = this.set("initialMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialMonth: Self = this.set("initialMonth", js.undefined)
    @scala.inline
    def setInitialRange(value: js.Object): Self = this.set("initialRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRange: Self = this.set("initialRange", js.undefined)
    @scala.inline
    def setInitialYear(value: Double): Self = this.set("initialYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialYear: Self = this.set("initialYear", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaximumDate(value: Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumDate: Self = this.set("maximumDate", js.undefined)
    @scala.inline
    def setMinimumDate(value: Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumDate: Self = this.set("minimumDate", js.undefined)
    @scala.inline
    def setNumberOfCalendars(value: Double): Self = this.set("numberOfCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfCalendars: Self = this.set("numberOfCalendars", js.undefined)
    @scala.inline
    def setOnHighlightDate(value: /* date */ Date => Unit): Self = this.set("onHighlightDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHighlightDate: Self = this.set("onHighlightDate", js.undefined)
    @scala.inline
    def setOnHighlightRange(value: /* date */ Date => Unit): Self = this.set("onHighlightRange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHighlightRange: Self = this.set("onHighlightRange", js.undefined)
    @scala.inline
    def setOnSelectStart(value: /* value */ MomentRangeNoneinpundefin => Unit): Self = this.set("onSelectStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectStart: Self = this.set("onSelectStart", js.undefined)
    @scala.inline
    def setPaginationArrowComponent(
      value: (ComponentClass[PaginationArrowProps[js.Object], ComponentState]) | SFC[PaginationArrowProps[js.Object]]
    ): Self = this.set("paginationArrowComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationArrowComponent: Self = this.set("paginationArrowComponent", js.undefined)
    @scala.inline
    def setSelectedLabel(value: String): Self = this.set("selectedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedLabel: Self = this.set("selectedLabel", js.undefined)
    @scala.inline
    def setShowLegend(value: Boolean): Self = this.set("showLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegend: Self = this.set("showLegend", js.undefined)
    @scala.inline
    def setSingleDateRange(value: Boolean): Self = this.set("singleDateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleDateRange: Self = this.set("singleDateRange", js.undefined)
    @scala.inline
    def setStateDefinitions(value: StateDefinitions): Self = this.set("stateDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateDefinitions: Self = this.set("stateDefinitions", js.undefined)
    @scala.inline
    def setValue(value: MomentRangeNoneinpundefin | DateRange | Moment): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

