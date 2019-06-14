package typings
package sharepointLib.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityEventType extends js.Object

@JSGlobal("SP.BusinessData.Runtime.EntityEventType")
@js.native
object EntityEventType extends js.Object {
  @js.native
  sealed trait itemAdded
    extends sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType
  
  @js.native
  sealed trait itemDeleted
    extends sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType
  
  @js.native
  sealed trait itemUpdated
    extends sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType
  
  /* 1 */ val itemAdded: itemAdded with scala.Double = js.native
  /* 3 */ val itemDeleted: itemDeleted with scala.Double = js.native
  /* 2 */ val itemUpdated: itemUpdated with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType with scala.Double] = js.native
}

