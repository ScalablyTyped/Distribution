package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recommendations Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-object)
  */
@js.native
trait RecommendationsObject extends StObject {
  
  var seeds: js.Array[RecommendationsSeedObject] = js.native
  
  var tracks: js.Array[TrackObjectSimplified] = js.native
}
object RecommendationsObject {
  
  @scala.inline
  def apply(seeds: js.Array[RecommendationsSeedObject], tracks: js.Array[TrackObjectSimplified]): RecommendationsObject = {
    val __obj = js.Dynamic.literal(seeds = seeds.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsObject]
  }
  
  @scala.inline
  implicit class RecommendationsObjectMutableBuilder[Self <: RecommendationsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeeds(value: js.Array[RecommendationsSeedObject]): Self = StObject.set(x, "seeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedsVarargs(value: RecommendationsSeedObject*): Self = StObject.set(x, "seeds", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[TrackObjectSimplified]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: TrackObjectSimplified*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
