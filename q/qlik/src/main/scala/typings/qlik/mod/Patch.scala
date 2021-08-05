package typings.qlik.mod

import typings.qlik.qlikStrings.add
import typings.qlik.qlikStrings.remove
import typings.qlik.qlikStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  var qOp: add | remove | replace
  
  var qPath: String
  
  var qValue: String
}
object Patch {
  
  inline def apply(qOp: add | remove | replace, qPath: String, qValue: String): Patch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  extension [Self <: Patch](x: Self) {
    
    inline def setQOp(value: add | remove | replace): Self = StObject.set(x, "qOp", value.asInstanceOf[js.Any])
    
    inline def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
