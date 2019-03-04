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
    addSpyHandler: js.Function2[js.Any, js.Any, scala.Unit],
    addStateHandler: js.Function1[js.Any, scala.Unit],
    currentPositionY: js.Function1[js.Any, scala.Double],
    isMounted: js.Function1[js.Any, scala.Boolean],
    mount: js.Function1[js.Any, scala.Unit],
    scrollHandler: js.Function1[js.Any, scala.Unit],
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: js.Function2[js.Any, js.Any, scala.Unit],
    update: js.Function0[scala.Unit],
    updateStates: js.Function0[scala.Unit]
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(addSpyHandler = addSpyHandler, addStateHandler = addStateHandler, currentPositionY = currentPositionY, isMounted = isMounted, mount = mount, scrollHandler = scrollHandler, scrollSpyContainers = scrollSpyContainers, spyCallbacks = spyCallbacks, spySetState = spySetState, unmount = unmount, update = update, updateStates = updateStates)
  
    __obj.asInstanceOf[ScrollSpy]
  }
}

