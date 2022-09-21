package typings.sshpk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOptions extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var parts: js.Array[KeyPart]
  
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: AlgorithmTypeWithCurve
}
object KeyOptions {
  
  inline def apply(parts: js.Array[KeyPart], `type`: AlgorithmTypeWithCurve): KeyOptions = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOptions]
  }
  
  extension [Self <: KeyOptions](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setParts(value: js.Array[KeyPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: KeyPart*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: AlgorithmTypeWithCurve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
