package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftVisibilityType extends js.Object

@JSGlobal("SP.DraftVisibilityType")
@js.native
object DraftVisibilityType extends js.Object {
  @js.native
  sealed trait approver
    extends sharepointLib.SPNs.DraftVisibilityType
  
  @js.native
  sealed trait author
    extends sharepointLib.SPNs.DraftVisibilityType
  
  @js.native
  sealed trait reader
    extends sharepointLib.SPNs.DraftVisibilityType
  
  val approver: approver with java.lang.String = js.native
  val author: author with java.lang.String = js.native
  val reader: reader with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.DraftVisibilityType with java.lang.String] = js.native
}

