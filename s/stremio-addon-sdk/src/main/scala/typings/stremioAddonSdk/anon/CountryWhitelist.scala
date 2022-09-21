package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryWhitelist extends StObject {
  
  /**
    * Hints it's restricted to particular countries.
    *
    * Array of ISO 3166-1 alpha-3 country codes in lowercase in which the stream is accessible.
    */
  var countryWhitelist: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If defined, addons with the same behaviorHints.group will be chosen automatically for binge watching.
    *
    * This should be something that identifies the stream's nature within your addon.
    * For example, if your addon is called "gobsAddon", and the stream is 720p, the group should be "gobsAddon-720p".
    * If the next episode has a stream with the same group, stremio should select that stream implicitly.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * **Not implemented yet!**
    *
    * HTTP headers to use when trying to playback url.
    * Only applies to urls.
    *
    * @ignore
    */
  var headers: js.UndefOr[Any] = js.undefined
  
  /**
    * Applies if the protocol of the url is http(s).
    *
    * Needs to be set to true if the URL does not support https or is not an MP4 file.
    */
  var notWebReady: js.UndefOr[Boolean] = js.undefined
}
object CountryWhitelist {
  
  inline def apply(): CountryWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryWhitelist]
  }
  
  extension [Self <: CountryWhitelist](x: Self) {
    
    inline def setCountryWhitelist(value: js.Array[String]): Self = StObject.set(x, "countryWhitelist", value.asInstanceOf[js.Any])
    
    inline def setCountryWhitelistUndefined: Self = StObject.set(x, "countryWhitelist", js.undefined)
    
    inline def setCountryWhitelistVarargs(value: String*): Self = StObject.set(x, "countryWhitelist", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNotWebReady(value: Boolean): Self = StObject.set(x, "notWebReady", value.asInstanceOf[js.Any])
    
    inline def setNotWebReadyUndefined: Self = StObject.set(x, "notWebReady", js.undefined)
  }
}
