package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAnalysisTrack extends StObject {
  
  var analysis_channels: Double
  
  var analysis_sample_rate: Double
  
  var code_version: Double
  
  var codestring: String
  
  var duration: Double
  
  var echoprint_version: Double
  
  var echoprintstring: String
  
  var end_of_fade_in: Double
  
  var key: Double
  
  var key_confidence: Double
  
  var loudness: Double
  
  var mode: Double
  
  var mode_confidence: Double
  
  var num_samples: Double
  
  var offset_seconds: Double
  
  var rhythm_version: Double
  
  var rhythmstring: String
  
  var sample_md5: String
  
  var start_of_fade_out: Double
  
  var synch_version: Double
  
  var synchstring: String
  
  var tempo: Double
  
  var tempo_confidence: Double
  
  var time_signature: Double
  
  var time_signature_confidence: Double
  
  var window_seconds: Double
}
object AudioAnalysisTrack {
  
  inline def apply(
    analysis_channels: Double,
    analysis_sample_rate: Double,
    code_version: Double,
    codestring: String,
    duration: Double,
    echoprint_version: Double,
    echoprintstring: String,
    end_of_fade_in: Double,
    key: Double,
    key_confidence: Double,
    loudness: Double,
    mode: Double,
    mode_confidence: Double,
    num_samples: Double,
    offset_seconds: Double,
    rhythm_version: Double,
    rhythmstring: String,
    sample_md5: String,
    start_of_fade_out: Double,
    synch_version: Double,
    synchstring: String,
    tempo: Double,
    tempo_confidence: Double,
    time_signature: Double,
    time_signature_confidence: Double,
    window_seconds: Double
  ): AudioAnalysisTrack = {
    val __obj = js.Dynamic.literal(analysis_channels = analysis_channels.asInstanceOf[js.Any], analysis_sample_rate = analysis_sample_rate.asInstanceOf[js.Any], code_version = code_version.asInstanceOf[js.Any], codestring = codestring.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], echoprint_version = echoprint_version.asInstanceOf[js.Any], echoprintstring = echoprintstring.asInstanceOf[js.Any], end_of_fade_in = end_of_fade_in.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], key_confidence = key_confidence.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mode_confidence = mode_confidence.asInstanceOf[js.Any], num_samples = num_samples.asInstanceOf[js.Any], offset_seconds = offset_seconds.asInstanceOf[js.Any], rhythm_version = rhythm_version.asInstanceOf[js.Any], rhythmstring = rhythmstring.asInstanceOf[js.Any], sample_md5 = sample_md5.asInstanceOf[js.Any], start_of_fade_out = start_of_fade_out.asInstanceOf[js.Any], synch_version = synch_version.asInstanceOf[js.Any], synchstring = synchstring.asInstanceOf[js.Any], tempo = tempo.asInstanceOf[js.Any], tempo_confidence = tempo_confidence.asInstanceOf[js.Any], time_signature = time_signature.asInstanceOf[js.Any], time_signature_confidence = time_signature_confidence.asInstanceOf[js.Any], window_seconds = window_seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisTrack]
  }
  
  extension [Self <: AudioAnalysisTrack](x: Self) {
    
    inline def setAnalysis_channels(value: Double): Self = StObject.set(x, "analysis_channels", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_sample_rate(value: Double): Self = StObject.set(x, "analysis_sample_rate", value.asInstanceOf[js.Any])
    
    inline def setCode_version(value: Double): Self = StObject.set(x, "code_version", value.asInstanceOf[js.Any])
    
    inline def setCodestring(value: String): Self = StObject.set(x, "codestring", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEchoprint_version(value: Double): Self = StObject.set(x, "echoprint_version", value.asInstanceOf[js.Any])
    
    inline def setEchoprintstring(value: String): Self = StObject.set(x, "echoprintstring", value.asInstanceOf[js.Any])
    
    inline def setEnd_of_fade_in(value: Double): Self = StObject.set(x, "end_of_fade_in", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_confidence(value: Double): Self = StObject.set(x, "key_confidence", value.asInstanceOf[js.Any])
    
    inline def setLoudness(value: Double): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMode_confidence(value: Double): Self = StObject.set(x, "mode_confidence", value.asInstanceOf[js.Any])
    
    inline def setNum_samples(value: Double): Self = StObject.set(x, "num_samples", value.asInstanceOf[js.Any])
    
    inline def setOffset_seconds(value: Double): Self = StObject.set(x, "offset_seconds", value.asInstanceOf[js.Any])
    
    inline def setRhythm_version(value: Double): Self = StObject.set(x, "rhythm_version", value.asInstanceOf[js.Any])
    
    inline def setRhythmstring(value: String): Self = StObject.set(x, "rhythmstring", value.asInstanceOf[js.Any])
    
    inline def setSample_md5(value: String): Self = StObject.set(x, "sample_md5", value.asInstanceOf[js.Any])
    
    inline def setStart_of_fade_out(value: Double): Self = StObject.set(x, "start_of_fade_out", value.asInstanceOf[js.Any])
    
    inline def setSynch_version(value: Double): Self = StObject.set(x, "synch_version", value.asInstanceOf[js.Any])
    
    inline def setSynchstring(value: String): Self = StObject.set(x, "synchstring", value.asInstanceOf[js.Any])
    
    inline def setTempo(value: Double): Self = StObject.set(x, "tempo", value.asInstanceOf[js.Any])
    
    inline def setTempo_confidence(value: Double): Self = StObject.set(x, "tempo_confidence", value.asInstanceOf[js.Any])
    
    inline def setTime_signature(value: Double): Self = StObject.set(x, "time_signature", value.asInstanceOf[js.Any])
    
    inline def setTime_signature_confidence(value: Double): Self = StObject.set(x, "time_signature_confidence", value.asInstanceOf[js.Any])
    
    inline def setWindow_seconds(value: Double): Self = StObject.set(x, "window_seconds", value.asInstanceOf[js.Any])
  }
}
