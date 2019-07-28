package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionScope extends js.Object

@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends js.Object {
  @js.native
  sealed trait list extends UserCustomActionScope
  
  @js.native
  sealed trait site extends UserCustomActionScope
  
  @js.native
  sealed trait unknown extends UserCustomActionScope
  
  @js.native
  sealed trait web extends UserCustomActionScope
  
  /* 3 */ val list: typings.sharepoint.SPNs.UserCustomActionScope.list with Double = js.native
  /* 1 */ val site: typings.sharepoint.SPNs.UserCustomActionScope.site with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SPNs.UserCustomActionScope.unknown with Double = js.native
  /* 2 */ val web: typings.sharepoint.SPNs.UserCustomActionScope.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserCustomActionScope with Double] = js.native
}

