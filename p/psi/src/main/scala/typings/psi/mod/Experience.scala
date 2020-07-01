package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experience extends js.Object {
  var id: String
  var initial_url: String
  var metrics: StringDictionary[typings.psi.anon.Category]
  var overall_category: String
}

object Experience {
  @scala.inline
  def apply(
    id: String,
    initial_url: String,
    metrics: StringDictionary[typings.psi.anon.Category],
    overall_category: String
  ): Experience = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initial_url = initial_url.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], overall_category = overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
}

