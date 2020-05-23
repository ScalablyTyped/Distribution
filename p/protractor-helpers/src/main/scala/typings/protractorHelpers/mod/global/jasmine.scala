package typings.protractorHelpers.mod.global

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Matchers
// TODO - Use `T` to improve types
// Note: This augments a namespace from '@types/jasmine'.
// Intentionally not referencing those types from this file as they introduce many globals,
// and users may use protractor-helpers but not jasmine, and have different definitions of those globals (e.g. through `jest`)
@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    def toBeChecked(): Boolean = js.native
    def toBeDisabled(): Boolean = js.native
    def toBeDisplayed(): Boolean = js.native
    def toBeInvalid(): Boolean = js.native
    def toBeInvalidRequired(): Boolean = js.native
    def toBePresent(): Boolean = js.native
    def toBeValid(): Boolean = js.native
    def toHaveClass(className: String): Boolean = js.native
    def toHaveCountOf(expectedCount: Double): Boolean = js.native
    def toHaveText(expectedText: String): Boolean = js.native
    def toHaveUrl(url: String): Boolean = js.native
    def toHaveValue(actual: String): Boolean = js.native
    def toHaveValue(actual: Double): Boolean = js.native
    def toMatchMoney(expectedValue: Double): Boolean = js.native
    def toMatchMoney(expectedValue: Double, currencySymbol: String): Boolean = js.native
    def toMatchMoneyWithFraction(expectedValue: Double): Boolean = js.native
    def toMatchMoneyWithFraction(expectedValue: Double, currencySymbol: String): Boolean = js.native
    def toMatchRegex(regex: RegExp): Boolean = js.native
    // Copied definitions from angular-translate.
    def toMatchTranslated(translationId: String): Boolean = js.native
    def toMatchTranslated(translationId: String, interpolateParams: js.Any): Boolean = js.native
    def toMatchTranslated(translationId: js.Array[String]): Boolean = js.native
    def toMatchTranslated(translationId: js.Array[String], interpolateParams: js.Any): Boolean = js.native
  }
  
}

