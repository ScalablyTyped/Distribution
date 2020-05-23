package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mandatory extends js.Object {
  var mandatory: Boolean
  var persistent: Boolean
}

object Mandatory {
  @scala.inline
  def apply(mandatory: Boolean, persistent: Boolean): Mandatory = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mandatory]
  }
}

