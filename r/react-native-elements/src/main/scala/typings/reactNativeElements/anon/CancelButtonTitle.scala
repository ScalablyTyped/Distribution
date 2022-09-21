package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonTitle extends StObject {
  
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.undefined
  
  var cancelButtonTitle: js.UndefOr[String] = js.undefined
  
  var showCancel: js.UndefOr[Boolean] = js.undefined
}
object CancelButtonTitle {
  
  inline def apply(): CancelButtonTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelButtonTitle]
  }
  
  extension [Self <: CancelButtonTitle](x: Self) {
    
    inline def setCancelButtonProps(value: PartialTouchableOpacityPr): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
    
    inline def setCancelButtonTitle(value: String): Self = StObject.set(x, "cancelButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTitleUndefined: Self = StObject.set(x, "cancelButtonTitle", js.undefined)
    
    inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
  }
}
