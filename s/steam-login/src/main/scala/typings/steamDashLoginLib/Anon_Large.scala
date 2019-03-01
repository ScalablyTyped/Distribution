package typings
package steamDashLoginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Large extends js.Object {
  var large: java.lang.String
  var medium: java.lang.String
  var small: java.lang.String
}

object Anon_Large {
  @scala.inline
  def apply(large: java.lang.String, medium: java.lang.String, small: java.lang.String): Anon_Large = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("large")(large)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[Anon_Large]
  }
}

