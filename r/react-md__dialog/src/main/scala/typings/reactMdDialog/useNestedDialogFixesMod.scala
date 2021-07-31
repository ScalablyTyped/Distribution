package typings.reactMdDialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNestedDialogFixesMod {
  
  @JSImport("@react-md/dialog/types/useNestedDialogFixes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useNestedDialogFixes(hasIdVisibleDisabledPropDisableEscapeClose: Options): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestedDialogFixes")(hasIdVisibleDisabledPropDisableEscapeClose.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait Options extends StObject {
    
    var disableEscapeClose: Boolean
    
    var disabled: Boolean
    
    var id: String
    
    var visible: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(disableEscapeClose: Boolean, disabled: Boolean, id: String, visible: Boolean): Options = {
      val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableEscapeClose(value: Boolean): Self = StObject.set(x, "disableEscapeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnValue extends StObject {
    
    var disableEscapeClose: Boolean
    
    var disableOverlay: Boolean
  }
  object ReturnValue {
    
    @scala.inline
    def apply(disableEscapeClose: Boolean, disableOverlay: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(disableEscapeClose = disableEscapeClose.asInstanceOf[js.Any], disableOverlay = disableOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableEscapeClose(value: Boolean): Self = StObject.set(x, "disableEscapeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableOverlay(value: Boolean): Self = StObject.set(x, "disableOverlay", value.asInstanceOf[js.Any])
    }
  }
}
