package typings.reactInfinite.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteProps extends Props[Infinite] {
  var className: js.UndefOr[String] = js.undefined
  var containerHeight: js.UndefOr[Double] = js.undefined
  var displayBottomUpwards: js.UndefOr[Boolean] = js.undefined
  var elementHeight: Double | js.Array[Double]
  var handleScroll: js.UndefOr[js.Function1[/* node */ ReactElement, Unit]] = js.undefined
  var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.undefined
  var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.undefined
  var isInfiniteLoading: js.UndefOr[Boolean] = js.undefined
  var loadingSpinnerDelegate: js.UndefOr[ReactElement] = js.undefined
  var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.undefined
  var preloadBatchSize: js.UndefOr[Double | js.Object] = js.undefined
  var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.undefined
  var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
}

object InfiniteProps {
  @scala.inline
  def apply(
    elementHeight: Double | js.Array[Double],
    children: ReactNode = null,
    className: String = null,
    containerHeight: js.UndefOr[Double] = js.undefined,
    displayBottomUpwards: js.UndefOr[Boolean] = js.undefined,
    handleScroll: /* node */ ReactElement => Unit = null,
    infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.undefined,
    infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.undefined,
    isInfiniteLoading: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    loadingSpinnerDelegate: ReactElement = null,
    onInfiniteLoad: () => Unit = null,
    preloadAdditionalHeight: Double | js.Object = null,
    preloadBatchSize: Double | js.Object = null,
    ref: js.UndefOr[Null | LegacyRef[Infinite]] = js.undefined,
    timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.undefined,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  ): InfiniteProps = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(containerHeight)) __obj.updateDynamic("containerHeight")(containerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBottomUpwards)) __obj.updateDynamic("displayBottomUpwards")(displayBottomUpwards.get.asInstanceOf[js.Any])
    if (handleScroll != null) __obj.updateDynamic("handleScroll")(js.Any.fromFunction1(handleScroll))
    if (!js.isUndefined(infiniteLoadBeginBottomOffset)) __obj.updateDynamic("infiniteLoadBeginBottomOffset")(infiniteLoadBeginBottomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteLoadBeginEdgeOffset)) __obj.updateDynamic("infiniteLoadBeginEdgeOffset")(infiniteLoadBeginEdgeOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInfiniteLoading)) __obj.updateDynamic("isInfiniteLoading")(isInfiniteLoading.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loadingSpinnerDelegate != null) __obj.updateDynamic("loadingSpinnerDelegate")(loadingSpinnerDelegate.asInstanceOf[js.Any])
    if (onInfiniteLoad != null) __obj.updateDynamic("onInfiniteLoad")(js.Any.fromFunction0(onInfiniteLoad))
    if (preloadAdditionalHeight != null) __obj.updateDynamic("preloadAdditionalHeight")(preloadAdditionalHeight.asInstanceOf[js.Any])
    if (preloadBatchSize != null) __obj.updateDynamic("preloadBatchSize")(preloadBatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(timeScrollStateLastsForAfterUserScrolls)) __obj.updateDynamic("timeScrollStateLastsForAfterUserScrolls")(timeScrollStateLastsForAfterUserScrolls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteProps]
  }
}

