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
  
  val list: list with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val web: web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.CompliancePolicyNs.SPContainerType with java.lang.String] = js.native
}

