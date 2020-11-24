package typings.seatsio.Seatsio

import typings.seatsio.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seat
  extends BaseObject
     with BookableObject {
  
  var companionSeat: Boolean = js.native
  
  var disabledBySocialDistancingRules: Boolean = js.native
  
  var parent: Type = js.native
  
  var restrictedView: Boolean = js.native
  
  var viewFromSeatUrl: js.UndefOr[String] = js.native
}
