package typings.reactNativeSortableList.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSortableList.reactNativeSortableListStrings.always
import typings.reactNativeSortableList.reactNativeSortableListStrings.handled
import typings.reactNativeSortableList.reactNativeSortableListStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableListProps[T, K] extends js.Object {
  
  /**
    * determines the height for vertical list and the width for horizontal list of the area at the begining and
    * the end of the list that will trigger autoscrolling. Defaults to 60.
    */
  var autoscrollAreaSize: js.UndefOr[Double] = js.native
  
  /**
    * these styles will be applied to the inner scroll view content container
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * data source
    */
  var data: DataByNumber[T] | DataByString[T] = js.native
  
  /**
    * when true, the SortableList's children are arranged horizontally in a row instead of vertically in a column.
    * The default value is false.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * these styles will be applied to the inner scroll view content container, excluding the header and footer
    */
  var innerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Determines when the keyboard should stay visible after a tap.
    *  - 'never' (the default), tapping outside of the focused text input when the keyboard is up dismisses
    *    the keyboard. When this happens, children won't receive the tap.
    *  - 'always', the keyboard will not dismiss automatically, and the scroll view will not catch taps, but
    *    children of the scroll view can catch taps.
    *  - 'handled', the keyboard will not dismiss automatically when the tap was handled by a children,
    *    (or captured by an ancestor).
    */
  var keyboardShouldPersistTaps: js.UndefOr[never | always | handled] = js.native
  
  /**
    * whether you intend to use the toggleRowActive method to activate a row or use the out of box solution.
    */
  var manuallyActivateRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when a row was activated (user long tapped).
    */
  var onActivateRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.native
  
  /**
    * Called when rows were reordered, takes an array of rows keys of the next rows order.
    */
  var onChangeOrder: js.UndefOr[js.Function1[/* nextOrder */ js.Array[K], Unit]] = js.native
  
  /**
    * Called when a row was pressed.
    */
  var onPressRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.native
  
  /**
    * Called when the active row was released.
    */
  var onReleaseRow: js.UndefOr[js.Function2[/* key */ K, /* currentOrder */ js.Array[K], Unit]] = js.native
  
  /**
    * an array of keys from data, the order of keys from the array will be used to initial rows order
    */
  var order: js.UndefOr[js.Array[K]] = js.native
  
  /**
    * A RefreshControl that works the same way as a ScrollView's refreshControl.
    */
  var refreshControl: js.UndefOr[ReactElement] = js.native
  
  /**
    * Renders returned component at the bottom of the list.
    */
  var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  /**
    * Renders returned component at the top of the list.
    */
  var renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  /**
    * Takes a row key, row index, data entry from the data source and its statuses disabled, active and should
    * return a renderable component to be rendered as the row. The child component will receive a method called
    * toggleRowActive (only if manuallyActivateRows={true}) to manually activate the row. Useful if you have
    * multiple touch responders in your view.
    */
  def renderRow(props: RowProps[T, K]): ReactElement | Null = js.native
  
  /**
    * determines time delay in ms before pressed row becomes active. Defaults to 200 ms.
    */
  var rowActivationTime: js.UndefOr[Double] = js.native
  
  /**
    * when false, the content does not scrollable. The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * when false, the horizontal scroll indicator will not be visible. The default value is true.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * when false, the vertical scroll indicator will not be visible. The default value is true.
    */
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * when false, rows are not sortable. The default value is true.
    */
  var sortingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * style of HOC
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object SortableListProps {
  
  @scala.inline
  def apply[T, K](data: DataByNumber[T] | DataByString[T], renderRow: RowProps[T, K] => ReactElement | Null): SortableListProps[T, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[SortableListProps[T, K]]
  }
  
  @scala.inline
  implicit class SortableListPropsOps[Self <: SortableListProps[_, _], T, K] (val x: Self with (SortableListProps[T, K])) extends AnyVal {
    
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
    def setData(value: DataByNumber[T] | DataByString[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderRow(value: RowProps[T, K] => ReactElement | Null): Self = this.set("renderRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoscrollAreaSize(value: Double): Self = this.set("autoscrollAreaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscrollAreaSize: Self = this.set("autoscrollAreaSize", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setInnerContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("innerContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerContainerStyle: Self = this.set("innerContainerStyle", js.undefined)
    
    @scala.inline
    def setInnerContainerStyleNull: Self = this.set("innerContainerStyle", null)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: never | always | handled): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setManuallyActivateRows(value: Boolean): Self = this.set("manuallyActivateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManuallyActivateRows: Self = this.set("manuallyActivateRows", js.undefined)
    
    @scala.inline
    def setOnActivateRow(value: /* key */ K => Unit): Self = this.set("onActivateRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivateRow: Self = this.set("onActivateRow", js.undefined)
    
    @scala.inline
    def setOnChangeOrder(value: /* nextOrder */ js.Array[K] => Unit): Self = this.set("onChangeOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeOrder: Self = this.set("onChangeOrder", js.undefined)
    
    @scala.inline
    def setOnPressRow(value: /* key */ K => Unit): Self = this.set("onPressRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressRow: Self = this.set("onPressRow", js.undefined)
    
    @scala.inline
    def setOnReleaseRow(value: (/* key */ K, /* currentOrder */ js.Array[K]) => Unit): Self = this.set("onReleaseRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReleaseRow: Self = this.set("onReleaseRow", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: K*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[K]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRefreshControl(value: ReactElement): Self = this.set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshControl: Self = this.set("refreshControl", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: () => ReactElement): Self = this.set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: () => ReactElement): Self = this.set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    
    @scala.inline
    def setRowActivationTime(value: Double): Self = this.set("rowActivationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowActivationTime: Self = this.set("rowActivationTime", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = this.set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsHorizontalScrollIndicator: Self = this.set("showsHorizontalScrollIndicator", js.undefined)
    
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    
    @scala.inline
    def setSortingEnabled(value: Boolean): Self = this.set("sortingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingEnabled: Self = this.set("sortingEnabled", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
