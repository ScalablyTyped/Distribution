package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrincipalSource with Double] = js.native
  /* 5 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 3 */ @js.native
  object membershipProvider extends TopLevel[membershipProvider with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object roleProvider extends TopLevel[roleProvider with Double]
  
  /* 1 */ @js.native
  object userInfoList extends TopLevel[userInfoList with Double]
  
  /* 2 */ @js.native
  object windows extends TopLevel[windows with Double]
  
}

