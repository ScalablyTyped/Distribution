package typings.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The expected clock drift; for more details
    * see http://redis.io/topics/distlock
    *
    * Default is 0.01
    */
  var driftFactor: js.UndefOr[Double] = js.native
  
  /**
    * LUA script to run on the Redis server to extend a lock's ttl.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var extendScript: js.UndefOr[ExtendScriptFunction | String] = js.native
  
  /**
    * LUA script to run on the Redis server to lock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var lockScript: js.UndefOr[LockScriptFunction | String] = js.native
  
  /**
    * The max number of times Redlock will attempt
    * to lock a resource before erroring.
    *
    * Default is 10
    */
  var retryCount: js.UndefOr[Double] = js.native
  
  /**
    * The time in milliseconds between attempts.
    *
    * Default is 200
    */
  var retryDelay: js.UndefOr[Double] = js.native
  
  /**
    * The max time in ms randomly added to retries
    * to improve performance under high contention
    * see https://www.awsarchitectureblog.com/2015/03/backoff.html
    *
    * Default is 100
    */
  var retryJitter: js.UndefOr[Double] = js.native
  
  /**
    * LUA script to run on the Redis server to unlock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var unlockScript: js.UndefOr[UnlockScriptFunction | String] = js.native
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
    def setDriftFactor(value: Double): Self = this.set("driftFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriftFactor: Self = this.set("driftFactor", js.undefined)
    
    @scala.inline
    def setExtendScriptFunction1(value: /* origScript */ String => String): Self = this.set("extendScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendScript(value: ExtendScriptFunction | String): Self = this.set("extendScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendScript: Self = this.set("extendScript", js.undefined)
    
    @scala.inline
    def setLockScriptFunction1(value: /* origScript */ String => String): Self = this.set("lockScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLockScript(value: LockScriptFunction | String): Self = this.set("lockScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScript: Self = this.set("lockScript", js.undefined)
    
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryCount: Self = this.set("retryCount", js.undefined)
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    
    @scala.inline
    def setRetryJitter(value: Double): Self = this.set("retryJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryJitter: Self = this.set("retryJitter", js.undefined)
    
    @scala.inline
    def setUnlockScriptFunction1(value: /* origScript */ String => String): Self = this.set("unlockScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlockScript(value: UnlockScriptFunction | String): Self = this.set("unlockScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnlockScript: Self = this.set("unlockScript", js.undefined)
  }
}
