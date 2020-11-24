package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessibility extends js.Object {
  
  def snapshot(): js.Promise[AXNode] = js.native
  def snapshot(options: SnapshopOptions): js.Promise[AXNode] = js.native
}
