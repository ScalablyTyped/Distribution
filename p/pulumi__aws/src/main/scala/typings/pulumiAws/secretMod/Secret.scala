package typings.pulumiAws.secretMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.secretsmanager.SecretRotationRules
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager/secret", "Secret")
@js.native
class Secret protected () extends CustomResource {
  /**
    * Create a Secret resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SecretArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the secret.
    */
  val arn: Output_[String] = js.native
  /**
    * A description of the secret.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies the ARN or alias of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
    */
  val kmsKeyId: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `namePrefix`.
    */
  val name: Output_[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[String] = js.native
  /**
    * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
    */
  val policy: Output_[js.UndefOr[String]] = js.native
  /**
    * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
    */
  val recoveryWindowInDays: Output_[js.UndefOr[Double]] = js.native
  /**
    * Specifies whether automatic rotation is enabled for this secret.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
    */
  val rotationEnabled: Output_[Boolean] = js.native
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
    */
  val rotationLambdaArn: Output_[String] = js.native
  /**
    * A structure that defines the rotation configuration for this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
    */
  val rotationRules: Output_[SecretRotationRules] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the secret.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/secretsmanager/secret", "Secret")
@js.native
object Secret extends js.Object {
  /**
    * Get an existing Secret resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Secret = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Secret = js.native
  def get(name: String, id: Input[ID], state: SecretState): Secret = js.native
  def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): Secret = js.native
  /**
    * Returns true if the given object is an instance of Secret.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
}

