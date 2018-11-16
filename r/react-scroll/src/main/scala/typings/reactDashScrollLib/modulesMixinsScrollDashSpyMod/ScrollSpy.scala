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

