package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BrowserFileHandling extends js.Object

@JSGlobal("SP.BrowserFileHandling")
@js.native
object BrowserFileHandling extends js.Object {
  @js.native
  sealed trait permissive
    extends sharepointLib.SPNs.BrowserFileHandling
  
  @js.native
  sealed trait strict
    extends sharepointLib.SPNs.BrowserFileHandling
  
  /* 0 */ val permissive: permissive with scala.Double = js.native
  /* 1 */ val strict: strict with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.BrowserFileHandling with scala.Double] = js.native
}

