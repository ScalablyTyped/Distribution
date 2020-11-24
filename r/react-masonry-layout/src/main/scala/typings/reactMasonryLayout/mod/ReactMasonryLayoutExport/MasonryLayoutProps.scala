package typings.reactMasonryLayout.mod.ReactMasonryLayoutExport

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasonryLayoutProps extends js.Object {
  
  /**
    * The css classname you want to use
    *
    * @default ''
    */
  var className: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  /**
    * The function that used to load more data
    *
    * @default () => {}
    */
  var infiniteScroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * By default, it will listen to the window's scroll event. If you want to listen to some div's scroll event, please set the container's id to it
    *
    * @default 'window'
    */
  var infiniteScrollContainer: js.UndefOr[String] = js.native
  
  /**
    * If you don't want to trigger infiniteScroll, set it to true
    *
    * @default false
    */
  var infiniteScrollDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The distance to trigger infiniteScroll
    *
    * @default 200
    */
  var infiniteScrollDistance: js.UndefOr[Double] = js.native
  
  /**
    * When no more data, please set it to true, then the infiniteScroll will not trigger
    *
    * @default false
    */
  var infiniteScrollEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * Override it if you want to custom the no more data indicator
    *
    * @default <div>no more data</div>
    */
  var infiniteScrollEndIndicator: js.UndefOr[ReactNode] = js.native
  
  /**
    * When you are loading data, please set it to true, then the infiniteScroll will not trigger
    *
    * @default false
    */
  var infiniteScrollLoading: js.UndefOr[Boolean] = js.native
  
  /**
    * Override it if you want to custom the loading spinner
    *
    * @default <div>this is a loader</div>
    */
  var infiniteScrollSpinner: js.UndefOr[ReactNode] = js.native
  
  /**
    * An attribute added to the grid items after they're positioned within the grid. If the attribute is not prefixed with data-, it will be added.
    * @default data-packed
    */
  var packed: js.UndefOr[String] = js.native
  
  /**
    * A boolean, defaulting to true, indicating that the grid items should be positioned using the top and left CSS properties.
    *
    * If set to false, the grid items will be positioned using the transform CSS property.
    *
    * @default false
    */
  var position: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of objects describing the grid's properties at different breakpoints.
    *
    * When defining your sizes, note the following:
    *
    * - Sizes must be listed smallest to largest
    * - Sizes must use min-width media queries (any unit)
    * - Width of the grid items at each breakpoint should be set in your CSS (in px)
    * - The size without the mq property is assumed to be your smallest breakpoint, and must appear first
    * @default [ { columns: 2, gutter: 20 }, { mq: '768px', columns: 3, gutter: 20 }, { mq: '1024px', columns: 6, gutter: 20 } ]
    */
  var sizes: js.UndefOr[js.Array[MasonryLayoutSizes]] = js.native
  
  /**
    * The inline style you want to use
    *
    * @default {}
    */
  var style: js.UndefOr[CSSProperties] = js.native
}
object MasonryLayoutProps {
  
  @scala.inline
  def apply(id: String): MasonryLayoutProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryLayoutProps]
  }
  
  @scala.inline
  implicit class MasonryLayoutPropsOps[Self <: MasonryLayoutProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInfiniteScroll(value: () => Unit): Self = this.set("infiniteScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInfiniteScroll: Self = this.set("infiniteScroll", js.undefined)
    
    @scala.inline
    def setInfiniteScrollContainer(value: String): Self = this.set("infiniteScrollContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollContainer: Self = this.set("infiniteScrollContainer", js.undefined)
    
    @scala.inline
    def setInfiniteScrollDisabled(value: Boolean): Self = this.set("infiniteScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollDisabled: Self = this.set("infiniteScrollDisabled", js.undefined)
    
    @scala.inline
    def setInfiniteScrollDistance(value: Double): Self = this.set("infiniteScrollDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollDistance: Self = this.set("infiniteScrollDistance", js.undefined)
    
    @scala.inline
    def setInfiniteScrollEnd(value: Boolean): Self = this.set("infiniteScrollEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollEnd: Self = this.set("infiniteScrollEnd", js.undefined)
    
    @scala.inline
    def setInfiniteScrollEndIndicator(value: ReactNode): Self = this.set("infiniteScrollEndIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollEndIndicator: Self = this.set("infiniteScrollEndIndicator", js.undefined)
    
    @scala.inline
    def setInfiniteScrollLoading(value: Boolean): Self = this.set("infiniteScrollLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollLoading: Self = this.set("infiniteScrollLoading", js.undefined)
    
    @scala.inline
    def setInfiniteScrollSpinner(value: ReactNode): Self = this.set("infiniteScrollSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfiniteScrollSpinner: Self = this.set("infiniteScrollSpinner", js.undefined)
    
    @scala.inline
    def setPacked(value: String): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacked: Self = this.set("packed", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: MasonryLayoutSizes*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[MasonryLayoutSizes]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
