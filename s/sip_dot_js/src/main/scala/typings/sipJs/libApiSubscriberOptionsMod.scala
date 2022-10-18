package typings.sipJs

import typings.sipJs.libApiSubscriptionOptionsMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriberOptionsMod {
  
  trait SubscriberOptions
    extends StObject
       with SubscriptionOptions {
    
    var body: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SubscriberOptions {
    
    inline def apply(): SubscriberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriberOptions]
    }
    
    extension [Self <: SubscriberOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
    }
  }
}
