package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketIncludeCookies extends js.Object {
  var bucket: String
  var includeCookies: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Anon_BucketIncludeCookies {
  @scala.inline
  def apply(bucket: String, includeCookies: js.UndefOr[Boolean] = js.undefined, prefix: String = null): Anon_BucketIncludeCookies = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (!js.isUndefined(includeCookies)) __obj.updateDynamic("includeCookies")(includeCookies)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_BucketIncludeCookies]
  }
}

