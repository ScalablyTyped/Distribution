package typings.reactElemental.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalState extends StObject {
  
  val modal: HTMLDivElement = js.native
  
  val windowHeight: Double = js.native
  
  val windowWidth: Double = js.native
}
object ModalState {
  
  @scala.inline
  def apply(modal: HTMLDivElement, windowHeight: Double, windowWidth: Double): ModalState = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalState]
  }
  
  @scala.inline
  implicit class ModalStateMutableBuilder[Self <: ModalState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModal(value: HTMLDivElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
