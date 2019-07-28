package typings.atPulumiAws.ec2SpotDatafeedSubscriptionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotDatafeedSubscriptionState extends js.Object {
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: js.UndefOr[Input[String]] = js.undefined
}

object SpotDatafeedSubscriptionState {
  @scala.inline
  def apply(bucket: Input[String] = null, prefix: Input[String] = null): SpotDatafeedSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotDatafeedSubscriptionState]
  }
}

