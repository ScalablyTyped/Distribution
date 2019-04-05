package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "until")
@js.native
object untilNs extends js.Object {
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def ableToSwitchToFrame(frame: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.libByMod.ByHash): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.seleniumDashWebdriverMod.By): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def alertIsPresent(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Alert] = js.native
  def elementIsDisabled(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementIsEnabled(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementIsNotSelected(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementIsNotVisible(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementIsSelected(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementIsVisible(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementLocated(locator: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementTextContains(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, substr: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementTextIs(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, text: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementTextMatches(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  def elementsLocated(locator: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]] = js.native
  def stalenessOf(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def titleContains(substr: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def titleIs(title: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def titleMatches(regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def urlContains(substrUrl: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def urlIs(url: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  def urlMatches(regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
}

