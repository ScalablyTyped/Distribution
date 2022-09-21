package typings.sshpk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FingerprintParseOptions extends StObject {
  
  var algotirhms: js.UndefOr[js.Array[String]] = js.undefined
  
  var enAlgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var hashType: js.UndefOr[FingerprintHashType] = js.undefined
  
  var `type`: js.UndefOr[FingerprintType] = js.undefined
}
object FingerprintParseOptions {
  
  inline def apply(): FingerprintParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FingerprintParseOptions]
  }
  
  extension [Self <: FingerprintParseOptions](x: Self) {
    
    inline def setAlgotirhms(value: js.Array[String]): Self = StObject.set(x, "algotirhms", value.asInstanceOf[js.Any])
    
    inline def setAlgotirhmsUndefined: Self = StObject.set(x, "algotirhms", js.undefined)
    
    inline def setAlgotirhmsVarargs(value: String*): Self = StObject.set(x, "algotirhms", js.Array(value*))
    
    inline def setEnAlgs(value: js.Array[String]): Self = StObject.set(x, "enAlgs", value.asInstanceOf[js.Any])
    
    inline def setEnAlgsUndefined: Self = StObject.set(x, "enAlgs", js.undefined)
    
    inline def setEnAlgsVarargs(value: String*): Self = StObject.set(x, "enAlgs", js.Array(value*))
    
    inline def setHashType(value: FingerprintHashType): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
    
    inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    
    inline def setType(value: FingerprintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
