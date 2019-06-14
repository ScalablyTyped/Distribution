package typings
package sharepointLib.SPNs.CompliancePolicyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SPContainerType extends js.Object

@JSGlobal("SP.CompliancePolicy.SPContainerType")
@js.native
object SPContainerType extends js.Object {
  @js.native
  sealed trait list
    extends sharepointLib.SPNs.CompliancePolicyNs.SPContainerType
  
   // : 0,
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.CompliancePolicyNs.SPContainerType
  
   // : 1,
  @js.native
  sealed trait web
    extends sharepointLib.SPNs.CompliancePolicyNs.SPContainerType
  
  /* 2 */ val list: list with scala.Double = js.native
  /* 0 */ val site: site with scala.Double = js.native
  /* 1 */ val web: web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.CompliancePolicyNs.SPContainerType with scala.Double] = js.native
}

