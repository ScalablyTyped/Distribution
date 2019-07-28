package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionRegistrationType extends js.Object

@JSGlobal("SP.UserCustomActionRegistrationType")
@js.native
object UserCustomActionRegistrationType extends js.Object {
  @js.native
  sealed trait contentType extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait fileType extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait list extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait none extends UserCustomActionRegistrationType
  
  @js.native
  sealed trait progId extends UserCustomActionRegistrationType
  
  /* 2 */ val contentType: typings.sharepoint.SPNs.UserCustomActionRegistrationType.contentType with Double = js.native
  /* 4 */ val fileType: typings.sharepoint.SPNs.UserCustomActionRegistrationType.fileType with Double = js.native
  /* 1 */ val list: typings.sharepoint.SPNs.UserCustomActionRegistrationType.list with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.UserCustomActionRegistrationType.none with Double = js.native
  /* 3 */ val progId: typings.sharepoint.SPNs.UserCustomActionRegistrationType.progId with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserCustomActionRegistrationType with Double] = js.native
}

