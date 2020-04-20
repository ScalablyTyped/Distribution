package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object AnonUrl {
  @scala.inline
  def apply(height: Double, url: String, width: Double): AnonUrl = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

