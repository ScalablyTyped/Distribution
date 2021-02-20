package typings.reactOverlays

import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.Modals
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmModalManagerMod {
  
  /**
    * Proper state management for containers and the modals in those containers.
    *
    * @internal Used by the Modal to ensure proper styling of containers.
    */
  @JSImport("react-overlays/esm/ModalManager", JSImport.Default)
  @js.native
  class default () extends ModalManager {
    def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
  }
  
  type ContainerState = (Record[String, _]) with Modals
  
  @js.native
  trait ModalInstance extends StObject {
    
    var backdrop: Element = js.native
    
    var dialog: Element = js.native
  }
  object ModalInstance {
    
    @scala.inline
    def apply(backdrop: Element, dialog: Element): ModalInstance = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalInstance]
    }
    
    @scala.inline
    implicit class ModalInstanceMutableBuilder[Self <: ModalInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackdrop(value: Element): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: Element): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Proper state management for containers and the modals in those containers.
    *
    * @internal Used by the Modal to ensure proper styling of containers.
    */
  @js.native
  trait ModalManager extends StObject {
    
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
}
