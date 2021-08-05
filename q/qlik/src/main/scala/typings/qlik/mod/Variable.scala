package typings.qlik.mod

import typings.qlik.anon.QIsNum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variable extends StObject {
  
  var qContent: QIsNum
}
object Variable {
  
  inline def apply(qContent: QIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  extension [Self <: Variable](x: Self) {
    
    inline def setQContent(value: QIsNum): Self = StObject.set(x, "qContent", value.asInstanceOf[js.Any])
  }
}
