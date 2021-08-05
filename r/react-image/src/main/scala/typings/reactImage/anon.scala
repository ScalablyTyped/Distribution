package typings.reactImage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CrossOrigin extends StObject {
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var decode: js.UndefOr[Boolean] = js.undefined
  }
  object CrossOrigin {
    
    inline def apply(): CrossOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOrigin]
    }
    
    extension [Self <: CrossOrigin](x: Self) {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Any
    
    var isLoading: Boolean
    
    var src: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    inline def apply(error: js.Any, isLoading: Boolean): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
