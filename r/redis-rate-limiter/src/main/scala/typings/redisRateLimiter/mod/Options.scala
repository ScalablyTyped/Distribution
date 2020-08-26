package typings.redisRateLimiter.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.redis.mod.RedisClient
import typings.redisRateLimiter.redisRateLimiterStrings.ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.native
  var key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) = js.native
  var limit: js.UndefOr[Double] = js.native
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var rate: js.UndefOr[String] = js.native
  var redis: RedisClient = js.native
  var window: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]),
    redis: RedisClient
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String])): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis(value: RedisClient): Self = this.set("redis", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteImmediatelyIfRaceCondition(value: Boolean): Self = this.set("deleteImmediatelyIfRaceCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteImmediatelyIfRaceCondition: Self = this.set("deleteImmediatelyIfRaceCondition", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOnPossibleRaceCondition(value: /* key */ String => Unit): Self = this.set("onPossibleRaceCondition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPossibleRaceCondition: Self = this.set("onPossibleRaceCondition", js.undefined)
    @scala.inline
    def setRate(value: String): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

