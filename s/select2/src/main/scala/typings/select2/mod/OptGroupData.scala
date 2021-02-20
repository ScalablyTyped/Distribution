package typings.select2.mod

import typings.std.HTMLOptGroupElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptGroupData extends StObject {
  
  var children: js.Array[OptionData] = js.native
  
  var disabled: Boolean = js.native
  
  var element: HTMLOptGroupElement = js.native
  
  var loading: js.UndefOr[scala.Nothing] = js.native
  
  var selected: Boolean = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object OptGroupData {
  
  @scala.inline
  def apply(
    children: js.Array[OptionData],
    disabled: Boolean,
    element: HTMLOptGroupElement,
    selected: Boolean,
    text: String,
    title: String
  ): OptGroupData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupData]
  }
  
  @scala.inline
  implicit class OptGroupDataMutableBuilder[Self <: OptGroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[OptionData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: OptionData*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLOptGroupElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
