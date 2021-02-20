package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attempts extends StObject {
  
  var attempts: Double = js.native
  
  var batch_id: String = js.native
  
  var response_code: Double = js.native
  
  var ts: String = js.native
}
object Attempts {
  
  @scala.inline
  def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
  
  @scala.inline
  implicit class AttemptsMutableBuilder[Self <: Attempts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_code(value: Double): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
