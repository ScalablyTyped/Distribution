package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelConfig extends StObject {
  
  var stopTogether: js.UndefOr[Boolean] = js.undefined
}
object ParallelConfig {
  
  inline def apply(): ParallelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelConfig]
  }
  
  extension [Self <: ParallelConfig](x: Self) {
    
    inline def setStopTogether(value: Boolean): Self = StObject.set(x, "stopTogether", value.asInstanceOf[js.Any])
    
    inline def setStopTogetherUndefined: Self = StObject.set(x, "stopTogether", js.undefined)
  }
}
