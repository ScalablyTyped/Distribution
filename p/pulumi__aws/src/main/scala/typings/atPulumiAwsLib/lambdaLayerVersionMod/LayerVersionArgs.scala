package typings
package atPulumiAwsLib.lambdaLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerVersionArgs extends js.Object {
  /**
    * A list of [Runtimes][2] this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Description of what your Lambda Layer does.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val filename: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * License info for your Lambda Layer. See [License Info][3].
    */
  val licenseInfo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `${base64sha256(file("file.zip"))}`, where "file.zip" is the local filename of the lambda layer source archive.
    */
  val sourceCodeHash: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LayerVersionArgs {
  @scala.inline
  def apply(
    layerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    compatibleRuntimes: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    filename: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    licenseInfo: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3Bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3Key: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3ObjectVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceCodeHash: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    if (compatibleRuntimes != null) __obj.updateDynamic("compatibleRuntimes")(compatibleRuntimes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (licenseInfo != null) __obj.updateDynamic("licenseInfo")(licenseInfo.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key.asInstanceOf[js.Any])
    if (s3ObjectVersion != null) __obj.updateDynamic("s3ObjectVersion")(s3ObjectVersion.asInstanceOf[js.Any])
    if (sourceCodeHash != null) __obj.updateDynamic("sourceCodeHash")(sourceCodeHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerVersionArgs]
  }
}

