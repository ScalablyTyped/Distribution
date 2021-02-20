package typings.seleniumWebdriver

import typings.seleniumWebdriver.byMod.ByHash
import typings.seleniumWebdriver.mod.Alert
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.Condition
import typings.seleniumWebdriver.mod.Locator
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import typings.seleniumWebdriver.mod.WebElementCondition
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object untilMod {
  
  @JSImport("selenium-webdriver/lib/until", "ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: js.Function1[/* webdriver */ WebDriver, WebElement]): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver/lib/until", "ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver/lib/until", "ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver/lib/until", "ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver/lib/until", "ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: WebElement): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "alertIsPresent")
  @js.native
  def alertIsPresent(): Condition[Alert] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsDisabled")
  @js.native
  def elementIsDisabled(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsEnabled")
  @js.native
  def elementIsEnabled(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsNotSelected")
  @js.native
  def elementIsNotSelected(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsNotVisible")
  @js.native
  def elementIsNotVisible(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsSelected")
  @js.native
  def elementIsSelected(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementIsVisible")
  @js.native
  def elementIsVisible(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementLocated")
  @js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementTextContains")
  @js.native
  def elementTextContains(element: WebElement, substr: String): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementTextIs")
  @js.native
  def elementTextIs(element: WebElement, text: String): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementTextMatches")
  @js.native
  def elementTextMatches(element: WebElement, regex: RegExp): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver/lib/until", "elementsLocated")
  @js.native
  def elementsLocated(locator: Locator): Condition[js.Array[WebElement]] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "stalenessOf")
  @js.native
  def stalenessOf(element: WebElement): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "titleContains")
  @js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "titleIs")
  @js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "titleMatches")
  @js.native
  def titleMatches(regex: RegExp): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "urlContains")
  @js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "urlIs")
  @js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver/lib/until", "urlMatches")
  @js.native
  def urlMatches(regex: RegExp): Condition[Boolean] = js.native
}
