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

