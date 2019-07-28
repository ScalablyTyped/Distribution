package typings.sharepoint.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonalizationScope extends js.Object

@JSGlobal("SP.WebParts.PersonalizationScope")
@js.native
object PersonalizationScope extends js.Object {
  @js.native
  sealed trait shared extends PersonalizationScope
  
  @js.native
  sealed trait user extends PersonalizationScope
  
  /* 1 */ val shared: typings.sharepoint.SPNs.WebPartsNs.PersonalizationScope.shared with Double = js.native
  /* 0 */ val user: typings.sharepoint.SPNs.WebPartsNs.PersonalizationScope.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalizationScope with Double] = js.native
}

