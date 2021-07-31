package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationDefinition extends StObject {
  
  var ticksToEnd: Double
  
  var username: String
}
object ReservationDefinition {
  
  @scala.inline
  def apply(ticksToEnd: Double, username: String): ReservationDefinition = {
    val __obj = js.Dynamic.literal(ticksToEnd = ticksToEnd.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationDefinition]
  }
  
  @scala.inline
  implicit class ReservationDefinitionMutableBuilder[Self <: ReservationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicksToEnd(value: Double): Self = StObject.set(x, "ticksToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
