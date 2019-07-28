package typings.ratelimiter.ratelimiterMod

import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimiterOption extends js.Object {
  /**
    * Redis connection instance
    */
  var db: RedisClient
  /**
    * Duration of limit in milliseconds
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The identifier to limit against (typically a user id)
    */
  var id: String
  /**
    * Max requests within duration
    */
  var max: js.UndefOr[Double] = js.undefined
}

object LimiterOption {
  @scala.inline
  def apply(db: RedisClient, id: String, duration: Int | Double = null, max: Int | Double = null): LimiterOption = {
    val __obj = js.Dynamic.literal(db = db, id = id)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterOption]
  }
}

