package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DANGER extends js.Object {
  var DANGER: java.lang.String
  var INFO: java.lang.String
  var SUCCESS: java.lang.String
  var WARNING: java.lang.String
}

object Anon_DANGER {
  @scala.inline
  def apply(
    DANGER: java.lang.String,
    INFO: java.lang.String,
    SUCCESS: java.lang.String,
    WARNING: java.lang.String
  ): Anon_DANGER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DANGER")(DANGER)
    __obj.updateDynamic("INFO")(INFO)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_DANGER]
  }
}

