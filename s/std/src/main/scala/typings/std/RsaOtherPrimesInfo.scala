package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaOtherPrimesInfo extends StObject {
  
  /* standard dom */
  var d: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var r: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var t: js.UndefOr[java.lang.String] = js.undefined
}
object RsaOtherPrimesInfo {
  
  inline def apply(): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RsaOtherPrimesInfo] (val x: Self) extends AnyVal {
    
    inline def setD(value: java.lang.String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setR(value: java.lang.String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setT(value: java.lang.String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
