package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupTag extends js.Object {
  /**
    * Key
    */
  var key: Input[String] = js.native
  /**
    * Enables propagation of the tag to
    * Amazon EC2 instances launched via this ASG
    */
  var propagateAtLaunch: Input[Boolean] = js.native
  /**
    * Value
    */
  var value: Input[String] = js.native
}

object GroupTag {
  @scala.inline
  def apply(key: Input[String], propagateAtLaunch: Input[Boolean], value: Input[String]): GroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTag]
  }
}

