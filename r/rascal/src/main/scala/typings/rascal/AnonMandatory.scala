package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMandatory extends js.Object {
  var mandatory: Boolean
  var persistent: Boolean
}

object AnonMandatory {
  @scala.inline
  def apply(mandatory: Boolean, persistent: Boolean): AnonMandatory = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMandatory]
  }
}

