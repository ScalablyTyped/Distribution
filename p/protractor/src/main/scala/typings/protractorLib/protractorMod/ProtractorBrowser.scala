package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends protractorLib.builtBrowserMod.ProtractorBrowser {
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String]) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: java.lang.String, opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
  def this(webdriverInstance: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, opt_baseUrl: java.lang.String, opt_rootElement: js.Promise[java.lang.String], opt_untrackOutstandingTimeouts: scala.Boolean, opt_blockingProxyUrl: java.lang.String) = this()
}

/* static members */
@JSImport("protractor", "ProtractorBrowser")
@js.native
object ProtractorBrowser extends js.Object {
  /**
    * @type {ProtractorBy}
    */
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
}

