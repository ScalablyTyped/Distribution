package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object for use in Recommendations Based on Seeds.
  * See: [Recommendations Based on Seeds](https://developer.spotify.com/web-api/get-recommendations/)
  *
  * @limit q Optional. The target size of the list of recommended tracks. For seeds with unusually small pools or when highly restrictive filtering is applied, it may be impossible to generate the requested number of recommended tracks. Debugging information for such cases is available in the response. Default: 20. Minimum: 1. Maximum: 100.
  * @market q Optional. An ISO 3166-1 alpha-2 country code. Provide this parameter if you want to apply Track Relinking. Because min_*, max_* and target_* are applied to pools before relinking, the generated results may not precisely match the filters applied. Original, non-relinked tracks are available via the linked_from attribute of the relinked track response.
  * @max_ q Optional. Multiple values. For each tunable track attribute, a hard ceiling on the selected track attribute’s value can be provided. See tunable track attributes below for the list of available options. For example, max_instrumentalness=0.35 would filter out most tracks that are likely to be instrumental.
  * @min_ q Optional. Multiple values. For each tunable track attribute, a hard floor on the selected track attribute’s value can be provided. See tunable track attributes below for the list of available options. For example, min_tempo=140 would restrict results to only those tracks with a tempo of greater than 140 beats per minute.
  * @seed_artists q A comma separated list of Spotify IDs for seed artists. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres.
  * @seed_genres q A comma separated list of any genres in the set of available genre seeds. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres.
  * @seed_tracks q A comma separated list of Spotify IDs for a seed track. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres.
  * @target_ q Optional. Multiple values. For each of the tunable track attributes (below) a target value may be provided. Tracks with the attribute values nearest to the target values will be preferred. For example, you might request target_energy=0.6 and target_danceability=0.8. All target values will be weighed equally in ranking results.
  */
@js.native
trait RecommendationsOptionsObject extends js.Object {
  
  var limit: js.UndefOr[Double] = js.native
  
  var market: js.UndefOr[String] = js.native
  
  var max_acousticness: js.UndefOr[Double] = js.native
  
  var max_danceability: js.UndefOr[Double] = js.native
  
  var max_duration_ms: js.UndefOr[Double] = js.native
  
  var max_energy: js.UndefOr[Double] = js.native
  
  var max_instrumentalness: js.UndefOr[Double] = js.native
  
  var max_key: js.UndefOr[Double] = js.native
  
  var max_liveness: js.UndefOr[Double] = js.native
  
  var max_loudness: js.UndefOr[Double] = js.native
  
  var max_mode: js.UndefOr[Double] = js.native
  
  var max_popularity: js.UndefOr[Double] = js.native
  
  var max_speechiness: js.UndefOr[Double] = js.native
  
  var max_tempo: js.UndefOr[Double] = js.native
  
  var max_time_signature: js.UndefOr[Double] = js.native
  
  var max_valence: js.UndefOr[Double] = js.native
  
  var min_acousticness: js.UndefOr[Double] = js.native
  
  var min_danceability: js.UndefOr[Double] = js.native
  
  var min_duration_ms: js.UndefOr[Double] = js.native
  
  var min_energy: js.UndefOr[Double] = js.native
  
  var min_instrumentalness: js.UndefOr[Double] = js.native
  
  var min_key: js.UndefOr[Double] = js.native
  
  var min_liveness: js.UndefOr[Double] = js.native
  
  var min_loudness: js.UndefOr[Double] = js.native
  
  var min_mode: js.UndefOr[Double] = js.native
  
  var min_popularity: js.UndefOr[Double] = js.native
  
  var min_speechiness: js.UndefOr[Double] = js.native
  
  var min_tempo: js.UndefOr[Double] = js.native
  
  var min_time_signature: js.UndefOr[Double] = js.native
  
  var min_valence: js.UndefOr[Double] = js.native
  
  var seed_artists: js.UndefOr[js.Array[String] | String] = js.native
  
     // Array of strings or Comma separated string
  var seed_genres: js.UndefOr[js.Array[String] | String] = js.native
  
     // Array of strings or Comma separated string
  var seed_tracks: js.UndefOr[js.Array[String] | String] = js.native
  
     // Array of strings or Comma separated string
  var target_acousticness: js.UndefOr[Double] = js.native
  
  var target_danceability: js.UndefOr[Double] = js.native
  
  var target_duration_ms: js.UndefOr[Double] = js.native
  
  var target_energy: js.UndefOr[Double] = js.native
  
  var target_instrumentalness: js.UndefOr[Double] = js.native
  
  var target_key: js.UndefOr[Double] = js.native
  
  var target_liveness: js.UndefOr[Double] = js.native
  
  var target_loudness: js.UndefOr[Double] = js.native
  
  var target_mode: js.UndefOr[Double] = js.native
  
  var target_popularity: js.UndefOr[Double] = js.native
  
  var target_speechiness: js.UndefOr[Double] = js.native
  
  var target_tempo: js.UndefOr[Double] = js.native
  
  var target_time_signature: js.UndefOr[Double] = js.native
  
  var target_valence: js.UndefOr[Double] = js.native
}
object RecommendationsOptionsObject {
  
  @scala.inline
  def apply(): RecommendationsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationsOptionsObject]
  }
  
  @scala.inline
  implicit class RecommendationsOptionsObjectOps[Self <: RecommendationsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMarket(value: String): Self = this.set("market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarket: Self = this.set("market", js.undefined)
    
    @scala.inline
    def setMax_acousticness(value: Double): Self = this.set("max_acousticness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_acousticness: Self = this.set("max_acousticness", js.undefined)
    
    @scala.inline
    def setMax_danceability(value: Double): Self = this.set("max_danceability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_danceability: Self = this.set("max_danceability", js.undefined)
    
    @scala.inline
    def setMax_duration_ms(value: Double): Self = this.set("max_duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_duration_ms: Self = this.set("max_duration_ms", js.undefined)
    
    @scala.inline
    def setMax_energy(value: Double): Self = this.set("max_energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_energy: Self = this.set("max_energy", js.undefined)
    
    @scala.inline
    def setMax_instrumentalness(value: Double): Self = this.set("max_instrumentalness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_instrumentalness: Self = this.set("max_instrumentalness", js.undefined)
    
    @scala.inline
    def setMax_key(value: Double): Self = this.set("max_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_key: Self = this.set("max_key", js.undefined)
    
    @scala.inline
    def setMax_liveness(value: Double): Self = this.set("max_liveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_liveness: Self = this.set("max_liveness", js.undefined)
    
    @scala.inline
    def setMax_loudness(value: Double): Self = this.set("max_loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_loudness: Self = this.set("max_loudness", js.undefined)
    
    @scala.inline
    def setMax_mode(value: Double): Self = this.set("max_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_mode: Self = this.set("max_mode", js.undefined)
    
    @scala.inline
    def setMax_popularity(value: Double): Self = this.set("max_popularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_popularity: Self = this.set("max_popularity", js.undefined)
    
    @scala.inline
    def setMax_speechiness(value: Double): Self = this.set("max_speechiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_speechiness: Self = this.set("max_speechiness", js.undefined)
    
    @scala.inline
    def setMax_tempo(value: Double): Self = this.set("max_tempo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_tempo: Self = this.set("max_tempo", js.undefined)
    
    @scala.inline
    def setMax_time_signature(value: Double): Self = this.set("max_time_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_time_signature: Self = this.set("max_time_signature", js.undefined)
    
    @scala.inline
    def setMax_valence(value: Double): Self = this.set("max_valence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_valence: Self = this.set("max_valence", js.undefined)
    
    @scala.inline
    def setMin_acousticness(value: Double): Self = this.set("min_acousticness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_acousticness: Self = this.set("min_acousticness", js.undefined)
    
    @scala.inline
    def setMin_danceability(value: Double): Self = this.set("min_danceability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_danceability: Self = this.set("min_danceability", js.undefined)
    
    @scala.inline
    def setMin_duration_ms(value: Double): Self = this.set("min_duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_duration_ms: Self = this.set("min_duration_ms", js.undefined)
    
    @scala.inline
    def setMin_energy(value: Double): Self = this.set("min_energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_energy: Self = this.set("min_energy", js.undefined)
    
    @scala.inline
    def setMin_instrumentalness(value: Double): Self = this.set("min_instrumentalness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_instrumentalness: Self = this.set("min_instrumentalness", js.undefined)
    
    @scala.inline
    def setMin_key(value: Double): Self = this.set("min_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_key: Self = this.set("min_key", js.undefined)
    
    @scala.inline
    def setMin_liveness(value: Double): Self = this.set("min_liveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_liveness: Self = this.set("min_liveness", js.undefined)
    
    @scala.inline
    def setMin_loudness(value: Double): Self = this.set("min_loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_loudness: Self = this.set("min_loudness", js.undefined)
    
    @scala.inline
    def setMin_mode(value: Double): Self = this.set("min_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_mode: Self = this.set("min_mode", js.undefined)
    
    @scala.inline
    def setMin_popularity(value: Double): Self = this.set("min_popularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_popularity: Self = this.set("min_popularity", js.undefined)
    
    @scala.inline
    def setMin_speechiness(value: Double): Self = this.set("min_speechiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_speechiness: Self = this.set("min_speechiness", js.undefined)
    
    @scala.inline
    def setMin_tempo(value: Double): Self = this.set("min_tempo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_tempo: Self = this.set("min_tempo", js.undefined)
    
    @scala.inline
    def setMin_time_signature(value: Double): Self = this.set("min_time_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_time_signature: Self = this.set("min_time_signature", js.undefined)
    
    @scala.inline
    def setMin_valence(value: Double): Self = this.set("min_valence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_valence: Self = this.set("min_valence", js.undefined)
    
    @scala.inline
    def setSeed_artistsVarargs(value: String*): Self = this.set("seed_artists", js.Array(value :_*))
    
    @scala.inline
    def setSeed_artists(value: js.Array[String] | String): Self = this.set("seed_artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed_artists: Self = this.set("seed_artists", js.undefined)
    
    @scala.inline
    def setSeed_genresVarargs(value: String*): Self = this.set("seed_genres", js.Array(value :_*))
    
    @scala.inline
    def setSeed_genres(value: js.Array[String] | String): Self = this.set("seed_genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed_genres: Self = this.set("seed_genres", js.undefined)
    
    @scala.inline
    def setSeed_tracksVarargs(value: String*): Self = this.set("seed_tracks", js.Array(value :_*))
    
    @scala.inline
    def setSeed_tracks(value: js.Array[String] | String): Self = this.set("seed_tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed_tracks: Self = this.set("seed_tracks", js.undefined)
    
    @scala.inline
    def setTarget_acousticness(value: Double): Self = this.set("target_acousticness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_acousticness: Self = this.set("target_acousticness", js.undefined)
    
    @scala.inline
    def setTarget_danceability(value: Double): Self = this.set("target_danceability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_danceability: Self = this.set("target_danceability", js.undefined)
    
    @scala.inline
    def setTarget_duration_ms(value: Double): Self = this.set("target_duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_duration_ms: Self = this.set("target_duration_ms", js.undefined)
    
    @scala.inline
    def setTarget_energy(value: Double): Self = this.set("target_energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_energy: Self = this.set("target_energy", js.undefined)
    
    @scala.inline
    def setTarget_instrumentalness(value: Double): Self = this.set("target_instrumentalness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_instrumentalness: Self = this.set("target_instrumentalness", js.undefined)
    
    @scala.inline
    def setTarget_key(value: Double): Self = this.set("target_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_key: Self = this.set("target_key", js.undefined)
    
    @scala.inline
    def setTarget_liveness(value: Double): Self = this.set("target_liveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_liveness: Self = this.set("target_liveness", js.undefined)
    
    @scala.inline
    def setTarget_loudness(value: Double): Self = this.set("target_loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_loudness: Self = this.set("target_loudness", js.undefined)
    
    @scala.inline
    def setTarget_mode(value: Double): Self = this.set("target_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_mode: Self = this.set("target_mode", js.undefined)
    
    @scala.inline
    def setTarget_popularity(value: Double): Self = this.set("target_popularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_popularity: Self = this.set("target_popularity", js.undefined)
    
    @scala.inline
    def setTarget_speechiness(value: Double): Self = this.set("target_speechiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_speechiness: Self = this.set("target_speechiness", js.undefined)
    
    @scala.inline
    def setTarget_tempo(value: Double): Self = this.set("target_tempo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_tempo: Self = this.set("target_tempo", js.undefined)
    
    @scala.inline
    def setTarget_time_signature(value: Double): Self = this.set("target_time_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_time_signature: Self = this.set("target_time_signature", js.undefined)
    
    @scala.inline
    def setTarget_valence(value: Double): Self = this.set("target_valence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_valence: Self = this.set("target_valence", js.undefined)
  }
}
