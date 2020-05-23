package typings.retryAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$current")
  var $current: js.UndefOr[Double] = js.undefined
  var backoffBase: js.UndefOr[Double] = js.undefined
  var backoffExponent: js.UndefOr[Double] = js.undefined
  var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var report: js.UndefOr[
    js.Function3[/* message */ String, /* obj */ Options, /* err */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $current: js.UndefOr[Double] = js.undefined,
    backoffBase: js.UndefOr[Double] = js.undefined,
    backoffExponent: js.UndefOr[Double] = js.undefined,
    `match`: js.Array[MatchOption] | MatchOption = null,
    max: js.UndefOr[Double] = js.undefined,
    name: String = null,
    report: (/* message */ String, /* obj */ Options, /* err */ js.UndefOr[js.Any]) => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($current)) __obj.updateDynamic("$current")($current.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffBase)) __obj.updateDynamic("backoffBase")(backoffBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffExponent)) __obj.updateDynamic("backoffExponent")(backoffExponent.get.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (report != null) __obj.updateDynamic("report")(js.Any.fromFunction3(report))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

