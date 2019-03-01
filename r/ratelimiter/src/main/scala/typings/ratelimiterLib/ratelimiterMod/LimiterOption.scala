package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimiterOption extends js.Object {
  /**
    * Redis connection instance
    */
  var db: redisLib.redisMod.RedisClient
  /**
    * Duration of limit in milliseconds
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The identifier to limit against (typically a user id)
    */
  var id: java.lang.String
  /**
    * Max requests within duration
    */
  var max: js.UndefOr[scala.Double] = js.undefined
}

object LimiterOption {
  @scala.inline
  def apply(
    db: redisLib.redisMod.RedisClient,
    id: java.lang.String,
    duration: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null
  ): LimiterOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("id")(id)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterOption]
  }
}

