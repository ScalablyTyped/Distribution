package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAnalysisMeta extends StObject {
  
  var analysis_time: Double
  
  var analyzer_version: String
  
  var detailed_status: String
  
  var input_process: String
  
  var platform: String
  
  var status_code: Double
  
  var timestamp: Double
}
object AudioAnalysisMeta {
  
  inline def apply(
    analysis_time: Double,
    analyzer_version: String,
    detailed_status: String,
    input_process: String,
    platform: String,
    status_code: Double,
    timestamp: Double
  ): AudioAnalysisMeta = {
    val __obj = js.Dynamic.literal(analysis_time = analysis_time.asInstanceOf[js.Any], analyzer_version = analyzer_version.asInstanceOf[js.Any], detailed_status = detailed_status.asInstanceOf[js.Any], input_process = input_process.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisMeta]
  }
  
  extension [Self <: AudioAnalysisMeta](x: Self) {
    
    inline def setAnalysis_time(value: Double): Self = StObject.set(x, "analysis_time", value.asInstanceOf[js.Any])
    
    inline def setAnalyzer_version(value: String): Self = StObject.set(x, "analyzer_version", value.asInstanceOf[js.Any])
    
    inline def setDetailed_status(value: String): Self = StObject.set(x, "detailed_status", value.asInstanceOf[js.Any])
    
    inline def setInput_process(value: String): Self = StObject.set(x, "input_process", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
