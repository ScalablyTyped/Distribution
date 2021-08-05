package typings.sipJs

import typings.sipJs.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invitationRejectOptionsMod {
  
  trait InvitationRejectOptions extends StObject {
    
    /**
      * Body
      */
    var body: js.UndefOr[String | Body] = js.undefined
    
    /**
      * Array of extra headers added to the response.
      */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Reason phrase for response.
      */
    var reasonPhrase: js.UndefOr[String] = js.undefined
    
    /**
      * Status code for response.
      */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object InvitationRejectOptions {
    
    inline def apply(): InvitationRejectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvitationRejectOptions]
    }
    
    extension [Self <: InvitationRejectOptions](x: Self) {
      
      inline def setBody(value: String | Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
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
