package typings.stringSimilarity.mod

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
    val __obj = js.Dynamic.literal(bestMatch = bestMatch.asInstanceOf[js.Any], bestMatchIndex = bestMatchIndex.asInstanceOf[js.Any], ratings = ratings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BestMatch]
  }
}

