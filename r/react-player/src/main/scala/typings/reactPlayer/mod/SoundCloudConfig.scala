package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundCloudConfig extends StObject {
  
  var options: js.UndefOr[js.Object] = js.undefined
}
object SoundCloudConfig {
  
  inline def apply(): SoundCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundCloudConfig]
  }
  
  extension [Self <: SoundCloudConfig](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
