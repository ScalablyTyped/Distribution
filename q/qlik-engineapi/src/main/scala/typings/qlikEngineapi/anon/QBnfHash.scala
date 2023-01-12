package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QBnfHash extends StObject {
  
  var qBnfHash: String
}
object QBnfHash {
  
  inline def apply(qBnfHash: String): QBnfHash = {
    val __obj = js.Dynamic.literal(qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QBnfHash] (val x: Self) extends AnyVal {
    
    inline def setQBnfHash(value: String): Self = StObject.set(x, "qBnfHash", value.asInstanceOf[js.Any])
  }
}
