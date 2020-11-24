package typings.rsmqWorker.mod

import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autostart: js.UndefOr[Boolean] = js.native
  
  var customExceedCheck: js.UndefOr[CustomExceedCheckCallback] = js.native
  
  var defaultDelay: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var invisibletime: js.UndefOr[Double] = js.native
  
  var maxReceiveCount: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[ClientOpts] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var redis: js.UndefOr[RedisClient] = js.native
  
  var redisPrefix: js.UndefOr[String] = js.native
  
  var rsmq: js.UndefOr[Client] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
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
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setCustomExceedCheck(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any => Boolean
    ): Self = this.set("customExceedCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomExceedCheck: Self = this.set("customExceedCheck", js.undefined)
    
    @scala.inline
    def setDefaultDelay(value: Double): Self = this.set("defaultDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDelay: Self = this.set("defaultDelay", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setInvisibletime(value: Double): Self = this.set("invisibletime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisibletime: Self = this.set("invisibletime", js.undefined)
    
    @scala.inline
    def setMaxReceiveCount(value: Double): Self = this.set("maxReceiveCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReceiveCount: Self = this.set("maxReceiveCount", js.undefined)
    
    @scala.inline
    def setOptions(value: ClientOpts): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRedis(value: RedisClient): Self = this.set("redis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedis: Self = this.set("redis", js.undefined)
    
    @scala.inline
    def setRedisPrefix(value: String): Self = this.set("redisPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedisPrefix: Self = this.set("redisPrefix", js.undefined)
    
    @scala.inline
    def setRsmq(value: Client): Self = this.set("rsmq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsmq: Self = this.set("rsmq", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
