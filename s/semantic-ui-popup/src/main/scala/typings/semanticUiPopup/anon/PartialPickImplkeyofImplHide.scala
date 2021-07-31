package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl>> */
trait PartialPickImplkeyofImplHide extends StObject {
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Double] = js.undefined
}
object PartialPickImplkeyofImplHide {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplHideMutableBuilder[Self <: PartialPickImplkeyofImplHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
