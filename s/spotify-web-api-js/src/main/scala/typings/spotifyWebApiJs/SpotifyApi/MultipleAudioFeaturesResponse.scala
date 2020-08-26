package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get audio features for several tracks
  *
  * GET /v1/audio-features?ids={ids}
  * https://developer.spotify.com/get-several-audio-features/
  */
@js.native
trait MultipleAudioFeaturesResponse extends js.Object {
  var audio_features: js.Array[AudioFeaturesObject] = js.native
}

object MultipleAudioFeaturesResponse {
  @scala.inline
  def apply(audio_features: js.Array[AudioFeaturesObject]): MultipleAudioFeaturesResponse = {
    val __obj = js.Dynamic.literal(audio_features = audio_features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAudioFeaturesResponse]
  }
  @scala.inline
  implicit class MultipleAudioFeaturesResponseOps[Self <: MultipleAudioFeaturesResponse] (val x: Self) extends AnyVal {
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
    def setAudio_featuresVarargs(value: AudioFeaturesObject*): Self = this.set("audio_features", js.Array(value :_*))
    @scala.inline
    def setAudio_features(value: js.Array[AudioFeaturesObject]): Self = this.set("audio_features", value.asInstanceOf[js.Any])
  }
  
}

