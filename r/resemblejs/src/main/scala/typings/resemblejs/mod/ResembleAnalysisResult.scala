package typings.resemblejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleAnalysisResult extends js.Object {
  var blue: Double
  var brightness: Double
  var green: Double
  var red: Double
}

object ResembleAnalysisResult {
  @scala.inline
  def apply(blue: Double, brightness: Double, green: Double, red: Double): ResembleAnalysisResult = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResembleAnalysisResult]
  }
}

