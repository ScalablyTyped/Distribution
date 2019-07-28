package typings.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "ProtractorBrowser")
@js.native
class ProtractorBrowser protected ()
  extends typings.protractor.builtBrowserMod.ProtractorBrowser {
  def this(webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String]
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: String,
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
  def this(
    webdriverInstance: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver,
    opt_baseUrl: String,
    opt_rootElement: js.Promise[String],
    opt_untrackOutstandingTimeouts: Boolean,
    opt_blockingProxyUrl: String
  ) = this()
}

/* static members */
@JSImport("protractor", "ProtractorBrowser")
@js.native
object ProtractorBrowser extends js.Object {
  /**
    * @type {ProtractorBy}
    */
  var By: typings.protractor.builtLocatorsMod.ProtractorBy = js.native
}

