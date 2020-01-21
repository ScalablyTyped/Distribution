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
    backoff: Int | Double = null,
    log: LogOptions = null,
    logger: Logger = null,
    readyWhen: String = null,
    respawn: Int | Double = null,
    timeout: Int | Double = null,
    workers: Int | Double = null
  ): BalancerOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (readyWhen != null) __obj.updateDynamic("readyWhen")(readyWhen.asInstanceOf[js.Any])
    if (respawn != null) __obj.updateDynamic("respawn")(respawn.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalancerOptions]
  }
}

