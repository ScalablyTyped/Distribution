package typings.reactWindow.mod

import typings.react.mod.ComponentType
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProps[T]
  extends StObject
     with CommonProps[T] {
  
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ComponentType[ListChildComponentProps[T]]
  
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the list component.
    *
    * Specifying "horizontal" or "vertical" for this value is deprecated. Use "layout" prop instead.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection | Direction] = js.undefined
  
  /**
    * Height of the list.
    *
    * For vertical lists, this must be a number. It affects the number of rows that will be rendered (and displayed) at any given time.
    *
    * For horizontal lists, this can be a number or a string (e.g. "50%").
    */
  var height: Double | String
  
  /**
    * Scroll offset for initial render.
    *
    * For vertical lists, this affects scrollTop. For horizontal lists, this affects scrollLeft.
    */
  var initialScrollOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Total number of items in the list. Note that only a few items will be rendered and displayed at a time.
    */
  var itemCount: Double
  
  /**
    * By default, lists will use an item's index as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your list does not satisfy the above constraints, use the itemKey property to specify your own keys for items
    */
  var itemKey: js.UndefOr[ListItemKeySelector[T]] = js.undefined
  
  /**
    * Layout/orientation of the list.
    *
    * Acceptable values are:
    * - "vertical" (default) - Up/down scrolling.
    * - "horizontal" - Left/right scrolling.
    *
    * Note that lists may scroll in both directions (depending on CSS) but content will only be windowed in the layout direction specified.
    */
  var layout: js.UndefOr[Layout] = js.undefined
  
  /**
    * Called when the items rendered by the list change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ ListOnItemsRenderedProps, Any]] = js.undefined
  
  /**
    * Called when the list scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ ListOnScrollProps, Any]] = js.undefined
  
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, List overscans by one item.
    */
  var overscanCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the list.
    *
    * For horizontal lists, this must be a number. It affects the number of columns that will be rendered (and displayed) at any given time.
    *
    * For vertical lists, this can be a number or a string (e.g. "50%").
    */
  var width: Double | String
}
object ListProps {
  
  inline def apply[T](
    children: ComponentType[ListChildComponentProps[T]],
    height: Double | String,
    itemCount: Double,
    width: Double | String
  ): ListProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProps[?], T] (val x: Self & ListProps[T]) extends AnyVal {
    
    inline def setChildren(value: ComponentType[ListChildComponentProps[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: CSSDirection | Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInitialScrollOffset(value: Double): Self = StObject.set(x, "initialScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setInitialScrollOffsetUndefined: Self = StObject.set(x, "initialScrollOffset", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemKey(value: (/* index */ Double, T) => Key): Self = StObject.set(x, "itemKey", js.Any.fromFunction2(value))
    
    inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => Any): Self = StObject.set(x, "onItemsRendered", js.Any.fromFunction1(value))
    
    inline def setOnItemsRenderedUndefined: Self = StObject.set(x, "onItemsRendered", js.undefined)
    
    inline def setOnScroll(value: /* props */ ListOnScrollProps => Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOverscanCount(value: Double): Self = StObject.set(x, "overscanCount", value.asInstanceOf[js.Any])
    
    inline def setOverscanCountUndefined: Self = StObject.set(x, "overscanCount", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
