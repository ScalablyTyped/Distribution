package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
  */
trait NonResourcePolicyRule extends StObject {
  
  /**
    * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
    *   - "/healthz" is legal
    *   - "/hea*" is illegal
    *   - "/hea" is legal but matches nothing
    *   - "/hea/ *" also matches nothing
    *   - "/healthz/ *" matches all per-component health checks.
    * "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
    */
  var nonResourceURLs: Input[js.Array[Input[String]]]
  
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
    */
  var verbs: Input[js.Array[Input[String]]]
}
object NonResourcePolicyRule {
  
  inline def apply(nonResourceURLs: Input[js.Array[Input[String]]], verbs: Input[js.Array[Input[String]]]): NonResourcePolicyRule = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourcePolicyRule]
  }
  
  extension [Self <: NonResourcePolicyRule](x: Self) {
    
    inline def setNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
    
    inline def setNonResourceURLsVarargs(value: Input[String]*): Self = StObject.set(x, "nonResourceURLs", js.Array(value :_*))
    
    inline def setVerbs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
    
    inline def setVerbsVarargs(value: Input[String]*): Self = StObject.set(x, "verbs", js.Array(value :_*))
  }
}
