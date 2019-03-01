package typings
package atPulumiAwsLib.inspectorGetRulesPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRulesPackagesResult extends js.Object {
  /**
    * A list of the AWS Inspector Rules Packages arns available in the AWS region.
    */
  val arns: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetRulesPackagesResult {
  @scala.inline
  def apply(arns: js.Array[java.lang.String], id: java.lang.String): GetRulesPackagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arns")(arns)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetRulesPackagesResult]
  }
}

