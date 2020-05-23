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
    driftFactor: js.UndefOr[Double] = js.undefined,
    extendScript: ExtendScriptFunction | String = null,
    lockScript: LockScriptFunction | String = null,
    retryCount: js.UndefOr[Double] = js.undefined,
    retryDelay: js.UndefOr[Double] = js.undefined,
    retryJitter: js.UndefOr[Double] = js.undefined,
    unlockScript: UnlockScriptFunction | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(driftFactor)) __obj.updateDynamic("driftFactor")(driftFactor.get.asInstanceOf[js.Any])
    if (extendScript != null) __obj.updateDynamic("extendScript")(extendScript.asInstanceOf[js.Any])
    if (lockScript != null) __obj.updateDynamic("lockScript")(lockScript.asInstanceOf[js.Any])
    if (!js.isUndefined(retryCount)) __obj.updateDynamic("retryCount")(retryCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelay)) __obj.updateDynamic("retryDelay")(retryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryJitter)) __obj.updateDynamic("retryJitter")(retryJitter.get.asInstanceOf[js.Any])
    if (unlockScript != null) __obj.updateDynamic("unlockScript")(unlockScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

