package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
