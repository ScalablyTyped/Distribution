package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketEnabled extends js.Object {
  var bucket: String
  var enabled: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Anon_BucketEnabled {
  @scala.inline
  def apply(bucket: String, enabled: js.UndefOr[Boolean] = js.undefined, prefix: String = null): Anon_BucketEnabled = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BucketEnabled]
  }
}

