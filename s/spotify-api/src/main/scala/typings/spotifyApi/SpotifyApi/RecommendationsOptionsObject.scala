package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait RecommendationsOptionsObject extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
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
  var seed_artists: js.UndefOr[js.Array[String] | String] = js.undefined
     // Array of strings or Comma separated string
  var seed_genres: js.UndefOr[js.Array[String] | String] = js.undefined
     // Array of strings or Comma separated string
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
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    market: String = null,
    max_acousticness: js.UndefOr[Double] = js.undefined,
    max_danceability: js.UndefOr[Double] = js.undefined,
    max_duration_ms: js.UndefOr[Double] = js.undefined,
    max_energy: js.UndefOr[Double] = js.undefined,
    max_instrumentalness: js.UndefOr[Double] = js.undefined,
    max_key: js.UndefOr[Double] = js.undefined,
    max_liveness: js.UndefOr[Double] = js.undefined,
    max_loudness: js.UndefOr[Double] = js.undefined,
    max_mode: js.UndefOr[Double] = js.undefined,
    max_popularity: js.UndefOr[Double] = js.undefined,
    max_speechiness: js.UndefOr[Double] = js.undefined,
    max_tempo: js.UndefOr[Double] = js.undefined,
    max_time_signature: js.UndefOr[Double] = js.undefined,
    max_valence: js.UndefOr[Double] = js.undefined,
    min_acousticness: js.UndefOr[Double] = js.undefined,
    min_danceability: js.UndefOr[Double] = js.undefined,
    min_duration_ms: js.UndefOr[Double] = js.undefined,
    min_energy: js.UndefOr[Double] = js.undefined,
    min_instrumentalness: js.UndefOr[Double] = js.undefined,
    min_key: js.UndefOr[Double] = js.undefined,
    min_liveness: js.UndefOr[Double] = js.undefined,
    min_loudness: js.UndefOr[Double] = js.undefined,
    min_mode: js.UndefOr[Double] = js.undefined,
    min_popularity: js.UndefOr[Double] = js.undefined,
    min_speechiness: js.UndefOr[Double] = js.undefined,
    min_tempo: js.UndefOr[Double] = js.undefined,
    min_time_signature: js.UndefOr[Double] = js.undefined,
    min_valence: js.UndefOr[Double] = js.undefined,
    seed_artists: js.Array[String] | String = null,
    seed_genres: js.Array[String] | String = null,
    seed_tracks: js.Array[String] | String = null,
    target_acousticness: js.UndefOr[Double] = js.undefined,
    target_danceability: js.UndefOr[Double] = js.undefined,
    target_duration_ms: js.UndefOr[Double] = js.undefined,
    target_energy: js.UndefOr[Double] = js.undefined,
    target_instrumentalness: js.UndefOr[Double] = js.undefined,
    target_key: js.UndefOr[Double] = js.undefined,
    target_liveness: js.UndefOr[Double] = js.undefined,
    target_loudness: js.UndefOr[Double] = js.undefined,
    target_mode: js.UndefOr[Double] = js.undefined,
    target_popularity: js.UndefOr[Double] = js.undefined,
    target_speechiness: js.UndefOr[Double] = js.undefined,
    target_tempo: js.UndefOr[Double] = js.undefined,
    target_time_signature: js.UndefOr[Double] = js.undefined,
    target_valence: js.UndefOr[Double] = js.undefined
  ): RecommendationsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (!js.isUndefined(max_acousticness)) __obj.updateDynamic("max_acousticness")(max_acousticness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_danceability)) __obj.updateDynamic("max_danceability")(max_danceability.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_duration_ms)) __obj.updateDynamic("max_duration_ms")(max_duration_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_energy)) __obj.updateDynamic("max_energy")(max_energy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_instrumentalness)) __obj.updateDynamic("max_instrumentalness")(max_instrumentalness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_key)) __obj.updateDynamic("max_key")(max_key.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_liveness)) __obj.updateDynamic("max_liveness")(max_liveness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_loudness)) __obj.updateDynamic("max_loudness")(max_loudness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_mode)) __obj.updateDynamic("max_mode")(max_mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_popularity)) __obj.updateDynamic("max_popularity")(max_popularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_speechiness)) __obj.updateDynamic("max_speechiness")(max_speechiness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_tempo)) __obj.updateDynamic("max_tempo")(max_tempo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_time_signature)) __obj.updateDynamic("max_time_signature")(max_time_signature.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_valence)) __obj.updateDynamic("max_valence")(max_valence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_acousticness)) __obj.updateDynamic("min_acousticness")(min_acousticness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_danceability)) __obj.updateDynamic("min_danceability")(min_danceability.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_duration_ms)) __obj.updateDynamic("min_duration_ms")(min_duration_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_energy)) __obj.updateDynamic("min_energy")(min_energy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_instrumentalness)) __obj.updateDynamic("min_instrumentalness")(min_instrumentalness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_key)) __obj.updateDynamic("min_key")(min_key.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_liveness)) __obj.updateDynamic("min_liveness")(min_liveness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_loudness)) __obj.updateDynamic("min_loudness")(min_loudness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_mode)) __obj.updateDynamic("min_mode")(min_mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_popularity)) __obj.updateDynamic("min_popularity")(min_popularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_speechiness)) __obj.updateDynamic("min_speechiness")(min_speechiness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_tempo)) __obj.updateDynamic("min_tempo")(min_tempo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_time_signature)) __obj.updateDynamic("min_time_signature")(min_time_signature.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_valence)) __obj.updateDynamic("min_valence")(min_valence.get.asInstanceOf[js.Any])
    if (seed_artists != null) __obj.updateDynamic("seed_artists")(seed_artists.asInstanceOf[js.Any])
    if (seed_genres != null) __obj.updateDynamic("seed_genres")(seed_genres.asInstanceOf[js.Any])
    if (seed_tracks != null) __obj.updateDynamic("seed_tracks")(seed_tracks.asInstanceOf[js.Any])
    if (!js.isUndefined(target_acousticness)) __obj.updateDynamic("target_acousticness")(target_acousticness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_danceability)) __obj.updateDynamic("target_danceability")(target_danceability.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_duration_ms)) __obj.updateDynamic("target_duration_ms")(target_duration_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_energy)) __obj.updateDynamic("target_energy")(target_energy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_instrumentalness)) __obj.updateDynamic("target_instrumentalness")(target_instrumentalness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_key)) __obj.updateDynamic("target_key")(target_key.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_liveness)) __obj.updateDynamic("target_liveness")(target_liveness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_loudness)) __obj.updateDynamic("target_loudness")(target_loudness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_mode)) __obj.updateDynamic("target_mode")(target_mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_popularity)) __obj.updateDynamic("target_popularity")(target_popularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_speechiness)) __obj.updateDynamic("target_speechiness")(target_speechiness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_tempo)) __obj.updateDynamic("target_tempo")(target_tempo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_time_signature)) __obj.updateDynamic("target_time_signature")(target_time_signature.get.asInstanceOf[js.Any])
    if (!js.isUndefined(target_valence)) __obj.updateDynamic("target_valence")(target_valence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsOptionsObject]
  }
}

