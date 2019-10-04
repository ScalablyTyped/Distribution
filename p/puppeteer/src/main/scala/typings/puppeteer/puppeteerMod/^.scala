package typings.puppeteer.puppeteerMod

import org.scalablytyped.runtime.StringDictionary
import typings.puppeteer.deviceDescriptorsMod.Device
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val devices: js.Array[Device] with StringDictionary[Device] = js.native
  def connect(): js.Promise[Browser] = js.native
  def connect(options: ConnectOptions): js.Promise[Browser] = js.native
  def createBrowserFetcher(): BrowserFetcher = js.native
  def createBrowserFetcher(options: FetcherOptions): BrowserFetcher = js.native
  def defaultArgs(): js.Array[String] = js.native
  def defaultArgs(options: ChromeArgOptions): js.Array[String] = js.native
  def executablePath(): String = js.native
  def launch(): js.Promise[Browser] = js.native
  def launch(options: LaunchOptions): js.Promise[Browser] = js.native
}

