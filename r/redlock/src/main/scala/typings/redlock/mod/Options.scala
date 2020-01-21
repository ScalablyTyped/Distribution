package typings.redlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The expected clock drift; for more details
    * see http://redis.io/topics/distlock
    *
    * Default is 0.01
    */
  var driftFactor: js.UndefOr[Double] = js.undefined
  /**
    * LUA script to run on the Redis server to extend a lock's ttl.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var extendScript: js.UndefOr[ExtendScriptFunction | String] = js.undefined
  /**
    * LUA script to run on the Redis server to lock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var lockScript: js.UndefOr[LockScriptFunction | String] = js.undefined
  /**
    * The max number of times Redlock will attempt
    * to lock a resource before erroring.
    *
    * Default is 10
    */
  var retryCount: js.UndefOr[Double] = js.undefined
  /**
    * The time in milliseconds between attempts.
    *
    * Default is 200
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
  /**
    * The max time in ms randomly added to retries
    * to improve performance under high contention
    * see https://www.awsarchitectureblog.com/2015/03/backoff.html
    *
    * Default is 100
    */
  var retryJitter: js.UndefOr[Double] = js.undefined
  /**
    * LUA script to run on the Redis server to unlock a resource.
    * https://redis.io/commands/eval
    *
    * Redlock has a default script.
    * Only override if you know it's necessary to do so.
    */
  var unlockScript: js.UndefOr[UnlockScriptFunction | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    driftFactor: Int | Double = null,
    extendScript: ExtendScriptFunction | String = null,
    lockScript: LockScriptFunction | String = null,
    retryCount: Int | Double = null,
    retryDelay: Int | Double = null,
    retryJitter: Int | Double = null,
    unlockScript: UnlockScriptFunction | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (driftFactor != null) __obj.updateDynamic("driftFactor")(driftFactor.asInstanceOf[js.Any])
    if (extendScript != null) __obj.updateDynamic("extendScript")(extendScript.asInstanceOf[js.Any])
    if (lockScript != null) __obj.updateDynamic("lockScript")(lockScript.asInstanceOf[js.Any])
    if (retryCount != null) __obj.updateDynamic("retryCount")(retryCount.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (retryJitter != null) __obj.updateDynamic("retryJitter")(retryJitter.asInstanceOf[js.Any])
    if (unlockScript != null) __obj.updateDynamic("unlockScript")(unlockScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

