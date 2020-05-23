package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[js.Array[Label]] = js.undefined
  var `type`: String
}

object Options {
  @scala.inline
  def apply(`type`: String, options: js.Array[Label] = null): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

