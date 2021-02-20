package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomText extends StObject {
  
  var component: text = js.native
  
  var label: String = js.native
  
  var `type`: text = js.native
}
object ICustomText {
  
  @scala.inline
  def apply(component: text, label: String, `type`: text): ICustomText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomText]
  }
  
  @scala.inline
  implicit class ICustomTextMutableBuilder[Self <: ICustomText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
