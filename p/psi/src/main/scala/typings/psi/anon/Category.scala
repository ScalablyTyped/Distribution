package typings.psi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: String
  var distributions: js.Array[Max]
  var percentile: Double
}

object Category {
  @scala.inline
  def apply(category: String, distributions: js.Array[Max], percentile: Double): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

