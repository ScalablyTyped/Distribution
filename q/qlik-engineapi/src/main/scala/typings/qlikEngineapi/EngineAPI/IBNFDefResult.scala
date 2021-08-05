package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IBNFDefResult
  */
trait IBNFDefResult extends StObject {
  
  /**
    * Description of the scripting language grammar.
    */
  var qBnfDefs: js.Array[IBNFDef]
  
  /**
    * A string hash of the BNF definition.
    */
  var qBnfHash: String
}
object IBNFDefResult {
  
  inline def apply(qBnfDefs: js.Array[IBNFDef], qBnfHash: String): IBNFDefResult = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDefResult]
  }
  
  extension [Self <: IBNFDefResult](x: Self) {
    
    inline def setQBnfDefs(value: js.Array[IBNFDef]): Self = StObject.set(x, "qBnfDefs", value.asInstanceOf[js.Any])
    
    inline def setQBnfDefsVarargs(value: IBNFDef*): Self = StObject.set(x, "qBnfDefs", js.Array(value :_*))
    
    inline def setQBnfHash(value: String): Self = StObject.set(x, "qBnfHash", value.asInstanceOf[js.Any])
  }
}
