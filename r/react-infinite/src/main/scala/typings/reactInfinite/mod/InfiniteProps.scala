package typings.reactInfinite.mod

import typings.react.mod.Props
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteProps extends Props[Infinite] {
  var className: js.UndefOr[String] = js.native
  var containerHeight: js.UndefOr[Double] = js.native
  var displayBottomUpwards: js.UndefOr[Boolean] = js.native
  var elementHeight: Double | js.Array[Double] = js.native
  var handleScroll: js.UndefOr[js.Function1[/* node */ ReactElement, Unit]] = js.native
  var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.native
  var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.native
  var isInfiniteLoading: js.UndefOr[Boolean] = js.native
  var loadingSpinnerDelegate: js.UndefOr[ReactElement] = js.native
  var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.native
  var preloadBatchSize: js.UndefOr[Double | js.Object] = js.native
  var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.native
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
}

object InfiniteProps {
  @scala.inline
  def apply(elementHeight: Double | js.Array[Double]): InfiniteProps = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteProps]
  }
  @scala.inline
  implicit class InfinitePropsOps[Self <: InfiniteProps] (val x: Self) extends AnyVal {
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
    def setElementHeightVarargs(value: Double*): Self = this.set("elementHeight", js.Array(value :_*))
    @scala.inline
    def setElementHeight(value: Double | js.Array[Double]): Self = this.set("elementHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerHeight: Self = this.set("containerHeight", js.undefined)
    @scala.inline
    def setDisplayBottomUpwards(value: Boolean): Self = this.set("displayBottomUpwards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayBottomUpwards: Self = this.set("displayBottomUpwards", js.undefined)
    @scala.inline
    def setHandleScroll(value: /* node */ ReactElement => Unit): Self = this.set("handleScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleScroll: Self = this.set("handleScroll", js.undefined)
    @scala.inline
    def setInfiniteLoadBeginBottomOffset(value: Double): Self = this.set("infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteLoadBeginBottomOffset: Self = this.set("infiniteLoadBeginBottomOffset", js.undefined)
    @scala.inline
    def setInfiniteLoadBeginEdgeOffset(value: Double): Self = this.set("infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteLoadBeginEdgeOffset: Self = this.set("infiniteLoadBeginEdgeOffset", js.undefined)
    @scala.inline
    def setIsInfiniteLoading(value: Boolean): Self = this.set("isInfiniteLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInfiniteLoading: Self = this.set("isInfiniteLoading", js.undefined)
    @scala.inline
    def setLoadingSpinnerDelegate(value: ReactElement): Self = this.set("loadingSpinnerDelegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingSpinnerDelegate: Self = this.set("loadingSpinnerDelegate", js.undefined)
    @scala.inline
    def setOnInfiniteLoad(value: () => Unit): Self = this.set("onInfiniteLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInfiniteLoad: Self = this.set("onInfiniteLoad", js.undefined)
    @scala.inline
    def setPreloadAdditionalHeight(value: Double | js.Object): Self = this.set("preloadAdditionalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadAdditionalHeight: Self = this.set("preloadAdditionalHeight", js.undefined)
    @scala.inline
    def setPreloadBatchSize(value: Double | js.Object): Self = this.set("preloadBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadBatchSize: Self = this.set("preloadBatchSize", js.undefined)
    @scala.inline
    def setTimeScrollStateLastsForAfterUserScrolls(value: Double): Self = this.set("timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeScrollStateLastsForAfterUserScrolls: Self = this.set("timeScrollStateLastsForAfterUserScrolls", js.undefined)
    @scala.inline
    def setUseWindowAsScrollContainer(value: Boolean): Self = this.set("useWindowAsScrollContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWindowAsScrollContainer: Self = this.set("useWindowAsScrollContainer", js.undefined)
  }
  
}

