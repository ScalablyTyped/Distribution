package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofHandler extends StObject {
  
  /* static member */
  var pattern: js.RegExp
}
object TypeofHandler {
  
  inline def apply(pattern: js.RegExp): TypeofHandler = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHandler]
  }
  
  extension [Self <: TypeofHandler](x: Self) {
    
    inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
