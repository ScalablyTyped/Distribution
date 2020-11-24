package typings.rmcTabs.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rmc-tabs.rmc-tabs/lib/TabPane.PropsType & {  children :react.react.ReactNode | undefined} */
@js.native
trait PropsTypechildrenReactNod extends js.Object {
  
  var active: Boolean = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var fixX: js.UndefOr[Boolean] = js.native
  
  var fixY: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object PropsTypechildrenReactNod {
  
  @scala.inline
  def apply(active: Boolean): PropsTypechildrenReactNod = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTypechildrenReactNod]
  }
  
  @scala.inline
  implicit class PropsTypechildrenReactNodOps[Self <: PropsTypechildrenReactNod] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFixX(value: Boolean): Self = this.set("fixX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixX: Self = this.set("fixX", js.undefined)
    
    @scala.inline
    def setFixY(value: Boolean): Self = this.set("fixY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixY: Self = this.set("fixY", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
