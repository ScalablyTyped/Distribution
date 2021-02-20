package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginArgsExtend extends StObject {
  
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
  implicit class PluginArgsExtendMutableBuilder[Self <: PluginArgsExtend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Static[Ractive[Ractive[_]]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Static[Ractive[Ractive[_]]]): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
