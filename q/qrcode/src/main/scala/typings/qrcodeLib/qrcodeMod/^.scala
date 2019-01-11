package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qrcode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeOptions): qrcodeLib.qrcodeMod.QRCode = js.native
  def create(text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment], options: qrcodeLib.qrcodeMod.QRCodeOptions): qrcodeLib.qrcodeMod.QRCode = js.native
  def toCanvas(canvasElement: stdLib.HTMLCanvasElement, text: java.lang.String): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions
  ): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(canvasElement: stdLib.HTMLCanvasElement, text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions
  ): js.Promise[_] = js.native
  def toCanvas(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(canvas: js.Any, text: java.lang.String): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(canvas: js.Any, text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeOptions): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(canvas: js.Any, text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(
    canvas: js.Any,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions
  ): js.Promise[_] = js.native
  def toCanvas(
    canvas: js.Any,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(text: java.lang.String): js.Promise[_] = js.native
  def toCanvas(
    text: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* canvas */ stdLib.HTMLCanvasElement, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeOptions): js.Promise[_] = js.native
  def toCanvas(
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* canvas */ stdLib.HTMLCanvasElement, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toCanvas(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function2[/* error */ nodeLib.Error, /* canvas */ stdLib.HTMLCanvasElement, scala.Unit]
  ): scala.Unit = js.native
  def toCanvas(text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment], options: qrcodeLib.qrcodeMod.QRCodeOptions): js.Promise[_] = js.native
  def toCanvas(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* canvas */ stdLib.HTMLCanvasElement, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(canvasElement: stdLib.HTMLCanvasElement, text: java.lang.String): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions
  ): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(canvasElement: stdLib.HTMLCanvasElement, text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions
  ): js.Promise[_] = js.native
  def toDataURL(
    canvasElement: stdLib.HTMLCanvasElement,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(text: java.lang.String): js.Promise[_] = js.native
  def toDataURL(
    text: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions): js.Promise[_] = js.native
  def toDataURL(
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toDataURL(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toDataURL(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions
  ): js.Promise[_] = js.native
  def toDataURL(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toFile(path: java.lang.String, text: java.lang.String): js.Promise[_] = js.native
  def toFile(
    path: java.lang.String,
    text: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFile(path: java.lang.String, text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeToFileOptions): js.Promise[_] = js.native
  def toFile(
    path: java.lang.String,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeToFileOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFile(path: java.lang.String, text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toFile(
    path: java.lang.String,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFile(
    path: java.lang.String,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToFileOptions
  ): js.Promise[_] = js.native
  def toFile(
    path: java.lang.String,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToFileOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFileStream(stream: nodeLib.streamMod.Writable, text: java.lang.String): js.Promise[_] = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions
  ): js.Promise[_] = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFileStream(stream: nodeLib.streamMod.Writable, text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions
  ): js.Promise[_] = js.native
  def toFileStream(
    stream: nodeLib.streamMod.Writable,
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeOptions,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def toString(text: java.lang.String): js.Promise[_] = js.native
  def toString(
    text: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* string */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toString(text: java.lang.String, options: qrcodeLib.qrcodeMod.QRCodeToStringOptions): js.Promise[_] = js.native
  def toString(
    text: java.lang.String,
    options: qrcodeLib.qrcodeMod.QRCodeToStringOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* string */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toString(text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment]): js.Promise[_] = js.native
  def toString(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    callback: js.Function2[/* error */ nodeLib.Error, /* string */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def toString(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToStringOptions
  ): js.Promise[_] = js.native
  def toString(
    text: js.Array[qrcodeLib.qrcodeMod.QRCodeSegment],
    options: qrcodeLib.qrcodeMod.QRCodeToStringOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* string */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

