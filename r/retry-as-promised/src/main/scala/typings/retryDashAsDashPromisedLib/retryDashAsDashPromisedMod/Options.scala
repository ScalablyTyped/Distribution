package typings
package retryDashAsDashPromisedLib.retryDashAsDashPromisedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$current")
  var $current: js.UndefOr[scala.Double] = js.undefined
  var backoffBase: js.UndefOr[scala.Double] = js.undefined
  var backoffExponent: js.UndefOr[scala.Double] = js.undefined
  var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var report: js.UndefOr[
    js.Function3[
      /* message */ java.lang.String, 
      /* obj */ Options, 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $current: scala.Int | scala.Double = null,
    backoffBase: scala.Int | scala.Double = null,
    backoffExponent: scala.Int | scala.Double = null,
    `match`: js.Array[MatchOption] | MatchOption = null,
    max: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    report: (/* message */ java.lang.String, /* obj */ Options, /* err */ js.UndefOr[js.Any]) => scala.Unit = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if ($current != null) __obj.updateDynamic("$current")($current.asInstanceOf[js.Any])
    if (backoffBase != null) __obj.updateDynamic("backoffBase")(backoffBase.asInstanceOf[js.Any])
    if (backoffExponent != null) __obj.updateDynamic("backoffExponent")(backoffExponent.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (report != null) __obj.updateDynamic("report")(js.Any.fromFunction3(report))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

