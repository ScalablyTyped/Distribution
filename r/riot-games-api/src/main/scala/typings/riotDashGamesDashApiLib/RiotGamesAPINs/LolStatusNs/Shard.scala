package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  var hostname: java.lang.String
  var locales: js.Array[java.lang.String]
  var name: java.lang.String
  var region_tag: java.lang.String
  var slug: java.lang.String
}

object Shard {
  @scala.inline
  def apply(
    hostname: java.lang.String,
    locales: js.Array[java.lang.String],
    name: java.lang.String,
    region_tag: java.lang.String,
    slug: java.lang.String
  ): Shard = {
    val __obj = js.Dynamic.literal(hostname = hostname, locales = locales, name = name, region_tag = region_tag, slug = slug)
  
    __obj.asInstanceOf[Shard]
  }
}

