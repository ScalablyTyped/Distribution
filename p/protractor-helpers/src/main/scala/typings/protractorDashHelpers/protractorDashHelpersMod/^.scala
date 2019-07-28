package typings.protractorDashHelpers.protractorDashHelpersMod

import typings.protractorDashHelpers.protractorDashHelpersMod.Global.protractorNs.ElementArrayFinder
import typings.protractorDashHelpers.protractorDashHelpersMod.Global.protractorNs.ElementFinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor-helpers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearAndSetValue(input: ElementFinder, value: String): Unit = js.native
  def createMessage(actual: String, message: String, isNot: js.Any): String = js.native
  def createMessage(actual: ElementArrayFinder, message: String, isNot: js.Any): String = js.native
  def createMessage(actual: ElementFinder, message: String, isNot: js.Any): String = js.native
  def displayHover(element: ElementFinder): Unit = js.native
  def getFilteredConsoleErrors(): js.Any = js.native
  def hasClass(element: ElementFinder, className: String): js.Any = js.native
  def hasLink(element: ElementFinder, url: String): js.Any = js.native
  def hasValue(element: ElementFinder, expectedValue: String): js.Any = js.native
  def hasValue(element: ElementFinder, expectedValue: Double): js.Any = js.native
  def isChecked(element: ElementFinder): js.Any = js.native
  def isDisabled(element: ElementFinder): js.Any = js.native
  def isFirefox(): Boolean = js.native
  def isIE(): Boolean = js.native
  def maximizeWindow(): Unit = js.native
  def maximizeWindow(width: Double): Unit = js.native
  def maximizeWindow(width: Double, height: Double): Unit = js.native
  def moveToElement(hook: String): Unit = js.native
  def not(
    arg: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify webdriver.promise.IThenable<any> */ js.Any
  ): js.Any = js.native
  def resetPosition(): Unit = js.native
  def safeGet(url: String): Unit = js.native
  def selectOption(option: ElementFinder): Unit = js.native
  def selectOptionByIndex(select: ElementFinder, index: Double): Unit = js.native
  def selectOptionByText(select: ElementFinder, text: String): Unit = js.native
  def translate(translationId: String): js.Any = js.native
  def translate(translationId: String, interpolateParams: js.Any): js.Any = js.native
  def translate(translationId: js.Array[String]): js.Any = js.native
  def translate(translationId: js.Array[String], interpolateParams: js.Any): js.Any = js.native
  def waitForElement(element: ElementFinder): Unit = js.native
  def waitForElement(element: ElementFinder, timeout: Double): Unit = js.native
  def waitForElementToDisappear(element: ElementFinder): Unit = js.native
  def waitForElementToDisappear(element: ElementFinder, timeout: Double): Unit = js.native
}

