package typings
package atPulumiAwsLib.ssmAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/association", "Association")
@js.native
class Association protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Association resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AssociationArgs) = this()
  def this(name: java.lang.String, args: AssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val associationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The descriptive name for the association.
    */
  val associationName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the SSM document to apply.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_S3BucketName]] = js.native
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_KeyValues]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/association", "Association")
@js.native
object Association extends js.Object {
  /**
    * Get an existing Association resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmAssociationMod.Association = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmAssociationMod.AssociationState
  ): atPulumiAwsLib.ssmAssociationMod.Association = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmAssociationMod.AssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ssmAssociationMod.Association = js.native
}

