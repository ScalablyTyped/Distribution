package typings.reactReduxToastr

import typings.reactReduxToastr.mod.ConfirmToastrCustomOptions
import typings.reactReduxToastr.mod.ConfirmToastrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CancelText extends StObject {
    
    var cancelText: String
    
    var okText: String
  }
  object CancelText {
    
    inline def apply(cancelText: String, okText: String): CancelText = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelText] (val x: Self) extends AnyVal {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var message: String
    
    var options: ConfirmToastrOptions | ConfirmToastrCustomOptions
    
    var show: Boolean
  }
  object Id {
    
    inline def apply(
      id: String,
      message: String,
      options: ConfirmToastrOptions | ConfirmToastrCustomOptions,
      show: Boolean
    ): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ConfirmToastrOptions | ConfirmToastrCustomOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
