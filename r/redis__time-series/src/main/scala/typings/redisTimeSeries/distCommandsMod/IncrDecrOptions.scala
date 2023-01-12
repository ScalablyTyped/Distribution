package typings.redisTimeSeries.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrDecrOptions extends StObject {
  
  var CHUNK_SIZE: js.UndefOr[Double] = js.undefined
  
  var LABELS: js.UndefOr[Labels] = js.undefined
  
  var RETENTION: js.UndefOr[Double] = js.undefined
  
  var TIMESTAMP: js.UndefOr[Timestamp] = js.undefined
  
  var UNCOMPRESSED: js.UndefOr[Boolean] = js.undefined
}
object IncrDecrOptions {
  
  inline def apply(): IncrDecrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncrDecrOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncrDecrOptions] (val x: Self) extends AnyVal {
    
    inline def setCHUNK_SIZE(value: Double): Self = StObject.set(x, "CHUNK_SIZE", value.asInstanceOf[js.Any])
    
    inline def setCHUNK_SIZEUndefined: Self = StObject.set(x, "CHUNK_SIZE", js.undefined)
    
    inline def setLABELS(value: Labels): Self = StObject.set(x, "LABELS", value.asInstanceOf[js.Any])
    
    inline def setLABELSUndefined: Self = StObject.set(x, "LABELS", js.undefined)
    
    inline def setRETENTION(value: Double): Self = StObject.set(x, "RETENTION", value.asInstanceOf[js.Any])
    
    inline def setRETENTIONUndefined: Self = StObject.set(x, "RETENTION", js.undefined)
    
    inline def setTIMESTAMP(value: Timestamp): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
    
    inline def setTIMESTAMPUndefined: Self = StObject.set(x, "TIMESTAMP", js.undefined)
    
    inline def setUNCOMPRESSED(value: Boolean): Self = StObject.set(x, "UNCOMPRESSED", value.asInstanceOf[js.Any])
    
    inline def setUNCOMPRESSEDUndefined: Self = StObject.set(x, "UNCOMPRESSED", js.undefined)
  }
}
