package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixcloudConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
}
object MixcloudConfig {
  
  inline def apply(): MixcloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixcloudConfig]
  }
  
  extension [Self <: MixcloudConfig](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
