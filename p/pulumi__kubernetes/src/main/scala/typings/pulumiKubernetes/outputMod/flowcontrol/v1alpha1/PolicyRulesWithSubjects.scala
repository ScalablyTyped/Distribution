package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
  */
trait PolicyRulesWithSubjects extends StObject {
  
  /**
    * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
    */
  var nonResourceRules: js.Array[NonResourcePolicyRule]
  
  /**
    * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
    */
  var resourceRules: js.Array[ResourcePolicyRule]
  
  /**
    * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
    */
  var subjects: js.Array[Subject]
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
  implicit class PolicyRulesWithSubjectsMutableBuilder[Self <: PolicyRulesWithSubjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonResourceRules(value: js.Array[NonResourcePolicyRule]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonResourceRulesVarargs(value: NonResourcePolicyRule*): Self = StObject.set(x, "nonResourceRules", js.Array(value :_*))
    
    @scala.inline
    def setResourceRules(value: js.Array[ResourcePolicyRule]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRulesVarargs(value: ResourcePolicyRule*): Self = StObject.set(x, "resourceRules", js.Array(value :_*))
    
    @scala.inline
    def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value :_*))
  }
}
