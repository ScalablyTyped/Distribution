package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popupVisible'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl>> */
trait PickImplpopupVisibleParti
  extends StObject
     with Param {
  
  var loading: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[String] = js.undefined
  
  var popupVisible: String & js.UndefOr[String]
  
  var position: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplpopupVisibleParti {
  
  inline def apply(popupVisible: String & js.UndefOr[String]): PickImplpopupVisibleParti = {
    val __obj = js.Dynamic.literal(popupVisible = popupVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupVisibleParti]
  }
  
  extension [Self <: PickImplpopupVisibleParti](x: Self) {
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPopupVisible(value: String & js.UndefOr[String]): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
