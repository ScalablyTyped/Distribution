package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleType extends js.Object
@JSGlobal("SP.RoleType")
@js.native
object RoleType extends js.Object {
  
  @js.native
  sealed trait administrator extends RoleType
  
  @js.native
  sealed trait contributor extends RoleType
  
  @js.native
  sealed trait editor extends RoleType
  
  @js.native
  sealed trait guest extends RoleType
  
  @js.native
  sealed trait none extends RoleType
  
  @js.native
  sealed trait reader extends RoleType
  
  @js.native
  sealed trait webDesigner extends RoleType
}
