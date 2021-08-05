package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfBindingData
  extends StObject
     with BaseBindingData
     with BindingData {
  
  var template: TemplateChunk[js.Any, js.Any]
}
object IfBindingData {
  
  inline def apply(template: TemplateChunk[js.Any, js.Any]): IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBindingData]
  }
  
  extension [Self <: IfBindingData](x: Self) {
    
    inline def setTemplate(value: TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
