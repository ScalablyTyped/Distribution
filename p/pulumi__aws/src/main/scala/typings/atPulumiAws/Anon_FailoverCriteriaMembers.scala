package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailoverCriteriaMembers extends js.Object {
  var failoverCriteria: Input[Anon_StatusCodesArray]
  var members: Input[js.Array[Input[Anon_OriginIdInput]]]
  var originId: Input[String]
}

object Anon_FailoverCriteriaMembers {
  @scala.inline
  def apply(
    failoverCriteria: Input[Anon_StatusCodesArray],
    members: Input[js.Array[Input[Anon_OriginIdInput]]],
    originId: Input[String]
  ): Anon_FailoverCriteriaMembers = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FailoverCriteriaMembers]
  }
}

