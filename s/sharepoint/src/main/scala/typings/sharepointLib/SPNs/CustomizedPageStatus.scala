package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomizedPageStatus extends js.Object

@JSGlobal("SP.CustomizedPageStatus")
@js.native
object CustomizedPageStatus extends js.Object {
  @js.native
  sealed trait customized
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  @js.native
  sealed trait uncustomized
    extends sharepointLib.SPNs.CustomizedPageStatus
  
  val customized: customized with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val uncustomized: uncustomized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.CustomizedPageStatus with java.lang.String] = js.native
}

