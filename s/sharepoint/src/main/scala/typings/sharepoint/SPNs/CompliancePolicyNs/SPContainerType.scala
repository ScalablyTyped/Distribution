package typings.sharepoint.SPNs.CompliancePolicyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SPContainerType extends js.Object

@JSGlobal("SP.CompliancePolicy.SPContainerType")
@js.native
object SPContainerType extends js.Object {
  @js.native
  sealed trait list extends SPContainerType
  
   // : 0,
  @js.native
  sealed trait site extends SPContainerType
  
   // : 1,
  @js.native
  sealed trait web extends SPContainerType
  
  /* 2 */ val list: typings.sharepoint.SPNs.CompliancePolicyNs.SPContainerType.list with Double = js.native
  /* 0 */ val site: typings.sharepoint.SPNs.CompliancePolicyNs.SPContainerType.site with Double = js.native
  /* 1 */ val web: typings.sharepoint.SPNs.CompliancePolicyNs.SPContainerType.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SPContainerType with Double] = js.native
}

