package typings.settings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaults: js.UndefOr[js.Any] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(defaults: js.Any = null, env: String = null, root: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

