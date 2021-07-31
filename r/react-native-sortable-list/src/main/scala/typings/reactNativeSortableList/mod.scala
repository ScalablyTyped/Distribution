package typings.reactNativeSortableList

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.PanResponderGestureState
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSortableList.anon.Animated
import typings.reactNativeSortableList.anon.Key
import typings.reactNativeSortableList.anon.X
import typings.reactNativeSortableList.reactNativeSortableListStrings.always
import typings.reactNativeSortableList.reactNativeSortableListStrings.handled
import typings.reactNativeSortableList.reactNativeSortableListStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-sortable-list", JSImport.Default)
  @js.native
  class default[T, K] () extends SortableList[T, K]
  
  type DataByNumber[T] = NumberDictionary[T]
  
  type DataByString[T] = StringDictionary[T]
  
  trait RowProps[T, K] extends StObject {
    
    var active: Boolean
    
    var data: T
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[K] = js.undefined
    
    var toggleRowActive: js.UndefOr[
        js.Function2[
          /* event */ GestureResponderEvent, 
          /* gestureState */ js.UndefOr[PanResponderGestureState], 
          Unit
        ]
      ] = js.undefined
  }
  object RowProps {
    
    @scala.inline
    def apply[T, K](active: Boolean, data: T): RowProps[T, K] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps[T, K]]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps[?, ?], T, K] (val x: Self & (RowProps[T, K])) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setToggleRowActive(
        value: (/* event */ GestureResponderEvent, /* gestureState */ js.UndefOr[PanResponderGestureState]) => Unit
      ): Self = StObject.set(x, "toggleRowActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToggleRowActiveUndefined: Self = StObject.set(x, "toggleRowActive", js.undefined)
    }
  }
  
  @js.native
  trait SortableList[T, K]
    extends Component[SortableListProps[T, K], js.Object, js.Any] {
    
    /**
      * scrolls by a given y offset, either immediately or with a smooth animation
      */
    def scrollBy(hasDxDyAnimated: Animated): Unit = js.native
    
    /**
      * scrolls to a given y offset, either immediately or with a smooth animation
      */
    def scrollTo(hasXYAnimated: X): Unit = js.native
    
    /**
      * scrolls to a given row key, either immediately or with a smooth animation
      */
    def scrollToRowKey(hasKeyAnimated: Key[K]): Unit = js.native
  }
  
  trait SortableListProps[T, K] extends StObject {
    
    /**
      * determines the height for vertical list and the width for horizontal list of the area at the begining and
      * the end of the list that will trigger autoscrolling. Defaults to 60.
      */
    var autoscrollAreaSize: js.UndefOr[Double] = js.undefined
    
    /**
      * these styles will be applied to the inner scroll view content container
      */
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * data source
      */
    var data: DataByNumber[T] | DataByString[T]
    
    /**
      * when true, the SortableList's children are arranged horizontally in a row instead of vertically in a column.
      * The default value is false.
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * these styles will be applied to the inner scroll view content container, excluding the header and footer
      */
    var innerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Determines when the keyboard should stay visible after a tap.
      *  - 'never' (the default), tapping outside of the focused text input when the keyboard is up dismisses
      *    the keyboard. When this happens, children won't receive the tap.
      *  - 'always', the keyboard will not dismiss automatically, and the scroll view will not catch taps, but
      *    children of the scroll view can catch taps.
      *  - 'handled', the keyboard will not dismiss automatically when the tap was handled by a children,
      *    (or captured by an ancestor).
      */
    var keyboardShouldPersistTaps: js.UndefOr[never | always | handled] = js.undefined
    
    /**
      * whether you intend to use the toggleRowActive method to activate a row or use the out of box solution.
      */
    var manuallyActivateRows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called when a row was activated (user long tapped).
      */
    var onActivateRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.undefined
    
    /**
      * Called when rows were reordered, takes an array of rows keys of the next rows order.
      */
    var onChangeOrder: js.UndefOr[js.Function1[/* nextOrder */ js.Array[K], Unit]] = js.undefined
    
    /**
      * Called when a row was pressed.
      */
    var onPressRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.undefined
    
    /**
      * Called when the active row was released.
      */
    var onReleaseRow: js.UndefOr[js.Function2[/* key */ K, /* currentOrder */ js.Array[K], Unit]] = js.undefined
    
    /**
      * an array of keys from data, the order of keys from the array will be used to initial rows order
      */
    var order: js.UndefOr[js.Array[K]] = js.undefined
    
    /**
      * A RefreshControl that works the same way as a ScrollView's refreshControl.
      */
    var refreshControl: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Renders returned component at the bottom of the list.
      */
    var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.undefined
    
    /**
      * Renders returned component at the top of the list.
      */
    var renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.undefined
    
    /**
      * Takes a row key, row index, data entry from the data source and its statuses disabled, active and should
      * return a renderable component to be rendered as the row. The child component will receive a method called
      * toggleRowActive (only if manuallyActivateRows={true}) to manually activate the row. Useful if you have
      * multiple touch responders in your view.
      */
    def renderRow(props: RowProps[T, K]): ReactElement | Null
    
    /**
      * determines time delay in ms before pressed row becomes active. Defaults to 200 ms.
      */
    var rowActivationTime: js.UndefOr[Double] = js.undefined
    
    /**
      * when false, the content does not scrollable. The default value is true.
      */
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * when false, the horizontal scroll indicator will not be visible. The default value is true.
      */
    var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * when false, the vertical scroll indicator will not be visible. The default value is true.
      */
    var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * when false, rows are not sortable. The default value is true.
      */
    var sortingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * style of HOC
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object SortableListProps {
    
    @scala.inline
    def apply[T, K](data: DataByNumber[T] | DataByString[T], renderRow: RowProps[T, K] => ReactElement | Null): SortableListProps[T, K] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
      __obj.asInstanceOf[SortableListProps[T, K]]
    }
    
    @scala.inline
    implicit class SortableListPropsMutableBuilder[Self <: SortableListProps[?, ?], T, K] (val x: Self & (SortableListProps[T, K])) extends AnyVal {
      
      @scala.inline
      def setAutoscrollAreaSize(value: Double): Self = StObject.set(x, "autoscrollAreaSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscrollAreaSizeUndefined: Self = StObject.set(x, "autoscrollAreaSize", js.undefined)
      
      @scala.inline
      def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      @scala.inline
      def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      @scala.inline
      def setData(value: DataByNumber[T] | DataByString[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInnerContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "innerContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainerStyleNull: Self = StObject.set(x, "innerContainerStyle", null)
      
      @scala.inline
      def setInnerContainerStyleUndefined: Self = StObject.set(x, "innerContainerStyle", js.undefined)
      
      @scala.inline
      def setKeyboardShouldPersistTaps(value: never | always | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      @scala.inline
      def setManuallyActivateRows(value: Boolean): Self = StObject.set(x, "manuallyActivateRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManuallyActivateRowsUndefined: Self = StObject.set(x, "manuallyActivateRows", js.undefined)
      
      @scala.inline
      def setOnActivateRow(value: /* key */ K => Unit): Self = StObject.set(x, "onActivateRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActivateRowUndefined: Self = StObject.set(x, "onActivateRow", js.undefined)
      
      @scala.inline
      def setOnChangeOrder(value: /* nextOrder */ js.Array[K] => Unit): Self = StObject.set(x, "onChangeOrder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeOrderUndefined: Self = StObject.set(x, "onChangeOrder", js.undefined)
      
      @scala.inline
      def setOnPressRow(value: /* key */ K => Unit): Self = StObject.set(x, "onPressRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressRowUndefined: Self = StObject.set(x, "onPressRow", js.undefined)
      
      @scala.inline
      def setOnReleaseRow(value: (/* key */ K, /* currentOrder */ js.Array[K]) => Unit): Self = StObject.set(x, "onReleaseRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReleaseRowUndefined: Self = StObject.set(x, "onReleaseRow", js.undefined)
      
      @scala.inline
      def setOrder(value: js.Array[K]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: K*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRefreshControl(value: ReactElement): Self = StObject.set(x, "refreshControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
      
      @scala.inline
      def setRenderFooter(value: () => ReactElement): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: () => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      @scala.inline
      def setRenderRow(value: RowProps[T, K] => ReactElement | Null): Self = StObject.set(x, "renderRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowActivationTime(value: Double): Self = StObject.set(x, "rowActivationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowActivationTimeUndefined: Self = StObject.set(x, "rowActivationTime", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
      
      @scala.inline
      def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
      
      @scala.inline
      def setSortingEnabled(value: Boolean): Self = StObject.set(x, "sortingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingEnabledUndefined: Self = StObject.set(x, "sortingEnabled", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
