package typings.reactScroll.scrollSpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSpy extends js.Object {
  var scrollSpyContainers: js.Array[_]
  var spyCallbacks: js.Array[_]
  var spySetState: js.Array[_]
  def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): Unit
  def addStateHandler(handler: js.Any): Unit
  def currentPositionY(scrollSpyContainer: js.Any): Double
  def isMounted(scrollSpyContainer: js.Any): Boolean
  def mount(scrollSpyContainer: js.Any): Unit
  def scrollHandler(scrollSpyContainer: js.Any): Unit
  def unmount(stateHandler: js.Any, spyHandler: js.Any): Unit
  def update(): Unit
  def updateStates(): Unit
}

object ScrollSpy {
  @scala.inline
  def apply(
    addSpyHandler: (js.Any, js.Any) => Unit,
    addStateHandler: js.Any => Unit,
    currentPositionY: js.Any => Double,
    isMounted: js.Any => Boolean,
    mount: js.Any => Unit,
    scrollHandler: js.Any => Unit,
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: (js.Any, js.Any) => Unit,
    update: () => Unit,
    updateStates: () => Unit
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
    __obj.asInstanceOf[ScrollSpy]
  }
}

