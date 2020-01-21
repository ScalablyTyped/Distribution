package typings.reactOverlays.modalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: typings.reactOverlays.modalMod.^, container: js.Any): Double = js.native
  def add(modal: typings.reactOverlays.modalMod.^, container: js.Any, className: String): Double = js.native
  def containerIndexFromModal(modal: typings.reactOverlays.modalMod.^): Double = js.native
  def isContainerOverflowing(modal: typings.reactOverlays.modalMod.^): Boolean = js.native
  def isTopModal(modal: typings.reactOverlays.modalMod.^): Boolean = js.native
  def remove(modal: typings.reactOverlays.modalMod.^): Unit = js.native
  def removeContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
  def setContainerStyle(containerState: js.Any, container: js.Any): Unit = js.native
}

