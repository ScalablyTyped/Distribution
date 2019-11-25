package typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Incident extends js.Object {
  var active: Boolean
  var created_at: String
  var id: Double
  var updates: js.Array[Message]
}

object Incident {
  @scala.inline
  def apply(active: Boolean, created_at: String, id: Double, updates: js.Array[Message]): Incident = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Incident]
  }
}

