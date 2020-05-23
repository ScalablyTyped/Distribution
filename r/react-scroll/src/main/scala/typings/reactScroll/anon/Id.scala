package typings.reactScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var name: String
}

object Id {
  @scala.inline
  def apply(name: String, id: String = null): Id = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

