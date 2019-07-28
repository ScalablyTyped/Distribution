package typings.reactDashNativeDashVideo

import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.horizontal
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.landscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: Double
  var orientation: horizontal | landscape
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(height: Double, orientation: horizontal | landscape, width: Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, orientation = orientation.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

