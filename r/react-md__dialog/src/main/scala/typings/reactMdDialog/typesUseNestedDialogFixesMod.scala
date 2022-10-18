package typings.reactMdDialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseNestedDialogFixesMod {
  
  @JSImport("@react-md/dialog/types/useNestedDialogFixes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNestedDialogFixes(hasIdVisibleDisabledPropDisableEscapeClose: Options): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestedDialogFixes")(hasIdVisibleDisabledPropDisableEscapeClose.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait Options extends StObject {
    
    var disableEscapeClose: Boolean
    
    var disabled: Boolean
    
    var id: String
    
    var visible: Boolean
  }
  object Options {
    
    inline def apply(disableEscapeClose: Boolean, disabled: Boolean, id: String, visible: Boolean): Options = {
      val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisableEscapeClose(value: Boolean): Self = StObject.set(x, "disableEscapeClose", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnValue extends StObject {
    
    var disableEscapeClose: Boolean
    
    var disableOverlay: Boolean
  }
  object ReturnValue {
    
    inline def apply(disableEscapeClose: Boolean, disableOverlay: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disableOverlay = disableOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setDisableEscapeClose(value: Boolean): Self = StObject.set(x, "disableEscapeClose", value.asInstanceOf[js.Any])
      
      inline def setDisableOverlay(value: Boolean): Self = StObject.set(x, "disableOverlay", value.asInstanceOf[js.Any])
    }
  }
}
