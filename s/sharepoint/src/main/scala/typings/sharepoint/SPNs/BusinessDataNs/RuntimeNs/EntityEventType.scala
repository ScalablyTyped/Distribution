package typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityEventType extends js.Object

@JSGlobal("SP.BusinessData.Runtime.EntityEventType")
@js.native
object EntityEventType extends js.Object {
  @js.native
  sealed trait itemAdded extends EntityEventType
  
  @js.native
  sealed trait itemDeleted extends EntityEventType
  
  @js.native
  sealed trait itemUpdated extends EntityEventType
  
  @js.native
  sealed trait none extends EntityEventType
  
  /* 1 */ val itemAdded: typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs.EntityEventType.itemAdded with Double = js.native
  /* 3 */ val itemDeleted: typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs.EntityEventType.itemDeleted with Double = js.native
  /* 2 */ val itemUpdated: typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs.EntityEventType.itemUpdated with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.BusinessDataNs.RuntimeNs.EntityEventType.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EntityEventType with Double] = js.native
}

