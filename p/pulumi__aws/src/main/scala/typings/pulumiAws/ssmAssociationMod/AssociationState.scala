package typings.pulumiAws.ssmAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ssm.AssociationOutputLocation
import typings.pulumiAws.inputMod.ssm.AssociationTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationState extends js.Object {
  /**
    * The ID of the SSM association.
    */
  val associationId: js.UndefOr[Input[String]] = js.native
  /**
    * The descriptive name for the association.
    */
  val associationName: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls.
    */
  val automationTargetParameterName: js.UndefOr[Input[String]] = js.native
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: js.UndefOr[Input[String]] = js.native
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the SSM document to apply.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: js.UndefOr[Input[AssociationOutputLocation]] = js.native
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: js.UndefOr[Input[String]] = js.native
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: js.UndefOr[Input[js.Array[Input[AssociationTarget]]]] = js.native
}

object AssociationState {
  @scala.inline
  def apply(): AssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationState]
  }
  @scala.inline
  implicit class AssociationStateOps[Self <: AssociationState] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: Input[String]): Self = this.set("associationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("associationId", js.undefined)
    @scala.inline
    def setAssociationName(value: Input[String]): Self = this.set("associationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationName: Self = this.set("associationName", js.undefined)
    @scala.inline
    def setAutomationTargetParameterName(value: Input[String]): Self = this.set("automationTargetParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationTargetParameterName: Self = this.set("automationTargetParameterName", js.undefined)
    @scala.inline
    def setComplianceSeverity(value: Input[String]): Self = this.set("complianceSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceSeverity: Self = this.set("complianceSeverity", js.undefined)
    @scala.inline
    def setDocumentVersion(value: Input[String]): Self = this.set("documentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentVersion: Self = this.set("documentVersion", js.undefined)
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: Input[String]): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: Input[String]): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("maxErrors", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutputLocation(value: Input[AssociationOutputLocation]): Self = this.set("outputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("outputLocation", js.undefined)
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setScheduleExpression(value: Input[String]): Self = this.set("scheduleExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleExpression: Self = this.set("scheduleExpression", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Input[AssociationTarget]*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Input[js.Array[Input[AssociationTarget]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

