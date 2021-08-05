package typings.qrcode

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.qrcode.anon.Dark
import typings.qrcode.anon.DeflateLevel
import typings.qrcode.anon.Quality
import typings.qrcode.qrcodeStrings.alphanumeric
import typings.qrcode.qrcodeStrings.byte
import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashpng
import typings.qrcode.qrcodeStrings.imageSlashwebp
import typings.qrcode.qrcodeStrings.kanji
import typings.qrcode.qrcodeStrings.numeric
import typings.qrcode.qrcodeStrings.png
import typings.qrcode.qrcodeStrings.svg
import typings.qrcode.qrcodeStrings.terminal
import typings.qrcode.qrcodeStrings.utf8
import typings.std.Error
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qrcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(text: String, options: QRCodeOptions): QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QRCode]
  inline def create(text: js.Array[QRCodeSegment], options: QRCodeOptions): QRCode = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QRCode]
  
  inline def toBuffer(text: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def toBuffer(text: String, callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toBuffer(text: String, options: QRCodeToBufferOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def toBuffer(
    text: String,
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toBuffer(text: js.Array[QRCodeSegment]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def toBuffer(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toBuffer(text: js.Array[QRCodeSegment], options: QRCodeToBufferOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def toBuffer(
    text: js.Array[QRCodeSegment],
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toCanvas(canvasElement: HTMLCanvasElement, text: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(canvasElement: HTMLCanvasElement, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvas: js.Any, text: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(canvas: js.Any, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvas: js.Any, text: String, options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    canvas: js.Any,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    canvas: js.Any,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(canvas.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(text: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(text: String, callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(text: String, options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(text: js.Array[QRCodeSegment]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toCanvas(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toCanvas(
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toCanvas")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toDataURL(canvasElement: HTMLCanvasElement, text: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(canvasElement.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def toDataURL(text: String, callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(text: String, options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def toDataURL(text: js.Array[QRCodeSegment], callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toDataURL(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toDataURL(
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toFile(path: String, text: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFile(path: String, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(path: String, text: String, options: QRCodeToFileOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFile(
    path: String,
    text: String,
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(path: String, text: js.Array[QRCodeSegment]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFile(path: String, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(path: String, text: js.Array[QRCodeSegment], options: QRCodeToFileOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFile(
    path: String,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(path.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toFileStream(stream: Writable, text: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFileStream(stream: Writable, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFileStream(stream: Writable, text: String, options: QRCodeToFileStreamOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFileStream(
    stream: Writable,
    text: String,
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFileStream(stream: Writable, text: js.Array[QRCodeSegment]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], options: QRCodeToFileStreamOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def toFileStream(
    stream: Writable,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFileStream")(stream.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toString_(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def toString_(text: String, callback: js.Function2[/* error */ Error, /* string */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toString_(text: String, options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toString_(
    text: String,
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toString_(text: js.Array[QRCodeSegment]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def toString_(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toString_(text: js.Array[QRCodeSegment], options: QRCodeToStringOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def toString_(
    text: js.Array[QRCodeSegment],
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait QRCode extends StObject {
    
    /**
      * Error Correction Level
      */
    var errorCorrectionLevel: Double
    
    /**
      * Calculated Mask pattern
      */
    var maskPattern: js.Any
    
    /**
      * Bitmatrix class with modules data
      */
    var modules: js.Any
    
    /**
      * Generated segments
      */
    var segments: js.Array[QRCodeSegment]
    
    /**
      * Calculated QR Code version
      */
    var version: Double
  }
  object QRCode {
    
    inline def apply(
      errorCorrectionLevel: Double,
      maskPattern: js.Any,
      modules: js.Any,
      segments: js.Array[QRCodeSegment],
      version: Double
    ): QRCode = {
      val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any], maskPattern = maskPattern.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRCode]
    }
    
    extension [Self <: QRCode](x: Self) {
      
      inline def setErrorCorrectionLevel(value: Double): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      inline def setMaskPattern(value: js.Any): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: js.Array[QRCodeSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: QRCodeSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qrcode.qrcodeStrings.low
    - typings.qrcode.qrcodeStrings.medium
    - typings.qrcode.qrcodeStrings.quartile
    - typings.qrcode.qrcodeStrings.high
    - typings.qrcode.qrcodeStrings.L
    - typings.qrcode.qrcodeStrings.M
    - typings.qrcode.qrcodeStrings.Q
    - typings.qrcode.qrcodeStrings.H
  */
  trait QRCodeErrorCorrectionLevel extends StObject
  object QRCodeErrorCorrectionLevel {
    
    inline def H: typings.qrcode.qrcodeStrings.H = "H".asInstanceOf[typings.qrcode.qrcodeStrings.H]
    
    inline def L: typings.qrcode.qrcodeStrings.L = "L".asInstanceOf[typings.qrcode.qrcodeStrings.L]
    
    inline def M: typings.qrcode.qrcodeStrings.M = "M".asInstanceOf[typings.qrcode.qrcodeStrings.M]
    
    inline def Q: typings.qrcode.qrcodeStrings.Q = "Q".asInstanceOf[typings.qrcode.qrcodeStrings.Q]
    
    inline def high: typings.qrcode.qrcodeStrings.high = "high".asInstanceOf[typings.qrcode.qrcodeStrings.high]
    
    inline def low: typings.qrcode.qrcodeStrings.low = "low".asInstanceOf[typings.qrcode.qrcodeStrings.low]
    
    inline def medium: typings.qrcode.qrcodeStrings.medium = "medium".asInstanceOf[typings.qrcode.qrcodeStrings.medium]
    
    inline def quartile: typings.qrcode.qrcodeStrings.quartile = "quartile".asInstanceOf[typings.qrcode.qrcodeStrings.quartile]
  }
  
  trait QRCodeOptions extends StObject {
    
    /**
      * Error correction level.
      * Possible values are low, medium, quartile, high or L, M, Q, H.
      * Default: M
      */
    var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.undefined
    
    /**
      * Helper function used internally to convert a kanji to its Shift JIS value.
      * Provide this function if you need support for Kanji mode.
      */
    var toSJISFunc: js.UndefOr[js.Function1[/* codePoint */ String, Double]] = js.undefined
    
    /**
      * QR Code version. If not specified the more suitable value will be calculated.
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  object QRCodeOptions {
    
    inline def apply(): QRCodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeOptions]
    }
    
    extension [Self <: QRCodeOptions](x: Self) {
      
      inline def setErrorCorrectionLevel(value: QRCodeErrorCorrectionLevel): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      inline def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
      
      inline def setToSJISFunc(value: /* codePoint */ String => Double): Self = StObject.set(x, "toSJISFunc", js.Any.fromFunction1(value))
      
      inline def setToSJISFuncUndefined: Self = StObject.set(x, "toSJISFunc", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait QRCodeRenderersOptions
    extends StObject
       with QRCodeOptions {
    
    var color: js.UndefOr[Dark] = js.undefined
    
    /**
      * Define how much wide the quiet zone should be.
      * Default: 4
      */
    var margin: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale factor. A value of 1 means 1px per modules (black dots).
      * Default: 4
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Forces a specific width for the output image.
      * If width is too small to contain the qr symbol, this option will be ignored.
      * Takes precedence over scale.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object QRCodeRenderersOptions {
    
    inline def apply(): QRCodeRenderersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeRenderersOptions]
    }
    
    extension [Self <: QRCodeRenderersOptions](x: Self) {
      
      inline def setColor(value: Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QRCodeSegment extends StObject {
    
    var data: String
    
    var mode: alphanumeric | numeric | kanji | byte
  }
  object QRCodeSegment {
    
    inline def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRCodeSegment]
    }
    
    extension [Self <: QRCodeSegment](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMode(value: alphanumeric | numeric | kanji | byte): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait QRCodeToBufferOptions
    extends StObject
       with QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
    
    /**
      * Output format. Only png supported for Buffer.
      */
    var `type`: js.UndefOr[png] = js.undefined
  }
  object QRCodeToBufferOptions {
    
    inline def apply(): QRCodeToBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToBufferOptions]
    }
    
    extension [Self <: QRCodeToBufferOptions](x: Self) {
      
      inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      inline def setType(value: png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QRCodeToDataURLOptions
    extends StObject
       with QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[Quality] = js.undefined
    
    /**
      * Data URI format.
      * Default: image/png
      */
    var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.undefined
  }
  object QRCodeToDataURLOptions {
    
    inline def apply(): QRCodeToDataURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToDataURLOptions]
    }
    
    extension [Self <: QRCodeToDataURLOptions](x: Self) {
      
      inline def setRendererOpts(value: Quality): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      inline def setType(value: imageSlashpng | imageSlashjpeg | imageSlashwebp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QRCodeToFileOptions
    extends StObject
       with QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
    
    /**
      * Output format.
      * Default: png
      */
    var `type`: js.UndefOr[png | svg | utf8] = js.undefined
  }
  object QRCodeToFileOptions {
    
    inline def apply(): QRCodeToFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToFileOptions]
    }
    
    extension [Self <: QRCodeToFileOptions](x: Self) {
      
      inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      inline def setType(value: png | svg | utf8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QRCodeToFileStreamOptions
    extends StObject
       with QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
    
    /**
      * Output format. Only png supported for file stream
      */
    var `type`: js.UndefOr[png] = js.undefined
  }
  object QRCodeToFileStreamOptions {
    
    inline def apply(): QRCodeToFileStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToFileStreamOptions]
    }
    
    extension [Self <: QRCodeToFileStreamOptions](x: Self) {
      
      inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      inline def setType(value: png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QRCodeToStringOptions
    extends StObject
       with QRCodeRenderersOptions {
    
    /**
      * Output format.
      * Default: utf8
      */
    var `type`: js.UndefOr[utf8 | svg | terminal] = js.undefined
  }
  object QRCodeToStringOptions {
    
    inline def apply(): QRCodeToStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToStringOptions]
    }
    
    extension [Self <: QRCodeToStringOptions](x: Self) {
      
      inline def setType(value: utf8 | svg | terminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
