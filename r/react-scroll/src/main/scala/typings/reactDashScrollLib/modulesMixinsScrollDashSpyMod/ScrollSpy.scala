package typings
package reactDashScrollLib.modulesMixinsScrollDashSpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSpy extends js.Object {
  var scrollSpyContainers: js.Array[_]
  var spyCallbacks: js.Array[_]
  var spySetState: js.Array[_]
  def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): scala.Unit
  def addStateHandler(handler: js.Any): scala.Unit
  def currentPositionY(scrollSpyContainer: js.Any): scala.Double
  def isMounted(scrollSpyContainer: js.Any): scala.Boolean
  def mount(scrollSpyContainer: js.Any): scala.Unit
  def scrollHandler(scrollSpyContainer: js.Any): scala.Unit
  def unmount(stateHandler: js.Any, spyHandler: js.Any): scala.Unit
  def update(): scala.Unit
  def updateStates(): scala.Unit
}

object ScrollSpy {
  @scala.inline
  def apply(
    addSpyHandler: (js.Any, js.Any) => scala.Unit,
    addStateHandler: js.Any => scala.Unit,
    currentPositionY: js.Any => scala.Double,
    isMounted: js.Any => scala.Boolean,
    mount: js.Any => scala.Unit,
    scrollHandler: js.Any => scala.Unit,
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: (js.Any, js.Any) => scala.Unit,
    update: () => scala.Unit,
    updateStates: () => scala.Unit
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers, spyCallbacks = spyCallbacks, spySetState = spySetState, unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
  
    __obj.asInstanceOf[ScrollSpy]
  }
}

