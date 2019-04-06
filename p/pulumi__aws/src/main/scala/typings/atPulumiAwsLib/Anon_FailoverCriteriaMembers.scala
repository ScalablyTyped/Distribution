package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailoverCriteriaMembers extends js.Object {
  var failoverCriteria: atPulumiPulumiLib.outputMod.Input[Anon_StatusCodesArray]
  var members: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_OriginIdInput]]]
  var originId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FailoverCriteriaMembers {
  @scala.inline
  def apply(
    failoverCriteria: atPulumiPulumiLib.outputMod.Input[Anon_StatusCodesArray],
    members: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_OriginIdInput]]],
    originId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_FailoverCriteriaMembers = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FailoverCriteriaMembers]
  }
}

