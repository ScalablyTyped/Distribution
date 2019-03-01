package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAttributes extends js.Object {
  var atime: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mtime: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object InputAttributes {
  @scala.inline
  def apply(
    atime: scala.Double | stdLib.Date = null,
    gid: scala.Int | scala.Double = null,
    mode: scala.Double | java.lang.String = null,
    mtime: scala.Double | stdLib.Date = null,
    size: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null
  ): InputAttributes = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAttributes]
  }
}

