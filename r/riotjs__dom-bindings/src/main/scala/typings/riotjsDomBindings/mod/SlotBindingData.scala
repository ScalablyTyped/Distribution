package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotBindingData[Scope]
  extends StObject
     with BaseBindingData[Scope]
     with _BindingData[Scope] {
  
  var bindings: js.Array[BindingData[Scope]]
  
  var html: String
  
  var id: String
}
object SlotBindingData {
  
  inline def apply[Scope](bindings: js.Array[BindingData[Scope]], html: String, id: String): SlotBindingData[Scope] = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotBindingData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotBindingData[?], Scope] (val x: Self & SlotBindingData[Scope]) extends AnyVal {
    
    inline def setBindings(value: js.Array[BindingData[Scope]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: BindingData[Scope]*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
