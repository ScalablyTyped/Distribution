package typings.resemblejs.resemblejsMod

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
    val __obj = js.Dynamic.literal(blue = blue, brightness = brightness, green = green, red = red)
  
    __obj.asInstanceOf[ResembleAnalysisResult]
  }
}

