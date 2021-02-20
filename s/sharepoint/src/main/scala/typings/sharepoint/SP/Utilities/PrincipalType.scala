package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrincipalType extends StObject
@JSGlobal("SP.Utilities.PrincipalType")
@js.native
object PrincipalType extends StObject {
  
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
}
