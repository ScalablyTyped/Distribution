package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  var first: Double
  
  var originalEvent: typings.std.Event
  
  var rows: Double
}
object Rows {
  
  inline def apply(first: Double, originalEvent: typings.std.Event, rows: Double): Rows = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
