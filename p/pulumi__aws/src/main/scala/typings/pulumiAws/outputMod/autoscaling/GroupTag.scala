package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupTag extends js.Object {
  /**
    * Key
    */
  var key: String = js.native
  /**
    * Enables propagation of the tag to
    * Amazon EC2 instances launched via this ASG
    */
  var propagateAtLaunch: Boolean = js.native
  /**
    * Value
    */
  var value: String = js.native
}

object GroupTag {
  @scala.inline
  def apply(key: String, propagateAtLaunch: Boolean, value: String): GroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], propagateAtLaunch = propagateAtLaunch.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTag]
  }
}

