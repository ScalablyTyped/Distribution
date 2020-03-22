package typings.reactSwipeableViewsUtils.mod

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViews.mod.OnTransitionEndCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithVirtualizeProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.undefined
  var overscanSlideAfter: js.UndefOr[Double] = js.undefined
  var overscanSlideBefore: js.UndefOr[Double] = js.undefined
  var slideCount: js.UndefOr[Double] = js.undefined
  var slideRenderer: SlideRendererCallback
}

object WithVirtualizeProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    slideRenderer: /* render */ SlideRenderProps => ReactNode,
    children: ReactNode = null,
    onTransitionEnd: () => Unit = null,
    overscanSlideAfter: Int | Double = null,
    overscanSlideBefore: Int | Double = null,
    slideCount: Int | Double = null
  ): WithVirtualizeProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (overscanSlideAfter != null) __obj.updateDynamic("overscanSlideAfter")(overscanSlideAfter.asInstanceOf[js.Any])
    if (overscanSlideBefore != null) __obj.updateDynamic("overscanSlideBefore")(overscanSlideBefore.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithVirtualizeProps]
  }
}

