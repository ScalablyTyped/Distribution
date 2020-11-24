package typings.select2.mod

import typings.std.HTMLOptGroupElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptGroupData extends js.Object {
  
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
  implicit class OptGroupDataOps[Self <: OptGroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: OptionData*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[OptionData]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: HTMLOptGroupElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
