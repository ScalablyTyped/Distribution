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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object until {
  
  @JSImport("protractor", "until")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ typings.seleniumWebdriver.mod.WebDriver, 
      typings.seleniumWebdriver.mod.WebElement
    ]
  ): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ableToSwitchToFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  inline def ableToSwitchToFrame(frame: Double): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ableToSwitchToFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  inline def ableToSwitchToFrame(frame: ByHash): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ableToSwitchToFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  inline def ableToSwitchToFrame(frame: By): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ableToSwitchToFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  inline def ableToSwitchToFrame(frame: typings.seleniumWebdriver.mod.WebElement): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ableToSwitchToFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def alertIsPresent(): Condition[Alert] = ^.asInstanceOf[js.Dynamic].applyDynamic("alertIsPresent")().asInstanceOf[Condition[Alert]]
  
  inline def elementIsDisabled(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsDisabled")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementIsEnabled(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsEnabled")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementIsNotSelected(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsNotSelected")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementIsNotVisible(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsNotVisible")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementIsSelected(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsSelected")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementIsVisible(element: typings.seleniumWebdriver.mod.WebElement): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsVisible")(element.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementLocated(locator: Locator): WebElementCondition = ^.asInstanceOf[js.Dynamic].applyDynamic("elementLocated")(locator.asInstanceOf[js.Any]).asInstanceOf[WebElementCondition]
  
  inline def elementTextContains(element: typings.seleniumWebdriver.mod.WebElement, substr: String): WebElementCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("elementTextContains")(element.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[WebElementCondition]
  
  inline def elementTextIs(element: typings.seleniumWebdriver.mod.WebElement, text: String): WebElementCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("elementTextIs")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[WebElementCondition]
  
  inline def elementTextMatches(element: typings.seleniumWebdriver.mod.WebElement, regex: RegExp): WebElementCondition = (^.asInstanceOf[js.Dynamic].applyDynamic("elementTextMatches")(element.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[WebElementCondition]
  
  inline def elementsLocated(locator: Locator): Condition[js.Array[typings.seleniumWebdriver.mod.WebElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementsLocated")(locator.asInstanceOf[js.Any]).asInstanceOf[Condition[js.Array[typings.seleniumWebdriver.mod.WebElement]]]
  
  inline def stalenessOf(element: typings.seleniumWebdriver.mod.WebElement): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("stalenessOf")(element.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def titleContains(substr: String): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("titleContains")(substr.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def titleIs(title: String): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("titleIs")(title.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def titleMatches(regex: RegExp): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("titleMatches")(regex.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def urlContains(substrUrl: String): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlContains")(substrUrl.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def urlIs(url: String): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlIs")(url.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
  
  inline def urlMatches(regex: RegExp): Condition[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(regex.asInstanceOf[js.Any]).asInstanceOf[Condition[Boolean]]
}
