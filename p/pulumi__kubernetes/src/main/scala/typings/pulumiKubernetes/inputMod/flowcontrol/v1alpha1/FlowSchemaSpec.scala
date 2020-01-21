package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
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
  var distinguisherMethod: js.UndefOr[Input[FlowDistinguisherMethod]] = js.undefined
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
    * The chosen FlowSchema is among those with the numerically lowest (which we take to be
    * logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative.
    * Note that if the precedence is not specified or zero, it will be set to 1000 as default.
    */
  var matchingPrecedence: js.UndefOr[Input[Double]] = js.undefined
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
    * If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid
    * in its status. Required.
    */
  var priorityLevelConfiguration: Input[PriorityLevelConfigurationReference]
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a
    * request if and only if at least one member of rules matches the request. if it is an empty
    * slice, there will be no requests matching the FlowSchema.
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRulesWithSubjects]]]] = js.undefined
}

object FlowSchemaSpec {
  @scala.inline
  def apply(
    priorityLevelConfiguration: Input[PriorityLevelConfigurationReference],
    distinguisherMethod: Input[FlowDistinguisherMethod] = null,
    matchingPrecedence: Input[Double] = null,
    rules: Input[js.Array[Input[PolicyRulesWithSubjects]]] = null
  ): FlowSchemaSpec = {
    val __obj = js.Dynamic.literal(priorityLevelConfiguration = priorityLevelConfiguration.asInstanceOf[js.Any])
    if (distinguisherMethod != null) __obj.updateDynamic("distinguisherMethod")(distinguisherMethod.asInstanceOf[js.Any])
    if (matchingPrecedence != null) __obj.updateDynamic("matchingPrecedence")(matchingPrecedence.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaSpec]
  }
}

