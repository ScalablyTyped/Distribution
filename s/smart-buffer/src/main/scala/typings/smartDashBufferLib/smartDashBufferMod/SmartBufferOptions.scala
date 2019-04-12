package typings
package smartDashBufferLib.smartDashBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object interface for constructing new SmartBuffer instances.
  */
trait SmartBufferOptions extends js.Object {
  var buff: js.UndefOr[nodeLib.Buffer] = js.undefined
  var encoding: js.UndefOr[nodeLib.BufferEncoding] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object SmartBufferOptions {
  @scala.inline
  def apply(
    buff: nodeLib.Buffer = null,
    encoding: nodeLib.BufferEncoding = null,
    size: scala.Int | scala.Double = null
  ): SmartBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (buff != null) __obj.updateDynamic("buff")(buff)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartBufferOptions]
  }
}

