package typings.reactDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'unicode' | 'label' | 'action', string> */
trait Recordunicodelabelactions extends StObject {
  
  var action: String
  
  var label: String
  
  var unicode: String
}
object Recordunicodelabelactions {
  
  @scala.inline
  def apply(action: String, label: String, unicode: String): Recordunicodelabelactions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordunicodelabelactions]
  }
  
  @scala.inline
  implicit class RecordunicodelabelactionsMutableBuilder[Self <: Recordunicodelabelactions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicode(value: String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
  }
}
