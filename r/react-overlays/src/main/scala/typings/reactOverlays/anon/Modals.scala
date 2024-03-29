package typings.reactOverlays.anon

import typings.reactOverlays.esmModalManagerMod.ModalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modals extends StObject {
  
  var isOverflowing: js.UndefOr[Boolean] = js.undefined
  
  var modals: js.Array[ModalInstance]
  
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
}
object Modals {
  
  inline def apply(modals: js.Array[ModalInstance]): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modals] (val x: Self) extends AnyVal {
    
    inline def setIsOverflowing(value: Boolean): Self = StObject.set(x, "isOverflowing", value.asInstanceOf[js.Any])
    
    inline def setIsOverflowingUndefined: Self = StObject.set(x, "isOverflowing", js.undefined)
    
    inline def setModals(value: js.Array[ModalInstance]): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
    
    inline def setModalsVarargs(value: ModalInstance*): Self = StObject.set(x, "modals", js.Array(value*))
    
    inline def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
