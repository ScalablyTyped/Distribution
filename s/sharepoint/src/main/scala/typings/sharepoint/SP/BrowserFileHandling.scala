package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BrowserFileHandling with Double] = js.native
  /* 0 */ @js.native
  object permissive extends TopLevel[permissive with Double]
  
  /* 1 */ @js.native
  object strict extends TopLevel[strict with Double]
  
}

