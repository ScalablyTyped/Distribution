package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.Subtitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  subtitles :std.Array<stremio-addon-sdk.stremio-addon-sdk.Subtitle>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
@js.native
trait subtitlesArraySubtitleCac extends StObject {
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
  
  var subtitles: js.Array[Subtitle] = js.native
}
object subtitlesArraySubtitleCac {
  
  @scala.inline
  def apply(subtitles: js.Array[Subtitle]): subtitlesArraySubtitleCac = {
    val __obj = js.Dynamic.literal(subtitles = subtitles.asInstanceOf[js.Any])
    __obj.asInstanceOf[subtitlesArraySubtitleCac]
  }
  
  @scala.inline
  implicit class subtitlesArraySubtitleCacMutableBuilder[Self <: subtitlesArraySubtitleCac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    @scala.inline
    def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    @scala.inline
    def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
    
    @scala.inline
    def setSubtitles(value: js.Array[Subtitle]): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlesVarargs(value: Subtitle*): Self = StObject.set(x, "subtitles", js.Array(value :_*))
  }
}
