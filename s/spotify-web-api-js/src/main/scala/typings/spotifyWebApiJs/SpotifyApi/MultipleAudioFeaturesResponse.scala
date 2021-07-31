package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get audio features for several tracks
  *
  * GET /v1/audio-features?ids={ids}
  * https://developer.spotify.com/get-several-audio-features/
  */
trait MultipleAudioFeaturesResponse extends StObject {
  
  var audio_features: js.Array[AudioFeaturesObject]
}
object MultipleAudioFeaturesResponse {
  
  @scala.inline
  def apply(audio_features: js.Array[AudioFeaturesObject]): MultipleAudioFeaturesResponse = {
    val __obj = js.Dynamic.literal(audio_features = audio_features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAudioFeaturesResponse]
  }
  
  @scala.inline
  implicit class MultipleAudioFeaturesResponseMutableBuilder[Self <: MultipleAudioFeaturesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio_features(value: js.Array[AudioFeaturesObject]): Self = StObject.set(x, "audio_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_featuresVarargs(value: AudioFeaturesObject*): Self = StObject.set(x, "audio_features", js.Array(value :_*))
  }
}
