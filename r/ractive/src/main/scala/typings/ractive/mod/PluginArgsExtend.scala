package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginArgsExtend extends StObject {
  
  var instance: Static[Ractive[Ractive[js.Any]]]
  
  var proto: Static[Ractive[Ractive[js.Any]]]
}
object PluginArgsExtend {
  
  inline def apply(instance: Static[Ractive[Ractive[js.Any]]], proto: Static[Ractive[Ractive[js.Any]]]): PluginArgsExtend = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsExtend]
  }
  
  extension [Self <: PluginArgsExtend](x: Self) {
    
    inline def setInstance(value: Static[Ractive[Ractive[js.Any]]]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setProto(value: Static[Ractive[Ractive[js.Any]]]): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
