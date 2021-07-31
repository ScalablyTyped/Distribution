package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External Url Object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
trait ExternalUrlObject extends StObject {
  
  var spotify: String
}
object ExternalUrlObject {
  
  @scala.inline
  def apply(spotify: String): ExternalUrlObject = {
    val __obj = js.Dynamic.literal(spotify = spotify.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalUrlObject]
  }
  
  @scala.inline
  implicit class ExternalUrlObjectMutableBuilder[Self <: ExternalUrlObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpotify(value: String): Self = StObject.set(x, "spotify", value.asInstanceOf[js.Any])
  }
}
