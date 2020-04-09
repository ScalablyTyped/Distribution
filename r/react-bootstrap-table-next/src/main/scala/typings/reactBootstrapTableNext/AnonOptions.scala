package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  var `type`: String
}

object AnonOptions {
  @scala.inline
  def apply(`type`: String, options: js.Array[AnonLabel] = null): AnonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

