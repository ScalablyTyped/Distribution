package typings.reactThreeFiber.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  @JSName("$$typeof")
  var DollarDollartypeof: Double | js.Symbol = js.native
  
  var children: ReactNode = js.native
  
  var containerInfo: js.Any = js.native
  
  var implementation: js.Any = js.native
  
  var key: String | Null = js.native
}
object Children {
  
  @scala.inline
  def apply(DollarDollartypeof: Double | js.Symbol, containerInfo: js.Any, implementation: js.Any): Children = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setDollarDollartypeof(value: Double | js.Symbol): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInfo(value: js.Any): Self = this.set("containerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementation(value: js.Any): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
}
