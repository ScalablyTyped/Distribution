package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
  */
@js.native
trait FlowSchemaSpec extends js.Object {
  /**
    * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
    */
  var distinguisherMethod: js.UndefOr[Input[FlowDistinguisherMethod]] = js.native
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
    */
  var matchingPrecedence: js.UndefOr[Input[Double]] = js.native
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
    */
  var priorityLevelConfiguration: Input[PriorityLevelConfigurationReference] = js.native
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRulesWithSubjects]]]] = js.native
}

object FlowSchemaSpec {
  @scala.inline
  def apply(priorityLevelConfiguration: Input[PriorityLevelConfigurationReference]): FlowSchemaSpec = {
    val __obj = js.Dynamic.literal(priorityLevelConfiguration = priorityLevelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaSpec]
  }
  @scala.inline
  implicit class FlowSchemaSpecOps[Self <: FlowSchemaSpec] (val x: Self) extends AnyVal {
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
    def setPriorityLevelConfiguration(value: Input[PriorityLevelConfigurationReference]): Self = this.set("priorityLevelConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistinguisherMethod(value: Input[FlowDistinguisherMethod]): Self = this.set("distinguisherMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistinguisherMethod: Self = this.set("distinguisherMethod", js.undefined)
    @scala.inline
    def setMatchingPrecedence(value: Input[Double]): Self = this.set("matchingPrecedence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchingPrecedence: Self = this.set("matchingPrecedence", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Input[PolicyRulesWithSubjects]*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Input[js.Array[Input[PolicyRulesWithSubjects]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

