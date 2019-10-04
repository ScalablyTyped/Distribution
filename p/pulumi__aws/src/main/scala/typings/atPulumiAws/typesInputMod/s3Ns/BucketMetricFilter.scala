package typings.atPulumiAws.typesInputMod.s3Ns

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketMetricFilter extends js.Object {
  /**
    * Object prefix for filtering (singular).
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Object tags for filtering (up to 10).
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object BucketMetricFilter {
  @scala.inline
  def apply(prefix: Input[String] = null, tags: Input[StringDictionary[_]] = null): BucketMetricFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketMetricFilter]
  }
}

