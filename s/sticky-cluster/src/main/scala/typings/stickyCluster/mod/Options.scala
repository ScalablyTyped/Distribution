package typings.stickyCluster.mod

import typings.stickyCluster.anon.Stickyclusterworkerindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Function1[/* index */ Double, Stickyclusterworkerindex]] = js.undefined
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var hardShutdownDelay: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: js.UndefOr[Double] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    env: /* index */ Double => Stickyclusterworkerindex = null,
    errorHandler: /* err */ js.Any => Unit = null,
    hardShutdownDelay: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(js.Any.fromFunction1(env))
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction1(errorHandler))
    if (!js.isUndefined(hardShutdownDelay)) __obj.updateDynamic("hardShutdownDelay")(hardShutdownDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

