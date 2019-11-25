package typings.protractor.protractorMod

import typings.seleniumDashWebdriver.libByMod.ByHash
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Alert
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Condition
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementCondition
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "until")
@js.native
object until extends js.Object {
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver, 
      typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
    ]
  ): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.By): Condition[Boolean] = js.native
  def ableToSwitchToFrame(frame: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): Condition[Boolean] = js.native
  def alertIsPresent(): Condition[Alert] = js.native
  def elementIsDisabled(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsEnabled(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsNotSelected(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsNotVisible(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsSelected(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementIsVisible(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): WebElementCondition = js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  def elementTextContains(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, substr: String): WebElementCondition = js.native
  def elementTextIs(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, text: String): WebElementCondition = js.native
  def elementTextMatches(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement, regex: RegExp): WebElementCondition = js.native
  def elementsLocated(locator: Locator): Condition[js.Array[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement]] = js.native
  def stalenessOf(element: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement): Condition[Boolean] = js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  def titleMatches(regex: RegExp): Condition[Boolean] = js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  def urlMatches(regex: RegExp): Condition[Boolean] = js.native
}

