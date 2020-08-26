package typings.reduxInfiniteScroll.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteScrollerProps extends js.Object {
  var children: js.UndefOr[js.Array[Element]] = js.native
  var containerHeight: js.UndefOr[Double | String] = js.native
  var elementIsScrollable: js.UndefOr[Boolean] = js.native
  var hasMore: js.UndefOr[Boolean] = js.native
  var holderType: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Element]] = js.native
  var loader: js.UndefOr[js.Any] = js.native
  var loadingMore: js.UndefOr[Boolean] = js.native
  var showLoader: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  def loadMore(): Unit = js.native
}

object InfiniteScrollerProps {
  @scala.inline
  def apply(loadMore: () => Unit): InfiniteScrollerProps = {
    val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction0(loadMore))
    __obj.asInstanceOf[InfiniteScrollerProps]
  }
  @scala.inline
  implicit class InfiniteScrollerPropsOps[Self <: InfiniteScrollerProps] (val x: Self) extends AnyVal {
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
    def setLoadMore(value: () => Unit): Self = this.set("loadMore", js.Any.fromFunction0(value))
    @scala.inline
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Element]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setContainerHeight(value: Double | String): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerHeight: Self = this.set("containerHeight", js.undefined)
    @scala.inline
    def setElementIsScrollable(value: Boolean): Self = this.set("elementIsScrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementIsScrollable: Self = this.set("elementIsScrollable", js.undefined)
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMore: Self = this.set("hasMore", js.undefined)
    @scala.inline
    def setHolderType(value: String): Self = this.set("holderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolderType: Self = this.set("holderType", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Element*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Element]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLoader(value: js.Any): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLoadingMore(value: Boolean): Self = this.set("loadingMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingMore: Self = this.set("loadingMore", js.undefined)
    @scala.inline
    def setShowLoader(value: Boolean): Self = this.set("showLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLoader: Self = this.set("showLoader", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

