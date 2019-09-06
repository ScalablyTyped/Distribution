package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrderEnum extends js.Object

@JSImport("square-connect", "SortOrderEnum")
@js.native
object SortOrderEnum extends js.Object {
  @js.native
  sealed trait ASC extends SortOrderEnum
  
  @js.native
  sealed trait DESC extends SortOrderEnum
  
  /* "ASC" */ val ASC: typings.squareDashConnect.squareDashConnectMod.SortOrderEnum.ASC with String = js.native
  /* "DESC" */ val DESC: typings.squareDashConnect.squareDashConnectMod.SortOrderEnum.DESC with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOrderEnum with String] = js.native
}

