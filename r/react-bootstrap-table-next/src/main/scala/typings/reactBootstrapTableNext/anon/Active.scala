package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: Boolean
  var disabled: Boolean
  var page: Double
  var title: String
}

object Active {
  @scala.inline
  def apply(active: Boolean, disabled: Boolean, page: Double, title: String): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

