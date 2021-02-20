package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
  */
@js.native
trait PolicyRulesWithSubjects extends StObject {
  
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.UndefOr[Input[js.Array[Input[NonResourcePolicyRule]]]] = js.native
  
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.UndefOr[Input[js.Array[Input[ResourcePolicyRule]]]] = js.native
  
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: Input[js.Array[Input[Subject]]] = js.native
}
object PolicyRulesWithSubjects {
  
  @scala.inline
  def apply(subjects: Input[js.Array[Input[Subject]]]): PolicyRulesWithSubjects = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRulesWithSubjects]
  }
  
  @scala.inline
  implicit class PolicyRulesWithSubjectsMutableBuilder[Self <: PolicyRulesWithSubjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonResourceRules(value: Input[js.Array[Input[NonResourcePolicyRule]]]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonResourceRulesUndefined: Self = StObject.set(x, "nonResourceRules", js.undefined)
    
    @scala.inline
    def setNonResourceRulesVarargs(value: Input[NonResourcePolicyRule]*): Self = StObject.set(x, "nonResourceRules", js.Array(value :_*))
    
    @scala.inline
    def setResourceRules(value: Input[js.Array[Input[ResourcePolicyRule]]]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRulesUndefined: Self = StObject.set(x, "resourceRules", js.undefined)
    
    @scala.inline
    def setResourceRulesVarargs(value: Input[ResourcePolicyRule]*): Self = StObject.set(x, "resourceRules", js.Array(value :_*))
    
    @scala.inline
    def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectsVarargs(value: Input[Subject]*): Self = StObject.set(x, "subjects", js.Array(value :_*))
  }
}
