package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardStatus extends js.Object {
  var hostname: java.lang.String
  var locales: js.Array[java.lang.String]
  var name: java.lang.String
  var region_tag: java.lang.String
  var services: js.Array[Service]
  var slug: java.lang.String
}

object ShardStatus {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    locales: js.Array[java.lang.String],
    name: java.lang.String,
    region_tag: java.lang.String,
    services: js.Array[Service],
    slug: java.lang.String
  ): ShardStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("locales")(locales)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("region_tag")(region_tag)
    __obj.updateDynamic("services")(services)
    __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[ShardStatus]
  }
}

