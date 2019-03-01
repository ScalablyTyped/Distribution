package typings
package stringDashSimilarityLib.stringDashSimilarityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rating extends js.Object {
  var rating: scala.Double
  var target: java.lang.String
}

object Rating {
  @scala.inline
  def apply(rating: scala.Double, target: java.lang.String): Rating = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rating")(rating)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Rating]
  }
}

