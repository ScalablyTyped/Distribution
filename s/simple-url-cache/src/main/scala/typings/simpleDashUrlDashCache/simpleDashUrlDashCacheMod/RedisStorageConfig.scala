package typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod

import typings.simpleDashUrlDashCache.simpleDashUrlDashCacheMod.privateNNs.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStorageConfig extends StorageConfig {
  var db: js.UndefOr[String] = js.undefined
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: Double
  var socket_keepalive: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RedisStorageConfig {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    `type`: String,
    db: String = null,
    password: String = null,
    path: String = null,
    socket_keepalive: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): RedisStorageConfig = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    __obj.updateDynamic("type")(`type`)
    if (db != null) __obj.updateDynamic("db")(db)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(socket_keepalive)) __obj.updateDynamic("socket_keepalive")(socket_keepalive)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RedisStorageConfig]
  }
}

