package typings.ractive.mod

import typings.ractive.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginArgsBase extends StObject {
  
  var Ractive: Instantiable
}
object PluginArgsBase {
  
  @scala.inline
  def apply(Ractive: Instantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsBase]
  }
  
  @scala.inline
  implicit class PluginArgsBaseMutableBuilder[Self <: PluginArgsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRactive(value: Instantiable): Self = StObject.set(x, "Ractive", value.asInstanceOf[js.Any])
  }
}
