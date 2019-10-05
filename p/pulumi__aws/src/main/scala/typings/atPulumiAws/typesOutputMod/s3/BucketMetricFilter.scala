package typings.atPulumiAws.typesOutputMod.s3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketMetricFilter extends js.Object {
  /**
    * Object prefix for filtering (singular).
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Object tags for filtering (up to 10).
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object BucketMetricFilter {
  @scala.inline
  def apply(prefix: String = null, tags: StringDictionary[js.Any] = null): BucketMetricFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[BucketMetricFilter]
  }
}

