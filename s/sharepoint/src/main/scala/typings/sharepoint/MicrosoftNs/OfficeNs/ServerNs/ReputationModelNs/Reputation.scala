package typings.sharepoint.MicrosoftNs.OfficeNs.ServerNs.ReputationModelNs

import typings.sharepoint.SPNs.ClientContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation")
@js.native
class Reputation () extends js.Object

/* static members */
@JSGlobal("Microsoft.Office.Server.ReputationModel.Reputation")
@js.native
object Reputation extends js.Object {
  def setLike(context: ClientContext, listId: String, itemId: Double, like: Boolean): Unit = js.native
  def setRating(context: ClientContext, listId: String, itemId: Double, rating: Double): Unit = js.native
}

