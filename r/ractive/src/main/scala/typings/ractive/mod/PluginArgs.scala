package typings.ractive.mod

import typings.ractive.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginArgs extends StObject {
  
  var Ractive: Instantiable
  
  var instance: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]])
  
  var proto: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]])
}
object PluginArgs {
  
  inline def apply(
    Ractive: Instantiable,
    instance: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]]),
    proto: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]])
  ): PluginArgs = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgs]
  }
  
  extension [Self <: PluginArgs](x: Self) {
    
    inline def setInstance(
      value: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]])
    ): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setProto(
      value: (Ractive[/* ractive.ractive.Ractive<any> */ Any]) | (Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]])
    ): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setRactive(value: Instantiable): Self = StObject.set(x, "Ractive", value.asInstanceOf[js.Any])
  }
}
