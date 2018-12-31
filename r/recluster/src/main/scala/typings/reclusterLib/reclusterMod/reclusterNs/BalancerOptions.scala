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

