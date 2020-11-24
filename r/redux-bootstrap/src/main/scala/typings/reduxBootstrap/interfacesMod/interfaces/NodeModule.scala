package typings.reduxBootstrap.interfacesMod.interfaces

import typings.reduxBootstrap.anon.Accept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeModule extends js.Object {
  
  var hot: Accept = js.native
}
object NodeModule {
  
  @scala.inline
  def apply(hot: Accept): NodeModule = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
  
  @scala.inline
  implicit class NodeModuleOps[Self <: NodeModule] (val x: Self) extends AnyVal {
    
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
    def setHot(value: Accept): Self = this.set("hot", value.asInstanceOf[js.Any])
  }
}
