package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedOptionsConfig extends StObject {
  
  var options: OptionsObject
}
object NormalizedOptionsConfig {
  
  inline def apply(options: OptionsObject): NormalizedOptionsConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOptionsConfig]
  }
  
  extension [Self <: NormalizedOptionsConfig](x: Self) {
    
    inline def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
