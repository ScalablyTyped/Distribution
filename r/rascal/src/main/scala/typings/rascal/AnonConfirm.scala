package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirm extends js.Object {
  var confirm: Boolean
  var options: AnonMandatory
  var vhost: String
}

object AnonConfirm {
  @scala.inline
  def apply(confirm: Boolean, options: AnonMandatory, vhost: String): AnonConfirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirm]
  }
}

