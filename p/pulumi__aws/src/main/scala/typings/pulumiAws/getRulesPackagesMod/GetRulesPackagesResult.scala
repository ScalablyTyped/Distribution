package typings.pulumiAws.getRulesPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRulesPackagesResult extends js.Object {
  /**
    * A list of the AWS Inspector Rules Packages arns available in the AWS region.
    */
  val arns: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetRulesPackagesResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String): GetRulesPackagesResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRulesPackagesResult]
  }
}

