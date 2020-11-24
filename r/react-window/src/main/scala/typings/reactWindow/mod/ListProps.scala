package typings.reactWindow.mod

import typings.react.mod.ComponentType
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProps extends CommonProps {
  
  /**
    * React component responsible for rendering the individual item specified by an index prop. This component also receives a style prop (used for positioning).
    *
    * If useIsScrolling is enabled for the list, the component also receives an additional isScrolling boolean prop.
    */
  var children: ComponentType[ListChildComponentProps] = js.native
  
  /**
    * Determines the direction of text and horizontal scrolling.
    *
    * This property also automatically sets the CSS direction style for the list component.
    *
    * Specifying "horizontal" or "vertical" for this value is deprecated. Use "layout" prop instead.
    *
    * @default "ltr"
    */
  var direction: js.UndefOr[CSSDirection | Direction] = js.native
  
  /**
    * Height of the list.
    *
    * For vertical lists, this must be a number. It affects the number of rows that will be rendered (and displayed) at any given time.
    *
    * For horizontal lists, this can be a number or a string (e.g. "50%").
    */
  var height: Double | String = js.native
  
  /**
    * Scroll offset for initial render.
    *
    * For vertical lists, this affects scrollTop. For horizontal lists, this affects scrollLeft.
    */
  var initialScrollOffset: js.UndefOr[Double] = js.native
  
  /**
    * Total number of items in the list. Note that only a few items will be rendered and displayed at a time.
    */
  var itemCount: Double = js.native
  
  /**
    * By default, lists will use an item's index as its key. This is okay if:
    *
    * - Your collections of items is never sorted or modified
    * - Your item renderer is not stateful and does not extend PureComponent
    *
    * If your list does not satisfy the above constraints, use the itemKey property to specify your own keys for items
    */
  var itemKey: js.UndefOr[ListItemKeySelector] = js.native
  
  /**
    * Layout/orientation of the list.
    *
    * Acceptable values are:
    * - "vertical" (default) - Up/down scrolling.
    * - "horizontal" - Left/right scrolling.
    *
    * Note that lists may scroll in both directions (depending on CSS) but content will only be windowed in the layout direction specified.
    */
  var layout: js.UndefOr[Layout] = js.native
  
  /**
    * Called when the items rendered by the list change.
    */
  var onItemsRendered: js.UndefOr[js.Function1[/* props */ ListOnItemsRenderedProps, _]] = js.native
  
  /**
    * Called when the list scroll positions changes, as a result of user scrolling or scroll-to method calls.
    */
  var onScroll: js.UndefOr[js.Function1[/* props */ ListOnScrollProps, _]] = js.native
  
  /**
    * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
    *
    * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
    * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
    *
    * Note that overscanning too much can negatively impact performance. By default, List overscans by one item.
    */
  var overscanCount: js.UndefOr[Double] = js.native
  
  /**
    * Width of the list.
    *
    * For horizontal lists, this must be a number. It affects the number of columns that will be rendered (and displayed) at any given time.
    *
    * For vertical lists, this can be a number or a string (e.g. "50%").
    */
  var width: Double | String = js.native
}
object ListProps {
  
  @scala.inline
  def apply(
    children: ComponentType[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    width: Double | String
  ): ListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
  
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ComponentType[ListChildComponentProps]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: CSSDirection | Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setInitialScrollOffset(value: Double): Self = this.set("initialScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScrollOffset: Self = this.set("initialScrollOffset", js.undefined)
    
    @scala.inline
    def setItemKey(value: (/* index */ Double, /* data */ js.Any) => Key): Self = this.set("itemKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemKey: Self = this.set("itemKey", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => _): Self = this.set("onItemsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemsRendered: Self = this.set("onItemsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* props */ ListOnScrollProps => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOverscanCount(value: Double): Self = this.set("overscanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanCount: Self = this.set("overscanCount", js.undefined)
  }
}
