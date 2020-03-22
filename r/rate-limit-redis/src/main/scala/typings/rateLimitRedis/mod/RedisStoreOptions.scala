package typings.rateLimitRedis.mod

import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedisStoreOptions extends js.Object {
  var client: js.UndefOr[RedisClient | Redis] = js.undefined
  var expiry: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var redisURL: js.UndefOr[String] = js.undefined
  var resetExpiryOnChange: js.UndefOr[Boolean] = js.undefined
}

object RedisStoreOptions {
  @scala.inline
  def apply(
    client: RedisClient | Redis = null,
    expiry: Int | Double = null,
    prefix: String = null,
    redisURL: String = null,
    resetExpiryOnChange: js.UndefOr[Boolean] = js.undefined
  ): RedisStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (redisURL != null) __obj.updateDynamic("redisURL")(redisURL.asInstanceOf[js.Any])
    if (!js.isUndefined(resetExpiryOnChange)) __obj.updateDynamic("resetExpiryOnChange")(resetExpiryOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisStoreOptions]
  }
}

