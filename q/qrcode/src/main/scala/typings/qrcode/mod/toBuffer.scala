package typings.qrcode.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qrcode", "toBuffer")
@js.native
object toBuffer extends js.Object {
  
  def apply(text: String): js.Promise[Buffer] = js.native
  def apply(text: String, callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]): Unit = js.native
  def apply(text: String, options: QRCodeToBufferOptions): js.Promise[Buffer] = js.native
  def apply(
    text: String,
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(text: js.Array[QRCodeSegment]): js.Promise[Buffer] = js.native
  def apply(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(text: js.Array[QRCodeSegment], options: QRCodeToBufferOptions): js.Promise[Buffer] = js.native
  def apply(
    text: js.Array[QRCodeSegment],
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
}
