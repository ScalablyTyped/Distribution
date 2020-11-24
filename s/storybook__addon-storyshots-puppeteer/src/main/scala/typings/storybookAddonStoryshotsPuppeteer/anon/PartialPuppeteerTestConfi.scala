package typings.storybookAddonStoryshotsPuppeteer.anon

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.DirectNavigationOptions
import typings.puppeteer.mod.Page
import typings.storybookAddonStoryshotsPuppeteer.configMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-storyshots-puppeteer.@storybook/addon-storyshots-puppeteer/dist/config.PuppeteerTestConfig> */
@js.native
trait PartialPuppeteerTestConfi extends js.Object {
  
  var chromeExecutablePath: js.UndefOr[String] = js.native
  
  var customizePage: js.UndefOr[js.Function1[/* page */ Page, js.Promise[Unit]]] = js.native
  
  var getCustomBrowser: js.UndefOr[js.Function0[js.Promise[Browser]]] = js.native
  
  var getGotoOptions: js.UndefOr[js.Function1[/* options */ Options, DirectNavigationOptions]] = js.native
  
  var setupTimeout: js.UndefOr[Double] = js.native
  
  var storybookUrl: js.UndefOr[String] = js.native
  
  var testBody: js.UndefOr[
    (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter
  ] = js.native
  
  var testTimeout: js.UndefOr[Double] = js.native
}
object PartialPuppeteerTestConfi {
  
  @scala.inline
  def apply(): PartialPuppeteerTestConfi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPuppeteerTestConfi]
  }
  
  @scala.inline
  implicit class PartialPuppeteerTestConfiOps[Self <: PartialPuppeteerTestConfi] (val x: Self) extends AnyVal {
    
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
    def deleteChromeExecutablePath: Self = this.set("chromeExecutablePath", js.undefined)
    
    @scala.inline
    def setCustomizePage(value: /* page */ Page => js.Promise[Unit]): Self = this.set("customizePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizePage: Self = this.set("customizePage", js.undefined)
    
    @scala.inline
    def setGetCustomBrowser(value: () => js.Promise[Browser]): Self = this.set("getCustomBrowser", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCustomBrowser: Self = this.set("getCustomBrowser", js.undefined)
    
    @scala.inline
    def setGetGotoOptions(value: /* options */ Options => DirectNavigationOptions): Self = this.set("getGotoOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGotoOptions: Self = this.set("getGotoOptions", js.undefined)
    
    @scala.inline
    def setSetupTimeout(value: Double): Self = this.set("setupTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTimeout: Self = this.set("setupTimeout", js.undefined)
    
    @scala.inline
    def setStorybookUrl(value: String): Self = this.set("storybookUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorybookUrl: Self = this.set("storybookUrl", js.undefined)
    
    @scala.inline
    def setTestBody(value: (js.Function2[/* page */ Page, /* options */ Options, Unit | js.Promise[Unit]]) with Filter): Self = this.set("testBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestBody: Self = this.set("testBody", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: Double): Self = this.set("testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTimeout: Self = this.set("testTimeout", js.undefined)
  }
}
