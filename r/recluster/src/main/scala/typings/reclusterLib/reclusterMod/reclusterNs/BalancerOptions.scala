package typings
package reclusterLib.reclusterMod.reclusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalancerOptions extends js.Object {
  /** arguments to pass to the worker (default: []) */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** max time between respawns when workers die */
  var backoff: js.UndefOr[scala.Double] = js.undefined
  /** what to log to stdout (default: {respawns: true}) */
  var log: js.UndefOr[LogOptions] = js.undefined
  /** logger to use, needs `log` method (default: console) */
  var logger: js.UndefOr[Logger] = js.undefined
  /** when does the worker become ready? 'listening' or 'started' */
  var readyWhen: js.UndefOr[java.lang.String] = js.undefined
  /** min time between respawns when workers die */
  var respawn: js.UndefOr[scala.Double] = js.undefined
  /** kill timeout for old workers after reload (sec) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** number of active workers */
  var workers: js.UndefOr[scala.Double] = js.undefined
}

object BalancerOptions {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    backoff: scala.Int | scala.Double = null,
    log: LogOptions = null,
    logger: Logger = null,
    readyWhen: java.lang.String = null,
    respawn: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    workers: scala.Int | scala.Double = null
  ): BalancerOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (readyWhen != null) __obj.updateDynamic("readyWhen")(readyWhen)
    if (respawn != null) __obj.updateDynamic("respawn")(respawn.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalancerOptions]
  }
}

