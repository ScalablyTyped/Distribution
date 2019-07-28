package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions
import typings.puppeteer.puppeteerMod.NavigationOptions
import typings.puppeteer.puppeteerMod.Page
import typings.puppeteer.puppeteerMod.ScreenshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforeScreenshot extends js.Object {
  var beforeScreenshot: js.UndefOr[
    js.Function2[/* page */ Page, /* options */ ImageSnapshotOptions, js.Promise[Unit]]
  ] = js.undefined
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ ImageSnapshotOptions, NavigationOptions]] = js.undefined
  var getMatchOptions: js.UndefOr[js.Function1[/* options */ ImageSnapshotOptions, Anon_FailureThreshold]] = js.undefined
  var getScreenshotOptions: js.UndefOr[js.Function1[/* options */ ImageSnapshotOptions, ScreenshotOptions]] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
}

object Anon_BeforeScreenshot {
  @scala.inline
  def apply(
    beforeScreenshot: (/* page */ Page, /* options */ ImageSnapshotOptions) => js.Promise[Unit] = null,
    chromeExecutablePath: String = null,
    getGotoOptions: /* options */ ImageSnapshotOptions => NavigationOptions = null,
    getMatchOptions: /* options */ ImageSnapshotOptions => Anon_FailureThreshold = null,
    getScreenshotOptions: /* options */ ImageSnapshotOptions => ScreenshotOptions = null,
    storybookUrl: String = null
  ): Anon_BeforeScreenshot = {
    val __obj = js.Dynamic.literal()
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction2(beforeScreenshot))
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath)
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1(getGotoOptions))
    if (getMatchOptions != null) __obj.updateDynamic("getMatchOptions")(js.Any.fromFunction1(getMatchOptions))
    if (getScreenshotOptions != null) __obj.updateDynamic("getScreenshotOptions")(js.Any.fromFunction1(getScreenshotOptions))
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl)
    __obj.asInstanceOf[Anon_BeforeScreenshot]
  }
}

