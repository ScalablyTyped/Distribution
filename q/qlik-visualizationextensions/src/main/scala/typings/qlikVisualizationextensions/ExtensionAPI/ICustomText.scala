package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomText extends StObject {
  
  var component: text
  
  var label: String
  
  var `type`: text
}
object ICustomText {
  
  inline def apply(label: String): ICustomText = {
    val __obj = js.Dynamic.literal(component = "text", label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[ICustomText]
  }
  
  extension [Self <: ICustomText](x: Self) {
    
    inline def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
