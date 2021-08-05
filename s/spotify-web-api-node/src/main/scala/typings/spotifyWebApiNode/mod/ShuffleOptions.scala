package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShuffleOptions
  extends StObject
     with DeviceOptions {
  
  var state: js.UndefOr[Boolean] = js.undefined
}
object ShuffleOptions {
  
  inline def apply(): ShuffleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShuffleOptions]
  }
  
  extension [Self <: ShuffleOptions](x: Self) {
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
