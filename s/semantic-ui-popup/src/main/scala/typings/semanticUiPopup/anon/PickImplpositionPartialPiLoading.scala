package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'position'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
trait PickImplpositionPartialPiLoading
  extends StObject
     with Param {
  
  var loading: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[String] = js.undefined
  
  var popupVisible: js.UndefOr[String] = js.undefined
  
  var position: String
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplpositionPartialPiLoading {
  
  inline def apply(position: String): PickImplpositionPartialPiLoading = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpositionPartialPiLoading]
  }
  
  extension [Self <: PickImplpositionPartialPiLoading](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
