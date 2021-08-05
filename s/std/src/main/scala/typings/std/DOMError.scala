package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error object that contains an error name. */
trait DOMError extends StObject {
  
  val name: java.lang.String
}
object DOMError {
  
  inline def apply(name: java.lang.String): DOMError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMError]
  }
  
  extension [Self <: DOMError](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
