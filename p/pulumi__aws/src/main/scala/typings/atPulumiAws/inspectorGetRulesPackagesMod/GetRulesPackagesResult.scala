package typings.atPulumiAws.inspectorGetRulesPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRulesPackagesResult extends js.Object {
  /**
    * A list of the AWS Inspector Rules Packages arns available in the AWS region.
    */
  val arns: js.Array[String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
}

object GetRulesPackagesResult {
  @scala.inline
  def apply(arns: js.Array[String], id: String): GetRulesPackagesResult = {
    val __obj = js.Dynamic.literal(arns = arns, id = id)
  
    __obj.asInstanceOf[GetRulesPackagesResult]
  }
}

