package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEstimate extends StObject {
  
  var quota: js.UndefOr[Double] = js.undefined
  
  var usage: js.UndefOr[Double] = js.undefined
}
object StorageEstimate {
  
  inline def apply(): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEstimate]
  }
  
  extension [Self <: StorageEstimate](x: Self) {
    
    inline def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
