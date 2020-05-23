package typings.smartBuffer.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object interface for constructing new SmartBuffer instances.
  */
trait SmartBufferOptions extends js.Object {
  var buff: js.UndefOr[Buffer] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object SmartBufferOptions {
  @scala.inline
  def apply(buff: Buffer = null, encoding: BufferEncoding = null, size: js.UndefOr[Double] = js.undefined): SmartBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (buff != null) __obj.updateDynamic("buff")(buff.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartBufferOptions]
  }
}

