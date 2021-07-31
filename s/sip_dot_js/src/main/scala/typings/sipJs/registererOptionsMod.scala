package typings.sipJs

import typings.sipJs.anon.FromTag
import typings.sipJs.coreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registererOptionsMod {
  
  trait RegistererOptions extends StObject {
    
    /** Registration expiration time in seconds. */
    var expires: js.UndefOr[Double] = js.undefined
    
    /** Array of extra Contact header parameters. */
    var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Array of extra headers added to the REGISTER. */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * UUID to provide with "+sip.instance" Contact parameter.
      * @defaultValue a randomly generated uuid
      */
    var instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * If true, constructor logs the registerer configuration.
      * @defaultValue `true`
      */
    var logConfiguration: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated TODO: provide alternative. */
    var params: js.UndefOr[FromTag] = js.undefined
    
    /**
      * Value to provide with "reg-id" Contact parameter.
      * @defaultValue 1
      */
    var regId: js.UndefOr[Double] = js.undefined
    
    /**
      * The URI of the registrar to send the REGISTER requests.
      * @defaultValue domain portion of the user agent's uri
      */
    var registrar: js.UndefOr[URI] = js.undefined
  }
  object RegistererOptions {
    
    @scala.inline
    def apply(): RegistererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistererOptions]
    }
    
    @scala.inline
    implicit class RegistererOptionsMutableBuilder[Self <: RegistererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setExtraContactHeaderParams(value: js.Array[String]): Self = StObject.set(x, "extraContactHeaderParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContactHeaderParamsUndefined: Self = StObject.set(x, "extraContactHeaderParams", js.undefined)
      
      @scala.inline
      def setExtraContactHeaderParamsVarargs(value: String*): Self = StObject.set(x, "extraContactHeaderParams", js.Array(value :_*))
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
      
      @scala.inline
      def setParams(value: FromTag): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRegId(value: Double): Self = StObject.set(x, "regId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegIdUndefined: Self = StObject.set(x, "regId", js.undefined)
      
      @scala.inline
      def setRegistrar(value: URI): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
    }
  }
}
