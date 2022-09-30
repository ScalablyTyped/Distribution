package typings.reactNativeScreens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DismissCount extends StObject {
  
  var dismissCount: Double
}
object DismissCount {
  
  inline def apply(dismissCount: Double): DismissCount = {
    val __obj = js.Dynamic.literal(dismissCount = dismissCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissCount]
  }
  
  extension [Self <: DismissCount](x: Self) {
    
    inline def setDismissCount(value: Double): Self = StObject.set(x, "dismissCount", value.asInstanceOf[js.Any])
  }
}
