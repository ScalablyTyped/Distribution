package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalType extends js.Object

@JSGlobal("SP.Utilities.PrincipalType")
@js.native
object PrincipalType extends js.Object {
  @js.native
  sealed trait all extends PrincipalType
  
  @js.native
  sealed trait distributionList extends PrincipalType
  
  @js.native
  sealed trait none extends PrincipalType
  
  @js.native
  sealed trait securityGroup extends PrincipalType
  
  @js.native
  sealed trait sharePointGroup extends PrincipalType
  
  @js.native
  sealed trait user extends PrincipalType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrincipalType with Double] = js.native
  /* 5 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object distributionList extends TopLevel[distributionList with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object securityGroup extends TopLevel[securityGroup with Double]
  
  /* 4 */ @js.native
  object sharePointGroup extends TopLevel[sharePointGroup with Double]
  
  /* 1 */ @js.native
  object user extends TopLevel[user with Double]
  
}

