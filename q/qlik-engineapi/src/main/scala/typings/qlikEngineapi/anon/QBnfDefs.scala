package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IBNFDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QBnfDefs extends StObject {
  
  var qBnfDefs: IBNFDef
  
  var qBnfHash: String
}
object QBnfDefs {
  
  inline def apply(qBnfDefs: IBNFDef, qBnfHash: String): QBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfDefs]
  }
  
  extension [Self <: QBnfDefs](x: Self) {
    
    inline def setQBnfDefs(value: IBNFDef): Self = StObject.set(x, "qBnfDefs", value.asInstanceOf[js.Any])
    
    inline def setQBnfHash(value: String): Self = StObject.set(x, "qBnfHash", value.asInstanceOf[js.Any])
  }
}
