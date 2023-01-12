package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-object)
  */
trait RecommendationsObject extends StObject {
  
  var seeds: js.Array[RecommendationsSeedObject]
  
  var tracks: js.Array[TrackObjectSimplified]
}
object RecommendationsObject {
  
  inline def apply(seeds: js.Array[RecommendationsSeedObject], tracks: js.Array[TrackObjectSimplified]): RecommendationsObject = {
    val __obj = js.Dynamic.literal(seeds = seeds.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationsObject] (val x: Self) extends AnyVal {
    
    inline def setSeeds(value: js.Array[RecommendationsSeedObject]): Self = StObject.set(x, "seeds", value.asInstanceOf[js.Any])
    
    inline def setSeedsVarargs(value: RecommendationsSeedObject*): Self = StObject.set(x, "seeds", js.Array(value*))
    
    inline def setTracks(value: js.Array[TrackObjectSimplified]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: TrackObjectSimplified*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
