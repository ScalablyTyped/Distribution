package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAnalysisIntervalObject extends StObject {
  
  var confidence: Double
  
  var duration: Double
  
  var start: Double
}
object AudioAnalysisIntervalObject {
  
  inline def apply(confidence: Double, duration: Double, start: Double): AudioAnalysisIntervalObject = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisIntervalObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioAnalysisIntervalObject] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
