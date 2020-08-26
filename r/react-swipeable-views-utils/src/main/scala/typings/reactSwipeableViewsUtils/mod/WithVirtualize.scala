package typings.reactSwipeableViewsUtils.mod

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithVirtualize extends js.Object {
  var index: Double = js.native
  var onChangeIndex: OnChangeIndexCallback = js.native
  def slideRenderer(render: SlideRendererCallback): ReactNode = js.native
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
  @scala.inline
  implicit class WithVirtualizeOps[Self <: WithVirtualize] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = this.set("onChangeIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setSlideRenderer(value: SlideRendererCallback => ReactNode): Self = this.set("slideRenderer", js.Any.fromFunction1(value))
  }
  
}

