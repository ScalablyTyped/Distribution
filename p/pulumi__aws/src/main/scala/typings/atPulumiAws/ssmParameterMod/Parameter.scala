package typings.atPulumiAws.ssmParameterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.ssmParameterTypeMod.ParameterType
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/parameter", "Parameter")
@js.native
class Parameter protected () extends CustomResource {
  /**
    * Create a Parameter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ParameterArgs) = this()
  def this(name: String, args: ParameterArgs, opts: CustomResourceOptions) = this()
  /**
    * A regular expression used to validate the parameter value.
    */
  val allowedPattern: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN of the parameter.
    */
  val arn: Output[String] = js.native
  /**
    * The description of the parameter.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The KMS key id or arn for encrypting a SecureString.
    */
  val keyId: Output[String] = js.native
  /**
    * The name of the parameter. If the name contains a path (e.g. any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
    */
  val name: Output[String] = js.native
  /**
    * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
    */
  val overwrite: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard` and `Advanced`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
    */
  val tier: Output[js.UndefOr[String]] = js.native
  /**
    * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
    */
  val `type`: Output[ParameterType] = js.native
  /**
    * The value of the parameter.
    */
  val value: Output[String] = js.native
  /**
    * The version of the parameter.
    */
  val version: Output[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/parameter", "Parameter")
@js.native
object Parameter extends js.Object {
  /**
    * Get an existing Parameter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Parameter = js.native
  def get(name: String, id: Input[ID], state: ParameterState): Parameter = js.native
  def get(name: String, id: Input[ID], state: ParameterState, opts: CustomResourceOptions): Parameter = js.native
  /**
    * Returns true if the given object is an instance of Parameter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/parameter.Parameter */ Boolean = js.native
}

