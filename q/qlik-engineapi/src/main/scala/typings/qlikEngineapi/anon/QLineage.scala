package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QLineage extends StObject {
  
  var qLineage: js.Array[QDiscriminator]
}
object QLineage {
  
  inline def apply(qLineage: js.Array[QDiscriminator]): QLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QLineage]
  }
  
  extension [Self <: QLineage](x: Self) {
    
    inline def setQLineage(value: js.Array[QDiscriminator]): Self = StObject.set(x, "qLineage", value.asInstanceOf[js.Any])
    
    inline def setQLineageVarargs(value: QDiscriminator*): Self = StObject.set(x, "qLineage", js.Array(value*))
  }
}
