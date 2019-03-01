package typings
package simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStorageConfig
  extends simpleDashUrlDashCacheLib.simpleDashUrlDashCacheMod.privateNNs.StorageConfig {
  var db: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var socket_keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RedisStorageConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    `type`: java.lang.String,
    db: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    socket_keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): RedisStorageConfig = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (db != null) __obj.updateDynamic("db")(db)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(socket_keepalive)) __obj.updateDynamic("socket_keepalive")(socket_keepalive)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RedisStorageConfig]
  }
}

