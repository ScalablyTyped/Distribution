package typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  var hostname: String
  var locales: js.Array[String]
  var name: String
  var region_tag: String
  var slug: String
}

object Shard {
  @scala.inline
  def apply(hostname: String, locales: js.Array[String], name: String, region_tag: String, slug: String): Shard = {
    val __obj = js.Dynamic.literal(hostname = hostname, locales = locales, name = name, region_tag = region_tag, slug = slug)
  
    __obj.asInstanceOf[Shard]
  }
}

