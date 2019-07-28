package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BrowserFileHandling extends js.Object

@JSGlobal("SP.BrowserFileHandling")
@js.native
object BrowserFileHandling extends js.Object {
  @js.native
  sealed trait permissive extends BrowserFileHandling
  
  @js.native
  sealed trait strict extends BrowserFileHandling
  
  /* 0 */ val permissive: typings.sharepoint.SPNs.BrowserFileHandling.permissive with Double = js.native
  /* 1 */ val strict: typings.sharepoint.SPNs.BrowserFileHandling.strict with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BrowserFileHandling with Double] = js.native
}

