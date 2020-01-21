package typings.storybookAddonStoryshotsPuppeteer.configMod

import typings.jestImageSnapshot.mod.MatchImageSnapshotOptions
import typings.puppeteer.mod.Base64ScreenShotOptions
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import typings.storybookAddonStoryshotsPuppeteer.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSnapshotConfig extends CommonConfig {
  def afterScreenshot(options: AnonContext): Unit
  def beforeScreenshot(page: Page, options: Options): Unit
  def getMatchOptions(options: Options): MatchImageSnapshotOptions
  def getScreenshotOptions(options: Options): Base64ScreenShotOptions
}

object ImageSnapshotConfig {
  @scala.inline
  def apply(
    afterScreenshot: AnonContext => Unit,
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

