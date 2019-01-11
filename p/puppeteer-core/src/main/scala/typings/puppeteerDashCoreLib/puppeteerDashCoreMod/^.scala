package typings
package puppeteerDashCoreLib.puppeteerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(): js.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def connect(options: puppeteerLib.puppeteerMod.ConnectOptions): js.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def defaultArgs(): js.Array[java.lang.String] = js.native
  def defaultArgs(options: puppeteerLib.puppeteerMod.ChromeArgOptions): js.Array[java.lang.String] = js.native
  def executablePath(): java.lang.String = js.native
  def launch(): js.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def launch(options: puppeteerLib.puppeteerMod.LaunchOptions): js.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
}

