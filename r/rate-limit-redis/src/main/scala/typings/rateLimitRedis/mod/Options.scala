package typings.rateLimitRedis.mod

import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var client: js.UndefOr[RedisClient | Redis] = js.native
  
  var expiry: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var redisURL: js.UndefOr[String] = js.native
  
  var resetExpiryOnChange: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setClient(value: RedisClient | Redis): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRedisURL(value: String): Self = this.set("redisURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedisURL: Self = this.set("redisURL", js.undefined)
    
    @scala.inline
    def setResetExpiryOnChange(value: Boolean): Self = this.set("resetExpiryOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetExpiryOnChange: Self = this.set("resetExpiryOnChange", js.undefined)
  }
}
