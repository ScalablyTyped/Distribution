package typings.reactNativeModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends js.Object {
  var backgroundColor: String
  var opacity: Double
  var zIndex: Double
}

object Opacity {
  @scala.inline
  def apply(backgroundColor: String, opacity: Double, zIndex: Double): Opacity = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

