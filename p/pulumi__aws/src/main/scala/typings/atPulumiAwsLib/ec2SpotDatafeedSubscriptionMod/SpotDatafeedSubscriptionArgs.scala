package typings
package atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotDatafeedSubscriptionArgs extends js.Object {
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SpotDatafeedSubscriptionArgs {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SpotDatafeedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotDatafeedSubscriptionArgs]
  }
}

