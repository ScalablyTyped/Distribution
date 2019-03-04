package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Incident extends js.Object {
  var active: scala.Boolean
  var created_at: java.lang.String
  var id: scala.Double
  var updates: js.Array[Message]
}

object Incident {
  @scala.inline
  def apply(active: scala.Boolean, created_at: java.lang.String, id: scala.Double, updates: js.Array[Message]): Incident = {
    val __obj = js.Dynamic.literal(active = active, created_at = created_at, id = id, updates = updates)
  
    __obj.asInstanceOf[Incident]
  }
}

