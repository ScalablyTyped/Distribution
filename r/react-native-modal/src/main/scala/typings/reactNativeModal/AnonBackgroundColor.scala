package typings.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: String
  var opacity: Double
  var zIndex: Double
}

object AnonBackgroundColor {
  @scala.inline
  def apply(backgroundColor: String, opacity: Double, zIndex: Double): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

