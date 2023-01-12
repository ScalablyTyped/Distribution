package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobDfAndroid extends StObject {
  
  var external_free: js.UndefOr[String] = js.undefined
  
  var external_total: js.UndefOr[String] = js.undefined
  
  var internal_free: js.UndefOr[String] = js.undefined
  
  var internal_total: js.UndefOr[String] = js.undefined
}
object RNFetchBlobDfAndroid {
  
  inline def apply(): RNFetchBlobDfAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RNFetchBlobDfAndroid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RNFetchBlobDfAndroid] (val x: Self) extends AnyVal {
    
    inline def setExternal_free(value: String): Self = StObject.set(x, "external_free", value.asInstanceOf[js.Any])
    
    inline def setExternal_freeUndefined: Self = StObject.set(x, "external_free", js.undefined)
    
    inline def setExternal_total(value: String): Self = StObject.set(x, "external_total", value.asInstanceOf[js.Any])
    
    inline def setExternal_totalUndefined: Self = StObject.set(x, "external_total", js.undefined)
    
    inline def setInternal_free(value: String): Self = StObject.set(x, "internal_free", value.asInstanceOf[js.Any])
    
    inline def setInternal_freeUndefined: Self = StObject.set(x, "internal_free", js.undefined)
    
    inline def setInternal_total(value: String): Self = StObject.set(x, "internal_total", value.asInstanceOf[js.Any])
    
    inline def setInternal_totalUndefined: Self = StObject.set(x, "internal_total", js.undefined)
  }
}
