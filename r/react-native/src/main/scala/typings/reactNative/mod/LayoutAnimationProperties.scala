package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationProperties extends js.Object {
  var opacity: String
  var scaleXY: String
}

object LayoutAnimationProperties {
  @scala.inline
  def apply(opacity: String, scaleXY: String): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], scaleXY = scaleXY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
}

