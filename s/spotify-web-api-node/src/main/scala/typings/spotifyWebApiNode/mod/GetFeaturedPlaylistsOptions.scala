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
  
  @scala.inline
  def apply(): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
  
  @scala.inline
  implicit class GetFeaturedPlaylistsOptionsMutableBuilder[Self <: GetFeaturedPlaylistsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
