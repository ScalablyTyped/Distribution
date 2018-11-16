package typings
package puppeteerDashCoreLib.puppeteerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object puppeteerDashCoreModMembers extends js.Object {
  def connect(): stdLib.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def connect(options: puppeteerLib.puppeteerMod.ConnectOptions): stdLib.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def defaultArgs(): js.Array[java.lang.String] = js.native
  def defaultArgs(options: puppeteerLib.puppeteerMod.DefaultArgsOptions): js.Array[java.lang.String] = js.native
  def executablePath(): java.lang.String = js.native
  def launch(): stdLib.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
  def launch(options: puppeteerLib.puppeteerMod.LaunchOptions): stdLib.Promise[puppeteerLib.puppeteerMod.Browser] = js.native
}

