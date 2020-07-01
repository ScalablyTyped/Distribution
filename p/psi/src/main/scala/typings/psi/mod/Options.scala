package typings.psi.mod

import typings.psi.psiStrings.desktop
import typings.psi.psiStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When using this module for a production-level build process,
    * registering for an API key from the Google Developer Console is recommended.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * Locale results should be generated in.
    * @default 'en_US'
    */
  var locale: js.UndefOr[String] = js.undefined
  var nokey: js.UndefOr[String] = js.undefined
  /**
    * Strategy to use when analyzing the page.
    * @default 'mobile'
    */
  var strategy: js.UndefOr[mobile | desktop] = js.undefined
  /**
    * Threshold score to pass the PageSpeed test. Useful for setting a performance budget.
    * @default 70
    */
  var treshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: String = null,
    locale: String = null,
    nokey: String = null,
    strategy: mobile | desktop = null,
    treshold: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nokey != null) __obj.updateDynamic("nokey")(nokey.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (!js.isUndefined(treshold)) __obj.updateDynamic("treshold")(treshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

