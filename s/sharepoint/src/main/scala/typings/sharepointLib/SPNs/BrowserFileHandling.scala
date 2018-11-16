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
  
  val permissive: permissive with java.lang.String = js.native
  val strict: strict with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.BrowserFileHandling with java.lang.String] = js.native
}

