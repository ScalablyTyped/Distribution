package typings.reactLoadingIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingIndicatorColor extends js.Object {
   // value between 0 and 255, inclusive
  var alpha: Double
   // value between 0 and 255, inclusive
  var blue: Double
   // value between 0 and 255, inclusive
  var green: Double
  var red: Double
}

object LoadingIndicatorColor {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): LoadingIndicatorColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIndicatorColor]
  }
}

