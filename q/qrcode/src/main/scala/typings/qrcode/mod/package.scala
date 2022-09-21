package typings.qrcode.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Writable
import typings.qrcode.mod.^
import typings.qrcode.qrcodeStrings.png
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def create(text: String): QRCode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any]).asInstanceOf[QRCode]
inline def create(text: String, options: QRCodeOptions): QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QRCode]
inline def create(text: js.Array[QRCodeSegment]): QRCode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any]).asInstanceOf[QRCode]
inline def create(text: js.Array[QRCodeSegment], options: QRCodeOptions): QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QRCode]

inline def toBuffer(text: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
inline def toBuffer(
  text: String,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* buffer */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toBuffer(text: String, options: QRCodeToBufferOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
inline def toBuffer(
  text: String,
  options: QRCodeToBufferOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* buffer */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toBuffer(text: js.Array[QRCodeSegment]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
inline def toBuffer(
  text: js.Array[QRCodeSegment],
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* buffer */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toBuffer(text: js.Array[QRCodeSegment], options: QRCodeToBufferOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
inline def toBuffer(
  text: js.Array[QRCodeSegment],
  options: QRCodeToBufferOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* buffer */ Buffer, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toCanvas(canvasElement: HTMLCanvasElement, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvasElement: HTMLCanvasElement,
  text: String,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvasElement: HTMLCanvasElement,
  text: String,
  options: QRCodeRenderersOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvasElement: HTMLCanvasElement,
  text: js.Array[QRCodeSegment],
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvasElement: HTMLCanvasElement,
  text: js.Array[QRCodeSegment],
  options: QRCodeRenderersOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvas: Any, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(canvas: Any, text: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvas: Any, text: String, options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvas: Any,
  text: String,
  options: QRCodeRenderersOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvas: Any, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvas: Any,
  text: js.Array[QRCodeSegment],
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(canvas: Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toCanvas(
  canvas: Any,
  text: js.Array[QRCodeSegment],
  options: QRCodeRenderersOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(text: String): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
inline def toCanvas(
  text: String,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(text: String, options: QRCodeRenderersOptions): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
inline def toCanvas(
  text: String,
  options: QRCodeRenderersOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(text: js.Array[QRCodeSegment]): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
inline def toCanvas(
  text: js.Array[QRCodeSegment],
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toCanvas(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
inline def toCanvas(
  text: js.Array[QRCodeSegment],
  options: QRCodeRenderersOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* canvas */ HTMLCanvasElement, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toDataURL(canvasElement: HTMLCanvasElement, text: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  canvasElement: HTMLCanvasElement,
  text: String,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  canvasElement: HTMLCanvasElement,
  text: String,
  options: QRCodeToDataURLOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  canvasElement: HTMLCanvasElement,
  text: js.Array[QRCodeSegment],
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  canvasElement: HTMLCanvasElement,
  text: js.Array[QRCodeSegment],
  options: QRCodeToDataURLOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  text: String,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  text: String,
  options: QRCodeToDataURLOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  text: js.Array[QRCodeSegment],
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toDataURL(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toDataURL(
  text: js.Array[QRCodeSegment],
  options: QRCodeToDataURLOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* url */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toFile(path: String, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFile(path: String, text: String, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFile(path: String, text: String, options: QRCodeToFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFile(
  path: String,
  text: String,
  options: QRCodeToFileOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFile(path: String, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFile(
  path: String,
  text: js.Array[QRCodeSegment],
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFile(path: String, text: js.Array[QRCodeSegment], options: QRCodeToFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFile(
  path: String,
  text: js.Array[QRCodeSegment],
  options: QRCodeToFileOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toFileStream(stream: Writable, text: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFileStream(
  stream: Writable,
  text: String,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFileStream(stream: Writable, text: String, options: QRCodeToFileStreamOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFileStream(
  stream: Writable,
  text: String,
  options: QRCodeToFileStreamOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFileStream(stream: Writable, text: js.Array[QRCodeSegment]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFileStream(
  stream: Writable,
  text: js.Array[QRCodeSegment],
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], options: QRCodeToFileStreamOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def toFileStream(
  stream: Writable,
  text: js.Array[QRCodeSegment],
  options: QRCodeToFileStreamOptions,
  callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toString_(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def toString_(
  text: String,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toString_(text: String, options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toString_(
  text: String,
  options: QRCodeToStringOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toString_(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def toString_(
  text: js.Array[QRCodeSegment],
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def toString_(text: js.Array[QRCodeSegment], options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def toString_(
  text: js.Array[QRCodeSegment],
  options: QRCodeToStringOptions,
  callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* string */ String, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

type QRCodeBufferType = png

type QRCodeFileStreamType = png

type QRCodeToSJISFunc = js.Function1[/* codePoint */ String, Double]
