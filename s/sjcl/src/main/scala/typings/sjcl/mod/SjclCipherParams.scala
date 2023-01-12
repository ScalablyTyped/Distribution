package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclCipherParams extends StObject {
  
  var adata: js.UndefOr[String] = js.undefined
  
  var cipher: js.UndefOr[String] = js.undefined
  
  var iter: js.UndefOr[Double] = js.undefined
  
  var ks: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var v: js.UndefOr[Double] = js.undefined
}
object SjclCipherParams {
  
  inline def apply(): SjclCipherParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SjclCipherParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclCipherParams] (val x: Self) extends AnyVal {
    
    inline def setAdata(value: String): Self = StObject.set(x, "adata", value.asInstanceOf[js.Any])
    
    inline def setAdataUndefined: Self = StObject.set(x, "adata", js.undefined)
    
    inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    inline def setIter(value: Double): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
    
    inline def setIterUndefined: Self = StObject.set(x, "iter", js.undefined)
    
    inline def setKs(value: Double): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
    
    inline def setKsUndefined: Self = StObject.set(x, "ks", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
