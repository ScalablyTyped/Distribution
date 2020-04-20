package typings.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  var backgroundColor: String
  var opacity: Double
  var zIndex: Double
}

object AnonOpacity {
  @scala.inline
  def apply(backgroundColor: String, opacity: Double, zIndex: Double): AnonOpacity = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

