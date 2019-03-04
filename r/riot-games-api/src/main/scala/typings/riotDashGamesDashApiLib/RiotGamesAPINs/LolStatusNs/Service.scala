package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var incidents: js.Array[Incident]
  var name: java.lang.String
  var slug: java.lang.String
  var status: java.lang.String
}

object Service {
  @scala.inline
  def apply(
    incidents: js.Array[Incident],
    name: java.lang.String,
    slug: java.lang.String,
    status: java.lang.String
  ): Service = {
    val __obj = js.Dynamic.literal(incidents = incidents, name = name, slug = slug, status = status)
  
    __obj.asInstanceOf[Service]
  }
}

