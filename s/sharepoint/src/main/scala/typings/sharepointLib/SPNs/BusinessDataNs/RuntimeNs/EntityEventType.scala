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
  
  val itemAdded: itemAdded with java.lang.String = js.native
  val itemDeleted: itemDeleted with java.lang.String = js.native
  val itemUpdated: itemUpdated with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.BusinessDataNs.RuntimeNs.EntityEventType with java.lang.String
  ] = js.native
}

