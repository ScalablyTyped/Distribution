package typings.atStorybookAddonDashStoryshotsDashPuppeteer.atStorybookAddonDashStoryshotsDashPuppeteerMod

import typings.jestDashImageDashSnapshot.jestDashImageDashSnapshotMod.MatchImageSnapshotOptions
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.DirectNavigationOptions
import typings.puppeteer.puppeteerMod.Page
import typings.puppeteer.puppeteerMod.ScreenshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomConfig extends js.Object {
  var beforeScreenshot: js.UndefOr[js.Function2[/* page */ Page, /* ctx */ Context, js.Promise[Unit]]] = js.undefined
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.undefined
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* ctx */ Context, DirectNavigationOptions]] = js.undefined
  var getMatchOptions: js.UndefOr[js.Function1[/* ctx */ Context, MatchImageSnapshotOptions]] = js.undefined
  var getScreenshotOptions: js.UndefOr[js.Function1[/* ctx */ Context, ScreenshotOptions]] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
}

object CustomConfig {
  @scala.inline
  def apply(
    beforeScreenshot: (/* page */ Page, /* ctx */ Context) => js.Promise[Unit] = null,
    chromeExecutablePath: String = null,
    customizePage: /* page */ Page => js.Promise[Unit] = null,
    getCustomBrowser: () => js.Promise[Browser] = null,
    getGotoOptions: /* ctx */ Context => DirectNavigationOptions = null,
    getMatchOptions: /* ctx */ Context => MatchImageSnapshotOptions = null,
    getScreenshotOptions: /* ctx */ Context => ScreenshotOptions = null,
    storybookUrl: String = null
  ): CustomConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction2(beforeScreenshot))
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath)
    if (customizePage != null) __obj.updateDynamic("customizePage")(js.Any.fromFunction1(customizePage))
    if (getCustomBrowser != null) __obj.updateDynamic("getCustomBrowser")(js.Any.fromFunction0(getCustomBrowser))
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1(getGotoOptions))
    if (getMatchOptions != null) __obj.updateDynamic("getMatchOptions")(js.Any.fromFunction1(getMatchOptions))
    if (getScreenshotOptions != null) __obj.updateDynamic("getScreenshotOptions")(js.Any.fromFunction1(getScreenshotOptions))
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl)
    __obj.asInstanceOf[CustomConfig]
  }
}

