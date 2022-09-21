package typings.sshpk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureOptions extends StObject {
  
  var curve: js.UndefOr[CurveType] = js.undefined
  
  var hashAlgo: js.UndefOr[AlgorithmHashType] = js.undefined
  
  var parts: js.Array[SignaturePart]
  
  var `type`: AlgorithmType
}
object SignatureOptions {
  
  inline def apply(parts: js.Array[SignaturePart], `type`: AlgorithmType): SignatureOptions = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureOptions]
  }
  
  extension [Self <: SignatureOptions](x: Self) {
    
    inline def setCurve(value: CurveType): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setHashAlgo(value: AlgorithmHashType): Self = StObject.set(x, "hashAlgo", value.asInstanceOf[js.Any])
    
    inline def setHashAlgoUndefined: Self = StObject.set(x, "hashAlgo", js.undefined)
    
    inline def setParts(value: js.Array[SignaturePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: SignaturePart*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setType(value: AlgorithmType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
