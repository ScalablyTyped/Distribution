package typings.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  var async: Boolean
  
  var bridge: Boolean
}
object Async {
  
  inline def apply(async: Boolean, bridge: Boolean): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  extension [Self <: Async](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBridge(value: Boolean): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
