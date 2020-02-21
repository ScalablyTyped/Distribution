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
  val parameters: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
  def apply(
    associationId: Input[String] = null,
    associationName: Input[String] = null,
    automationTargetParameterName: Input[String] = null,
    complianceSeverity: Input[String] = null,
    documentVersion: Input[String] = null,
    instanceId: Input[String] = null,
    maxConcurrency: Input[String] = null,
    maxErrors: Input[String] = null,
    name: Input[String] = null,
    outputLocation: Input[AssociationOutputLocation] = null,
    parameters: Input[StringDictionary[_]] = null,
    scheduleExpression: Input[String] = null,
    targets: Input[js.Array[Input[AssociationTarget]]] = null
  ): AssociationState = {
    val __obj = js.Dynamic.literal()
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (associationName != null) __obj.updateDynamic("associationName")(associationName.asInstanceOf[js.Any])
    if (automationTargetParameterName != null) __obj.updateDynamic("automationTargetParameterName")(automationTargetParameterName.asInstanceOf[js.Any])
    if (complianceSeverity != null) __obj.updateDynamic("complianceSeverity")(complianceSeverity.asInstanceOf[js.Any])
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (scheduleExpression != null) __obj.updateDynamic("scheduleExpression")(scheduleExpression.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationState]
  }
}

