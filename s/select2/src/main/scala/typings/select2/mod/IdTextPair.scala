package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTextPair extends js.Object {
  var element: js.UndefOr[scala.Nothing] = js.undefined
  var id: String
  var loading: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object IdTextPair {
  @scala.inline
  def apply(id: String, text: String): IdTextPair = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTextPair]
  }
}

