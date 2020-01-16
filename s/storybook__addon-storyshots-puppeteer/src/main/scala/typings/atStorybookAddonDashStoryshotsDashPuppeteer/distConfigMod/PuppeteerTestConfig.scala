package typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod

import typings.atStorybookAddonDashStoryshotsDashPuppeteer.Anon_Filter
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.DirectNavigationOptions
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PuppeteerTestConfig extends CommonConfig {
  var testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Anon_Filter
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
    testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Anon_Filter,
    testTimeout: Double
  ): PuppeteerTestConfig = {
    val __obj = js.Dynamic.literal(chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testBody = testBody.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PuppeteerTestConfig]
  }
}

