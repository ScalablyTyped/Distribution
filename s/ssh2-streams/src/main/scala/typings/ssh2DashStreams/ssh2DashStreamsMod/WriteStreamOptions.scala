package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteStreamOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object WriteStreamOptions {
  @scala.inline
  def apply(encoding: String = null, flags: String = null, mode: Int | Double = null): WriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteStreamOptions]
  }
}

