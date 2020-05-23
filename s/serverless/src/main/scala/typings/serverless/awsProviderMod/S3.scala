package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3 extends js.Object {
  var bucket: String
  var event: String
  var existing: js.UndefOr[Boolean] = js.undefined
  var rules: js.Array[S3Rule]
}

object S3 {
  @scala.inline
  def apply(
    bucket: String,
    event: String,
    rules: js.Array[S3Rule],
    existing: js.UndefOr[Boolean] = js.undefined
  ): S3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (!js.isUndefined(existing)) __obj.updateDynamic("existing")(existing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
}

