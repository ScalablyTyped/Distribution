package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceS3 extends js.Object {
  // address of S3 bucket containing data
  var bucket: java.lang.String
  // Pattern that selects keys to ingest.
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  // Prefix that selects keys to ingest.
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object SourceS3 {
  @scala.inline
  def apply(bucket: java.lang.String, pattern: java.lang.String = null, prefix: java.lang.String = null): SourceS3 = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[SourceS3]
  }
}

