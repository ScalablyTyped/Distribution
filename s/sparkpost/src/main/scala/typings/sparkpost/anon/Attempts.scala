package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attempts extends StObject {
  
  var attempts: Double
  
  var batch_id: String
  
  var response_code: Double
  
  var ts: String
}
object Attempts {
  
  inline def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attempts] (val x: Self) extends AnyVal {
    
    inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    inline def setResponse_code(value: Double): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    inline def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
