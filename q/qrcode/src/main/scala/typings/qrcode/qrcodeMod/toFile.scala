package typings.qrcode.qrcodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", "toFile")
@js.native
object toFile extends js.Object {
  def apply(path: String, text: String): js.Promise[_] = js.native
  def apply(path: String, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def apply(path: String, text: String, options: QRCodeToFileOptions): js.Promise[_] = js.native
  def apply(
    path: String,
    text: String,
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def apply(path: String, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def apply(path: String, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def apply(path: String, text: js.Array[QRCodeSegment], options: QRCodeToFileOptions): js.Promise[_] = js.native
  def apply(
    path: String,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}

