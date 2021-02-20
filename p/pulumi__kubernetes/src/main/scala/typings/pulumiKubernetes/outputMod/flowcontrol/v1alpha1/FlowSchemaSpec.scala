package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
  */
@js.native
trait FlowSchemaSpec extends StObject {
  
  /**
    * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
    */
  var distinguisherMethod: FlowDistinguisherMethod = js.native
  
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
    */
  var matchingPrecedence: Double = js.native
  
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
    */
  var priorityLevelConfiguration: PriorityLevelConfigurationReference = js.native
  
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
    */
  var rules: js.Array[PolicyRulesWithSubjects] = js.native
}
object FlowSchemaSpec {
  
  @scala.inline
  def apply(
    distinguisherMethod: FlowDistinguisherMethod,
    matchingPrecedence: Double,
    priorityLevelConfiguration: PriorityLevelConfigurationReference,
    rules: js.Array[PolicyRulesWithSubjects]
  ): FlowSchemaSpec = {
    val __obj = js.Dynamic.literal(distinguisherMethod = distinguisherMethod.asInstanceOf[js.Any], matchingPrecedence = matchingPrecedence.asInstanceOf[js.Any], priorityLevelConfiguration = priorityLevelConfiguration.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaSpec]
  }
  
  @scala.inline
  implicit class FlowSchemaSpecMutableBuilder[Self <: FlowSchemaSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistinguisherMethod(value: FlowDistinguisherMethod): Self = StObject.set(x, "distinguisherMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingPrecedence(value: Double): Self = StObject.set(x, "matchingPrecedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityLevelConfiguration(value: PriorityLevelConfigurationReference): Self = StObject.set(x, "priorityLevelConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[PolicyRulesWithSubjects]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: PolicyRulesWithSubjects*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
