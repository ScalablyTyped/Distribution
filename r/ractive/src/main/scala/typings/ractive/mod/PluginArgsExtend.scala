package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginArgsExtend extends js.Object {
  
  var instance: Static[Ractive[Ractive[_]]] = js.native
  
  var proto: Static[Ractive[Ractive[_]]] = js.native
}
object PluginArgsExtend {
  
  @scala.inline
  def apply(instance: Static[Ractive[Ractive[_]]], proto: Static[Ractive[Ractive[_]]]): PluginArgsExtend = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsExtend]
  }
  
  @scala.inline
  implicit class PluginArgsExtendOps[Self <: PluginArgsExtend] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: Static[Ractive[Ractive[_]]]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Static[Ractive[Ractive[_]]]): Self = this.set("proto", value.asInstanceOf[js.Any])
  }
}
