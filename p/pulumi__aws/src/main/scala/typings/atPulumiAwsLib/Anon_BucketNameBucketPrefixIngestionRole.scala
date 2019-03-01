package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameBucketPrefixIngestionRole extends js.Object {
  var bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var bucketPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var ingestionRole: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sourceEngine: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sourceEngineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_BucketNameBucketPrefixIngestionRole {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ingestionRole: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sourceEngine: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sourceEngineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bucketPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BucketNameBucketPrefixIngestionRole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("ingestionRole")(ingestionRole.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceEngine")(sourceEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceEngineVersion")(sourceEngineVersion.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameBucketPrefixIngestionRole]
  }
}

