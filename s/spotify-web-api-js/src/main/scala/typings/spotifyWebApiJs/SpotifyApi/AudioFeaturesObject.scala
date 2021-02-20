package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.audio_features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio Features Object
  * https://developer.spotify.com/web-api/object-model/#audio-features-object
  */
@js.native
trait AudioFeaturesObject extends StObject {
  
  var acousticness: Double = js.native
  
  var analysis_url: String = js.native
  
  var danceability: Double = js.native
  
  var duration_ms: Double = js.native
  
  var energy: Double = js.native
  
  var id: String = js.native
  
  var instrumentalness: Double = js.native
  
  var key: Double = js.native
  
  var liveness: Double = js.native
  
  var loudness: Double = js.native
  
  var mode: Double = js.native
  
  var speechiness: Double = js.native
  
  var tempo: Double = js.native
  
  var time_signature: Double = js.native
  
  var track_href: String = js.native
  
  var `type`: audio_features = js.native
  
  var uri: String = js.native
  
  var valence: Double = js.native
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
  
  @scala.inline
  implicit class AudioFeaturesObjectMutableBuilder[Self <: AudioFeaturesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcousticness(value: Double): Self = StObject.set(x, "acousticness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysis_url(value: String): Self = StObject.set(x, "analysis_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDanceability(value: Double): Self = StObject.set(x, "danceability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentalness(value: Double): Self = StObject.set(x, "instrumentalness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveness(value: Double): Self = StObject.set(x, "liveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoudness(value: Double): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechiness(value: Double): Self = StObject.set(x, "speechiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempo(value: Double): Self = StObject.set(x, "tempo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_signature(value: Double): Self = StObject.set(x, "time_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_href(value: String): Self = StObject.set(x, "track_href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: audio_features): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValence(value: Double): Self = StObject.set(x, "valence", value.asInstanceOf[js.Any])
  }
}
