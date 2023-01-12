package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Episode Object
  * [saved episode object](https://developer.spotify.com/documentation/web-api/reference/#object-savedepisodeobject)
  */
trait SavedEpisodeObject extends StObject {
  
  /**
    * The date and time the episode was saved.
    */
  var added_at: String
  
  /**
    * Information about the episode.
    */
  var episode: EpisodeObject
}
object SavedEpisodeObject {
  
  inline def apply(added_at: String, episode: EpisodeObject): SavedEpisodeObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], episode = episode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedEpisodeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedEpisodeObject] (val x: Self) extends AnyVal {
    
    inline def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    inline def setEpisode(value: EpisodeObject): Self = StObject.set(x, "episode", value.asInstanceOf[js.Any])
  }
}
