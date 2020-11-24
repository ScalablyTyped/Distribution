package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import typings.seatsio.anon.Own
import typings.seatsio.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseObject extends js.Object {
  
  var accessible: Boolean = js.native
  
  var category: js.UndefOr[Category] = js.native
  
  var center: js.UndefOr[X] = js.native
  
  var dataPerEvent: StringDictionary[DataPerEvent] = js.native
  
  def deselect(): Unit = js.native
  def deselect(ticketType: String): Unit = js.native
  
  var displayObjectType: js.UndefOr[String] = js.native
  
  var extraData: js.Any = js.native
  
  var forSale: Boolean = js.native
  
  var inSelectableChannel: Boolean = js.native
  
  var label: String = js.native
  
  var labels: Own = js.native
  
  var objectType: String = js.native
  
  var pricing: js.UndefOr[js.Array[Pricing] | Pricing] = js.native
  
  def pulse(): Unit = js.native
  
  def select(): Unit = js.native
  def select(ticketType: String): Unit = js.native
  
  var selectable: Boolean = js.native
  
  var selected: Boolean = js.native
  
  var selectedTicketType: js.UndefOr[String] = js.native
  
  var status: String = js.native
  
  def unpulse(): Unit = js.native
}
