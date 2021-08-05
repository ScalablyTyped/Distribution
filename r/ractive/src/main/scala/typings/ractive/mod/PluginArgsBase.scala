package typings.ractive.mod

import typings.ractive.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginArgsBase extends StObject {
  
  var Ractive: Instantiable
}
object PluginArgsBase {
  
  inline def apply(Ractive: Instantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsBase]
  }
  
  extension [Self <: PluginArgsBase](x: Self) {
    
    inline def setRactive(value: Instantiable): Self = StObject.set(x, "Ractive", value.asInstanceOf[js.Any])
  }
}
