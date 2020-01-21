package typings.pulumiPulumi.parseFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturedPropertyInfo extends js.Object {
  var invoked: Boolean
  var name: String
}

object CapturedPropertyInfo {
  @scala.inline
  def apply(invoked: Boolean, name: String): CapturedPropertyInfo = {
    val __obj = js.Dynamic.literal(invoked = invoked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CapturedPropertyInfo]
  }
}

