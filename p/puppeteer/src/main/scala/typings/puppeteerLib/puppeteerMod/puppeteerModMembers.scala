package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer", JSImport.Namespace)
@js.native
object puppeteerModMembers extends js.Object {
  def connect(): stdLib.Promise[Browser] = js.native
  def connect(options: ConnectOptions): stdLib.Promise[Browser] = js.native
  def defaultArgs(): js.Array[java.lang.String] = js.native
  def defaultArgs(options: ChromeArgOptions): js.Array[java.lang.String] = js.native
  def executablePath(): java.lang.String = js.native
  def launch(): stdLib.Promise[Browser] = js.native
  def launch(options: LaunchOptions): stdLib.Promise[Browser] = js.native
}

