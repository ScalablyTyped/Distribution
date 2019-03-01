package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketEnabled extends js.Object {
  var bucket: java.lang.String
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketEnabled {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null
  ): Anon_BucketEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BucketEnabled]
  }
}

