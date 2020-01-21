package typings.riotGamesApi.RiotGamesAPI.LolStatus

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
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region_tag = region_tag.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShardStatus]
  }
}

