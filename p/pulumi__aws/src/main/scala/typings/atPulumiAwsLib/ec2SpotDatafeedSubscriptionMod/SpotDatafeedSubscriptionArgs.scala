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

