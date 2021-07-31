package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrincipalSource extends StObject
@JSGlobal("SP.Utilities.PrincipalSource")
@js.native
object PrincipalSource extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with PrincipalSource
  
  @js.native
  sealed trait membershipProvider
    extends StObject
       with PrincipalSource
  
  @js.native
  sealed trait none
    extends StObject
       with PrincipalSource
  
  @js.native
  sealed trait roleProvider
    extends StObject
       with PrincipalSource
  
  @js.native
  sealed trait userInfoList
    extends StObject
       with PrincipalSource
  
  @js.native
  sealed trait windows
    extends StObject
       with PrincipalSource
}
