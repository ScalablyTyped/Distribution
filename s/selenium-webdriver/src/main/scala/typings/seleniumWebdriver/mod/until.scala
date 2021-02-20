package typings.seleniumWebdriver.mod

import typings.seleniumWebdriver.byMod.ByHash
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object until {
  
  @JSImport("selenium-webdriver", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: js.Function1[/* webdriver */ WebDriver, WebElement]): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  @JSImport("selenium-webdriver", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: WebElement): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.alertIsPresent")
  @js.native
  def alertIsPresent(): Condition[Alert] = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsDisabled")
  @js.native
  def elementIsDisabled(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsEnabled")
  @js.native
  def elementIsEnabled(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsNotSelected")
  @js.native
  def elementIsNotSelected(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsNotVisible")
  @js.native
  def elementIsNotVisible(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsSelected")
  @js.native
  def elementIsSelected(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementIsVisible")
  @js.native
  def elementIsVisible(element: WebElement): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementLocated")
  @js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementTextContains")
  @js.native
  def elementTextContains(element: WebElement, substr: String): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementTextIs")
  @js.native
  def elementTextIs(element: WebElement, text: String): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementTextMatches")
  @js.native
  def elementTextMatches(element: WebElement, regex: RegExp): WebElementCondition = js.native
  
  @JSImport("selenium-webdriver", "until.elementsLocated")
  @js.native
  def elementsLocated(locator: Locator): Condition[js.Array[WebElement]] = js.native
  
  @JSImport("selenium-webdriver", "until.stalenessOf")
  @js.native
  def stalenessOf(element: WebElement): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.titleContains")
  @js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.titleIs")
  @js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.titleMatches")
  @js.native
  def titleMatches(regex: RegExp): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.urlContains")
  @js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.urlIs")
  @js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  
  @JSImport("selenium-webdriver", "until.urlMatches")
  @js.native
  def urlMatches(regex: RegExp): Condition[Boolean] = js.native
}
