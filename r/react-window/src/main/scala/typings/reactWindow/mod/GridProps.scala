package typings.reactWindow.mod

import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.reactWindow.anon.ColumnIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps extends CommonProps {
  
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ComponentType[GridChildComponentProps] = js.native
  
  /**
    * Number of columns in the grid. Note that only a few columns will be rendered and displayed at a time.
    */
  var columnCount: Double = js.native
  
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the grid component.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection] = js.native
  
  /**
    * Height of the grid. This affects the number of rows that will be rendered (and displayed) at any given time.
    */
  var height: Double = js.native
  
  /**
    * Horizontal scroll offset for initial render.
    */
  var initialScrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * Vertical scroll offset for initial render.
    */
  var initialScrollTop: js.UndefOr[Double] = js.native
  
  /**
    * By default, grids will use an item's indices as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your grid does not satisfy the above constraints, use the itemKey property to specify your own keys for items.
    */
  var itemKey: js.UndefOr[GridItemKeySelector] = js.native
  
  /**
    * Called when the items rendered by the grid change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ GridOnItemsRenderedProps, _]] = js.native
  
  /**
    * Called when the grid scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ GridOnScrollProps, _]] = js.native
  
  /**
    * The number of columns to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanColumnCount: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated since version 1.8.2, please use overscanColumnCount
    */
  var overscanColumnsCount: js.UndefOr[Double] = js.native
  
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
  var overscanCount: js.UndefOr[Double] = js.native
  
  /**
    * The number of rows to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, grid overscans by one item.
    */
  var overscanRowCount: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated since version 1.8.2, please use overscanRowCount
    */
  var overscanRowsCount: js.UndefOr[Double] = js.native
  
  /**
    * Number of rows in the grid. Note that only a few rows will be rendered and displayed at a time.
    */
  var rowCount: Double = js.native
  
  /**
    * Width of the grid. This affects the number of columns that will be rendered (and displayed) at any given time.
    */
  var width: Double = js.native
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
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ComponentType[GridChildComponentProps]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: CSSDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setInitialScrollLeft(value: Double): Self = this.set("initialScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScrollLeft: Self = this.set("initialScrollLeft", js.undefined)
    
    @scala.inline
    def setInitialScrollTop(value: Double): Self = this.set("initialScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScrollTop: Self = this.set("initialScrollTop", js.undefined)
    
    @scala.inline
    def setItemKey(value: /* params */ ColumnIndex => Key): Self = this.set("itemKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemKey: Self = this.set("itemKey", js.undefined)
    
    @scala.inline
    def setOnItemsRendered(value: /* props */ GridOnItemsRenderedProps => _): Self = this.set("onItemsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemsRendered: Self = this.set("onItemsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* props */ GridOnScrollProps => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOverscanColumnCount(value: Double): Self = this.set("overscanColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanColumnCount: Self = this.set("overscanColumnCount", js.undefined)
    
    @scala.inline
    def setOverscanColumnsCount(value: Double): Self = this.set("overscanColumnsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanColumnsCount: Self = this.set("overscanColumnsCount", js.undefined)
    
    @scala.inline
    def setOverscanCount(value: Double): Self = this.set("overscanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanCount: Self = this.set("overscanCount", js.undefined)
    
    @scala.inline
    def setOverscanRowCount(value: Double): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanRowCount: Self = this.set("overscanRowCount", js.undefined)
    
    @scala.inline
    def setOverscanRowsCount(value: Double): Self = this.set("overscanRowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanRowsCount: Self = this.set("overscanRowsCount", js.undefined)
  }
}
