package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indeterminate extends js.Object {
  var checked: Boolean
  var indeterminate: Boolean
  var mode: String
}

object Indeterminate {
  @scala.inline
  def apply(checked: Boolean, indeterminate: Boolean, mode: String): Indeterminate = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indeterminate]
  }
}

