package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.puppeteer.deviceDescriptorsMod.Device
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.BrowserFetcher
import typings.puppeteer.mod.ChromeArgOptions
import typings.puppeteer.mod.ConnectOptions
import typings.puppeteer.mod.FetcherOptions
import typings.puppeteer.mod.LaunchOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  object devices extends TopLevel[/* name */ StringDictionary[Device]]
  
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

