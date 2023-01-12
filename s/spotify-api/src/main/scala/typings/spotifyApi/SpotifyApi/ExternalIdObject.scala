package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External Id object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
trait ExternalIdObject extends StObject {
  
  var ean: js.UndefOr[String] = js.undefined
  
  var isrc: js.UndefOr[String] = js.undefined
  
  var upc: js.UndefOr[String] = js.undefined
}
object ExternalIdObject {
  
  inline def apply(): ExternalIdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalIdObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalIdObject] (val x: Self) extends AnyVal {
    
    inline def setEan(value: String): Self = StObject.set(x, "ean", value.asInstanceOf[js.Any])
    
    inline def setEanUndefined: Self = StObject.set(x, "ean", js.undefined)
    
    inline def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
    
    inline def setIsrcUndefined: Self = StObject.set(x, "isrc", js.undefined)
    
    inline def setUpc(value: String): Self = StObject.set(x, "upc", value.asInstanceOf[js.Any])
    
    inline def setUpcUndefined: Self = StObject.set(x, "upc", js.undefined)
  }
}
