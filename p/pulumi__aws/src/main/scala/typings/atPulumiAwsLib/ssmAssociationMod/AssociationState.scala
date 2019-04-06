package typings
package atPulumiAwsLib.ssmAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationState extends js.Object {
  val associationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The descriptive name for the association.
    */
  val associationName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the SSM document to apply.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_S3BucketNameS3KeyPrefix]] = js.undefined
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]]
  ] = js.undefined
}

object AssociationState {
  @scala.inline
  def apply(
    associationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    associationName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    complianceSeverity: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    documentVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxConcurrency: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxErrors: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    outputLocation: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_S3BucketNameS3KeyPrefix] = null,
    parameters: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    scheduleExpression: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    targets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]] = null
  ): AssociationState = {
    val __obj = js.Dynamic.literal()
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AssociationState]
  }
}

