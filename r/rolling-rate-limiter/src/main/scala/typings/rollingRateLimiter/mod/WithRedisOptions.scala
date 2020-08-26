package typings.rollingRateLimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRedisOptions extends GeneralOptions {
  var namespace: js.UndefOr[String] = js.native
  var redis: CompatibleRedisClient = js.native
}

object WithRedisOptions {
  @scala.inline
  def apply(interval: Double, maxInInterval: Double, redis: CompatibleRedisClient): WithRedisOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRedisOptions]
  }
  @scala.inline
  implicit class WithRedisOptionsOps[Self <: WithRedisOptions] (val x: Self) extends AnyVal {
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
    def setRedis(value: CompatibleRedisClient): Self = this.set("redis", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

