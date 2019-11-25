package typings.stickyDashCluster.stickyDashClusterMod

import typings.stickyDashCluster.Anon_Stickyclusterworkerindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Function1[/* index */ Double, Anon_Stickyclusterworkerindex]] = js.undefined
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var hardShutdownDelay: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    env: /* index */ Double => Anon_Stickyclusterworkerindex = null,
    errorHandler: /* err */ js.Any => Unit = null,
    hardShutdownDelay: Int | Double = null,
    port: Int | Double = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(js.Any.fromFunction1(env))
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (hardShutdownDelay != null) __obj.updateDynamic("hardShutdownDelay")(hardShutdownDelay.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

