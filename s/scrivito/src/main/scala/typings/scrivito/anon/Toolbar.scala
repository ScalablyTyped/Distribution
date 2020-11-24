package typings.scrivito.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toolbar extends js.Object {
  
  var toolbar: js.Array[String] = js.native
}
object Toolbar {
  
  @scala.inline
  def apply(toolbar: js.Array[String]): Toolbar = {
    val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolbar]
  }
  
  @scala.inline
  implicit class ToolbarOps[Self <: Toolbar] (val x: Self) extends AnyVal {
    
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
    def setToolbarVarargs(value: String*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: js.Array[String]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}
