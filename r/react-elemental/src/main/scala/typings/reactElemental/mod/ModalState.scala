package typings.reactElemental.mod

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalState extends StObject {
  
  val modal: HTMLDivElement
  
  val windowHeight: Double
  
  val windowWidth: Double
}
object ModalState {
  
  inline def apply(modal: HTMLDivElement, windowHeight: Double, windowWidth: Double): ModalState = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalState]
  }
  
  extension [Self <: ModalState](x: Self) {
    
    inline def setModal(value: HTMLDivElement): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
