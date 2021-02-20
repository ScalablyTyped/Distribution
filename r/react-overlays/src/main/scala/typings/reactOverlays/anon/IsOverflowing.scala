package typings.reactOverlays.anon

import typings.reactOverlays.modalManagerMod.ModalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsOverflowing extends StObject {
  
  var isOverflowing: js.UndefOr[Boolean] = js.native
  
  var modals: js.Array[ModalInstance] = js.native
  
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}
object IsOverflowing {
  
  @scala.inline
  def apply(modals: js.Array[ModalInstance]): IsOverflowing = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOverflowing]
  }
  
  @scala.inline
  implicit class IsOverflowingMutableBuilder[Self <: IsOverflowing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOverflowing(value: Boolean): Self = StObject.set(x, "isOverflowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOverflowingUndefined: Self = StObject.set(x, "isOverflowing", js.undefined)
    
    @scala.inline
    def setModals(value: js.Array[ModalInstance]): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalsVarargs(value: ModalInstance*): Self = StObject.set(x, "modals", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
