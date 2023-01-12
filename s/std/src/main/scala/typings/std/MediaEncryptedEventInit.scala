package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaEncryptedEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var initData: js.UndefOr[js.typedarray.ArrayBuffer | Null] = js.undefined
  
  /* standard dom */
  var initDataType: js.UndefOr[java.lang.String] = js.undefined
}
object MediaEncryptedEventInit {
  
  inline def apply(): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaEncryptedEventInit] (val x: Self) extends AnyVal {
    
    inline def setInitData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setInitDataNull: Self = StObject.set(x, "initData", null)
    
    inline def setInitDataType(value: java.lang.String): Self = StObject.set(x, "initDataType", value.asInstanceOf[js.Any])
    
    inline def setInitDataTypeUndefined: Self = StObject.set(x, "initDataType", js.undefined)
    
    inline def setInitDataUndefined: Self = StObject.set(x, "initData", js.undefined)
  }
}
