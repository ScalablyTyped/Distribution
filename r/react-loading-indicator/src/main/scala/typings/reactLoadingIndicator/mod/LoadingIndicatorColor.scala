package typings.reactLoadingIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingIndicatorColor extends js.Object {
   // value between 0 and 255, inclusive
  var alpha: Double = js.native
   // value between 0 and 255, inclusive
  var blue: Double = js.native
   // value between 0 and 255, inclusive
  var green: Double = js.native
  var red: Double = js.native
}

object LoadingIndicatorColor {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): LoadingIndicatorColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingIndicatorColor]
  }
  @scala.inline
  implicit class LoadingIndicatorColorOps[Self <: LoadingIndicatorColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
  
}

