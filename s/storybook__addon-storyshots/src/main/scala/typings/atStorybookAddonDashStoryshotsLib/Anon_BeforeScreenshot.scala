package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforeScreenshot extends js.Object {
  var beforeScreenshot: js.UndefOr[
    js.Function2[
      /* page */ puppeteerLib.puppeteerMod.Page, 
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var chromeExecutablePath: js.UndefOr[java.lang.String] = js.undefined
  var getGotoOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      puppeteerLib.puppeteerMod.NavigationOptions
    ]
  ] = js.undefined
  var getMatchOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      Anon_FailureThreshold
    ]
  ] = js.undefined
  var getScreenshotOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      puppeteerLib.puppeteerMod.ScreenshotOptions
    ]
  ] = js.undefined
  var storybookUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BeforeScreenshot {
  @scala.inline
  def apply(
    beforeScreenshot: (/* page */ puppeteerLib.puppeteerMod.Page, /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions) => js.Promise[scala.Unit] = null,
    chromeExecutablePath: java.lang.String = null,
    getGotoOptions: /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions => puppeteerLib.puppeteerMod.NavigationOptions = null,
    getMatchOptions: /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions => Anon_FailureThreshold = null,
    getScreenshotOptions: /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions => puppeteerLib.puppeteerMod.ScreenshotOptions = null,
    storybookUrl: java.lang.String = null
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

