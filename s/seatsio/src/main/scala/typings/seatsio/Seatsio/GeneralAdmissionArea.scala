package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralAdmissionArea
  extends BaseObject
     with BookableObject {
  
  var capacity: Double = js.native
  
  @JSName("dataPerEvent")
  var dataPerEvent_GeneralAdmissionArea: StringDictionary[GeneralAdmissionDataPerEvent] = js.native
  
  var numBooked: Double = js.native
  
  var numFree: Double = js.native
  
  var numSelected: Double = js.native
  
  var selectionPerTicketType: StringDictionary[Double] = js.native
}
