package typings.ssh2Streams.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAttributes extends js.Object {
  var atime: js.UndefOr[Double | Date] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double | String] = js.undefined
  var mtime: js.UndefOr[Double | Date] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object InputAttributes {
  @scala.inline
  def apply(
    atime: Double | Date = null,
    gid: js.UndefOr[Double] = js.undefined,
    mode: Double | String = null,
    mtime: Double | Date = null,
    size: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined
  ): InputAttributes = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAttributes]
  }
}

