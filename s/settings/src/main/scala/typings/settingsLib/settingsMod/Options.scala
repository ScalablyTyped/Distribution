package typings
package settingsLib.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaults: js.UndefOr[js.Any] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(defaults: js.Any = null, env: java.lang.String = null, root: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (env != null) __obj.updateDynamic("env")(env)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Options]
  }
}

