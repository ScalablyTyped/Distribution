package typings.reactNativeVideo

import typings.reactNativeVideo.reactNativeVideoStrings.horizontal
import typings.reactNativeVideo.reactNativeVideoStrings.landscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var orientation: horizontal | landscape
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, orientation: horizontal | landscape, width: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

