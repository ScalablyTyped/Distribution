package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginArgsInstance extends StObject {
  
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
  implicit class PluginArgsInstanceMutableBuilder[Self <: PluginArgsInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Ractive[Ractive[_]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Ractive[Ractive[_]]): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
