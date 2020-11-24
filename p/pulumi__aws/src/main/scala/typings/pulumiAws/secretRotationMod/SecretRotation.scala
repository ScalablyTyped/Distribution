package typings.pulumiAws.secretRotationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.SecretRotationRotationRules
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/secretsmanager/secretRotation", "SecretRotation")
@js.native
class SecretRotation protected () extends CustomResource {
  /**
    * Create a SecretRotation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecretRotationArgs) = this()
  def this(name: String, args: SecretRotationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies whether automatic rotation is enabled for this secret.
    */
  val rotationEnabled: Output_[Boolean] = js.native
  
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret.
    */
  val rotationLambdaArn: Output_[String] = js.native
  
  /**
    * A structure that defines the rotation configuration for this secret. Defined below.
    */
  val rotationRules: Output_[SecretRotationRotationRules] = js.native
  
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: Output_[String] = js.native
  
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/secretsmanager/secretRotation", "SecretRotation")
@js.native
object SecretRotation extends js.Object {
  
  /**
    * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SecretRotation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecretRotation = js.native
  def get(name: String, id: Input[ID], state: SecretRotationState): SecretRotation = js.native
  def get(name: String, id: Input[ID], state: SecretRotationState, opts: CustomResourceOptions): SecretRotation = js.native
  
  /**
    * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean = js.native
}
