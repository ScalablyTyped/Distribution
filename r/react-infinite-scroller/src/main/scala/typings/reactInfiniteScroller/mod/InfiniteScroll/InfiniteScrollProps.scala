package typings.reactInfiniteScroller.mod.InfiniteScroll

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <InfiniteScroll /> properties.
  */
@js.native
trait InfiniteScrollProps
  extends AllHTMLAttributes[typings.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll]
     with ClassAttributes[typings.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] {
  
  /**
    * Name of the element that the component should render as.
    * Defaults to 'div'.
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
    */
  var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.native
  
  /**
    * Whether there are more items to be loaded. Event listeners are removed if false.
    * Defaults to false.
    */
  var hasMore: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the component should load the first set of items.
    * Defaults to true.
    */
  var initialLoad: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether new items should be loaded when user scrolls to the top of the scrollable area.
    * Default to false.
    */
  var isReverse: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback for when more items are requested by the user.
    * Page param is next page index.
    */
  def loadMore(page: Double): Unit = js.native
  
  /**
    * Loader component for indicating "loading more".
    */
  var loader: js.UndefOr[ReactElement] = js.native
  
  /**
    * The number of the first page to load, with the default of 0, the first page is 1.
    * Defaults to 0.
    */
  var pageStart: js.UndefOr[Double] = js.native
  
  /**
    * The distance in pixels before the end of the items that will trigger a call to loadMore.
    * Defaults to 250.
    */
  var threshold: js.UndefOr[Double] = js.native
  
  /**
    * Proxy to the useCapture option of the added event listeners.
    * Defaults to false.
    */
  var useCapture: js.UndefOr[Boolean] = js.native
  
  /**
    * Add scroll listeners to the window, or else, the component's parentNode.
    * Defaults to true.
    */
  var useWindow: js.UndefOr[Boolean] = js.native
}
object InfiniteScrollProps {
  
  @scala.inline
  def apply(loadMore: Double => Unit): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction1(loadMore))
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    
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
    def setLoadMore(value: Double => Unit): Self = this.set("loadMore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setGetScrollParent(value: () => HTMLElement | Null): Self = this.set("getScrollParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollParent: Self = this.set("getScrollParent", js.undefined)
    
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMore: Self = this.set("hasMore", js.undefined)
    
    @scala.inline
    def setInitialLoad(value: Boolean): Self = this.set("initialLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLoad: Self = this.set("initialLoad", js.undefined)
    
    @scala.inline
    def setIsReverse(value: Boolean): Self = this.set("isReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReverse: Self = this.set("isReverse", js.undefined)
    
    @scala.inline
    def setLoader(value: ReactElement): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setPageStart(value: Double): Self = this.set("pageStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageStart: Self = this.set("pageStart", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setUseCapture(value: Boolean): Self = this.set("useCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCapture: Self = this.set("useCapture", js.undefined)
    
    @scala.inline
    def setUseWindow(value: Boolean): Self = this.set("useWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWindow: Self = this.set("useWindow", js.undefined)
  }
}
