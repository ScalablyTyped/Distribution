package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio Features Object
  * https://developer.spotify.com/web-api/object-model/#audio-features-object
  */
trait AudioFeaturesObject extends js.Object {
  var acousticness: scala.Double
  var analysis_url: java.lang.String
  var danceability: scala.Double
  var duration_ms: scala.Double
  var energy: scala.Double
  var id: java.lang.String
  var instrumentalness: scala.Double
  var key: scala.Double
  var liveness: scala.Double
  var loudness: scala.Double
  var mode: scala.Double
  var speechiness: scala.Double
  var tempo: scala.Double
  var time_signature: scala.Double
  var track_href: java.lang.String
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.audio_features
  var uri: java.lang.String
  var valence: scala.Double
}

object AudioFeaturesObject {
  @scala.inline
  def apply(
    acousticness: scala.Double,
    analysis_url: java.lang.String,
    danceability: scala.Double,
    duration_ms: scala.Double,
    energy: scala.Double,
    id: java.lang.String,
    instrumentalness: scala.Double,
    key: scala.Double,
    liveness: scala.Double,
    loudness: scala.Double,
    mode: scala.Double,
    speechiness: scala.Double,
    tempo: scala.Double,
    time_signature: scala.Double,
    track_href: java.lang.String,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.audio_features,
    uri: java.lang.String,
    valence: scala.Double
  ): AudioFeaturesObject = {
    val __obj = js.Dynamic.literal(acousticness = acousticness, analysis_url = analysis_url, danceability = danceability, duration_ms = duration_ms, energy = energy, id = id, instrumentalness = instrumentalness, key = key, liveness = liveness, loudness = loudness, mode = mode, speechiness = speechiness, tempo = tempo, time_signature = time_signature, track_href = track_href, uri = uri, valence = valence)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AudioFeaturesObject]
  }
}

