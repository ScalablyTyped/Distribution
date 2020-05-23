package typings.reactCircularProgressbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
  var path: String
  var root: String
  var text: String
  var trail: String
}

object Background {
  @scala.inline
  def apply(background: String, path: String, root: String, text: String, trail: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trail = trail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

