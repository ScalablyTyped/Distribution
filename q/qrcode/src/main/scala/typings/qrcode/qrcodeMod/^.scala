package typings.qrcode.qrcodeMod

import typings.node.streamMod.Writable
import typings.std.Error
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(text: String, options: QRCodeOptions): QRCode = js.native
  def create(text: js.Array[QRCodeSegment], options: QRCodeOptions): QRCode = js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String): js.Promise[_] = js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toCanvas(canvas: js.Any, text: String): js.Promise[_] = js.native
  def toCanvas(canvas: js.Any, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toCanvas(canvas: js.Any, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toCanvas(text: String): js.Promise[_] = js.native
  def toCanvas(text: String, callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]): Unit = js.native
  def toCanvas(text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def toCanvas(text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def toCanvas(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  def toCanvas(
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: String): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toDataURL(text: String): js.Promise[_] = js.native
  def toDataURL(text: String, callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  def toDataURL(text: String, options: QRCodeToDataURLOptions): js.Promise[_] = js.native
  def toDataURL(
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toDataURL(text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toDataURL(text: js.Array[QRCodeSegment], callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  def toDataURL(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[_] = js.native
  def toDataURL(
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  def toFile(path: String, text: String): js.Promise[_] = js.native
  def toFile(path: String, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toFile(path: String, text: String, options: QRCodeToFileOptions): js.Promise[_] = js.native
  def toFile(
    path: String,
    text: String,
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toFile(path: String, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toFile(path: String, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toFile(path: String, text: js.Array[QRCodeSegment], options: QRCodeToFileOptions): js.Promise[_] = js.native
  def toFile(
    path: String,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toFileStream(stream: Writable, text: String): js.Promise[_] = js.native
  def toFileStream(stream: Writable, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toFileStream(stream: Writable, text: String, options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  def toFileStream(
    stream: Writable,
    text: String,
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  def toFileStream(
    stream: Writable,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def toString(text: String): js.Promise[_] = js.native
  def toString(text: String, callback: js.Function2[/* error */ Error, /* string */ String, Unit]): Unit = js.native
  def toString(text: String, options: QRCodeToStringOptions): js.Promise[_] = js.native
  def toString(
    text: String,
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
  def toString(text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  def toString(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
  def toString(text: js.Array[QRCodeSegment], options: QRCodeToStringOptions): js.Promise[_] = js.native
  def toString(
    text: js.Array[QRCodeSegment],
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
}

