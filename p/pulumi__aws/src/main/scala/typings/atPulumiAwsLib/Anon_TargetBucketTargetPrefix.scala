package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TargetBucketTargetPrefix extends js.Object {
  var targetBucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var targetPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_TargetBucketTargetPrefix {
  @scala.inline
  def apply(
    targetBucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_TargetBucketTargetPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetBucket")(targetBucket.asInstanceOf[js.Any])
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TargetBucketTargetPrefix]
  }
}

