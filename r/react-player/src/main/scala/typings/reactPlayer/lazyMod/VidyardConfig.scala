package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VidyardConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
}
object VidyardConfig {
  
  inline def apply(): VidyardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VidyardConfig]
  }
  
  extension [Self <: VidyardConfig](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
