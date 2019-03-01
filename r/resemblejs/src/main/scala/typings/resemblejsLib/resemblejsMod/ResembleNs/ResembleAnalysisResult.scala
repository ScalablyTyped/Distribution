package typings
package resemblejsLib.resemblejsMod.ResembleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResembleAnalysisResult extends js.Object {
  var blue: scala.Double
  var brightness: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object ResembleAnalysisResult {
  @scala.inline
  def apply(blue: scala.Double, brightness: scala.Double, green: scala.Double, red: scala.Double): ResembleAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("brightness")(brightness)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[ResembleAnalysisResult]
  }
}

