package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenWebOptions extends js.Object

@JSGlobal("SP.OpenWebOptions")
@js.native
object OpenWebOptions extends js.Object {
  @js.native
  sealed trait initNavigationCache
    extends sharepointLib.SPNs.OpenWebOptions
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.OpenWebOptions
  
  /* 1 */ val initNavigationCache: initNavigationCache with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.OpenWebOptions with scala.Double] = js.native
}

