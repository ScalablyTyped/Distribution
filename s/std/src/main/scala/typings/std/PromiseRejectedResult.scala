package typings.std

import typings.std.stdStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseRejectedResult
  extends StObject
     with PromiseSettledResult[js.Any] {
  
  var reason: js.Any
  
  var status: rejected
}
object PromiseRejectedResult {
  
  inline def apply(reason: js.Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  
  extension [Self <: PromiseRejectedResult](x: Self) {
    
    inline def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
