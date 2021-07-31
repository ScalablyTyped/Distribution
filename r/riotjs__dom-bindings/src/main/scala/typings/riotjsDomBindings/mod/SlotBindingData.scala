package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotBindingData
  extends StObject
     with BaseBindingData
     with BindingData {
  
  var bindings: BindingData
  
  var html: String
  
  var id: String
}
object SlotBindingData {
  
  @scala.inline
  def apply(bindings: BindingData, html: String, id: String): SlotBindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotBindingData]
  }
  
  @scala.inline
  implicit class SlotBindingDataMutableBuilder[Self <: SlotBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: BindingData): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
