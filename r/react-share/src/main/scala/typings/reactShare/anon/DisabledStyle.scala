package typings.reactShare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledStyle extends StObject {
  
  var disabledStyle: Opacity
  
  var openShareDialogOnClick: Boolean
  
  var resetButtonStyle: Boolean
}
object DisabledStyle {
  
  inline def apply(disabledStyle: Opacity, openShareDialogOnClick: Boolean, resetButtonStyle: Boolean): DisabledStyle = {
    val __obj = js.Dynamic.literal(disabledStyle = disabledStyle.asInstanceOf[js.Any], openShareDialogOnClick = openShareDialogOnClick.asInstanceOf[js.Any], resetButtonStyle = resetButtonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledStyle]
  }
  
  extension [Self <: DisabledStyle](x: Self) {
    
    inline def setDisabledStyle(value: Opacity): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setOpenShareDialogOnClick(value: Boolean): Self = StObject.set(x, "openShareDialogOnClick", value.asInstanceOf[js.Any])
    
    inline def setResetButtonStyle(value: Boolean): Self = StObject.set(x, "resetButtonStyle", value.asInstanceOf[js.Any])
  }
}
