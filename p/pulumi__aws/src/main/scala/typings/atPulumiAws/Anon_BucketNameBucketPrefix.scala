package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameBucketPrefix extends js.Object {
  var bucketName: String
  var bucketPrefix: js.UndefOr[String] = js.undefined
  var ingestionRole: String
  var sourceEngine: String
  var sourceEngineVersion: String
}

object Anon_BucketNameBucketPrefix {
  @scala.inline
  def apply(
    bucketName: String,
    ingestionRole: String,
    sourceEngine: String,
    sourceEngineVersion: String,
    bucketPrefix: String = null
  ): Anon_BucketNameBucketPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, ingestionRole = ingestionRole, sourceEngine = sourceEngine, sourceEngineVersion = sourceEngineVersion)
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix)
    __obj.asInstanceOf[Anon_BucketNameBucketPrefix]
  }
}

