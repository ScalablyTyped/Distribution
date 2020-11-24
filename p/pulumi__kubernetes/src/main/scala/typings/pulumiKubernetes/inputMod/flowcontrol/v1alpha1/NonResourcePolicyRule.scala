package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
  */
@js.native
trait NonResourcePolicyRule extends js.Object {
  
  /**
    * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
    *   - "/healthz" is legal
    *   - "/hea*" is illegal
    *   - "/hea" is legal but matches nothing
    *   - "/hea/ *" also matches nothing
    *   - "/healthz/ *" matches all per-component health checks.
    * "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
    */
  var nonResourceURLs: Input[js.Array[Input[String]]] = js.native
  
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
    */
  var verbs: Input[js.Array[Input[String]]] = js.native
}
object NonResourcePolicyRule {
  
  @scala.inline
  def apply(nonResourceURLs: Input[js.Array[Input[String]]], verbs: Input[js.Array[Input[String]]]): NonResourcePolicyRule = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourcePolicyRule]
  }
  
  @scala.inline
  implicit class NonResourcePolicyRuleOps[Self <: NonResourcePolicyRule] (val x: Self) extends AnyVal {
    
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
    def setNonResourceURLsVarargs(value: Input[String]*): Self = this.set("nonResourceURLs", js.Array(value :_*))
    
    @scala.inline
    def setNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = this.set("nonResourceURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbsVarargs(value: Input[String]*): Self = this.set("verbs", js.Array(value :_*))
    
    @scala.inline
    def setVerbs(value: Input[js.Array[Input[String]]]): Self = this.set("verbs", value.asInstanceOf[js.Any])
  }
}
