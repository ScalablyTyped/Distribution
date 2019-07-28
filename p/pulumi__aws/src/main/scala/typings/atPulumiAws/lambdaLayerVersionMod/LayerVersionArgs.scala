package typings.atPulumiAws.lambdaLayerVersionMod

import typings.atPulumiPulumi.atPulumiPulumiMod.assetNs.Archive
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerVersionArgs extends js.Object {
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[Input[Archive]] = js.undefined
  /**
    * A list of [Runtimes][2] this layer is compatible with. Up to 5 runtimes can be specified.
    */
  val compatibleRuntimes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Description of what your Lambda Layer does.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A unique name for your Lambda Layer
    */
  val layerName: Input[String]
  /**
    * License info for your Lambda Layer. See [License Info][3].
    */
  val licenseInfo: js.UndefOr[Input[String]] = js.undefined
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[Input[String]] = js.undefined
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[Input[String]] = js.undefined
  val sourceCodeHash: js.UndefOr[Input[String]] = js.undefined
}

object LayerVersionArgs {
  @scala.inline
  def apply(
    layerName: Input[String],
    code: Input[Archive] = null,
    compatibleRuntimes: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    licenseInfo: Input[String] = null,
    s3Bucket: Input[String] = null,
    s3Key: Input[String] = null,
    s3ObjectVersion: Input[String] = null,
    sourceCodeHash: Input[String] = null
  ): LayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (compatibleRuntimes != null) __obj.updateDynamic("compatibleRuntimes")(compatibleRuntimes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (licenseInfo != null) __obj.updateDynamic("licenseInfo")(licenseInfo.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key.asInstanceOf[js.Any])
    if (s3ObjectVersion != null) __obj.updateDynamic("s3ObjectVersion")(s3ObjectVersion.asInstanceOf[js.Any])
    if (sourceCodeHash != null) __obj.updateDynamic("sourceCodeHash")(sourceCodeHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerVersionArgs]
  }
}

