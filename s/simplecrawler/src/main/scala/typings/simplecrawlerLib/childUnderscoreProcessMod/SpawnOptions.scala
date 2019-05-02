package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[js.Any] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object SpawnOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.Any = null,
    gid: scala.Int | scala.Double = null,
    shell: scala.Boolean | java.lang.String = null,
    stdio: js.Any = null,
    uid: scala.Int | scala.Double = null
  ): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnOptions]
  }
}

