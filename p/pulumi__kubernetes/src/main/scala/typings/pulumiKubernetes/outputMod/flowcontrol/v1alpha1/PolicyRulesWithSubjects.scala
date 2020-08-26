package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
  */
@js.native
trait PolicyRulesWithSubjects extends js.Object {
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.Array[NonResourcePolicyRule] = js.native
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.Array[ResourcePolicyRule] = js.native
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: js.Array[Subject] = js.native
}

object PolicyRulesWithSubjects {
  @scala.inline
  def apply(
    nonResourceRules: js.Array[NonResourcePolicyRule],
    resourceRules: js.Array[ResourcePolicyRule],
    subjects: js.Array[Subject]
  ): PolicyRulesWithSubjects = {
    val __obj = js.Dynamic.literal(nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRulesWithSubjects]
  }
  @scala.inline
  implicit class PolicyRulesWithSubjectsOps[Self <: PolicyRulesWithSubjects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNonResourceRulesVarargs(value: NonResourcePolicyRule*): Self = this.set("nonResourceRules", js.Array(value :_*))
    @scala.inline
    def setNonResourceRules(value: js.Array[NonResourcePolicyRule]): Self = this.set("nonResourceRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRulesVarargs(value: ResourcePolicyRule*): Self = this.set("resourceRules", js.Array(value :_*))
    @scala.inline
    def setResourceRules(value: js.Array[ResourcePolicyRule]): Self = this.set("resourceRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectsVarargs(value: Subject*): Self = this.set("subjects", js.Array(value :_*))
    @scala.inline
    def setSubjects(value: js.Array[Subject]): Self = this.set("subjects", value.asInstanceOf[js.Any])
  }
  
}

