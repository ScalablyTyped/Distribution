package typings.scrivito.anon

import typings.scrivito.mod.Obj
import typings.scrivito.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends js.Object {
  
  var content: js.Any = js.native
  
  var name: String = js.native
  
  var obj: js.UndefOr[Obj] = js.native
  
  var widget: js.UndefOr[Widget] = js.native
}
object Content {
  
  @scala.inline
  def apply(content: js.Any, name: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: Obj): Self = this.set("obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObj: Self = this.set("obj", js.undefined)
    
    @scala.inline
    def setWidget(value: Widget): Self = this.set("widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
}
