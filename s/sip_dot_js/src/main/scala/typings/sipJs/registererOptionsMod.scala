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
      * Determines when a re-REGISTER request is sent. The value should be specified as a percentage of the expiration time (between 50 and 99).
      * @defaultValue 99
      */
    var refreshFrequency: js.UndefOr[Double] = js.undefined
    
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
    
    inline def apply(): RegistererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistererOptions]
    }
    
    extension [Self <: RegistererOptions](x: Self) {
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExtraContactHeaderParams(value: js.Array[String]): Self = StObject.set(x, "extraContactHeaderParams", value.asInstanceOf[js.Any])
      
      inline def setExtraContactHeaderParamsUndefined: Self = StObject.set(x, "extraContactHeaderParams", js.undefined)
      
      inline def setExtraContactHeaderParamsVarargs(value: String*): Self = StObject.set(x, "extraContactHeaderParams", js.Array(value*))
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value*))
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
      
      inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
      
      inline def setParams(value: FromTag): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRefreshFrequency(value: Double): Self = StObject.set(x, "refreshFrequency", value.asInstanceOf[js.Any])
      
      inline def setRefreshFrequencyUndefined: Self = StObject.set(x, "refreshFrequency", js.undefined)
      
      inline def setRegId(value: Double): Self = StObject.set(x, "regId", value.asInstanceOf[js.Any])
      
      inline def setRegIdUndefined: Self = StObject.set(x, "regId", js.undefined)
      
      inline def setRegistrar(value: URI): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      inline def setRegistrarUndefined: Self = StObject.set(x, "registrar", js.undefined)
    }
  }
}
