package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.audio_features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio Features Object
  * https://developer.spotify.com/web-api/object-model/#audio-features-object
  */
@js.native
trait AudioFeaturesObject extends js.Object {
  
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
  implicit class AudioFeaturesObjectOps[Self <: AudioFeaturesObject] (val x: Self) extends AnyVal {
    
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
    def setAcousticness(value: Double): Self = this.set("acousticness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysis_url(value: String): Self = this.set("analysis_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDanceability(value: Double): Self = this.set("danceability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ms(value: Double): Self = this.set("duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergy(value: Double): Self = this.set("energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentalness(value: Double): Self = this.set("instrumentalness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveness(value: Double): Self = this.set("liveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoudness(value: Double): Self = this.set("loudness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechiness(value: Double): Self = this.set("speechiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempo(value: Double): Self = this.set("tempo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_signature(value: Double): Self = this.set("time_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_href(value: String): Self = this.set("track_href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: audio_features): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValence(value: Double): Self = this.set("valence", value.asInstanceOf[js.Any])
  }
}
