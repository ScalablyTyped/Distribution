package typings.raygun.typesMod

import typings.raygun.anon.PartialMessageDetails
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBuilding extends js.Object {
  
  var details: PartialMessageDetails = js.native
  
  var occurredOn: Date = js.native
}
object MessageBuilding {
  
  @scala.inline
  def apply(details: PartialMessageDetails, occurredOn: Date): MessageBuilding = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBuilding]
  }
  
  @scala.inline
  implicit class MessageBuildingOps[Self <: MessageBuilding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetails(value: PartialMessageDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurredOn(value: Date): Self = this.set("occurredOn", value.asInstanceOf[js.Any])
  }
}
