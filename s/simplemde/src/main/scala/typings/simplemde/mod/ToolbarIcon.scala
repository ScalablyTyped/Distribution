package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarIcon extends js.Object {
  
  var action: String | (js.Function1[/* editor */ SimpleMDE, Unit]) = js.native
  
  var className: String = js.native
  
  var name: String = js.native
  
  var title: String = js.native
}
object ToolbarIcon {
  
  @scala.inline
  def apply(
    action: String | (js.Function1[/* editor */ SimpleMDE, Unit]),
    className: String,
    name: String,
    title: String
  ): ToolbarIcon = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarIcon]
  }
  
  @scala.inline
  implicit class ToolbarIconOps[Self <: ToolbarIcon] (val x: Self) extends AnyVal {
    
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
    def setActionFunction1(value: /* editor */ SimpleMDE => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAction(value: String | (js.Function1[/* editor */ SimpleMDE, Unit])): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
