package typings.storybookAddonStoryshotsPuppeteer.anon

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import typings.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.PuppeteerTestConfig> */
trait PartialPuppeteerTestConfi extends js.Object {
  var chromeExecutablePath: js.UndefOr[String] = js.undefined
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.undefined
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.undefined
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.undefined
  var setupTimeout: js.UndefOr[Double] = js.undefined
  var storybookUrl: js.UndefOr[String] = js.undefined
  var testBody: js.UndefOr[
    (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter
  ] = js.undefined
  var testTimeout: js.UndefOr[Double] = js.undefined
}

object PartialPuppeteerTestConfi {
  @scala.inline
  def apply(
    chromeExecutablePath: String = null,
    customizePage: /* page */ Page => js.Promise[Unit] = null,
    getCustomBrowser: () => js.Promise[Browser] = null,
    getGotoOptions: /* options */ Options => DirectNavigationOptions = null,
    setupTimeout: js.UndefOr[Double] = js.undefined,
    storybookUrl: String = null,
    testBody: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter = null,
    testTimeout: js.UndefOr[Double] = js.undefined
  ): PartialPuppeteerTestConfi = {
    val __obj = js.Dynamic.literal()
    if (chromeExecutablePath != null) __obj.updateDynamic("chromeExecutablePath")(chromeExecutablePath.asInstanceOf[js.Any])
    if (customizePage != null) __obj.updateDynamic("customizePage")(js.Any.fromFunction1(customizePage))
    if (getCustomBrowser != null) __obj.updateDynamic("getCustomBrowser")(js.Any.fromFunction0(getCustomBrowser))
    if (getGotoOptions != null) __obj.updateDynamic("getGotoOptions")(js.Any.fromFunction1(getGotoOptions))
    if (!js.isUndefined(setupTimeout)) __obj.updateDynamic("setupTimeout")(setupTimeout.get.asInstanceOf[js.Any])
    if (storybookUrl != null) __obj.updateDynamic("storybookUrl")(storybookUrl.asInstanceOf[js.Any])
    if (testBody != null) __obj.updateDynamic("testBody")(testBody.asInstanceOf[js.Any])
    if (!js.isUndefined(testTimeout)) __obj.updateDynamic("testTimeout")(testTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPuppeteerTestConfi]
  }
}

