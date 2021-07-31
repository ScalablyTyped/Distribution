package typings.reactNativeMaterialUi.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: String | Element
  
  var label: String
  
  var name: String
}
object Icon {
  
  @scala.inline
  def apply(icon: String | Element, label: String, name: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
