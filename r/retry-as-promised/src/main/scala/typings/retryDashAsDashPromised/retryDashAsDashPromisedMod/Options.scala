package typings.retryDashAsDashPromised.retryDashAsDashPromisedMod

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
    $current: Int | Double = null,
    backoffBase: Int | Double = null,
    backoffExponent: Int | Double = null,
    `match`: js.Array[MatchOption] | MatchOption = null,
    max: Int | Double = null,
    name: String = null,
    report: (/* message */ String, /* obj */ Options, /* err */ js.UndefOr[js.Any]) => Unit = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if ($current != null) __obj.updateDynamic("$current")($current.asInstanceOf[js.Any])
    if (backoffBase != null) __obj.updateDynamic("backoffBase")(backoffBase.asInstanceOf[js.Any])
    if (backoffExponent != null) __obj.updateDynamic("backoffExponent")(backoffExponent.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (report != null) __obj.updateDynamic("report")(js.Any.fromFunction3(report))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

