package typings.scrollbooster.mod

import typings.scrollbooster.anon.PartialScrollBoosterOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollBooster extends js.Object {
  def destroy(): Unit = js.native
  def getState(): ScrollingState = js.native
  def scrollTo(position: Position): Unit = js.native
  def setPosition(position: Position): Unit = js.native
  def updateMetrics(): Unit = js.native
  def updateOptions(options: PartialScrollBoosterOptio): Unit = js.native
}

object ScrollBooster {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getState: () => ScrollingState,
    scrollTo: Position => Unit,
    setPosition: Position => Unit,
    updateMetrics: () => Unit,
    updateOptions: PartialScrollBoosterOptio => Unit
  ): ScrollBooster = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getState = js.Any.fromFunction0(getState), scrollTo = js.Any.fromFunction1(scrollTo), setPosition = js.Any.fromFunction1(setPosition), updateMetrics = js.Any.fromFunction0(updateMetrics), updateOptions = js.Any.fromFunction1(updateOptions))
    __obj.asInstanceOf[ScrollBooster]
  }
  @scala.inline
  implicit class ScrollBoosterOps[Self <: ScrollBooster] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => ScrollingState): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollTo(value: Position => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: Position => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMetrics(value: () => Unit): Self = this.set("updateMetrics", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateOptions(value: PartialScrollBoosterOptio => Unit): Self = this.set("updateOptions", js.Any.fromFunction1(value))
  }
  
}

