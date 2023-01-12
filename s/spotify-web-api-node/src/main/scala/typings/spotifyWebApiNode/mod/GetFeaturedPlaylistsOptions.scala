package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFeaturedPlaylistsOptions
  extends StObject
     with PaginationLocaleOptions {
  
  var timestamp: js.UndefOr[String] = js.undefined
}
object GetFeaturedPlaylistsOptions {
  
  inline def apply(): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFeaturedPlaylistsOptions] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
