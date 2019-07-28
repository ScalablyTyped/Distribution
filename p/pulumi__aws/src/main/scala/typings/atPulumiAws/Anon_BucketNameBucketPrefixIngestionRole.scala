package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameBucketPrefixIngestionRole extends js.Object {
  var bucketName: Input[String]
  var bucketPrefix: js.UndefOr[Input[String]] = js.undefined
  var ingestionRole: Input[String]
  var sourceEngine: Input[String]
  var sourceEngineVersion: Input[String]
}

object Anon_BucketNameBucketPrefixIngestionRole {
  @scala.inline
  def apply(
    bucketName: Input[String],
    ingestionRole: Input[String],
    sourceEngine: Input[String],
    sourceEngineVersion: Input[String],
    bucketPrefix: Input[String] = null
  ): Anon_BucketNameBucketPrefixIngestionRole = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameBucketPrefixIngestionRole]
  }
}

