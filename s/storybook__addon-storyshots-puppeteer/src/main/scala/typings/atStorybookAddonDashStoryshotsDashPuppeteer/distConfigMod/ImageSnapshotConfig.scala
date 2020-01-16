package typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod

import typings.atStorybookAddonDashStoryshotsDashPuppeteer.Anon_Context
import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotMod.MatchImageSnapshotOptions
import typings.puppeteer.puppeteerMod.Base64ScreenShotOptions
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.DirectNavigationOptions
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSnapshotConfig extends CommonConfig {
  def afterScreenshot(options: Anon_Context): Unit
  def beforeScreenshot(page: Page, options: Options): Unit
  def getMatchOptions(options: Options): MatchImageSnapshotOptions
  def getScreenshotOptions(options: Options): Base64ScreenShotOptions
}

object ImageSnapshotConfig {
  @scala.inline
  def apply(
    afterScreenshot: Anon_Context => Unit,
    beforeScreenshot: (Page, Options) => Unit,
    chromeExecutablePath: String,
    customizePage: Page => js.Promise[Unit],
    getCustomBrowser: () => js.Promise[Browser],
    getGotoOptions: Options => DirectNavigationOptions,
    getMatchOptions: Options => MatchImageSnapshotOptions,
    getScreenshotOptions: Options => Base64ScreenShotOptions,
    setupTimeout: Double,
    storybookUrl: String,
    testTimeout: Double
  ): ImageSnapshotConfig = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction2(beforeScreenshot), chromeExecutablePath = chromeExecutablePath.asInstanceOf[js.Any], customizePage = js.Any.fromFunction1(customizePage), getCustomBrowser = js.Any.fromFunction0(getCustomBrowser), getGotoOptions = js.Any.fromFunction1(getGotoOptions), getMatchOptions = js.Any.fromFunction1(getMatchOptions), getScreenshotOptions = js.Any.fromFunction1(getScreenshotOptions), setupTimeout = setupTimeout.asInstanceOf[js.Any], storybookUrl = storybookUrl.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageSnapshotConfig]
  }
}

