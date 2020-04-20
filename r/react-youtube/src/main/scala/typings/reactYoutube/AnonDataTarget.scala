package typings.reactYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTarget extends js.Object {
  var data: String
  var target: js.Any
}

object AnonDataTarget {
  @scala.inline
  def apply(data: String, target: js.Any): AnonDataTarget = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataTarget]
  }
}

