package typings.stringDashSimilarity.stringDashSimilarityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BestMatch extends js.Object {
  var bestMatch: Rating
  var bestMatchIndex: Double
  var ratings: js.Array[Rating]
}

object BestMatch {
  @scala.inline
  def apply(bestMatch: Rating, bestMatchIndex: Double, ratings: js.Array[Rating]): BestMatch = {
    val __obj = js.Dynamic.literal(bestMatch = bestMatch, bestMatchIndex = bestMatchIndex, ratings = ratings)
  
    __obj.asInstanceOf[BestMatch]
  }
}

