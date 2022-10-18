package typings.rockset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCodegenConfigurationMod {
  
  @JSImport("rockset/dist/codegen/configuration", "Configuration")
  @js.native
  open class Configuration () extends StObject {
    def this(param: ConfigurationParameters) = this()
    
    /**
      * parameter for oauth2 security
      * @param name security name
      * @param scopes oauth2 scope
      * @memberof Configuration
      */
    var accessToken: js.UndefOr[
        String | (js.Function2[/* name */ String, /* scopes */ js.UndefOr[js.Array[String]], String])
      ] = js.native
    
    /**
      * parameter for apiKey security
      * @param name security name
      * @memberof Configuration
      */
    var apiKey: js.UndefOr[String | (js.Function1[/* name */ String, String])] = js.native
    
    /**
      * override base path
      *
      * @type {string}
      * @memberof Configuration
      */
    var basePath: js.UndefOr[String] = js.native
    
    /**
      * parameter for basic security
      *
      * @type {string}
      * @memberof Configuration
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * parameter for basic security
      *
      * @type {string}
      * @memberof Configuration
      */
    var username: js.UndefOr[String] = js.native
  }
  
  trait ConfigurationParameters extends StObject {
    
    var accessToken: js.UndefOr[
        String | (js.Function2[/* name */ String, /* scopes */ js.UndefOr[js.Array[String]], String])
      ] = js.undefined
    
    var apiKey: js.UndefOr[String | (js.Function1[/* name */ String, String])] = js.undefined
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object ConfigurationParameters {
    
    inline def apply(): ConfigurationParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationParameters]
    }
    
    extension [Self <: ConfigurationParameters](x: Self) {
      
      inline def setAccessToken(
        value: String | (js.Function2[/* name */ String, /* scopes */ js.UndefOr[js.Array[String]], String])
      ): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenFunction2(value: (/* name */ String, /* scopes */ js.UndefOr[js.Array[String]]) => String): Self = StObject.set(x, "accessToken", js.Any.fromFunction2(value))
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setApiKey(value: String | (js.Function1[/* name */ String, String])): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyFunction1(value: /* name */ String => String): Self = StObject.set(x, "apiKey", js.Any.fromFunction1(value))
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
