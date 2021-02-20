package typings.qlik.mod

import typings.qlik.anon.Data
import typings.qlik.qlikStrings.accordion
import typings.qlik.qlikStrings.items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition extends StObject {
  
  var component: accordion = js.native
  
  var items: Data = js.native
  
  var `type`: items = js.native
}
object Definition {
  
  @scala.inline
  def apply(component: accordion, items: Data, `type`: items): Definition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: accordion): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: Data): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: items): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
