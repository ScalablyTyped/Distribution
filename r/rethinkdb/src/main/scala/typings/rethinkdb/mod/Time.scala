package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.TIME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Time extends ReqlType {
  
  @JSName("$reql_type$")
  var Dollarreql_typeDollar_Time: TIME = js.native
  
  var epoch_time: Double = js.native
  
  var timezone: String = js.native
}
object Time {
  
  @scala.inline
  def apply(Dollarreql_typeDollar: TIME, epoch_time: Double, timezone: String): Time = {
    val __obj = js.Dynamic.literal(epoch_time = epoch_time.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("$reql_type$")(Dollarreql_typeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDollarreql_typeDollar(value: TIME): Self = StObject.set(x, "$reql_type$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpoch_time(value: Double): Self = StObject.set(x, "epoch_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
