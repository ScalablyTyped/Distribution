package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.audio_features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio Features Object
  * https://developer.spotify.com/web-api/object-model/#audio-features-object
  */
trait AudioFeaturesObject extends js.Object {
  var acousticness: Double
  var analysis_url: String
  var danceability: Double
  var duration_ms: Double
  var energy: Double
  var id: String
  var instrumentalness: Double
  var key: Double
  var liveness: Double
  var loudness: Double
  var mode: Double
  var speechiness: Double
  var tempo: Double
  var time_signature: Double
  var track_href: String
  var `type`: audio_features
  var uri: String
  var valence: Double
}

object AudioFeaturesObject {
  @scala.inline
  def apply(
    acousticness: Double,
    analysis_url: String,
    danceability: Double,
    duration_ms: Double,
    energy: Double,
    id: String,
    instrumentalness: Double,
    key: Double,
    liveness: Double,
    loudness: Double,
    mode: Double,
    speechiness: Double,
    tempo: Double,
    time_signature: Double,
    track_href: String,
    `type`: audio_features,
    uri: String,
    valence: Double
  ): AudioFeaturesObject = {
    val __obj = js.Dynamic.literal(acousticness = acousticness.asInstanceOf[js.Any], analysis_url = analysis_url.asInstanceOf[js.Any], danceability = danceability.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instrumentalness = instrumentalness.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], liveness = liveness.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], speechiness = speechiness.asInstanceOf[js.Any], tempo = tempo.asInstanceOf[js.Any], time_signature = time_signature.asInstanceOf[js.Any], track_href = track_href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valence = valence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFeaturesObject]
  }
}

