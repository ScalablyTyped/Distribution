package typings.storybookAddonStoryshotsPuppeteer.configMod

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonConfig extends js.Object {
  var chromeExecutablePath: String
  var setupTimeout: Double
  var storybookUrl: String
  var testTimeout: Double
  def customizePage(page: Page): js.Promise[Unit]
  def getCustomBrowser(): js.Promise[Browser]
  def getGotoOptions(options: Options): DirectNavigationOptions
}

object CommonConfig {
  @scala.inline
  def apply(
    chromeExecutablePath: String,
    customizePage: Page => js.Promise[Unit],
    getCustomBrowser: () => js.Promise[Browser],
    getGotoOptions: Options => DirectNavigationOptions,
    setupTimeout: Double,
    storybookUrl: String,
    testTimeout: Double
  ): CommonConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonConfig]
  }
}

