package typings.protractorHelpers

import typings.protractorHelpers.mod.global.protractor.ElementArrayFinder
import typings.protractorHelpers.mod.global.protractor.ElementFinder
import typings.seleniumWebdriver.mod.Locator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protractor-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearAndSetValue(input: ElementFinder, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearAndSetValue")(input.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createMessage(actual: String, message: String, isNot: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any], isNot.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createMessage(actual: ElementArrayFinder, message: String, isNot: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any], isNot.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createMessage(actual: ElementFinder, message: String, isNot: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessage")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any], isNot.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def displayHover(element: ElementFinder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("displayHover")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getFilteredConsoleErrors(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilteredConsoleErrors")().asInstanceOf[js.Any]
  
  object global {
    
    @scala.inline
    def $data(hook: String): ElementArrayFinder = js.Dynamic.global.applyDynamic("$$data")(hook.asInstanceOf[js.Any]).asInstanceOf[ElementArrayFinder]
    
    // Globals
    @scala.inline
    def data(hook: String): ElementFinder = js.Dynamic.global.applyDynamic("$data")(hook.asInstanceOf[js.Any]).asInstanceOf[ElementFinder]
    
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
      
      trait ElementArrayFinder extends StObject {
        
        @JSName("$$data")
        def DollarDollardata(hook: String): ElementArrayFinder
        
        def getByText(text: String): ElementFinder
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
      
      trait ElementFinder extends StObject {
        
        @JSName("$data")
        def $data(hook: String): ElementFinder
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
        def dataHook(hook: String, optParentElement: Unit, optRootSelector: String): Locator = js.native
        def dataHook(hook: String, optParentElement: ElementFinder): Locator = js.native
        def dataHook(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
        
        def dataHookAll(hook: String): Locator = js.native
        def dataHookAll(hook: String, optParentElement: Unit, optRootSelector: String): Locator = js.native
        def dataHookAll(hook: String, optParentElement: ElementFinder): Locator = js.native
        def dataHookAll(hook: String, optParentElement: ElementFinder, optRootSelector: String): Locator = js.native
      }
    }
  }
  
  @scala.inline
  def hasClass(element: ElementFinder, className: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def hasLink(element: ElementFinder, url: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLink")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def hasValue(element: ElementFinder, expectedValue: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(element.asInstanceOf[js.Any], expectedValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def hasValue(element: ElementFinder, expectedValue: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(element.asInstanceOf[js.Any], expectedValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isChecked(element: ElementFinder): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isChecked")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isDisabled(element: ElementFinder): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  @scala.inline
  def maximizeWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("maximizeWindow")().asInstanceOf[Unit]
  @scala.inline
  def maximizeWindow(width: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("maximizeWindow")(width.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def maximizeWindow(width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maximizeWindow")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def maximizeWindow(width: Unit, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("maximizeWindow")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def moveToElement(hook: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveToElement")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def not(
    arg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.promise.IThenable<any> */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def resetPosition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPosition")().asInstanceOf[Unit]
  
  @scala.inline
  def safeGet(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("safeGet")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def selectOption(option: ElementFinder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectOption")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def selectOptionByIndex(select: ElementFinder, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptionByIndex")(select.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def selectOptionByText(select: ElementFinder, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptionByText")(select.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def translate(translationId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(translationId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def translate(translationId: String, interpolateParams: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(translationId.asInstanceOf[js.Any], interpolateParams.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def translate(translationId: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(translationId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def translate(translationId: js.Array[String], interpolateParams: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(translationId.asInstanceOf[js.Any], interpolateParams.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def waitForElement(element: ElementFinder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def waitForElement(element: ElementFinder, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(element.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def waitForElementToDisappear(element: ElementFinder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToDisappear")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def waitForElementToDisappear(element: ElementFinder, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToDisappear")(element.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
