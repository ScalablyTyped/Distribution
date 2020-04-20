package typings.scrollbooster.mod

import typings.scrollbooster.PartialScrollBoosterOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBooster extends js.Object {
  def destroy(): Unit
  def getState(): ScrollingState
  def scrollTo(position: Position): Unit
  def setPosition(position: Position): Unit
  def updateMetrics(): Unit
  def updateOptions(options: PartialScrollBoosterOptio): Unit
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
}

