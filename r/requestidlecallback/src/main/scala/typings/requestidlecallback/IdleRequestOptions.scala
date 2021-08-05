package typings.requestidlecallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleRequestOptions extends StObject {
  
  var timeout: Double
}
object IdleRequestOptions {
  
  inline def apply(timeout: Double): IdleRequestOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleRequestOptions]
  }
  
  extension [Self <: IdleRequestOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
