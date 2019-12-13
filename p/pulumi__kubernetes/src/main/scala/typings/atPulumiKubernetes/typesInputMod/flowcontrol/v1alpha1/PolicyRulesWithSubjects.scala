package typings.atPulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test
  * considers the subject making the request, the verb being requested, and the resource to be
  * acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least
  * one member of subjects matches the request and (b) at least one member of resourceRules or
  * nonResourceRules matches the request.
  */
trait PolicyRulesWithSubjects extends js.Object {
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests
    * according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.UndefOr[Input[js.Array[Input[NonResourcePolicyRule]]]] = js.undefined
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according
    * to their verb and the target resource. At least one of `resourceRules` and
    * `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.UndefOr[Input[js.Array[Input[ResourcePolicyRule]]]] = js.undefined
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about.
    * There must be at least one member in this slice. A slice that includes both the
    * system:authenticated and system:unauthenticated user groups matches every request.
    * Required.
    */
  var subjects: Input[js.Array[Input[Subject]]]
}

object PolicyRulesWithSubjects {
  @scala.inline
  def apply(
    subjects: Input[js.Array[Input[Subject]]],
    nonResourceRules: Input[js.Array[Input[NonResourcePolicyRule]]] = null,
    resourceRules: Input[js.Array[Input[ResourcePolicyRule]]] = null
  ): PolicyRulesWithSubjects = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any])
    if (nonResourceRules != null) __obj.updateDynamic("nonResourceRules")(nonResourceRules.asInstanceOf[js.Any])
    if (resourceRules != null) __obj.updateDynamic("resourceRules")(resourceRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRulesWithSubjects]
  }
}

