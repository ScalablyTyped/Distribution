package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var incidents: js.Array[Incident]
  var name: String
  var slug: String
  var status: String
}

object Service {
  @scala.inline
  def apply(incidents: js.Array[Incident], name: String, slug: String, status: String): Service = {
    val __obj = js.Dynamic.literal(incidents = incidents, name = name, slug = slug, status = status)
  
    __obj.asInstanceOf[Service]
  }
}

