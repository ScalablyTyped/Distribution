package typings.reactDashOverlays.libModalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: typings.reactDashOverlays.libModalMod.^, container: js.Any): Double = js.native
  def add(modal: typings.reactDashOverlays.libModalMod.^, container: js.Any, className: String): Double = js.native
  def containerIndexFromModal(modal: typings.reactDashOverlays.libModalMod.^): Double = js.native
  def isContainerOverflowing(modal: typings.reactDashOverlays.libModalMod.^): Boolean = js.native
  def isTopModal(modal: typings.reactDashOverlays.libModalMod.^): Boolean = js.native
  def remove(modal: typings.reactDashOverlays.libModalMod.^): Unit = js.native
  def removeContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
  def setContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
}

