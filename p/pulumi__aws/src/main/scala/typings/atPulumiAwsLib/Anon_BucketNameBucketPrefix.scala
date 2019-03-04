package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameBucketPrefix extends js.Object {
  var bucketName: java.lang.String
  var bucketPrefix: js.UndefOr[java.lang.String] = js.undefined
  var ingestionRole: java.lang.String
  var sourceEngine: java.lang.String
  var sourceEngineVersion: java.lang.String
}

object Anon_BucketNameBucketPrefix {
  @scala.inline
  def apply(
    bucketName: java.lang.String,
    ingestionRole: java.lang.String,
    sourceEngine: java.lang.String,
    sourceEngineVersion: java.lang.String,
    bucketPrefix: java.lang.String = null
  ): Anon_BucketNameBucketPrefix = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, ingestionRole = ingestionRole, sourceEngine = sourceEngine, sourceEngineVersion = sourceEngineVersion)
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix)
    __obj.asInstanceOf[Anon_BucketNameBucketPrefix]
  }
}

