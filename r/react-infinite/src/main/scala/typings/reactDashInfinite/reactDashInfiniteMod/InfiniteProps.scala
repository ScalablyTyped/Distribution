package typings.reactDashInfinite.reactDashInfiniteMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
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
    containerHeight: Int | Double = null,
    displayBottomUpwards: js.UndefOr[Boolean] = js.undefined,
    handleScroll: /* node */ ReactElement => Unit = null,
    infiniteLoadBeginBottomOffset: Int | Double = null,
    infiniteLoadBeginEdgeOffset: Int | Double = null,
    isInfiniteLoading: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    loadingSpinnerDelegate: ReactElement = null,
    onInfiniteLoad: () => Unit = null,
    preloadAdditionalHeight: Double | js.Object = null,
    preloadBatchSize: Double | js.Object = null,
    ref: LegacyRef[Infinite] = null,
    timeScrollStateLastsForAfterUserScrolls: Int | Double = null,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  ): InfiniteProps = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBottomUpwards)) __obj.updateDynamic("displayBottomUpwards")(displayBottomUpwards)
    if (handleScroll != null) __obj.updateDynamic("handleScroll")(js.Any.fromFunction1(handleScroll))
    if (infiniteLoadBeginBottomOffset != null) __obj.updateDynamic("infiniteLoadBeginBottomOffset")(infiniteLoadBeginBottomOffset.asInstanceOf[js.Any])
    if (infiniteLoadBeginEdgeOffset != null) __obj.updateDynamic("infiniteLoadBeginEdgeOffset")(infiniteLoadBeginEdgeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(isInfiniteLoading)) __obj.updateDynamic("isInfiniteLoading")(isInfiniteLoading)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loadingSpinnerDelegate != null) __obj.updateDynamic("loadingSpinnerDelegate")(loadingSpinnerDelegate)
    if (onInfiniteLoad != null) __obj.updateDynamic("onInfiniteLoad")(js.Any.fromFunction0(onInfiniteLoad))
    if (preloadAdditionalHeight != null) __obj.updateDynamic("preloadAdditionalHeight")(preloadAdditionalHeight.asInstanceOf[js.Any])
    if (preloadBatchSize != null) __obj.updateDynamic("preloadBatchSize")(preloadBatchSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (timeScrollStateLastsForAfterUserScrolls != null) __obj.updateDynamic("timeScrollStateLastsForAfterUserScrolls")(timeScrollStateLastsForAfterUserScrolls.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer)
    __obj.asInstanceOf[InfiniteProps]
  }
}

