package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupTag extends js.Object {
  /**
    * Key
    */
  var key: String
  /**
    * Enables propagation of the tag to
    * Amazon EC2 instances launched via this ASG
    */
  var propagateAtLaunch: Boolean
  /**
    * Value
    */
  var value: String
}

object GroupTag {
  @scala.inline
  def apply(key: String, propagateAtLaunch: Boolean, value: String): GroupTag = {
    val __obj = js.Dynamic.literal(key = key, propagateAtLaunch = propagateAtLaunch, value = value)
  
    __obj.asInstanceOf[GroupTag]
  }
}

