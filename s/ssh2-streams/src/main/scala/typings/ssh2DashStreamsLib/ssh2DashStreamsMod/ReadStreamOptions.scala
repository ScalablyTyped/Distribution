package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var handle: js.UndefOr[nodeLib.Buffer] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object ReadStreamOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    flags: java.lang.String = null,
    handle: nodeLib.Buffer = null,
    mode: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

