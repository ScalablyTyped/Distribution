package typings.atPulumiAws.ssmAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ssm.AssociationOutputLocation
import typings.atPulumiAws.typesInputMod.ssm.AssociationTarget
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationArgs extends js.Object {
  /**
    * The descriptive name for the association.
    */
  val associationName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: js.UndefOr[Input[String]] = js.undefined
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the SSM document to apply.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: js.UndefOr[Input[AssociationOutputLocation]] = js.undefined
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: js.UndefOr[Input[String]] = js.undefined
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: js.UndefOr[Input[js.Array[Input[AssociationTarget]]]] = js.undefined
}

object AssociationArgs {
  @scala.inline
  def apply(
    associationName: Input[String] = null,
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
  ): AssociationArgs = {
    val __obj = js.Dynamic.literal()
    if (associationName != null) __obj.updateDynamic("associationName")(associationName.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AssociationArgs]
  }
}

