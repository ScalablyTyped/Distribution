package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
  */
trait FlowSchemaSpec extends js.Object {
  /**
    * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match
    * this schema. `nil` specifies that the distinguisher is disabled and thus will always be the
    * empty string.
    */
  val distinguisherMethod: FlowDistinguisherMethod
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
    * The chosen FlowSchema is among those with the numerically lowest (which we take to be
    * logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative.
    * Note that if the precedence is not specified or zero, it will be set to 1000 as default.
    */
  val matchingPrecedence: Double
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
    * If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid
    * in its status. Required.
    */
  val priorityLevelConfiguration: PriorityLevelConfigurationReference
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a
    * request if and only if at least one member of rules matches the request. if it is an empty
    * slice, there will be no requests matching the FlowSchema.
    */
  val rules: js.Array[PolicyRulesWithSubjects]
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
}

