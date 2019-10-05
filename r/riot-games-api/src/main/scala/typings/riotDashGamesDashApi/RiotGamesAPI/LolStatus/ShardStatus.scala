package typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardStatus extends js.Object {
  var hostname: String
  var locales: js.Array[String]
  var name: String
  var region_tag: String
  var services: js.Array[Service]
  var slug: String
}

object ShardStatus {
  @scala.inline
  def apply(
    hostname: String,
    locales: js.Array[String],
    name: String,
    region_tag: String,
    services: js.Array[Service],
    slug: String
  ): ShardStatus = {
    val __obj = js.Dynamic.literal(hostname = hostname, locales = locales, name = name, region_tag = region_tag, services = services, slug = slug)
  
    __obj.asInstanceOf[ShardStatus]
  }
}

