package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginArgsInstance extends StObject {
  
  var instance: Ractive[Ractive[js.Any]]
  
  var proto: Ractive[Ractive[js.Any]]
}
object PluginArgsInstance {
  
  @scala.inline
  def apply(instance: Ractive[Ractive[js.Any]], proto: Ractive[Ractive[js.Any]]): PluginArgsInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsInstance]
  }
  
  @scala.inline
  implicit class PluginArgsInstanceMutableBuilder[Self <: PluginArgsInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Ractive[Ractive[js.Any]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Ractive[Ractive[js.Any]]): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
