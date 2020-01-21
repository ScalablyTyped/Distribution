package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer", "launch")
@js.native
object launch extends js.Object {
  def apply(): js.Promise[Browser] = js.native
  def apply(options: LaunchOptions): js.Promise[Browser] = js.native
}

