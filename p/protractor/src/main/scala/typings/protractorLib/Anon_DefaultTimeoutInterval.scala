package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTimeoutInterval
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Default time to wait in ms before a test fails.
    */
  var defaultTimeoutInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set, only execute specs whose names match the pattern, which is
    * internally compiled to a RegExp.
    */
  var grep: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Inverts 'grep' matches
    */
  var invertGrep: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function called to print jasmine results.
    */
  var print: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * If true, run specs in semi-random order
    */
  var random: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the randomization seed if randomization is turned on
    */
  var seed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, print colors to the terminal.
    */
  var showColors: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DefaultTimeoutInterval {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    defaultTimeoutInterval: scala.Int | scala.Double = null,
    grep: java.lang.String = null,
    invertGrep: js.UndefOr[scala.Boolean] = js.undefined,
    print: () => scala.Unit = null,
    random: js.UndefOr[scala.Boolean] = js.undefined,
    seed: java.lang.String = null,
    showColors: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DefaultTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (defaultTimeoutInterval != null) __obj.updateDynamic("defaultTimeoutInterval")(defaultTimeoutInterval.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep)
    if (!js.isUndefined(invertGrep)) __obj.updateDynamic("invertGrep")(invertGrep)
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction0(print))
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random)
    if (seed != null) __obj.updateDynamic("seed")(seed)
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors)
    __obj.asInstanceOf[Anon_DefaultTimeoutInterval]
  }
}

