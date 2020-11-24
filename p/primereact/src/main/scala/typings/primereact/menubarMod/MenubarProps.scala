package typings.primereact.menubarMod

import typings.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenubarProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var model: js.UndefOr[js.Array[MenuItem]] = js.native
  
  var start: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
}
object MenubarProps {
  
  @scala.inline
  def apply(): MenubarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenubarProps]
  }
  
  @scala.inline
  implicit class MenubarPropsOps[Self <: MenubarProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnd(value: /* props */ js.Object => _): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModelVarargs(value: MenuItem*): Self = this.set("model", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: js.Array[MenuItem]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setStart(value: /* props */ js.Object => _): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
