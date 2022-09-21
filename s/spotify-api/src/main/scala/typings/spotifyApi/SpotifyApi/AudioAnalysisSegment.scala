package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAnalysisSegment extends StObject {
  
  var confidence: Double
  
  var duration: Double
  
  var loudness_end: Double
  
  var loudness_max: Double
  
  var loudness_max_time: Double
  
  var loudness_start: Double
  
  var pitches: js.Array[Double]
  
  var start: Double
  
  var timbre: js.Array[Double]
}
object AudioAnalysisSegment {
  
  inline def apply(
    confidence: Double,
    duration: Double,
    loudness_end: Double,
    loudness_max: Double,
    loudness_max_time: Double,
    loudness_start: Double,
    pitches: js.Array[Double],
    start: Double,
    timbre: js.Array[Double]
  ): AudioAnalysisSegment = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loudness_end = loudness_end.asInstanceOf[js.Any], loudness_max = loudness_max.asInstanceOf[js.Any], loudness_max_time = loudness_max_time.asInstanceOf[js.Any], loudness_start = loudness_start.asInstanceOf[js.Any], pitches = pitches.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], timbre = timbre.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisSegment]
  }
  
  extension [Self <: AudioAnalysisSegment](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoudness_end(value: Double): Self = StObject.set(x, "loudness_end", value.asInstanceOf[js.Any])
    
    inline def setLoudness_max(value: Double): Self = StObject.set(x, "loudness_max", value.asInstanceOf[js.Any])
    
    inline def setLoudness_max_time(value: Double): Self = StObject.set(x, "loudness_max_time", value.asInstanceOf[js.Any])
    
    inline def setLoudness_start(value: Double): Self = StObject.set(x, "loudness_start", value.asInstanceOf[js.Any])
    
    inline def setPitches(value: js.Array[Double]): Self = StObject.set(x, "pitches", value.asInstanceOf[js.Any])
    
    inline def setPitchesVarargs(value: Double*): Self = StObject.set(x, "pitches", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTimbre(value: js.Array[Double]): Self = StObject.set(x, "timbre", value.asInstanceOf[js.Any])
    
    inline def setTimbreVarargs(value: Double*): Self = StObject.set(x, "timbre", js.Array(value*))
  }
}
