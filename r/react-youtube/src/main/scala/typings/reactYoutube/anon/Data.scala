package typings.reactYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Double
  var target: js.Any
}

object Data {
  @scala.inline
  def apply(data: Double, target: js.Any): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

