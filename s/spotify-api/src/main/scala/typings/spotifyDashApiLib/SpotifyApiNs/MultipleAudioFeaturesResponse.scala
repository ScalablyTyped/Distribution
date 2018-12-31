package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get audio features for several tracks
  * 
  * GET /v1/audio-features?ids={ids}
  * https://developer.spotify.com/get-several-audio-features/
  */
trait MultipleAudioFeaturesResponse extends js.Object {
  var audio_features: js.Array[AudioFeaturesObject]
}

