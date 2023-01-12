package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfBindingData[Scope]
  extends StObject
     with BaseBindingData[Scope]
     with _BindingData[Scope] {
  
  var template: TemplateChunk[Scope, Any]
}
object IfBindingData {
  
  inline def apply[Scope](template: TemplateChunk[Scope, Any]): IfBindingData[Scope] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBindingData[Scope]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfBindingData[?], Scope] (val x: Self & IfBindingData[Scope]) extends AnyVal {
    
    inline def setTemplate(value: TemplateChunk[Scope, Any]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
