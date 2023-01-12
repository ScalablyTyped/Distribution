package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assigned extends StObject {
  
  var assigned: Double
  
  var fail: Double
  
  var ok: Double
  
  var pfail: Double
}
object Assigned {
  
  inline def apply(assigned: Double, fail: Double, ok: Double, pfail: Double): Assigned = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], pfail = pfail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assigned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assigned] (val x: Self) extends AnyVal {
    
    inline def setAssigned(value: Double): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
    
    inline def setFail(value: Double): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setPfail(value: Double): Self = StObject.set(x, "pfail", value.asInstanceOf[js.Any])
  }
}
