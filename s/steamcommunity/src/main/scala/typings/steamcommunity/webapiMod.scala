package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webapiMod {
  
  trait WebApi extends StObject {
    
    /**
      * Retrieves your account's Web API key, and registers one if needed. Usage of this method constitutes agreement to the Steam Web API terms of use.
      *
      * @param domain A domain name to associate with your key.
      * @param callback A function to be called once the key is obtained.
      */
    def getWebApiKey(domain: String, callback: js.Function2[/* err */ CallbackError, /* key */ String, Any]): Any
    
    /**
      * Gets an oauth access token for those WebAPI methods that need one.
      * This only works if you logged in via node-steamcommunity and you didn't disable mobile login. Thus, you should just use the token returned in the callback to login.
      *
      * @deprecated No longer works if not logged in via mobile login. Will be removed in a future release.
      * @param callback A function to be called once the token is obtained.
      */
    def getWebApiOauthToken(callback: Callback): Any
  }
  object WebApi {
    
    inline def apply(
      getWebApiKey: (String, js.Function2[/* err */ CallbackError, /* key */ String, Any]) => Any,
      getWebApiOauthToken: Callback => Any
    ): WebApi = {
      val __obj = js.Dynamic.literal(getWebApiKey = js.Any.fromFunction2(getWebApiKey), getWebApiOauthToken = js.Any.fromFunction1(getWebApiOauthToken))
      __obj.asInstanceOf[WebApi]
    }
    
    extension [Self <: WebApi](x: Self) {
      
      inline def setGetWebApiKey(value: (String, js.Function2[/* err */ CallbackError, /* key */ String, Any]) => Any): Self = StObject.set(x, "getWebApiKey", js.Any.fromFunction2(value))
      
      inline def setGetWebApiOauthToken(value: Callback => Any): Self = StObject.set(x, "getWebApiOauthToken", js.Any.fromFunction1(value))
    }
  }
}
