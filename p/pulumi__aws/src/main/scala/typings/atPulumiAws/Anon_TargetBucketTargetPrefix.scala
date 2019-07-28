package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TargetBucketTargetPrefix extends js.Object {
  var targetBucket: Input[String]
  var targetPrefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_TargetBucketTargetPrefix {
  @scala.inline
  def apply(targetBucket: Input[String], targetPrefix: Input[String] = null): Anon_TargetBucketTargetPrefix = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TargetBucketTargetPrefix]
  }
}

