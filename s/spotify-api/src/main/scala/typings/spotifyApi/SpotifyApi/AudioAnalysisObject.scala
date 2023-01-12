package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audio Analysis Object
  * https://developer.spotify.com/documentation/web-api/reference/#/operations/get-audio-analysis
  */
trait AudioAnalysisObject extends StObject {
  
  var bars: js.Array[AudioAnalysisIntervalObject]
  
  var beats: js.Array[AudioAnalysisIntervalObject]
  
  var meta: AudioAnalysisMeta
  
  var sections: js.Array[AudioAnalysisSection]
  
  var segments: js.Array[AudioAnalysisSegment]
  
  var tatums: js.Array[AudioAnalysisIntervalObject]
  
  var track: AudioAnalysisTrack
}
object AudioAnalysisObject {
  
  inline def apply(
    bars: js.Array[AudioAnalysisIntervalObject],
    beats: js.Array[AudioAnalysisIntervalObject],
    meta: AudioAnalysisMeta,
    sections: js.Array[AudioAnalysisSection],
    segments: js.Array[AudioAnalysisSegment],
    tatums: js.Array[AudioAnalysisIntervalObject],
    track: AudioAnalysisTrack
  ): AudioAnalysisObject = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], beats = beats.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], tatums = tatums.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAnalysisObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioAnalysisObject] (val x: Self) extends AnyVal {
    
    inline def setBars(value: js.Array[AudioAnalysisIntervalObject]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: AudioAnalysisIntervalObject*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setBeats(value: js.Array[AudioAnalysisIntervalObject]): Self = StObject.set(x, "beats", value.asInstanceOf[js.Any])
    
    inline def setBeatsVarargs(value: AudioAnalysisIntervalObject*): Self = StObject.set(x, "beats", js.Array(value*))
    
    inline def setMeta(value: AudioAnalysisMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[AudioAnalysisSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: AudioAnalysisSection*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSegments(value: js.Array[AudioAnalysisSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: AudioAnalysisSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setTatums(value: js.Array[AudioAnalysisIntervalObject]): Self = StObject.set(x, "tatums", value.asInstanceOf[js.Any])
    
    inline def setTatumsVarargs(value: AudioAnalysisIntervalObject*): Self = StObject.set(x, "tatums", js.Array(value*))
    
    inline def setTrack(value: AudioAnalysisTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
