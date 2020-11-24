package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginArgsInstance extends js.Object {
  
  var instance: Ractive[Ractive[_]] = js.native
  
  var proto: Ractive[Ractive[_]] = js.native
}
object PluginArgsInstance {
  
  @scala.inline
  def apply(instance: Ractive[Ractive[_]], proto: Ractive[Ractive[_]]): PluginArgsInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsInstance]
  }
  
  @scala.inline
  implicit class PluginArgsInstanceOps[Self <: PluginArgsInstance] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: Ractive[Ractive[_]]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Ractive[Ractive[_]]): Self = this.set("proto", value.asInstanceOf[js.Any])
  }
}
