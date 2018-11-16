package typings
package protractorDashHelpersLib.protractorDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor-helpers", JSImport.Namespace)
@js.native
object protractorDashHelpersModMembers extends js.Object {
  def clearAndSetValue(
    input: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    value: java.lang.String
  ): scala.Unit = js.native
  def createMessage(actual: java.lang.String, message: java.lang.String, isNot: js.Any): java.lang.String = js.native
  def createMessage(
    actual: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementArrayFinder,
    message: java.lang.String,
    isNot: js.Any
  ): java.lang.String = js.native
  def createMessage(
    actual: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    message: java.lang.String,
    isNot: js.Any
  ): java.lang.String = js.native
  def displayHover(element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): scala.Unit = js.native
  def getFilteredConsoleErrors(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[js.Array[java.lang.String]] = js.native
  def hasClass(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    className: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def hasLink(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    url: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def hasValue(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    expectedValue: java.lang.String
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def hasValue(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    expectedValue: scala.Double
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def isChecked(element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def isDisabled(element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def isFirefox(): scala.Boolean = js.native
  def isIE(): scala.Boolean = js.native
  def maximizeWindow(): scala.Unit = js.native
  def maximizeWindow(width: scala.Double): scala.Unit = js.native
  def maximizeWindow(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def moveToElement(hook: java.lang.String): scala.Unit = js.native
  def not(arg: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[_]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Boolean] = js.native
  def resetPosition(): scala.Unit = js.native
  def safeGet(url: java.lang.String): scala.Unit = js.native
  def selectOption(option: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): scala.Unit = js.native
  def selectOptionByIndex(
    select: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    index: scala.Double
  ): scala.Unit = js.native
  def selectOptionByText(
    select: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    text: java.lang.String
  ): scala.Unit = js.native
  def translate(translationId: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[java.lang.String] = js.native
  def translate(translationId: java.lang.String, interpolateParams: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[java.lang.String] = js.native
  def translate(translationId: js.Array[java.lang.String]): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def translate(translationId: js.Array[java.lang.String], interpolateParams: js.Any): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def waitForElement(element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): scala.Unit = js.native
  def waitForElement(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForElementToDisappear(element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder): scala.Unit = js.native
  def waitForElementToDisappear(
    element: protractorDashHelpersLib.protractorDashHelpersMod.Global.protractorNs.ElementFinder,
    timeout: scala.Double
  ): scala.Unit = js.native
}

