package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameKmsKeyArnPrefixRegion extends js.Object {
  var bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var syncFormat: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketNameKmsKeyArnPrefixRegion {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    region: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    syncFormat: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BucketNameKmsKeyArnPrefixRegion = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (syncFormat != null) __obj.updateDynamic("syncFormat")(syncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameKmsKeyArnPrefixRegion]
  }
}

