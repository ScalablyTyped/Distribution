package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedVideoFrameMetadata extends StObject {
  
  /* standard dom */
  var contributingSources: js.UndefOr[js.Array[Double]] = js.undefined
  
  /* standard dom */
  var dependencies: js.UndefOr[js.Array[Double]] = js.undefined
  
  /* standard dom */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var height: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var spatialIndex: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var synchronizationSource: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var temporalIndex: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var width: js.UndefOr[Double] = js.undefined
}
object RTCEncodedVideoFrameMetadata {
  
  inline def apply(): RTCEncodedVideoFrameMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCEncodedVideoFrameMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCEncodedVideoFrameMetadata] (val x: Self) extends AnyVal {
    
    inline def setContributingSources(value: js.Array[Double]): Self = StObject.set(x, "contributingSources", value.asInstanceOf[js.Any])
    
    inline def setContributingSourcesUndefined: Self = StObject.set(x, "contributingSources", js.undefined)
    
    inline def setContributingSourcesVarargs(value: Double*): Self = StObject.set(x, "contributingSources", js.Array(value*))
    
    inline def setDependencies(value: js.Array[Double]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: Double*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSpatialIndex(value: Double): Self = StObject.set(x, "spatialIndex", value.asInstanceOf[js.Any])
    
    inline def setSpatialIndexUndefined: Self = StObject.set(x, "spatialIndex", js.undefined)
    
    inline def setSynchronizationSource(value: Double): Self = StObject.set(x, "synchronizationSource", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationSourceUndefined: Self = StObject.set(x, "synchronizationSource", js.undefined)
    
    inline def setTemporalIndex(value: Double): Self = StObject.set(x, "temporalIndex", value.asInstanceOf[js.Any])
    
    inline def setTemporalIndexUndefined: Self = StObject.set(x, "temporalIndex", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
