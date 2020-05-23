package typings.recluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalancerOptions extends js.Object {
  /** arguments to pass to the worker (default: []) */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /** max time between respawns when workers die */
  var backoff: js.UndefOr[Double] = js.undefined
  /** what to log to stdout (default: {respawns: true}) */
  var log: js.UndefOr[LogOptions] = js.undefined
  /** logger to use, needs `log` method (default: console) */
  var logger: js.UndefOr[Logger] = js.undefined
  /** when does the worker become ready? 'listening' or 'started' */
  var readyWhen: js.UndefOr[String] = js.undefined
  /** min time between respawns when workers die */
  var respawn: js.UndefOr[Double] = js.undefined
  /** kill timeout for old workers after reload (sec) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** number of active workers */
  var workers: js.UndefOr[Double] = js.undefined
}

object BalancerOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    backoff: js.UndefOr[Double] = js.undefined,
    log: LogOptions = null,
    logger: Logger = null,
    readyWhen: String = null,
    respawn: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    workers: js.UndefOr[Double] = js.undefined
  ): BalancerOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(backoff)) __obj.updateDynamic("backoff")(backoff.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (readyWhen != null) __obj.updateDynamic("readyWhen")(readyWhen.asInstanceOf[js.Any])
    if (!js.isUndefined(respawn)) __obj.updateDynamic("respawn")(respawn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workers)) __obj.updateDynamic("workers")(workers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalancerOptions]
  }
}

