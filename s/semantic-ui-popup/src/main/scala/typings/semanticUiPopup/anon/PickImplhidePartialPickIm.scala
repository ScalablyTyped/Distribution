package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl, 'hide'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.DelaySettings._Impl>> */
trait PickImplhidePartialPickIm
  extends StObject
     with Param {
  
  var hide: Double & js.UndefOr[Double]
  
  var show: js.UndefOr[Double] = js.undefined
}
object PickImplhidePartialPickIm {
  
  inline def apply(hide: Double & js.UndefOr[Double]): PickImplhidePartialPickIm = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhidePartialPickIm]
  }
  
  extension [Self <: PickImplhidePartialPickIm](x: Self) {
    
    inline def setHide(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
