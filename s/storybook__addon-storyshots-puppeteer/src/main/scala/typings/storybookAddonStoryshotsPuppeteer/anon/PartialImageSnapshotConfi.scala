package typings.storybookAddonStoryshotsPuppeteer.anon

import typings.jestImageSnapshot.mod.MatchImageSnapshotOptions
import typings.puppeteer.mod.Base64ScreenShotOptions
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import typings.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.ImageSnapshotConfig> */
trait PartialImageSnapshotConfi extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* options */ Context, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function2[/* page */ Page, /* options */ Options, Unit]] = js.undefined
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.undefined
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.undefined
  var getMatchOptions: js.UndefOr[js.Function1[/* options */ Options, MatchImageSnapshotOptions]] = js.undefined
  var getScreenshotOptions: js.UndefOr[js.Function1[/* options */ Options, Base64ScreenShotOptions]] = js.undefined
  var setupTimeout: js.UndefOr[Double] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
}

object PartialImageSnapshotConfi {
  @scala.inline
  def apply(
    afterScreenshot: /* options */ Context => Unit = null,
    beforeScreenshot: (/* page */ Page, /* options */ Options) => Unit = null,
    chromeExecutablePath: String = null,
    customizePage: /* page */ Page => js.Promise[Unit] = null,
    getCustomBrowser: () => js.Promise[Browser] = null,
    getGotoOptions: /* options */ Options => DirectNavigationOptions = null,
    getMatchOptions: /* options */ Options => MatchImageSnapshotOptions = null,
    getScreenshotOptions: /* options */ Options => Base64ScreenShotOptions = null,
    setupTimeout: js.UndefOr[Double] = js.undefined,
    storybookUrl: String = null,
    testTimeout: js.UndefOr[Double] = js.undefined
  ): PartialImageSnapshotConfi = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1(afterScreenshot))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction2(beforeScreenshot))
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath.asInstanceOf[js.Any])
    if (customizePage != null) __obj.updateDynamic("customizePage")(js.Any.fromFunction1(customizePage))
    if (getCustomBrowser != null) __obj.updateDynamic("getCustomBrowser")(js.Any.fromFunction0(getCustomBrowser))
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1(getGotoOptions))
    if (getMatchOptions != null) __obj.updateDynamic("getMatchOptions")(js.Any.fromFunction1(getMatchOptions))
    if (getScreenshotOptions != null) __obj.updateDynamic("getScreenshotOptions")(js.Any.fromFunction1(getScreenshotOptions))
    if (!js.isUndefined(setupTimeout)) __obj.updateDynamic("setupTimeout")(setupTimeout.get.asInstanceOf[js.Any])
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(testTimeout)) __obj.updateDynamic("testTimeout")(testTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImageSnapshotConfi]
  }
}

