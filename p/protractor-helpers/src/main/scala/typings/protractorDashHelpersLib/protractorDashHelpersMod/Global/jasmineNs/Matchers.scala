package typings
package protractorDashHelpersLib.protractorDashHelpersMod.Global.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[T] extends js.Object {
  def toBeChecked(): scala.Boolean = js.native
  def toBeDisabled(): scala.Boolean = js.native
  def toBeDisplayed(): scala.Boolean = js.native
  def toBeInvalid(): scala.Boolean = js.native
  def toBeInvalidRequired(): scala.Boolean = js.native
  def toBePresent(): scala.Boolean = js.native
  def toBeValid(): scala.Boolean = js.native
  def toHaveClass(className: java.lang.String): scala.Boolean = js.native
  def toHaveCountOf(expectedCount: scala.Double): scala.Boolean = js.native
  def toHaveText(expectedText: java.lang.String): scala.Boolean = js.native
  def toHaveUrl(url: java.lang.String): scala.Boolean = js.native
  def toHaveValue(actual: java.lang.String): scala.Boolean = js.native
  def toHaveValue(actual: scala.Double): scala.Boolean = js.native
  def toMatchMoney(expectedValue: scala.Double): scala.Boolean = js.native
  def toMatchMoney(expectedValue: scala.Double, currencySymbol: java.lang.String): scala.Boolean = js.native
  def toMatchMoneyWithFraction(expectedValue: scala.Double): scala.Boolean = js.native
  def toMatchMoneyWithFraction(expectedValue: scala.Double, currencySymbol: java.lang.String): scala.Boolean = js.native
  def toMatchRegex(regex: stdLib.RegExp): scala.Boolean = js.native
  // Copied definitions from angular-translate.
  def toMatchTranslated(translationId: java.lang.String): scala.Boolean = js.native
  def toMatchTranslated(translationId: java.lang.String, interpolateParams: js.Any): scala.Boolean = js.native
  def toMatchTranslated(translationId: js.Array[java.lang.String]): scala.Boolean = js.native
  def toMatchTranslated(translationId: js.Array[java.lang.String], interpolateParams: js.Any): scala.Boolean = js.native
}

