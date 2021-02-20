package typings.sipJs

import typings.sipJs.subscriptionOptionsMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberOptionsMod {
  
  @js.native
  trait SubscriberOptions extends SubscriptionOptions {
    
    var body: js.UndefOr[String] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var expires: js.UndefOr[Double] = js.native
    
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  }
  object SubscriberOptions {
    
    @scala.inline
    def apply(): SubscriberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriberOptions]
    }
    
    @scala.inline
    implicit class SubscriberOptionsMutableBuilder[Self <: SubscriberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    }
  }
}
