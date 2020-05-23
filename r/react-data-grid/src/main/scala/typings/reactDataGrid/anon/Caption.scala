package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caption extends js.Object {
  var caption: String
  var id: Double
}

object Caption {
  @scala.inline
  def apply(caption: String, id: Double): Caption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caption]
  }
}

