package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketEnabledPrefix extends js.Object {
  var bucket: Input[String]
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BucketEnabledPrefix {
  @scala.inline
  def apply(bucket: Input[String], enabled: Input[Boolean] = null, prefix: Input[String] = null): Anon_BucketEnabledPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketEnabledPrefix]
  }
}

