package typings.storybookAddonStoryshotsPuppeteer.configMod

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import typings.storybookAddonStoryshotsPuppeteer.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PuppeteerTestConfig extends CommonConfig {
  var testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter = js.native
}

object PuppeteerTestConfig {
  @scala.inline
  def apply(
    chromeExecutablePath: String,
    customizePage: Page => js.Promise[Unit],
    getCustomBrowser: () => js.Promise[Browser],
    getGotoOptions: Options => DirectNavigationOptions,
    setupTimeout: Double,
    storybookUrl: String,
    testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter,
    testTimeout: Double
  ): PuppeteerTestConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testBody = testBody.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PuppeteerTestConfig]
  }
  @scala.inline
  implicit class PuppeteerTestConfigOps[Self <: PuppeteerTestConfig] (val x: Self) extends AnyVal {
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
    def setTestBody(value: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter): Self = this.set("testBody", value.asInstanceOf[js.Any])
  }
  
}

