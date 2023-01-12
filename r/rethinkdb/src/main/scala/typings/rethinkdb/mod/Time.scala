package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.TIME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time
  extends StObject
     with ReqlType {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Time: TIME
  
  var epoch_time: Double
  
  var timezone: String
}
object Time {
  
  inline def apply(epoch_time: Double, timezone: String): Time = {
    val __obj = js.Dynamic.literal(epoch_time = epoch_time.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")("TIME")
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    inline def setDollarreql_typeDollar(value: TIME): Self = StObject.set(x, "$reql_type$", value.asInstanceOf[js.Any])
    
    inline def setEpoch_time(value: Double): Self = StObject.set(x, "epoch_time", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
