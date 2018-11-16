package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accessibility extends js.Object {
  def snapshot(): stdLib.Promise[AXNode] = js.native
  def snapshot(options: SnapshopOptions): stdLib.Promise[AXNode] = js.native
}

