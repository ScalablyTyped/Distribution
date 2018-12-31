package typings
package atPulumiAwsLib.inspectorAssessmentTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTargetArgs extends js.Object {
  /**
    * The name of the assessment target.
    * * `resource_group_arn` (Required )- The resource group ARN stating tags for instance matching.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val resourceGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

