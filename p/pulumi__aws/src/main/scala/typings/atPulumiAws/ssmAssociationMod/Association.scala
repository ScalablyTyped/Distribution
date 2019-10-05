package typings.atPulumiAws.ssmAssociationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ssm.AssociationOutputLocation
import typings.atPulumiAws.typesOutputMod.ssm.AssociationTarget
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/association", "Association")
@js.native
class Association protected () extends CustomResource {
  /**
    * Create a Association resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AssociationArgs) = this()
  def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the SSM association.
    */
  val associationId: Output[String] = js.native
  /**
    * The descriptive name for the association.
    */
  val associationName: Output[js.UndefOr[String]] = js.native
  /**
    * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
    */
  val complianceSeverity: Output[js.UndefOr[String]] = js.native
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  val documentVersion: Output[String] = js.native
  /**
    * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
    */
  val instanceId: Output[js.UndefOr[String]] = js.native
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxConcurrency: Output[js.UndefOr[String]] = js.native
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
    */
  val maxErrors: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the SSM document to apply.
    */
  val name: Output[String] = js.native
  /**
    * An output location block. Output Location is documented below.
    */
  val outputLocation: Output[js.UndefOr[AssociationOutputLocation]] = js.native
  /**
    * A block of arbitrary string parameters to pass to the SSM document.
    */
  val parameters: Output[StringDictionary[_]] = js.native
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  val scheduleExpression: Output[js.UndefOr[String]] = js.native
  /**
    * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
    */
  val targets: Output[js.Array[AssociationTarget]] = js.native
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
  def get(name: String, id: Input[ID]): Association = js.native
  def get(name: String, id: Input[ID], state: AssociationState): Association = js.native
  def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): Association = js.native
  /**
    * Returns true if the given object is an instance of Association.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = js.native
}

