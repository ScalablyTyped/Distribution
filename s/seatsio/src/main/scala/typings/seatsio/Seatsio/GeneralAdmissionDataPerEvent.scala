package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import typings.seatsio.anon.DictticketType
import typings.seatsio.seatsioNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralAdmissionDataPerEvent extends DataPerEvent {
  
  var holds: StringDictionary[DictticketType] = js.native
  
  var numBooked: `5` = js.native
}
object GeneralAdmissionDataPerEvent {
  
  @scala.inline
  def apply(holds: StringDictionary[DictticketType], numBooked: `5`, status: String): GeneralAdmissionDataPerEvent = {
    val __obj = js.Dynamic.literal(holds = holds.asInstanceOf[js.Any], numBooked = numBooked.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralAdmissionDataPerEvent]
  }
  
  @scala.inline
  implicit class GeneralAdmissionDataPerEventOps[Self <: GeneralAdmissionDataPerEvent] (val x: Self) extends AnyVal {
    
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
    def setHolds(value: StringDictionary[DictticketType]): Self = this.set("holds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBooked(value: `5`): Self = this.set("numBooked", value.asInstanceOf[js.Any])
  }
}
