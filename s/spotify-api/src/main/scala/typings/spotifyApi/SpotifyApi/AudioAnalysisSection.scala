package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAnalysisSection extends StObject {
  
  var confidence: Double
  
  var duration: Double
  
  var key: Double
  
  var key_confidence: Double
  
  var loudness: Double
  
  var mode: Double
  
  var mode_confidence: Double
  
  var start: Double
  
  var tempo: Double
  
  var tempo_confidence: Double
  
  var time_signature: Double
  
  var time_signature_confidence: Double
}
object AudioAnalysisSection {
  
  inline def apply(
    confidence: Double,
    duration: Double,
    key: Double,
    key_confidence: Double,
    loudness: Double,
    mode: Double,
    mode_confidence: Double,
    start: Double,
    tempo: Double,
    tempo_confidence: Double,
    time_signature: Double,
    time_signature_confidence: Double
  ): AudioAnalysisSection = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], key_confidence = key_confidence.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mode_confidence = mode_confidence.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tempo = tempo.asInstanceOf[js.Any], tempo_confidence = tempo_confidence.asInstanceOf[js.Any], time_signature = time_signature.asInstanceOf[js.Any], time_signature_confidence = time_signature_confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisSection]
  }
  
  extension [Self <: AudioAnalysisSection](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_confidence(value: Double): Self = StObject.set(x, "key_confidence", value.asInstanceOf[js.Any])
    
    inline def setLoudness(value: Double): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMode_confidence(value: Double): Self = StObject.set(x, "mode_confidence", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTempo(value: Double): Self = StObject.set(x, "tempo", value.asInstanceOf[js.Any])
    
    inline def setTempo_confidence(value: Double): Self = StObject.set(x, "tempo_confidence", value.asInstanceOf[js.Any])
    
    inline def setTime_signature(value: Double): Self = StObject.set(x, "time_signature", value.asInstanceOf[js.Any])
    
    inline def setTime_signature_confidence(value: Double): Self = StObject.set(x, "time_signature_confidence", value.asInstanceOf[js.Any])
  }
}
