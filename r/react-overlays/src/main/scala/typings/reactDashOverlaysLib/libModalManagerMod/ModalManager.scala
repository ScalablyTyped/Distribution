package typings
package reactDashOverlaysLib.libModalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: reactDashOverlaysLib.libModalMod.namespaced, container: js.Any): scala.Double = js.native
  def add(modal: reactDashOverlaysLib.libModalMod.namespaced, container: js.Any, className: java.lang.String): scala.Double = js.native
  def containerIndexFromModal(modal: reactDashOverlaysLib.libModalMod.namespaced): scala.Double = js.native
  def isContainerOverflowing(modal: reactDashOverlaysLib.libModalMod.namespaced): scala.Boolean = js.native
  def isTopModal(modal: reactDashOverlaysLib.libModalMod.namespaced): scala.Boolean = js.native
  def remove(modal: reactDashOverlaysLib.libModalMod.namespaced): scala.Unit = js.native
  def removeContainerStyle(containerState: js.Any, container: js.Any): scala.Unit = js.native
  def setContainerStyle(containerState: js.Any, container: js.Any): scala.Unit = js.native
}

