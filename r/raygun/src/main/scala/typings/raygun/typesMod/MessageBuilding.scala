package typings.raygun.typesMod

import typings.raygun.anon.PartialMessageDetails
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBuilding extends StObject {
  
  var details: PartialMessageDetails
  
  var occurredOn: Date
}
object MessageBuilding {
  
  @scala.inline
  def apply(details: PartialMessageDetails, occurredOn: Date): MessageBuilding = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBuilding]
  }
  
  @scala.inline
  implicit class MessageBuildingMutableBuilder[Self <: MessageBuilding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: PartialMessageDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurredOn(value: Date): Self = StObject.set(x, "occurredOn", value.asInstanceOf[js.Any])
  }
}
