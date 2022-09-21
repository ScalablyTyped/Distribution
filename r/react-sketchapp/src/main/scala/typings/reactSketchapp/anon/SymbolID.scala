package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolID extends StObject {
  
  var name: String
  
  var symbolID: String
}
object SymbolID {
  
  inline def apply(name: String, symbolID: String): SymbolID = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbolID = symbolID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolID]
  }
  
  extension [Self <: SymbolID](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSymbolID(value: String): Self = StObject.set(x, "symbolID", value.asInstanceOf[js.Any])
  }
}
