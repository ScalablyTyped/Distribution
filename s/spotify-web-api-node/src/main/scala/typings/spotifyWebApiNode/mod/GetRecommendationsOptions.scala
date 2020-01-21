package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecommendationsOptions
  extends LimitOptions
     with MarketOptions {
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
  var seed_genres: js.UndefOr[js.Array[String] | String] = js.undefined
  var seed_tracks: js.UndefOr[js.Array[String] | String] = js.undefined
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

object GetRecommendationsOptions {
  @scala.inline
  def apply(
    limit: Int | Double = null,
    market: String = null,
    max_acousticness: Int | Double = null,
    max_danceability: Int | Double = null,
    max_duration_ms: Int | Double = null,
    max_energy: Int | Double = null,
    max_instrumentalness: Int | Double = null,
    max_key: Int | Double = null,
    max_liveness: Int | Double = null,
    max_loudness: Int | Double = null,
    max_mode: Int | Double = null,
    max_popularity: Int | Double = null,
    max_speechiness: Int | Double = null,
    max_tempo: Int | Double = null,
    max_time_signature: Int | Double = null,
    max_valence: Int | Double = null,
    min_acousticness: Int | Double = null,
    min_danceability: Int | Double = null,
    min_duration_ms: Int | Double = null,
    min_energy: Int | Double = null,
    min_instrumentalness: Int | Double = null,
    min_key: Int | Double = null,
    min_liveness: Int | Double = null,
    min_loudness: Int | Double = null,
    min_mode: Int | Double = null,
    min_popularity: Int | Double = null,
    min_speechiness: Int | Double = null,
    min_tempo: Int | Double = null,
    min_time_signature: Int | Double = null,
    min_valence: Int | Double = null,
    seed_artists: js.Array[String] | String = null,
    seed_genres: js.Array[String] | String = null,
    seed_tracks: js.Array[String] | String = null,
    target_acousticness: Int | Double = null,
    target_danceability: Int | Double = null,
    target_duration_ms: Int | Double = null,
    target_energy: Int | Double = null,
    target_instrumentalness: Int | Double = null,
    target_key: Int | Double = null,
    target_liveness: Int | Double = null,
    target_loudness: Int | Double = null,
    target_mode: Int | Double = null,
    target_popularity: Int | Double = null,
    target_speechiness: Int | Double = null,
    target_tempo: Int | Double = null,
    target_time_signature: Int | Double = null,
    target_valence: Int | Double = null
  ): GetRecommendationsOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    if (max_acousticness != null) __obj.updateDynamic("max_acousticness")(max_acousticness.asInstanceOf[js.Any])
    if (max_danceability != null) __obj.updateDynamic("max_danceability")(max_danceability.asInstanceOf[js.Any])
    if (max_duration_ms != null) __obj.updateDynamic("max_duration_ms")(max_duration_ms.asInstanceOf[js.Any])
    if (max_energy != null) __obj.updateDynamic("max_energy")(max_energy.asInstanceOf[js.Any])
    if (max_instrumentalness != null) __obj.updateDynamic("max_instrumentalness")(max_instrumentalness.asInstanceOf[js.Any])
    if (max_key != null) __obj.updateDynamic("max_key")(max_key.asInstanceOf[js.Any])
    if (max_liveness != null) __obj.updateDynamic("max_liveness")(max_liveness.asInstanceOf[js.Any])
    if (max_loudness != null) __obj.updateDynamic("max_loudness")(max_loudness.asInstanceOf[js.Any])
    if (max_mode != null) __obj.updateDynamic("max_mode")(max_mode.asInstanceOf[js.Any])
    if (max_popularity != null) __obj.updateDynamic("max_popularity")(max_popularity.asInstanceOf[js.Any])
    if (max_speechiness != null) __obj.updateDynamic("max_speechiness")(max_speechiness.asInstanceOf[js.Any])
    if (max_tempo != null) __obj.updateDynamic("max_tempo")(max_tempo.asInstanceOf[js.Any])
    if (max_time_signature != null) __obj.updateDynamic("max_time_signature")(max_time_signature.asInstanceOf[js.Any])
    if (max_valence != null) __obj.updateDynamic("max_valence")(max_valence.asInstanceOf[js.Any])
    if (min_acousticness != null) __obj.updateDynamic("min_acousticness")(min_acousticness.asInstanceOf[js.Any])
    if (min_danceability != null) __obj.updateDynamic("min_danceability")(min_danceability.asInstanceOf[js.Any])
    if (min_duration_ms != null) __obj.updateDynamic("min_duration_ms")(min_duration_ms.asInstanceOf[js.Any])
    if (min_energy != null) __obj.updateDynamic("min_energy")(min_energy.asInstanceOf[js.Any])
    if (min_instrumentalness != null) __obj.updateDynamic("min_instrumentalness")(min_instrumentalness.asInstanceOf[js.Any])
    if (min_key != null) __obj.updateDynamic("min_key")(min_key.asInstanceOf[js.Any])
    if (min_liveness != null) __obj.updateDynamic("min_liveness")(min_liveness.asInstanceOf[js.Any])
    if (min_loudness != null) __obj.updateDynamic("min_loudness")(min_loudness.asInstanceOf[js.Any])
    if (min_mode != null) __obj.updateDynamic("min_mode")(min_mode.asInstanceOf[js.Any])
    if (min_popularity != null) __obj.updateDynamic("min_popularity")(min_popularity.asInstanceOf[js.Any])
    if (min_speechiness != null) __obj.updateDynamic("min_speechiness")(min_speechiness.asInstanceOf[js.Any])
    if (min_tempo != null) __obj.updateDynamic("min_tempo")(min_tempo.asInstanceOf[js.Any])
    if (min_time_signature != null) __obj.updateDynamic("min_time_signature")(min_time_signature.asInstanceOf[js.Any])
    if (min_valence != null) __obj.updateDynamic("min_valence")(min_valence.asInstanceOf[js.Any])
    if (seed_artists != null) __obj.updateDynamic("seed_artists")(seed_artists.asInstanceOf[js.Any])
    if (seed_genres != null) __obj.updateDynamic("seed_genres")(seed_genres.asInstanceOf[js.Any])
    if (seed_tracks != null) __obj.updateDynamic("seed_tracks")(seed_tracks.asInstanceOf[js.Any])
    if (target_acousticness != null) __obj.updateDynamic("target_acousticness")(target_acousticness.asInstanceOf[js.Any])
    if (target_danceability != null) __obj.updateDynamic("target_danceability")(target_danceability.asInstanceOf[js.Any])
    if (target_duration_ms != null) __obj.updateDynamic("target_duration_ms")(target_duration_ms.asInstanceOf[js.Any])
    if (target_energy != null) __obj.updateDynamic("target_energy")(target_energy.asInstanceOf[js.Any])
    if (target_instrumentalness != null) __obj.updateDynamic("target_instrumentalness")(target_instrumentalness.asInstanceOf[js.Any])
    if (target_key != null) __obj.updateDynamic("target_key")(target_key.asInstanceOf[js.Any])
    if (target_liveness != null) __obj.updateDynamic("target_liveness")(target_liveness.asInstanceOf[js.Any])
    if (target_loudness != null) __obj.updateDynamic("target_loudness")(target_loudness.asInstanceOf[js.Any])
    if (target_mode != null) __obj.updateDynamic("target_mode")(target_mode.asInstanceOf[js.Any])
    if (target_popularity != null) __obj.updateDynamic("target_popularity")(target_popularity.asInstanceOf[js.Any])
    if (target_speechiness != null) __obj.updateDynamic("target_speechiness")(target_speechiness.asInstanceOf[js.Any])
    if (target_tempo != null) __obj.updateDynamic("target_tempo")(target_tempo.asInstanceOf[js.Any])
    if (target_time_signature != null) __obj.updateDynamic("target_time_signature")(target_time_signature.asInstanceOf[js.Any])
    if (target_valence != null) __obj.updateDynamic("target_valence")(target_valence.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsOptions]
  }
}

