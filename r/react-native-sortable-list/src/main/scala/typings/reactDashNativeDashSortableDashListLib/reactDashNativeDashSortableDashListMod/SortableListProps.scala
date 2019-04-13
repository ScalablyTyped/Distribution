package typings
package reactDashNativeDashSortableDashListLib.reactDashNativeDashSortableDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableListProps extends js.Object {
  /**
    * determines the height for vertical list and the width for horizontal list of the area at the begining and
    * the end of the list that will trigger autoscrolling. Defaults to 60.
    */
  var autoscrollAreaSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * these styles will be applied to the inner scroll view content container
    */
  var contentContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * data source
    */
  var data: reactDashNativeDashSortableDashListLib.Data
  /**
    * when true, the SortableList's children are arranged horizontally in a row instead of vertically in a column.
    * The default value is false.
    */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * these styles will be applied to the inner scroll view content container, excluding the header and footer
    */
  var innerContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * whether you intend to use the toggleRowActive method to activate a row or use the out of box solution.
    */
  var manuallyActivateRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when a row was activated (user long tapped).
    */
  var onActivateRow: js.UndefOr[
    js.Function1[/* key */ reactDashNativeDashSortableDashListLib.DataKey, scala.Unit]
  ] = js.undefined
  /**
    * Called when rows were reordered, takes an array of rows keys of the next rows order.
    */
  var onChangeOrder: js.UndefOr[
    js.Function1[
      /* nextOrder */ js.Array[reactDashNativeDashSortableDashListLib.DataKey], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when a row was pressed.
    */
  var onPressRow: js.UndefOr[
    js.Function1[/* key */ reactDashNativeDashSortableDashListLib.DataKey, scala.Unit]
  ] = js.undefined
  /**
    * Called when the active row was released.
    */
  var onReleaseRow: js.UndefOr[
    js.Function1[/* key */ reactDashNativeDashSortableDashListLib.DataKey, scala.Unit]
  ] = js.undefined
  /**
    * an array of keys from data, the order of keys from the array will be used to initial rows order
    */
  var order: js.UndefOr[js.Array[reactDashNativeDashSortableDashListLib.DataKey]] = js.undefined
  /**
    * A RefreshControl that works the same way as a ScrollView's refreshControl.
    */
  var refreshControl: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Renders returned component at the bottom of the list.
    */
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Renders returned component at the top of the list.
    */
  var renderHeader: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * determines time delay in ms before pressed row becomes active. Defaults to 200 ms.
    */
  var rowActivationTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * when false, the content does not scrollable. The default value is true.
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when false, the horizontal scroll indicator will not be visible. The default value is true.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when false, the vertical scroll indicator will not be visible. The default value is true.
    */
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when false, rows are not sortable. The default value is true.
    */
  var sortingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * style of HOC
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Takes a row key, row index, data entry from the data source and its statuses disabled, active and should
    * return a renderable component to be rendered as the row. The child component will receive a method called
    * toggleRowActive (only if manuallyActivateRows={true}) to manually activate the row. Useful if you have
    * multiple touch responders in your view.
    */
  def renderRow(props: RowProps): reactLib.reactMod.Global.JSXNs.Element
}

object SortableListProps {
  @scala.inline
  def apply(
    data: reactDashNativeDashSortableDashListLib.Data,
    renderRow: RowProps => reactLib.reactMod.Global.JSXNs.Element,
    autoscrollAreaSize: scala.Int | scala.Double = null,
    contentContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    innerContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    manuallyActivateRows: js.UndefOr[scala.Boolean] = js.undefined,
    onActivateRow: /* key */ reactDashNativeDashSortableDashListLib.DataKey => scala.Unit = null,
    onChangeOrder: /* nextOrder */ js.Array[reactDashNativeDashSortableDashListLib.DataKey] => scala.Unit = null,
    onPressRow: /* key */ reactDashNativeDashSortableDashListLib.DataKey => scala.Unit = null,
    onReleaseRow: /* key */ reactDashNativeDashSortableDashListLib.DataKey => scala.Unit = null,
    order: js.Array[reactDashNativeDashSortableDashListLib.DataKey] = null,
    refreshControl: reactLib.reactMod.Global.JSXNs.Element = null,
    renderFooter: () => reactLib.reactMod.Global.JSXNs.Element = null,
    renderHeader: () => reactLib.reactMod.Global.JSXNs.Element = null,
    rowActivationTime: scala.Int | scala.Double = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    sortingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): SortableListProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    if (autoscrollAreaSize != null) __obj.updateDynamic("autoscrollAreaSize")(autoscrollAreaSize.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (innerContainerStyle != null) __obj.updateDynamic("innerContainerStyle")(innerContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(manuallyActivateRows)) __obj.updateDynamic("manuallyActivateRows")(manuallyActivateRows)
    if (onActivateRow != null) __obj.updateDynamic("onActivateRow")(js.Any.fromFunction1(onActivateRow))
    if (onChangeOrder != null) __obj.updateDynamic("onChangeOrder")(js.Any.fromFunction1(onChangeOrder))
    if (onPressRow != null) __obj.updateDynamic("onPressRow")(js.Any.fromFunction1(onPressRow))
    if (onReleaseRow != null) __obj.updateDynamic("onReleaseRow")(js.Any.fromFunction1(onReleaseRow))
    if (order != null) __obj.updateDynamic("order")(order)
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (rowActivationTime != null) __obj.updateDynamic("rowActivationTime")(rowActivationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator)
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator)
    if (!js.isUndefined(sortingEnabled)) __obj.updateDynamic("sortingEnabled")(sortingEnabled)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableListProps]
  }
}

