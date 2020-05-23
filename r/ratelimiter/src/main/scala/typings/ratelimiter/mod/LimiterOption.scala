package typings.ratelimiter.mod

import typings.redis.mod.RedisClient
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
  def apply(
    db: RedisClient,
    id: String,
    duration: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined
  ): LimiterOption = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterOption]
  }
}

