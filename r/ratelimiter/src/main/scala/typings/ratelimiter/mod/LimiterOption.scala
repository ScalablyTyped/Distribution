package typings.ratelimiter.mod

import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimiterOption extends js.Object {
  
  /**
    * Redis connection instance
    */
  var db: RedisClient = js.native
  
  /**
    * Duration of limit in milliseconds
    * @default 3600000
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The identifier to limit against (typically a user id)
    */
  var id: String = js.native
  
  /**
    * Max requests within duration
    * @default 2500
    */
  var max: js.UndefOr[Double] = js.native
}
object LimiterOption {
  
  @scala.inline
  def apply(db: RedisClient, id: String): LimiterOption = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterOption]
  }
  
  @scala.inline
  implicit class LimiterOptionOps[Self <: LimiterOption] (val x: Self) extends AnyVal {
    
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
    def setDb(value: RedisClient): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
}
