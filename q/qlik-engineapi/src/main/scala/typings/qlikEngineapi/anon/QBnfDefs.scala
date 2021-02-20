package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IBNFDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QBnfDefs extends StObject {
  
  var qBnfDefs: IBNFDef = js.native
  
  var qBnfHash: String = js.native
}
object QBnfDefs {
  
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): QBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfDefs]
  }
  
  @scala.inline
  implicit class QBnfDefsMutableBuilder[Self <: QBnfDefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBnfDefs(value: IBNFDef): Self = StObject.set(x, "qBnfDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBnfHash(value: String): Self = StObject.set(x, "qBnfHash", value.asInstanceOf[js.Any])
  }
}
