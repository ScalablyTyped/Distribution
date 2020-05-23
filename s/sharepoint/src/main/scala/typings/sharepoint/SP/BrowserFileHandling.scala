package typings.sharepoint.SP

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
  
}

