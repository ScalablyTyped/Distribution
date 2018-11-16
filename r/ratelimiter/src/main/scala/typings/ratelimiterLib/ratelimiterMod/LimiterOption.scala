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

