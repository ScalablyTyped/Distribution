package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides histogram information about tracked world mesh faces in a given area. Returned by DeviceTracking.calculateWorldMeshHistogram(). Lens Studio v3.2+ */
trait TrackedMeshHistogramResult
  extends StObject
     with ScriptObject {
  
  /** Average normal direction, in world space, of the mesh faces. */
  var avgNormal: vec3
  
  /**
    * Array of relative proportions for each classification, in the order described below. The values all add up to a total of 1.0. The classification value order is: * 0: None * 1: Wall * 2: Floor
    * * 3: Ceiling * 4: Table * 5: Seat * 6: Window * 7: Door
    */
  var histogram: js.Array[Double]
}
object TrackedMeshHistogramResult {
  
  inline def apply(
    avgNormal: vec3,
    getTypeName: () => String,
    histogram: js.Array[Double],
    isOfType: String => Boolean
  ): TrackedMeshHistogramResult = {
    val __obj = js.Dynamic.literal(avgNormal = avgNormal.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), histogram = histogram.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TrackedMeshHistogramResult]
  }
  
  extension [Self <: TrackedMeshHistogramResult](x: Self) {
    
    inline def setAvgNormal(value: vec3): Self = StObject.set(x, "avgNormal", value.asInstanceOf[js.Any])
    
    inline def setHistogram(value: js.Array[Double]): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramVarargs(value: Double*): Self = StObject.set(x, "histogram", js.Array(value*))
  }
}
