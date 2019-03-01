package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  var redis_version: java.lang.String
  var versions: js.Array[scala.Double]
}

object ServerInfo {
  @scala.inline
  def apply(redis_version: java.lang.String, versions: js.Array[scala.Double]): ServerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redis_version")(redis_version)
    __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[ServerInfo]
  }
}

