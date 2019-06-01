package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecommendationsOptions
  extends LimitOptions
     with MarketOptions {
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
  var seed_artists: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var seed_genres: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var seed_tracks: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
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

object GetRecommendationsOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    market: java.lang.String = null,
    max_acousticness: scala.Int | scala.Double = null,
    max_danceability: scala.Int | scala.Double = null,
    max_duration_ms: scala.Int | scala.Double = null,
    max_energy: scala.Int | scala.Double = null,
    max_instrumentalness: scala.Int | scala.Double = null,
    max_key: scala.Int | scala.Double = null,
    max_liveness: scala.Int | scala.Double = null,
    max_loudness: scala.Int | scala.Double = null,
    max_mode: scala.Int | scala.Double = null,
    max_popularity: scala.Int | scala.Double = null,
    max_speechiness: scala.Int | scala.Double = null,
    max_tempo: scala.Int | scala.Double = null,
    max_time_signature: scala.Int | scala.Double = null,
    max_valence: scala.Int | scala.Double = null,
    min_acousticness: scala.Int | scala.Double = null,
    min_danceability: scala.Int | scala.Double = null,
    min_duration_ms: scala.Int | scala.Double = null,
    min_energy: scala.Int | scala.Double = null,
    min_instrumentalness: scala.Int | scala.Double = null,
    min_key: scala.Int | scala.Double = null,
    min_liveness: scala.Int | scala.Double = null,
    min_loudness: scala.Int | scala.Double = null,
    min_mode: scala.Int | scala.Double = null,
    min_popularity: scala.Int | scala.Double = null,
    min_speechiness: scala.Int | scala.Double = null,
    min_tempo: scala.Int | scala.Double = null,
    min_time_signature: scala.Int | scala.Double = null,
    min_valence: scala.Int | scala.Double = null,
    seed_artists: js.Array[java.lang.String] | java.lang.String = null,
    seed_genres: js.Array[java.lang.String] | java.lang.String = null,
    seed_tracks: js.Array[java.lang.String] | java.lang.String = null,
    target_acousticness: scala.Int | scala.Double = null,
    target_danceability: scala.Int | scala.Double = null,
    target_duration_ms: scala.Int | scala.Double = null,
    target_energy: scala.Int | scala.Double = null,
    target_instrumentalness: scala.Int | scala.Double = null,
    target_key: scala.Int | scala.Double = null,
    target_liveness: scala.Int | scala.Double = null,
    target_loudness: scala.Int | scala.Double = null,
    target_mode: scala.Int | scala.Double = null,
    target_popularity: scala.Int | scala.Double = null,
    target_speechiness: scala.Int | scala.Double = null,
    target_tempo: scala.Int | scala.Double = null,
    target_time_signature: scala.Int | scala.Double = null,
    target_valence: scala.Int | scala.Double = null
  ): GetRecommendationsOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market)
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

