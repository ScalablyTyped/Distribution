package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketIncludeCookiesPrefix extends js.Object {
  var bucket: Input[String]
  var includeCookies: js.UndefOr[Input[Boolean]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BucketIncludeCookiesPrefix {
  @scala.inline
  def apply(bucket: Input[String], includeCookies: Input[Boolean] = null, prefix: Input[String] = null): Anon_BucketIncludeCookiesPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (includeCookies != null) __obj.updateDynamic("includeCookies")(includeCookies.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketIncludeCookiesPrefix]
  }
}

