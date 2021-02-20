package typings.protractor.mod

import typings.seleniumWebdriver.byMod.ByHash
import typings.seleniumWebdriver.mod.Alert
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.Condition
import typings.seleniumWebdriver.mod.Locator
import typings.seleniumWebdriver.mod.WebElementCondition
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object until {
  
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typings.seleniumWebdriver.mod.WebDriver, 
      typings.seleniumWebdriver.mod.WebElement
    ]
  ): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: Double): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: By): Condition[Boolean] = js.native
  @JSImport("protractor", "until.ableToSwitchToFrame")
  @js.native
  def ableToSwitchToFrame(frame: typings.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.alertIsPresent")
  @js.native
  def alertIsPresent(): Condition[Alert] = js.native
  
  @JSImport("protractor", "until.elementIsDisabled")
  @js.native
  def elementIsDisabled(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsEnabled")
  @js.native
  def elementIsEnabled(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsNotSelected")
  @js.native
  def elementIsNotSelected(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsNotVisible")
  @js.native
  def elementIsNotVisible(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsSelected")
  @js.native
  def elementIsSelected(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementIsVisible")
  @js.native
  def elementIsVisible(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementLocated")
  @js.native
  def elementLocated(locator: Locator): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextContains")
  @js.native
  def elementTextContains(element: typings.seleniumWebdriver.mod.WebElement, substr: String): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextIs")
  @js.native
  def elementTextIs(element: typings.seleniumWebdriver.mod.WebElement, text: String): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementTextMatches")
  @js.native
  def elementTextMatches(element: typings.seleniumWebdriver.mod.WebElement, regex: RegExp): WebElementCondition = js.native
  
  @JSImport("protractor", "until.elementsLocated")
  @js.native
  def elementsLocated(locator: Locator): Condition[js.Array[typings.seleniumWebdriver.mod.WebElement]] = js.native
  
  @JSImport("protractor", "until.stalenessOf")
  @js.native
  def stalenessOf(element: typings.seleniumWebdriver.mod.WebElement): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleContains")
  @js.native
  def titleContains(substr: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleIs")
  @js.native
  def titleIs(title: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.titleMatches")
  @js.native
  def titleMatches(regex: RegExp): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlContains")
  @js.native
  def urlContains(substrUrl: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlIs")
  @js.native
  def urlIs(url: String): Condition[Boolean] = js.native
  
  @JSImport("protractor", "until.urlMatches")
  @js.native
  def urlMatches(regex: RegExp): Condition[Boolean] = js.native
}
