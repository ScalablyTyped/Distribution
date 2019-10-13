package typings.puppeteerDashCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.puppeteer.deviceDescriptorsMod.Device
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.BrowserFetcher
import typings.puppeteer.puppeteerMod.ChromeArgOptions
import typings.puppeteer.puppeteerMod.ConnectOptions
import typings.puppeteer.puppeteerMod.FetcherOptions
import typings.puppeteer.puppeteerMod.LaunchOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object puppeteerDashCoreMod extends js.Object {
  def connect(): js.Promise[Browser] = js.native
  def connect(options: ConnectOptions): js.Promise[Browser] = js.native
  def createBrowserFetcher(): BrowserFetcher = js.native
  def createBrowserFetcher(options: FetcherOptions): BrowserFetcher = js.native
  def defaultArgs(): js.Array[String] = js.native
  def defaultArgs(options: ChromeArgOptions): js.Array[String] = js.native
  def executablePath(): String = js.native
  def launch(): js.Promise[Browser] = js.native
  def launch(options: LaunchOptions): js.Promise[Browser] = js.native
  @js.native
  object devices
    extends TopLevel[js.Array[Device] with StringDictionary[Device]]
  
  @js.native
  object errors extends js.Object {
    @js.native
    class TimeoutError () extends Error {
      /* CompleteClass */
      override var message: String = js.native
      /* CompleteClass */
      override var name: String = js.native
    }
    
  }
  
}

