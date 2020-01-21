package typings.riotGamesApi.RiotGamesAPI.LolStatus

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
    val __obj = js.Dynamic.literal(incidents = incidents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Service]
  }
}

