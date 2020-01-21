package typings.stringSimilarity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rating extends js.Object {
  var rating: Double
  var target: String
}

object Rating {
  @scala.inline
  def apply(rating: Double, target: String): Rating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rating]
  }
}

