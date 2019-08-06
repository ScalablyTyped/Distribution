package typings.atPulumiAws.lambdaLayerVersionMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.atPulumiPulumiMod.assetNs.Archive
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/layerVersion", "LayerVersion")
@js.native
class LayerVersion protected () extends CustomResource {
  /**
    * Create a LayerVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LayerVersionArgs) = this()
  def this(name: String, args: LayerVersionArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: Output[String] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: Output[js.UndefOr[Archive]] = js.native
  /**
    * A list of [Runtimes][2] this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The date this resource was created.
    */
  val createdDate: Output[String] = js.native
  /**
    * Description of what your Lambda Layer does.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: Output[String] = js.native
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: Output[String] = js.native
  /**
    * License info for your Lambda Layer. See [License Info][3].
    */
  val licenseInfo: Output[js.UndefOr[String]] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: Output[js.UndefOr[String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: Output[js.UndefOr[String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: Output[js.UndefOr[String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `${filebase64sha256("file.zip")}` (this provider 0.11.12 or later) or `${base64sha256(file("file.zip"))}` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda layer source archive.
    */
  val sourceCodeHash: Output[String] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Output[Double] = js.native
  /**
    * This Lamba Layer version.
    */
  val version: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/layerVersion", "LayerVersion")
@js.native
object LayerVersion extends js.Object {
  /**
    * Get an existing LayerVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LayerVersion = js.native
  def get(name: String, id: Input[ID], state: LayerVersionState): LayerVersion = js.native
  def get(name: String, id: Input[ID], state: LayerVersionState, opts: CustomResourceOptions): LayerVersion = js.native
  /**
    * Returns true if the given object is an instance of LayerVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean = js.native
}

