package typings.select2.mod

import typings.std.HTMLOptGroupElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptGroupData extends StObject {
  
  var children: js.Array[OptionData]
  
  var disabled: Boolean
  
  var element: HTMLOptGroupElement
  
  var loading: Unit
  
  var selected: Boolean
  
  var text: String
  
  var title: String
}
object OptGroupData {
  
  inline def apply(
    children: js.Array[OptionData],
    disabled: Boolean,
    element: HTMLOptGroupElement,
    loading: Unit,
    selected: Boolean,
    text: String,
    title: String
  ): OptGroupData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptGroupData] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[OptionData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: OptionData*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLOptGroupElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Unit): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
