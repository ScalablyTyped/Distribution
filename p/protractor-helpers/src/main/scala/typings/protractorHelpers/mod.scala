package typings.protractorHelpers

import typings.protractorHelpers.mod.global.protractor.ElementArrayFinder
import typings.protractorHelpers.mod.global.protractor.ElementFinder
import typings.seleniumWebdriver.mod.Locator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protractor-helpers", "clearAndSetValue")
  @js.native
  def clearAndSetValue(input: ElementFinder, value: String): Unit = js.native
  
  @JSImport("protractor-helpers", "createMessage")
  @js.native
  def createMessage(actual: String, message: String, isNot: js.Any): String = js.native
  @JSImport("protractor-helpers", "createMessage")
  @js.native
  def createMessage(actual: ElementArrayFinder, message: String, isNot: js.Any): String = js.native
  @JSImport("protractor-helpers", "createMessage")
  @js.native
  def createMessage(actual: ElementFinder, message: String, isNot: js.Any): String = js.native
  
  @JSImport("protractor-helpers", "displayHover")
  @js.native
  def displayHover(element: ElementFinder): Unit = js.native
  
  @JSImport("protractor-helpers", "getFilteredConsoleErrors")
  @js.native
  def getFilteredConsoleErrors(): js.Any = js.native
  
  object global {
    
    @JSGlobal("$$data")
    @js.native
    def $data(hook: String): ElementArrayFinder = js.native
    
    // Globals
    @JSGlobal("$data")
    @js.native
    def data(hook: String): ElementFinder = js.native
    
    // Matchers
    // TODO - Use `T` to improve types
    // Note: This augments a namespace from '@types/jasmine'.
    // Intentionally not referencing those types from this file as they introduce many globals,
    // and users may use protractor-helpers but not jasmine, and have different definitions of those globals (e.g. through `jest`)
    object jasmine {
      
      @js.native
      trait Matchers[T] extends StObject {
        
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
    
    // ElementArrayFinder
    // Locators
    // TODO - find out about result of querySelector and querySelector all.
    //        Are they Locator s?
    object protractor {
      
      @js.native
      trait ElementArrayFinder extends StObject {
        
        @JSName("$$data")
        def DollarDollardata(hook: String): ElementArrayFinder = js.native
        
        def getByText(text: String): ElementFinder = js.native
      }
      object ElementArrayFinder {
        
        @scala.inline
        def apply(DollarDollardata: String => ElementArrayFinder, getByText: String => ElementFinder): ElementArrayFinder = {
          val __obj = js.Dynamic.literal(getByText = js.Any.fromFunction1(getByText))
          __obj.updateDynamic("$$data")(js.Any.fromFunction1(DollarDollardata))
          __obj.asInstanceOf[ElementArrayFinder]
        }
        
        @scala.inline
        implicit class ElementArrayFinderMutableBuilder[Self <: ElementArrayFinder] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDollarDollardata(value: String => ElementArrayFinder): Self = StObject.set(x, "$$data", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetByText(value: String => ElementFinder): Self = StObject.set(x, "getByText", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait ElementFinder extends StObject {
        
        @JSName("$data")
        def $data(hook: String): ElementFinder = js.native
      }
      object ElementFinder {
        
        @scala.inline
        def apply($data: String => ElementFinder): ElementFinder = {
          val __obj = js.Dynamic.literal($data = js.Any.fromFunction1($data))
          __obj.asInstanceOf[ElementFinder]
        }
        
        @scala.inline
        implicit class ElementFinderMutableBuilder[Self <: ElementFinder] (val x: Self) extends AnyVal {
          
          @scala.inline
          def set$data(value: String => ElementFinder): Self = StObject.set(x, "$data", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait IProtractorLocatorStrategy extends StObject {
        
        def dataHook(hook: String): Locator = js.native
        def dataHook(hook: String, optParentElement: js.UndefOr[scala.Nothing], optRootSelector: String): Locator = js.native
        def dataHook(hook: String, optParentElement: ElementFinder): Locator = js.native
        def dataHook(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
        
        def dataHookAll(hook: String): Locator = js.native
        def dataHookAll(hook: String, optParentElement: js.UndefOr[scala.Nothing], optRootSelector: String): Locator = js.native
        def dataHookAll(hook: String, optParentElement: ElementFinder): Locator = js.native
        def dataHookAll(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
      }
    }
  }
  
  @JSImport("protractor-helpers", "hasClass")
  @js.native
  def hasClass(element: ElementFinder, className: String): js.Any = js.native
  
  @JSImport("protractor-helpers", "hasLink")
  @js.native
  def hasLink(element: ElementFinder, url: String): js.Any = js.native
  
  @JSImport("protractor-helpers", "hasValue")
  @js.native
  def hasValue(element: ElementFinder, expectedValue: String): js.Any = js.native
  @JSImport("protractor-helpers", "hasValue")
  @js.native
  def hasValue(element: ElementFinder, expectedValue: Double): js.Any = js.native
  
  @JSImport("protractor-helpers", "isChecked")
  @js.native
  def isChecked(element: ElementFinder): js.Any = js.native
  
  @JSImport("protractor-helpers", "isDisabled")
  @js.native
  def isDisabled(element: ElementFinder): js.Any = js.native
  
  @JSImport("protractor-helpers", "isFirefox")
  @js.native
  def isFirefox(): Boolean = js.native
  
  @JSImport("protractor-helpers", "isIE")
  @js.native
  def isIE(): Boolean = js.native
  
  @JSImport("protractor-helpers", "maximizeWindow")
  @js.native
  def maximizeWindow(): Unit = js.native
  @JSImport("protractor-helpers", "maximizeWindow")
  @js.native
  def maximizeWindow(width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  @JSImport("protractor-helpers", "maximizeWindow")
  @js.native
  def maximizeWindow(width: Double): Unit = js.native
  @JSImport("protractor-helpers", "maximizeWindow")
  @js.native
  def maximizeWindow(width: Double, height: Double): Unit = js.native
  
  @JSImport("protractor-helpers", "moveToElement")
  @js.native
  def moveToElement(hook: String): Unit = js.native
  
  @JSImport("protractor-helpers", "not")
  @js.native
  def not(
    arg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.promise.IThenable<any> */ js.Any
  ): js.Any = js.native
  
  @JSImport("protractor-helpers", "resetPosition")
  @js.native
  def resetPosition(): Unit = js.native
  
  @JSImport("protractor-helpers", "safeGet")
  @js.native
  def safeGet(url: String): Unit = js.native
  
  @JSImport("protractor-helpers", "selectOption")
  @js.native
  def selectOption(option: ElementFinder): Unit = js.native
  
  @JSImport("protractor-helpers", "selectOptionByIndex")
  @js.native
  def selectOptionByIndex(select: ElementFinder, index: Double): Unit = js.native
  
  @JSImport("protractor-helpers", "selectOptionByText")
  @js.native
  def selectOptionByText(select: ElementFinder, text: String): Unit = js.native
  
  @JSImport("protractor-helpers", "translate")
  @js.native
  def translate(translationId: String): js.Any = js.native
  @JSImport("protractor-helpers", "translate")
  @js.native
  def translate(translationId: String, interpolateParams: js.Any): js.Any = js.native
  @JSImport("protractor-helpers", "translate")
  @js.native
  def translate(translationId: js.Array[String]): js.Any = js.native
  @JSImport("protractor-helpers", "translate")
  @js.native
  def translate(translationId: js.Array[String], interpolateParams: js.Any): js.Any = js.native
  
  @JSImport("protractor-helpers", "waitForElement")
  @js.native
  def waitForElement(element: ElementFinder): Unit = js.native
  @JSImport("protractor-helpers", "waitForElement")
  @js.native
  def waitForElement(element: ElementFinder, timeout: Double): Unit = js.native
  
  @JSImport("protractor-helpers", "waitForElementToDisappear")
  @js.native
  def waitForElementToDisappear(element: ElementFinder): Unit = js.native
  @JSImport("protractor-helpers", "waitForElementToDisappear")
  @js.native
  def waitForElementToDisappear(element: ElementFinder, timeout: Double): Unit = js.native
}
