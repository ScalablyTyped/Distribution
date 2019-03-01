package typings
package stringDashSimilarityLib.stringDashSimilarityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BestMatch extends js.Object {
  var bestMatch: Rating
  var bestMatchIndex: scala.Double
  var ratings: js.Array[Rating]
}

object BestMatch {
  @scala.inline
  def apply(bestMatch: Rating, bestMatchIndex: scala.Double, ratings: js.Array[Rating]): BestMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bestMatch")(bestMatch)
    __obj.updateDynamic("bestMatchIndex")(bestMatchIndex)
    __obj.updateDynamic("ratings")(ratings)
    __obj.asInstanceOf[BestMatch]
  }
}

