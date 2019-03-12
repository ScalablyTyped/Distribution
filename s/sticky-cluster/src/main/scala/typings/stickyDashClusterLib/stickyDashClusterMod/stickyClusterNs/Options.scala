package typings
package stickyDashClusterLib.stickyDashClusterMod.stickyClusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[
    js.Function1[/* index */ scala.Double, stickyDashClusterLib.Anon_Stickyclusterworkerindex]
  ] = js.undefined
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
  var hardShutdownDelay: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    env: /* index */ scala.Double => stickyDashClusterLib.Anon_Stickyclusterworkerindex = null,
    errorHandler: /* err */ js.Any => scala.Unit = null,
    hardShutdownDelay: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (env != null) __obj.updateDynamic("env")(js.Any.fromFunction1(env))
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (hardShutdownDelay != null) __obj.updateDynamic("hardShutdownDelay")(hardShutdownDelay.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Options]
  }
}

