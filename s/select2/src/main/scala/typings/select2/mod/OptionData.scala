package typings.select2.mod

import typings.std.HTMLOptionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionData extends StObject {
  
  var children: Unit
  
  var disabled: Boolean
  
  var element: HTMLOptionElement
  
  var id: String
  
  var loading: Unit
  
  var selected: Boolean
  
  var text: String
  
  var title: String
}
object OptionData {
  
  @scala.inline
  def apply(
    children: Unit,
    disabled: Boolean,
    element: HTMLOptionElement,
    id: String,
    loading: Unit,
    selected: Boolean,
    text: String,
    title: String
  ): OptionData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
  
  @scala.inline
  implicit class OptionDataMutableBuilder[Self <: OptionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLOptionElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Unit): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
