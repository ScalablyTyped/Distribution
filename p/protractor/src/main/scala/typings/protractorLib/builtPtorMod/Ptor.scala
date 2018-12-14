package typings
package protractorLib.builtPtorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/ptor", "Ptor")
@js.native
class Ptor () extends js.Object {
  var ActionSequence: org.scalablytyped.runtime.Instantiable1[
    /* driver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.ActionSequence
  ] = js.native
  var Browser: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IBrowser = js.native
  var Builder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Builder] = js.native
  var Button: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IButton = js.native
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  var Capabilities: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities] = js.native
  var Capability: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ICapability = js.native
  var Command: js.Any = js.native
  var CommandName: js.Any = js.native
  var ElementArrayFinder: js.Any = js.native
  var ElementFinder: js.Any = js.native
  var EventEmitter: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.EventEmitter] = js.native
  var ExpectedConditions: protractorLib.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  var FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.FileDetector] = js.native
  var Key: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IKey = js.native
  var ProtractorBrowser: js.Any = js.native
  var ProtractorBy: js.Any = js.native
  var ProtractorExpectedConditions: js.Any = js.native
  var Session: org.scalablytyped.runtime.Instantiable2[
    /* id */ java.lang.String, 
    /* capabilities */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session
  ] = js.native
  var WebDriver: org.scalablytyped.runtime.Instantiable2[
    /* session */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session, 
    /* executor */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver
  ] = js.native
  var WebElement: org.scalablytyped.runtime.Instantiable2[
    /* driver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    /* id */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String], 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ] = js.native
  var WebElementPromise: org.scalablytyped.runtime.Instantiable2[
    /* driver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    /* el */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement], 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise
  ] = js.native
  var browser: protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  var by: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  @JSName("element")
  var element_Original: protractorLib.builtBrowserMod.ElementHelper = js.native
  var error: protractorLib.Anon_ScriptTimeoutError = js.native
  var logging: protractorLib.Anon_GetLevel = js.native
  var promise: protractorLib.Anon_CreateFlow = js.native
  var until: protractorLib.Anon_ElementTextMatches = js.native
  var utils: protractorLib.Anon_Firefox = js.native
  @JSName("$")
  def $(search: java.lang.String): protractorLib.builtElementMod.ElementFinder = js.native
  @JSName("$$")
  def $$(search: java.lang.String): protractorLib.builtElementMod.ElementArrayFinder = js.native
  def element(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementFinder = js.native
  def wrapDriver(webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, baseUrl: java.lang.String): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(
    webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver,
    baseUrl: java.lang.String,
    rootElement: java.lang.String
  ): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(
    webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver,
    baseUrl: java.lang.String,
    rootElement: java.lang.String,
    untrackOutstandingTimeouts: scala.Boolean
  ): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
}

