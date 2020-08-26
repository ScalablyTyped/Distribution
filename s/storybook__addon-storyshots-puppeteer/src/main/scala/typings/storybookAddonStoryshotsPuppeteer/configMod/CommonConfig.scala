package typings.storybookAddonStoryshotsPuppeteer.configMod

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonConfig extends js.Object {
  var chromeExecutablePath: String = js.native
  var setupTimeout: Double = js.native
  var storybookUrl: String = js.native
  var testTimeout: Double = js.native
  def customizePage(page: Page): js.Promise[Unit] = js.native
  def getCustomBrowser(): js.Promise[Browser] = js.native
  def getGotoOptions(options: Options): DirectNavigationOptions = js.native
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
  @scala.inline
  implicit class CommonConfigOps[Self <: CommonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChromeExecutablePath(value: String): Self = this.set("chromeExecutablePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomizePage(value: Page => js.Promise[Unit]): Self = this.set("customizePage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCustomBrowser(value: () => js.Promise[Browser]): Self = this.set("getCustomBrowser", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGotoOptions(value: Options => DirectNavigationOptions): Self = this.set("getGotoOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setSetupTimeout(value: Double): Self = this.set("setupTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorybookUrl(value: String): Self = this.set("storybookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
  }
  
}

