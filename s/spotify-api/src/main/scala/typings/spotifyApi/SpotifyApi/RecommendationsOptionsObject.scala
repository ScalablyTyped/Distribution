package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object for use in Recommendations Based on Seeds.
  * See: [Recommendations Based on Seeds](https://developer.spotify.com/web-api/get-recommendations/)
  *
  * [max_*] - Multiple values. For each tunable track attribute, a hard ceiling on the selected track attribute’s value can be provided. See tunable track attributes below for the list of available options. For example, max_instrumentalness=0.35 would filter out most tracks that are likely to be instrumental.
  * [min_*] - Multiple values. For each tunable track attribute, a hard floor on the selected track attribute’s value can be provided. See tunable track attributes below for the list of available options. For example, min_tempo=140 would restrict results to only those tracks with a tempo of greater than 140 beats per minute.
  * [target_*] - Multiple values. For each of the tunable track attributes (below) a target value may be provided. Tracks with the attribute values nearest to the target values will be preferred. For example, you might request target_energy=0.6 and target_danceability=0.8. All target values will be weighed equally in ranking results.
  */
trait RecommendationsOptionsObject extends StObject {
  
  /** The target size of the list of recommended tracks. For seeds with unusually small pools or when highly restrictive filtering is applied, it may be impossible to generate the requested number of recommended tracks. Debugging information for such cases is available in the response. Default: 20. Minimum: 1. Maximum: 100. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** An ISO 3166-1 alpha-2 country code. Provide this parameter if you want to apply Track Relinking. Because min_*, max_* and target_* are applied to pools before relinking, the generated results may not precisely match the filters applied. Original, non-relinked tracks are available via the linked_from attribute of the relinked track response. */
  var market: js.UndefOr[String] = js.undefined
  
  var max_acousticness: js.UndefOr[Double] = js.undefined
  
  var max_danceability: js.UndefOr[Double] = js.undefined
  
  var max_duration_ms: js.UndefOr[Double] = js.undefined
  
  var max_energy: js.UndefOr[Double] = js.undefined
  
  var max_instrumentalness: js.UndefOr[Double] = js.undefined
  
  var max_key: js.UndefOr[Double] = js.undefined
  
  var max_liveness: js.UndefOr[Double] = js.undefined
  
  var max_loudness: js.UndefOr[Double] = js.undefined
  
  var max_mode: js.UndefOr[Double] = js.undefined
  
  var max_popularity: js.UndefOr[Double] = js.undefined
  
  var max_speechiness: js.UndefOr[Double] = js.undefined
  
  var max_tempo: js.UndefOr[Double] = js.undefined
  
  var max_time_signature: js.UndefOr[Double] = js.undefined
  
  var max_valence: js.UndefOr[Double] = js.undefined
  
  var min_acousticness: js.UndefOr[Double] = js.undefined
  
  var min_danceability: js.UndefOr[Double] = js.undefined
  
  var min_duration_ms: js.UndefOr[Double] = js.undefined
  
  var min_energy: js.UndefOr[Double] = js.undefined
  
  var min_instrumentalness: js.UndefOr[Double] = js.undefined
  
  var min_key: js.UndefOr[Double] = js.undefined
  
  var min_liveness: js.UndefOr[Double] = js.undefined
  
  var min_loudness: js.UndefOr[Double] = js.undefined
  
  var min_mode: js.UndefOr[Double] = js.undefined
  
  var min_popularity: js.UndefOr[Double] = js.undefined
  
  var min_speechiness: js.UndefOr[Double] = js.undefined
  
  var min_tempo: js.UndefOr[Double] = js.undefined
  
  var min_time_signature: js.UndefOr[Double] = js.undefined
  
  var min_valence: js.UndefOr[Double] = js.undefined
  
  /** A comma separated list of Spotify IDs for seed artists. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres. */
  var seed_artists: js.UndefOr[js.Array[String] | String] = js.undefined
  
  // Array of strings or Comma separated string
  /** A comma separated list of any genres in the set of available genre seeds. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres. */
  var seed_genres: js.UndefOr[js.Array[String] | String] = js.undefined
  
  // Array of strings or Comma separated string
  /** A comma separated list of Spotify IDs for a seed track. Up to 5 seed values may be provided in any combination of seed_artists, seed_tracks and seed_genres. */
  var seed_tracks: js.UndefOr[js.Array[String] | String] = js.undefined
  
  // Array of strings or Comma separated string
  var target_acousticness: js.UndefOr[Double] = js.undefined
  
  var target_danceability: js.UndefOr[Double] = js.undefined
  
  var target_duration_ms: js.UndefOr[Double] = js.undefined
  
  var target_energy: js.UndefOr[Double] = js.undefined
  
  var target_instrumentalness: js.UndefOr[Double] = js.undefined
  
  var target_key: js.UndefOr[Double] = js.undefined
  
  var target_liveness: js.UndefOr[Double] = js.undefined
  
  var target_loudness: js.UndefOr[Double] = js.undefined
  
  var target_mode: js.UndefOr[Double] = js.undefined
  
  var target_popularity: js.UndefOr[Double] = js.undefined
  
  var target_speechiness: js.UndefOr[Double] = js.undefined
  
  var target_tempo: js.UndefOr[Double] = js.undefined
  
  var target_time_signature: js.UndefOr[Double] = js.undefined
  
  var target_valence: js.UndefOr[Double] = js.undefined
}
object RecommendationsOptionsObject {
  
  inline def apply(): RecommendationsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationsOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationsOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMarket(value: String): Self = StObject.set(x, "market", value.asInstanceOf[js.Any])
    
    inline def setMarketUndefined: Self = StObject.set(x, "market", js.undefined)
    
    inline def setMax_acousticness(value: Double): Self = StObject.set(x, "max_acousticness", value.asInstanceOf[js.Any])
    
    inline def setMax_acousticnessUndefined: Self = StObject.set(x, "max_acousticness", js.undefined)
    
    inline def setMax_danceability(value: Double): Self = StObject.set(x, "max_danceability", value.asInstanceOf[js.Any])
    
    inline def setMax_danceabilityUndefined: Self = StObject.set(x, "max_danceability", js.undefined)
    
    inline def setMax_duration_ms(value: Double): Self = StObject.set(x, "max_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setMax_duration_msUndefined: Self = StObject.set(x, "max_duration_ms", js.undefined)
    
    inline def setMax_energy(value: Double): Self = StObject.set(x, "max_energy", value.asInstanceOf[js.Any])
    
    inline def setMax_energyUndefined: Self = StObject.set(x, "max_energy", js.undefined)
    
    inline def setMax_instrumentalness(value: Double): Self = StObject.set(x, "max_instrumentalness", value.asInstanceOf[js.Any])
    
    inline def setMax_instrumentalnessUndefined: Self = StObject.set(x, "max_instrumentalness", js.undefined)
    
    inline def setMax_key(value: Double): Self = StObject.set(x, "max_key", value.asInstanceOf[js.Any])
    
    inline def setMax_keyUndefined: Self = StObject.set(x, "max_key", js.undefined)
    
    inline def setMax_liveness(value: Double): Self = StObject.set(x, "max_liveness", value.asInstanceOf[js.Any])
    
    inline def setMax_livenessUndefined: Self = StObject.set(x, "max_liveness", js.undefined)
    
    inline def setMax_loudness(value: Double): Self = StObject.set(x, "max_loudness", value.asInstanceOf[js.Any])
    
    inline def setMax_loudnessUndefined: Self = StObject.set(x, "max_loudness", js.undefined)
    
    inline def setMax_mode(value: Double): Self = StObject.set(x, "max_mode", value.asInstanceOf[js.Any])
    
    inline def setMax_modeUndefined: Self = StObject.set(x, "max_mode", js.undefined)
    
    inline def setMax_popularity(value: Double): Self = StObject.set(x, "max_popularity", value.asInstanceOf[js.Any])
    
    inline def setMax_popularityUndefined: Self = StObject.set(x, "max_popularity", js.undefined)
    
    inline def setMax_speechiness(value: Double): Self = StObject.set(x, "max_speechiness", value.asInstanceOf[js.Any])
    
    inline def setMax_speechinessUndefined: Self = StObject.set(x, "max_speechiness", js.undefined)
    
    inline def setMax_tempo(value: Double): Self = StObject.set(x, "max_tempo", value.asInstanceOf[js.Any])
    
    inline def setMax_tempoUndefined: Self = StObject.set(x, "max_tempo", js.undefined)
    
    inline def setMax_time_signature(value: Double): Self = StObject.set(x, "max_time_signature", value.asInstanceOf[js.Any])
    
    inline def setMax_time_signatureUndefined: Self = StObject.set(x, "max_time_signature", js.undefined)
    
    inline def setMax_valence(value: Double): Self = StObject.set(x, "max_valence", value.asInstanceOf[js.Any])
    
    inline def setMax_valenceUndefined: Self = StObject.set(x, "max_valence", js.undefined)
    
    inline def setMin_acousticness(value: Double): Self = StObject.set(x, "min_acousticness", value.asInstanceOf[js.Any])
    
    inline def setMin_acousticnessUndefined: Self = StObject.set(x, "min_acousticness", js.undefined)
    
    inline def setMin_danceability(value: Double): Self = StObject.set(x, "min_danceability", value.asInstanceOf[js.Any])
    
    inline def setMin_danceabilityUndefined: Self = StObject.set(x, "min_danceability", js.undefined)
    
    inline def setMin_duration_ms(value: Double): Self = StObject.set(x, "min_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setMin_duration_msUndefined: Self = StObject.set(x, "min_duration_ms", js.undefined)
    
    inline def setMin_energy(value: Double): Self = StObject.set(x, "min_energy", value.asInstanceOf[js.Any])
    
    inline def setMin_energyUndefined: Self = StObject.set(x, "min_energy", js.undefined)
    
    inline def setMin_instrumentalness(value: Double): Self = StObject.set(x, "min_instrumentalness", value.asInstanceOf[js.Any])
    
    inline def setMin_instrumentalnessUndefined: Self = StObject.set(x, "min_instrumentalness", js.undefined)
    
    inline def setMin_key(value: Double): Self = StObject.set(x, "min_key", value.asInstanceOf[js.Any])
    
    inline def setMin_keyUndefined: Self = StObject.set(x, "min_key", js.undefined)
    
    inline def setMin_liveness(value: Double): Self = StObject.set(x, "min_liveness", value.asInstanceOf[js.Any])
    
    inline def setMin_livenessUndefined: Self = StObject.set(x, "min_liveness", js.undefined)
    
    inline def setMin_loudness(value: Double): Self = StObject.set(x, "min_loudness", value.asInstanceOf[js.Any])
    
    inline def setMin_loudnessUndefined: Self = StObject.set(x, "min_loudness", js.undefined)
    
    inline def setMin_mode(value: Double): Self = StObject.set(x, "min_mode", value.asInstanceOf[js.Any])
    
    inline def setMin_modeUndefined: Self = StObject.set(x, "min_mode", js.undefined)
    
    inline def setMin_popularity(value: Double): Self = StObject.set(x, "min_popularity", value.asInstanceOf[js.Any])
    
    inline def setMin_popularityUndefined: Self = StObject.set(x, "min_popularity", js.undefined)
    
    inline def setMin_speechiness(value: Double): Self = StObject.set(x, "min_speechiness", value.asInstanceOf[js.Any])
    
    inline def setMin_speechinessUndefined: Self = StObject.set(x, "min_speechiness", js.undefined)
    
    inline def setMin_tempo(value: Double): Self = StObject.set(x, "min_tempo", value.asInstanceOf[js.Any])
    
    inline def setMin_tempoUndefined: Self = StObject.set(x, "min_tempo", js.undefined)
    
    inline def setMin_time_signature(value: Double): Self = StObject.set(x, "min_time_signature", value.asInstanceOf[js.Any])
    
    inline def setMin_time_signatureUndefined: Self = StObject.set(x, "min_time_signature", js.undefined)
    
    inline def setMin_valence(value: Double): Self = StObject.set(x, "min_valence", value.asInstanceOf[js.Any])
    
    inline def setMin_valenceUndefined: Self = StObject.set(x, "min_valence", js.undefined)
    
    inline def setSeed_artists(value: js.Array[String] | String): Self = StObject.set(x, "seed_artists", value.asInstanceOf[js.Any])
    
    inline def setSeed_artistsUndefined: Self = StObject.set(x, "seed_artists", js.undefined)
    
    inline def setSeed_artistsVarargs(value: String*): Self = StObject.set(x, "seed_artists", js.Array(value*))
    
    inline def setSeed_genres(value: js.Array[String] | String): Self = StObject.set(x, "seed_genres", value.asInstanceOf[js.Any])
    
    inline def setSeed_genresUndefined: Self = StObject.set(x, "seed_genres", js.undefined)
    
    inline def setSeed_genresVarargs(value: String*): Self = StObject.set(x, "seed_genres", js.Array(value*))
    
    inline def setSeed_tracks(value: js.Array[String] | String): Self = StObject.set(x, "seed_tracks", value.asInstanceOf[js.Any])
    
    inline def setSeed_tracksUndefined: Self = StObject.set(x, "seed_tracks", js.undefined)
    
    inline def setSeed_tracksVarargs(value: String*): Self = StObject.set(x, "seed_tracks", js.Array(value*))
    
    inline def setTarget_acousticness(value: Double): Self = StObject.set(x, "target_acousticness", value.asInstanceOf[js.Any])
    
    inline def setTarget_acousticnessUndefined: Self = StObject.set(x, "target_acousticness", js.undefined)
    
    inline def setTarget_danceability(value: Double): Self = StObject.set(x, "target_danceability", value.asInstanceOf[js.Any])
    
    inline def setTarget_danceabilityUndefined: Self = StObject.set(x, "target_danceability", js.undefined)
    
    inline def setTarget_duration_ms(value: Double): Self = StObject.set(x, "target_duration_ms", value.asInstanceOf[js.Any])
    
    inline def setTarget_duration_msUndefined: Self = StObject.set(x, "target_duration_ms", js.undefined)
    
    inline def setTarget_energy(value: Double): Self = StObject.set(x, "target_energy", value.asInstanceOf[js.Any])
    
    inline def setTarget_energyUndefined: Self = StObject.set(x, "target_energy", js.undefined)
    
    inline def setTarget_instrumentalness(value: Double): Self = StObject.set(x, "target_instrumentalness", value.asInstanceOf[js.Any])
    
    inline def setTarget_instrumentalnessUndefined: Self = StObject.set(x, "target_instrumentalness", js.undefined)
    
    inline def setTarget_key(value: Double): Self = StObject.set(x, "target_key", value.asInstanceOf[js.Any])
    
    inline def setTarget_keyUndefined: Self = StObject.set(x, "target_key", js.undefined)
    
    inline def setTarget_liveness(value: Double): Self = StObject.set(x, "target_liveness", value.asInstanceOf[js.Any])
    
    inline def setTarget_livenessUndefined: Self = StObject.set(x, "target_liveness", js.undefined)
    
    inline def setTarget_loudness(value: Double): Self = StObject.set(x, "target_loudness", value.asInstanceOf[js.Any])
    
    inline def setTarget_loudnessUndefined: Self = StObject.set(x, "target_loudness", js.undefined)
    
    inline def setTarget_mode(value: Double): Self = StObject.set(x, "target_mode", value.asInstanceOf[js.Any])
    
    inline def setTarget_modeUndefined: Self = StObject.set(x, "target_mode", js.undefined)
    
    inline def setTarget_popularity(value: Double): Self = StObject.set(x, "target_popularity", value.asInstanceOf[js.Any])
    
    inline def setTarget_popularityUndefined: Self = StObject.set(x, "target_popularity", js.undefined)
    
    inline def setTarget_speechiness(value: Double): Self = StObject.set(x, "target_speechiness", value.asInstanceOf[js.Any])
    
    inline def setTarget_speechinessUndefined: Self = StObject.set(x, "target_speechiness", js.undefined)
    
    inline def setTarget_tempo(value: Double): Self = StObject.set(x, "target_tempo", value.asInstanceOf[js.Any])
    
    inline def setTarget_tempoUndefined: Self = StObject.set(x, "target_tempo", js.undefined)
    
    inline def setTarget_time_signature(value: Double): Self = StObject.set(x, "target_time_signature", value.asInstanceOf[js.Any])
    
    inline def setTarget_time_signatureUndefined: Self = StObject.set(x, "target_time_signature", js.undefined)
    
    inline def setTarget_valence(value: Double): Self = StObject.set(x, "target_valence", value.asInstanceOf[js.Any])
    
    inline def setTarget_valenceUndefined: Self = StObject.set(x, "target_valence", js.undefined)
  }
}
