package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEstimate extends StObject {
  
  /* standard dom */
  var quota: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var usage: js.UndefOr[Double] = js.undefined
}
object StorageEstimate {
  
  inline def apply(): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageEstimate] (val x: Self) extends AnyVal {
    
    inline def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
