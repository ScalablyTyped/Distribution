package typings.sketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var _data: String
}

object Data {
  @scala.inline
  def apply(_data: String): Data = {
    val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

