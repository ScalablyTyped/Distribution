package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEstimate extends StObject {
  
  var quota: js.UndefOr[Double] = js.undefined
  
  var usage: js.UndefOr[Double] = js.undefined
}
object StorageEstimate {
  
  @scala.inline
  def apply(): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEstimate]
  }
  
  @scala.inline
  implicit class StorageEstimateMutableBuilder[Self <: StorageEstimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuota(value: Double): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
