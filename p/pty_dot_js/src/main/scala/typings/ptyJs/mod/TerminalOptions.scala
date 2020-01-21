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
    cols: Int | Double = null,
    cwd: String = null,
    env: js.Any = null,
    gid: Int | Double = null,
    name: String = null,
    rows: Int | Double = null,
    uid: Int | Double = null
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalOptions]
  }
}

