package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var len: String
  var max: String
  var min: String
  var range: String
}

object Max {
  @scala.inline
  def apply(len: String, max: String, min: String, range: String): Max = {
    val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

