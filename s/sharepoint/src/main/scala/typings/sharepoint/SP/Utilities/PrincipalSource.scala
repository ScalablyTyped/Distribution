package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalSource extends js.Object

@JSGlobal("SP.Utilities.PrincipalSource")
@js.native
object PrincipalSource extends js.Object {
  @js.native
  sealed trait all extends PrincipalSource
  
  @js.native
  sealed trait membershipProvider extends PrincipalSource
  
  @js.native
  sealed trait none extends PrincipalSource
  
  @js.native
  sealed trait roleProvider extends PrincipalSource
  
  @js.native
  sealed trait userInfoList extends PrincipalSource
  
  @js.native
  sealed trait windows extends PrincipalSource
  
}

