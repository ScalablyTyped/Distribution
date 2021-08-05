package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldRange extends StObject {
  
  var oldRange: js.Any
  
  var range: js.Any
  
  var source: String
}
object OldRange {
  
  inline def apply(oldRange: js.Any, range: js.Any, source: String): OldRange = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldRange]
  }
  
  extension [Self <: OldRange](x: Self) {
    
    inline def setOldRange(value: js.Any): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
