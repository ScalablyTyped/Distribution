package typings.seatsio.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictticketType
  extends StObject
     with /* ticketType */ StringDictionary[Double] {
  
  var NO_TICKET_TYPE: Double
}
object DictticketType {
  
  inline def apply(NO_TICKET_TYPE: Double): DictticketType = {
    val __obj = js.Dynamic.literal(NO_TICKET_TYPE = NO_TICKET_TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictticketType]
  }
  
  extension [Self <: DictticketType](x: Self) {
    
    inline def setNO_TICKET_TYPE(value: Double): Self = StObject.set(x, "NO_TICKET_TYPE", value.asInstanceOf[js.Any])
  }
}
