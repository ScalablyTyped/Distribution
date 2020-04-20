package typings.reactSwipeableViewsUtils.mod

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithVirtualize extends js.Object {
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  def slideRenderer(render: SlideRendererCallback): ReactNode
}

object WithVirtualize {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    slideRenderer: SlideRendererCallback => ReactNode
  ): WithVirtualize = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
    __obj.asInstanceOf[WithVirtualize]
  }
}

