package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrincipalSource extends StObject
@JSGlobal("SP.Utilities.PrincipalSource")
@js.native
object PrincipalSource extends StObject {
  
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
