package typings.resemblejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleAnalysisResult extends js.Object {
  var blue: Double = js.native
  var brightness: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
}

object ResembleAnalysisResult {
  @scala.inline
  def apply(blue: Double, brightness: Double, green: Double, red: Double): ResembleAnalysisResult = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResembleAnalysisResult]
  }
  @scala.inline
  implicit class ResembleAnalysisResultOps[Self <: ResembleAnalysisResult] (val x: Self) extends AnyVal {
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
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
  
}

