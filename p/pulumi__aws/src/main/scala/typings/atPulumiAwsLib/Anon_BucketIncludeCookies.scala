package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketIncludeCookies extends js.Object {
  var bucket: java.lang.String
  var includeCookies: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketIncludeCookies {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    includeCookies: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null
  ): Anon_BucketIncludeCookies = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (!js.isUndefined(includeCookies)) __obj.updateDynamic("includeCookies")(includeCookies)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BucketIncludeCookies]
  }
}

