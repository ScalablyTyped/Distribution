package typings.reactYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTarget extends js.Object {
  var data: String
  var target: js.Any
}

object DataTarget {
  @scala.inline
  def apply(data: String, target: js.Any): DataTarget = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTarget]
  }
}

