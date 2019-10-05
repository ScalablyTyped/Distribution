package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.audio_features
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
    val __obj = js.Dynamic.literal(acousticness = acousticness, analysis_url = analysis_url, danceability = danceability, duration_ms = duration_ms, energy = energy, id = id, instrumentalness = instrumentalness, key = key, liveness = liveness, loudness = loudness, mode = mode, speechiness = speechiness, tempo = tempo, time_signature = time_signature, track_href = track_href, uri = uri, valence = valence)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AudioFeaturesObject]
  }
}

