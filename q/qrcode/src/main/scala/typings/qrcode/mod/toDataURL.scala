package typings.qrcode.mod

import typings.std.Error
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", "toDataURL")
@js.native
object toDataURL extends js.Object {
  def apply(canvasElement: HTMLCanvasElement, text: String): js.Promise[String] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: String,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[String] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def apply(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  def apply(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def apply(text: String): js.Promise[String] = js.native
  def apply(text: String, callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  def apply(text: String, options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  def apply(
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def apply(text: js.Array[QRCodeSegment]): js.Promise[String] = js.native
  def apply(text: js.Array[QRCodeSegment], callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  def apply(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  def apply(
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
}

