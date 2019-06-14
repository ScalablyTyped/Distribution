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
  
  /* 2 */ val approver: approver with scala.Double = js.native
  /* 1 */ val author: author with scala.Double = js.native
  /* 0 */ val reader: reader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.DraftVisibilityType with scala.Double] = js.native
}

