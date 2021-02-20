package typings.sipJs

import typings.sipJs.anon.FromTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherOptionsMod {
  
  @js.native
  trait PublisherOptions extends StObject {
    
    /** @deprecated TODO: provide alternative. */
    var body: js.UndefOr[String] = js.native
    
    /** @deprecated TODO: provide alternative. */
    var contentType: js.UndefOr[String] = js.native
    
    /**
      * Expire value for the published event.
      * @defaultValue 3600
      */
    var expires: js.UndefOr[Double] = js.native
    
    /**
      * Array of extra headers added to the PUBLISH request message.
      */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /** @deprecated TODO: provide alternative. */
    var params: js.UndefOr[FromTag] = js.native
    
    /**
      * If set true, UA will gracefully unpublish for the event on UA close.
      * @defaultValue true
      */
    var unpublishOnClose: js.UndefOr[Boolean] = js.native
  }
  object PublisherOptions {
    
    @scala.inline
    def apply(): PublisherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublisherOptions]
    }
    
    @scala.inline
    implicit class PublisherOptionsMutableBuilder[Self <: PublisherOptions] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setParams(value: FromTag): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setUnpublishOnClose(value: Boolean): Self = StObject.set(x, "unpublishOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpublishOnCloseUndefined: Self = StObject.set(x, "unpublishOnClose", js.undefined)
    }
  }
}
