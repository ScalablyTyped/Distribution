package typings.sharepoint.SP.Sharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Role extends js.Object
@JSGlobal("SP.Sharing.Role")
@js.native
object Role extends js.Object {
  
  @js.native
  sealed trait edit extends Role
  
  @js.native
  sealed trait none extends Role
  
  @js.native
  sealed trait owner extends Role
  
  @js.native
  sealed trait view extends Role
}
