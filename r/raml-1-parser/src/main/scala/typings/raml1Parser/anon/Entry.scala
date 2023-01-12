package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  var entry: Any
  
  var parameters: Any
}
object Entry {
  
  inline def apply(entry: Any, parameters: Any): Entry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
