package typings
package spotifyDashApiLib.SpotifyApiNs

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
  var limit: js.UndefOr[scala.Double] = js.undefined
  var market: js.UndefOr[java.lang.String] = js.undefined
  var max_acousticness: js.UndefOr[scala.Double] = js.undefined
  var max_danceability: js.UndefOr[scala.Double] = js.undefined
  var max_duration_ms: js.UndefOr[scala.Double] = js.undefined
  var max_energy: js.UndefOr[scala.Double] = js.undefined
  var max_instrumentalness: js.UndefOr[scala.Double] = js.undefined
  var max_key: js.UndefOr[scala.Double] = js.undefined
  var max_liveness: js.UndefOr[scala.Double] = js.undefined
  var max_loudness: js.UndefOr[scala.Double] = js.undefined
  var max_mode: js.UndefOr[scala.Double] = js.undefined
  var max_popularity: js.UndefOr[scala.Double] = js.undefined
  var max_speechiness: js.UndefOr[scala.Double] = js.undefined
  var max_tempo: js.UndefOr[scala.Double] = js.undefined
  var max_time_signature: js.UndefOr[scala.Double] = js.undefined
  var max_valence: js.UndefOr[scala.Double] = js.undefined
  var min_acousticness: js.UndefOr[scala.Double] = js.undefined
  var min_danceability: js.UndefOr[scala.Double] = js.undefined
  var min_duration_ms: js.UndefOr[scala.Double] = js.undefined
  var min_energy: js.UndefOr[scala.Double] = js.undefined
  var min_instrumentalness: js.UndefOr[scala.Double] = js.undefined
  var min_key: js.UndefOr[scala.Double] = js.undefined
  var min_liveness: js.UndefOr[scala.Double] = js.undefined
  var min_loudness: js.UndefOr[scala.Double] = js.undefined
  var min_mode: js.UndefOr[scala.Double] = js.undefined
  var min_popularity: js.UndefOr[scala.Double] = js.undefined
  var min_speechiness: js.UndefOr[scala.Double] = js.undefined
  var min_tempo: js.UndefOr[scala.Double] = js.undefined
  var min_time_signature: js.UndefOr[scala.Double] = js.undefined
  var min_valence: js.UndefOr[scala.Double] = js.undefined
  var seed_artists: js.UndefOr[java.lang.String] = js.undefined
     // Comma separated string
  var seed_genres: js.UndefOr[java.lang.String] = js.undefined
     // Comma separated string
  var seed_tracks: js.UndefOr[java.lang.String] = js.undefined
     // Comma separated string
  var target_acousticness: js.UndefOr[scala.Double] = js.undefined
  var target_danceability: js.UndefOr[scala.Double] = js.undefined
  var target_duration_ms: js.UndefOr[scala.Double] = js.undefined
  var target_energy: js.UndefOr[scala.Double] = js.undefined
  var target_instrumentalness: js.UndefOr[scala.Double] = js.undefined
  var target_key: js.UndefOr[scala.Double] = js.undefined
  var target_liveness: js.UndefOr[scala.Double] = js.undefined
  var target_loudness: js.UndefOr[scala.Double] = js.undefined
  var target_mode: js.UndefOr[scala.Double] = js.undefined
  var target_popularity: js.UndefOr[scala.Double] = js.undefined
  var target_speechiness: js.UndefOr[scala.Double] = js.undefined
  var target_tempo: js.UndefOr[scala.Double] = js.undefined
  var target_time_signature: js.UndefOr[scala.Double] = js.undefined
  var target_valence: js.UndefOr[scala.Double] = js.undefined
}

