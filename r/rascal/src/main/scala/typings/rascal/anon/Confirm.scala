package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confirm extends js.Object {
  var confirm: Boolean
  var options: Mandatory
  var vhost: String
}

object Confirm {
  @scala.inline
  def apply(confirm: Boolean, options: Mandatory, vhost: String): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
}

