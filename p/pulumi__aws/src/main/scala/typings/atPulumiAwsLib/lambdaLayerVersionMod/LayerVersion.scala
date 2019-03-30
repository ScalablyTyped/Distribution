package typings
package atPulumiAwsLib.lambdaLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/layerVersion", "LayerVersion")
@js.native
class LayerVersion protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LayerVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LayerVersionArgs) = this()
  def this(name: java.lang.String, args: LayerVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of [Runtimes][2] this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The date this resource was created.
    */
  val createdDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Description of what your Lambda Layer does.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val filename: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * License info for your Lambda Layer. See [License Info][3].
    */
  val licenseInfo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `${base64sha256(file("file.zip"))}`, where "file.zip" is the local filename of the lambda layer source archive.
    */
  val sourceCodeHash: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * This Lamba Layer version.
    */
  val version: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionState
  ): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
}

