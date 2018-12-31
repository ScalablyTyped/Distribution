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

