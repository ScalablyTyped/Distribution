package typings.ptyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that can be used when creating a new pseudo-terminal. */
trait TerminalOptions extends js.Object {
  var cols: js.UndefOr[Double] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object TerminalOptions {
  @scala.inline
  def apply(
    cols: js.UndefOr[Double] = js.undefined,
    cwd: String = null,
    env: js.Any = null,
    gid: js.UndefOr[Double] = js.undefined,
    name: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalOptions]
  }
}

