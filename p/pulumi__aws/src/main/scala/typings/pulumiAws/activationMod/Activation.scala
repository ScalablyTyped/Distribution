package typings.pulumiAws.activationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/activation", "Activation")
@js.native
class Activation protected () extends CustomResource {
  /**
    * Create a Activation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ActivationArgs) = this()
  def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
  /**
    * The code the system generates when it processes the activation.
    */
  val activationCode: Output_[String] = js.native
  /**
    * The description of the resource that you want to register.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
    */
  val expirationDate: Output_[String] = js.native
  /**
    * If the current activation has expired.
    */
  val expired: Output_[String] = js.native
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: Output_[String] = js.native
  /**
    * The default name of the registered managed instance.
    */
  val name: Output_[String] = js.native
  /**
    * The number of managed instances that are currently registered using this activation.
    */
  val registrationCount: Output_[Double] = js.native
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: Output_[js.UndefOr[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/activation", "Activation")
@js.native
object Activation extends js.Object {
  /**
    * Get an existing Activation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Activation = js.native
  def get(name: String, id: Input[ID], state: ActivationState): Activation = js.native
  def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): Activation = js.native
  /**
    * Returns true if the given object is an instance of Activation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
}

