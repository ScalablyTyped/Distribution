package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobDfIOS extends StObject {
  
  var free: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object RNFetchBlobDfIOS {
  
  inline def apply(): RNFetchBlobDfIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RNFetchBlobDfIOS]
  }
  
  extension [Self <: RNFetchBlobDfIOS](x: Self) {
    
    inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setFreeUndefined: Self = StObject.set(x, "free", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
