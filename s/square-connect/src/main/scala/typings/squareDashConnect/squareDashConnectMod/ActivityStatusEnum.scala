package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivityStatusEnum extends js.Object

@JSImport("square-connect", "ActivityStatusEnum")
@js.native
object ActivityStatusEnum extends js.Object {
  @js.native
  sealed trait ACTIVE extends ActivityStatusEnum
  
  @js.native
  sealed trait INACTIVE extends ActivityStatusEnum
  
  /* "ACTIVE" */ val ACTIVE: typings.squareDashConnect.squareDashConnectMod.ActivityStatusEnum.ACTIVE with String = js.native
  /* "INACTIVE" */ val INACTIVE: typings.squareDashConnect.squareDashConnectMod.ActivityStatusEnum.INACTIVE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActivityStatusEnum with String] = js.native
}

