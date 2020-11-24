package typings.reactOverlays.modalManagerMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proper state management for containers and the modals in those containers.
  *
  * @internal Used by the Modal to ensure proper styling of containers.
  */
@js.native
trait ModalManager extends js.Object {
  
  def add(modal: ModalInstance, container: HTMLElement): Double = js.native
  def add(modal: ModalInstance, container: HTMLElement, className: String): Double = js.native
  
  def containerIndexFromModal(modal: ModalInstance): Double = js.native
  
  val containers: js.Array[HTMLElement] = js.native
  
  val data: js.Array[ContainerState] = js.native
  
  val handleContainerOverflow: Boolean = js.native
  
  val hideSiblingNodes: Boolean = js.native
  
  def isContainerOverflowing(modal: ModalInstance): js.Any = js.native
  
  def isTopModal(modal: ModalInstance): Boolean = js.native
  
  val modals: js.Array[ModalInstance] = js.native
  
  def remove(modal: ModalInstance): Unit = js.native
  
  def removeContainerStyle(containerState: ContainerState, container: HTMLElement): Unit = js.native
  
  val scrollbarSize: Double = js.native
  
  def setContainerStyle(containerState: ContainerState, container: HTMLElement): Unit = js.native
}
