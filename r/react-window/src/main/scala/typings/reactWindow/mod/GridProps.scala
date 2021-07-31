package typings.reactWindow.mod

import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.reactWindow.anon.ColumnIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps
  extends StObject
     with CommonProps {
  
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ComponentType[GridChildComponentProps]
  
  /**
    * Number of columns in the grid. Note that only a few columns will be rendered and displayed at a time.
    */
  var columnCount: Double
  
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the grid component.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection] = js.undefined
  
  /**
    * Height of the grid. This affects the number of rows that will be rendered (and displayed) at any given time.
    */
  var height: Double
  
  /**
    * Horizontal scroll offset for initial render.
    */
  var initialScrollLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical scroll offset for initial render.
    */
  var initialScrollTop: js.UndefOr[Double] = js.undefined
  
  /**
    * By default, grids will use an item's indices as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your grid does not satisfy the above constraints, use the itemKey property to specify your own keys for items.
    */
  var itemKey: js.UndefOr[GridItemKeySelector] = js.undefined
  
  /**
    * Called when the items rendered by the grid change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ GridOnItemsRenderedProps, js.Any]] = js.undefined
  
  /**
    * Called when the grid scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ GridOnScrollProps, js.Any]] = js.undefined
  
  /**
    * The number of columns to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated since version 1.8.2, please use overscanColumnCount
    */
  var overscanColumnsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    *
    * @deprecated since version 1.4.0
    */
  var overscanCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of rows to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated since version 1.8.2, please use overscanRowCount
    */
  var overscanRowsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of rows in the grid. Note that only a few rows will be rendered and displayed at a time.
    */
  var rowCount: Double
  
  /**
    * Width of the grid. This affects the number of columns that will be rendered (and displayed) at any given time.
    */
  var width: Double
}
object GridProps {
  
  @scala.inline
  def apply(
    children: ComponentType[GridChildComponentProps],
    columnCount: Double,
    height: Double,
    rowCount: Double,
    width: Double
  ): GridProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ComponentType[GridChildComponentProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: CSSDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScrollLeft(value: Double): Self = StObject.set(x, "initialScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScrollLeftUndefined: Self = StObject.set(x, "initialScrollLeft", js.undefined)
    
    @scala.inline
    def setInitialScrollTop(value: Double): Self = StObject.set(x, "initialScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScrollTopUndefined: Self = StObject.set(x, "initialScrollTop", js.undefined)
    
    @scala.inline
    def setItemKey(value: /* params */ ColumnIndex => Key): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
    
    @scala.inline
    def setOnItemsRendered(value: /* props */ GridOnItemsRenderedProps => js.Any): Self = StObject.set(x, "onItemsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemsRenderedUndefined: Self = StObject.set(x, "onItemsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* props */ GridOnScrollProps => js.Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOverscanColumnCount(value: Double): Self = StObject.set(x, "overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanColumnCountUndefined: Self = StObject.set(x, "overscanColumnCount", js.undefined)
    
    @scala.inline
    def setOverscanColumnsCount(value: Double): Self = StObject.set(x, "overscanColumnsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanColumnsCountUndefined: Self = StObject.set(x, "overscanColumnsCount", js.undefined)
    
    @scala.inline
    def setOverscanCount(value: Double): Self = StObject.set(x, "overscanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanCountUndefined: Self = StObject.set(x, "overscanCount", js.undefined)
    
    @scala.inline
    def setOverscanRowCount(value: Double): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowCountUndefined: Self = StObject.set(x, "overscanRowCount", js.undefined)
    
    @scala.inline
    def setOverscanRowsCount(value: Double): Self = StObject.set(x, "overscanRowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanRowsCountUndefined: Self = StObject.set(x, "overscanRowsCount", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
