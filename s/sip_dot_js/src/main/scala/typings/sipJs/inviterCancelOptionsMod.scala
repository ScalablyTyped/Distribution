package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inviterCancelOptionsMod {
  
  trait InviterCancelOptions extends StObject {
    
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var reasonPhrase: js.UndefOr[String] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object InviterCancelOptions {
    
    inline def apply(): InviterCancelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviterCancelOptions]
    }
    
    extension [Self <: InviterCancelOptions](x: Self) {
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      inline def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      inline def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
