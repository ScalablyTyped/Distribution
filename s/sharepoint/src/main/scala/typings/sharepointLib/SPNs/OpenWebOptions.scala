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
  
  val initNavigationCache: initNavigationCache with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.OpenWebOptions with java.lang.String] = js.native
}

