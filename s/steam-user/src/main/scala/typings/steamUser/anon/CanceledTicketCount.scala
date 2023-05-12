package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanceledTicketCount extends StObject {
  
  var canceledTicketCount: Double
}
object CanceledTicketCount {
  
  inline def apply(canceledTicketCount: Double): CanceledTicketCount = {
    val __obj = js.Dynamic.literal(canceledTicketCount = canceledTicketCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanceledTicketCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanceledTicketCount] (val x: Self) extends AnyVal {
    
    inline def setCanceledTicketCount(value: Double): Self = StObject.set(x, "canceledTicketCount", value.asInstanceOf[js.Any])
  }
}
