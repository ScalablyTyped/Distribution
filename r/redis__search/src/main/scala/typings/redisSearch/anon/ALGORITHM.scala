package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.VectorAlgorithms
import typings.redisSearch.redisSearchStrings.COSINE
import typings.redisSearch.redisSearchStrings.IP
import typings.redisSearch.redisSearchStrings.L2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALGORITHM[T /* <: VectorAlgorithms */] extends StObject {
  
  var ALGORITHM: T
  
  var DIM: Double
  
  var DISTANCE_METRIC: L2 | IP | COSINE
  
  var INITIAL_CAP: js.UndefOr[Double] = js.undefined
  
  var TYPE: String
}
object ALGORITHM {
  
  inline def apply[T /* <: VectorAlgorithms */](ALGORITHM: T, DIM: Double, DISTANCE_METRIC: L2 | IP | COSINE, TYPE: String): ALGORITHM[T] = {
    val __obj = js.Dynamic.literal(ALGORITHM = ALGORITHM.asInstanceOf[js.Any], DIM = DIM.asInstanceOf[js.Any], DISTANCE_METRIC = DISTANCE_METRIC.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALGORITHM[T]]
  }
  
  extension [Self <: ALGORITHM[?], T /* <: VectorAlgorithms */](x: Self & ALGORITHM[T]) {
    
    inline def setALGORITHM(value: T): Self = StObject.set(x, "ALGORITHM", value.asInstanceOf[js.Any])
    
    inline def setDIM(value: Double): Self = StObject.set(x, "DIM", value.asInstanceOf[js.Any])
    
    inline def setDISTANCE_METRIC(value: L2 | IP | COSINE): Self = StObject.set(x, "DISTANCE_METRIC", value.asInstanceOf[js.Any])
    
    inline def setINITIAL_CAP(value: Double): Self = StObject.set(x, "INITIAL_CAP", value.asInstanceOf[js.Any])
    
    inline def setINITIAL_CAPUndefined: Self = StObject.set(x, "INITIAL_CAP", js.undefined)
    
    inline def setTYPE(value: String): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
  }
}
