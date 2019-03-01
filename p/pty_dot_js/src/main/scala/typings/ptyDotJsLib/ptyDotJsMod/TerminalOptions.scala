package typings
package ptyDotJsLib.ptyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that can be used when creating a new pseudo-terminal. */
trait TerminalOptions extends js.Object {
  var cols: js.UndefOr[scala.Double] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object TerminalOptions {
  @scala.inline
  def apply(
    cols: scala.Int | scala.Double = null,
    cwd: java.lang.String = null,
    env: js.Any = null,
    gid: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): TerminalOptions = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalOptions]
  }
}

