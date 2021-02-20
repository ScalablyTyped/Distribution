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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qrcode", "create")
  @js.native
  def create(text: String, options: QRCodeOptions): QRCode = js.native
  @JSImport("qrcode", "create")
  @js.native
  def create(text: js.Array[QRCodeSegment], options: QRCodeOptions): QRCode = js.native
  
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(text: String): js.Promise[Buffer] = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(text: String, callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]): Unit = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(text: String, options: QRCodeToBufferOptions): js.Promise[Buffer] = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(
    text: String,
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(text: js.Array[QRCodeSegment]): js.Promise[Buffer] = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(text: js.Array[QRCodeSegment], options: QRCodeToBufferOptions): js.Promise[Buffer] = js.native
  @JSImport("qrcode", "toBuffer")
  @js.native
  def toBuffer(
    text: js.Array[QRCodeSegment],
    options: QRCodeToBufferOptions,
    callback: js.Function2[/* error */ Error, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: String): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    canvas: js.Any,
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(canvas: js.Any, text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    canvas: js.Any,
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(text: String): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(text: String, callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(text: String, options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    text: String,
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(text: js.Array[QRCodeSegment], options: QRCodeRenderersOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toCanvas")
  @js.native
  def toCanvas(
    text: js.Array[QRCodeSegment],
    options: QRCodeRenderersOptions,
    callback: js.Function2[/* error */ Error, /* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: String): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: String, options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment]): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(canvasElement: HTMLCanvasElement, text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    canvasElement: HTMLCanvasElement,
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: String): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: String, callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: String, options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    text: String,
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: js.Array[QRCodeSegment]): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: js.Array[QRCodeSegment], callback: js.Function2[/* error */ Error, /* url */ String, Unit]): Unit = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(text: js.Array[QRCodeSegment], options: QRCodeToDataURLOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toDataURL")
  @js.native
  def toDataURL(
    text: js.Array[QRCodeSegment],
    options: QRCodeToDataURLOptions,
    callback: js.Function2[/* error */ Error, /* url */ String, Unit]
  ): Unit = js.native
  
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: String): js.Promise[_] = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: String, options: QRCodeToFileOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(
    path: String,
    text: String,
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(path: String, text: js.Array[QRCodeSegment], options: QRCodeToFileOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toFile")
  @js.native
  def toFile(
    path: String,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: String): js.Promise[_] = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: String, options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(
    stream: Writable,
    text: String,
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment]): js.Promise[_] = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(stream: Writable, text: js.Array[QRCodeSegment], options: QRCodeToFileStreamOptions): js.Promise[_] = js.native
  @JSImport("qrcode", "toFileStream")
  @js.native
  def toFileStream(
    stream: Writable,
    text: js.Array[QRCodeSegment],
    options: QRCodeToFileStreamOptions,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(text: String): js.Promise[String] = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(text: String, callback: js.Function2[/* error */ Error, /* string */ String, Unit]): Unit = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(text: String, options: QRCodeToStringOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(
    text: String,
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(text: js.Array[QRCodeSegment]): js.Promise[String] = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(
    text: js.Array[QRCodeSegment],
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(text: js.Array[QRCodeSegment], options: QRCodeToStringOptions): js.Promise[String] = js.native
  @JSImport("qrcode", "toString")
  @js.native
  def toString_(
    text: js.Array[QRCodeSegment],
    options: QRCodeToStringOptions,
    callback: js.Function2[/* error */ Error, /* string */ String, Unit]
  ): Unit = js.native
  
  @js.native
  trait QRCode extends StObject {
    
    /**
      * Error Correction Level
      */
    var errorCorrectionLevel: Double = js.native
    
    /**
      * Calculated Mask pattern
      */
    var maskPattern: js.Any = js.native
    
    /**
      * Bitmatrix class with modules data
      */
    var modules: js.Any = js.native
    
    /**
      * Generated segments
      */
    var segments: js.Array[QRCodeSegment] = js.native
    
    /**
      * Calculated QR Code version
      */
    var version: Double = js.native
  }
  object QRCode {
    
    @scala.inline
    def apply(
      errorCorrectionLevel: Double,
      maskPattern: js.Any,
      modules: js.Any,
      segments: js.Array[QRCodeSegment],
      version: Double
    ): QRCode = {
      val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any], maskPattern = maskPattern.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRCode]
    }
    
    @scala.inline
    implicit class QRCodeMutableBuilder[Self <: QRCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCorrectionLevel(value: Double): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskPattern(value: js.Any): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModules(value: js.Any): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[QRCodeSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: QRCodeSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def H: typings.qrcode.qrcodeStrings.H = "H".asInstanceOf[typings.qrcode.qrcodeStrings.H]
    
    @scala.inline
    def L: typings.qrcode.qrcodeStrings.L = "L".asInstanceOf[typings.qrcode.qrcodeStrings.L]
    
    @scala.inline
    def M: typings.qrcode.qrcodeStrings.M = "M".asInstanceOf[typings.qrcode.qrcodeStrings.M]
    
    @scala.inline
    def Q: typings.qrcode.qrcodeStrings.Q = "Q".asInstanceOf[typings.qrcode.qrcodeStrings.Q]
    
    @scala.inline
    def high: typings.qrcode.qrcodeStrings.high = "high".asInstanceOf[typings.qrcode.qrcodeStrings.high]
    
    @scala.inline
    def low: typings.qrcode.qrcodeStrings.low = "low".asInstanceOf[typings.qrcode.qrcodeStrings.low]
    
    @scala.inline
    def medium: typings.qrcode.qrcodeStrings.medium = "medium".asInstanceOf[typings.qrcode.qrcodeStrings.medium]
    
    @scala.inline
    def quartile: typings.qrcode.qrcodeStrings.quartile = "quartile".asInstanceOf[typings.qrcode.qrcodeStrings.quartile]
  }
  
  @js.native
  trait QRCodeOptions extends StObject {
    
    /**
      * Error correction level.
      * Possible values are low, medium, quartile, high or L, M, Q, H.
      * Default: M
      */
    var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.native
    
    /**
      * Helper function used internally to convert a kanji to its Shift JIS value.
      * Provide this function if you need support for Kanji mode.
      */
    var toSJISFunc: js.UndefOr[js.Function1[/* codePoint */ String, Double]] = js.native
    
    /**
      * QR Code version. If not specified the more suitable value will be calculated.
      */
    var version: js.UndefOr[Double] = js.native
  }
  object QRCodeOptions {
    
    @scala.inline
    def apply(): QRCodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeOptions]
    }
    
    @scala.inline
    implicit class QRCodeOptionsMutableBuilder[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCorrectionLevel(value: QRCodeErrorCorrectionLevel): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
      
      @scala.inline
      def setToSJISFunc(value: /* codePoint */ String => Double): Self = StObject.set(x, "toSJISFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToSJISFuncUndefined: Self = StObject.set(x, "toSJISFunc", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeRenderersOptions extends QRCodeOptions {
    
    var color: js.UndefOr[Dark] = js.native
    
    /**
      * Define how much wide the quiet zone should be.
      * Default: 4
      */
    var margin: js.UndefOr[Double] = js.native
    
    /**
      * Scale factor. A value of 1 means 1px per modules (black dots).
      * Default: 4
      */
    var scale: js.UndefOr[Double] = js.native
    
    /**
      * Forces a specific width for the output image.
      * If width is too small to contain the qr symbol, this option will be ignored.
      * Takes precedence over scale.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object QRCodeRenderersOptions {
    
    @scala.inline
    def apply(): QRCodeRenderersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeRenderersOptions]
    }
    
    @scala.inline
    implicit class QRCodeRenderersOptionsMutableBuilder[Self <: QRCodeRenderersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeSegment extends StObject {
    
    var data: String = js.native
    
    var mode: alphanumeric | numeric | kanji | byte = js.native
  }
  object QRCodeSegment {
    
    @scala.inline
    def apply(data: String, mode: alphanumeric | numeric | kanji | byte): QRCodeSegment = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRCodeSegment]
    }
    
    @scala.inline
    implicit class QRCodeSegmentMutableBuilder[Self <: QRCodeSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: alphanumeric | numeric | kanji | byte): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QRCodeToBufferOptions extends QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.native
    
    /**
      * Output format. Only png supported for Buffer.
      */
    var `type`: js.UndefOr[png] = js.native
  }
  object QRCodeToBufferOptions {
    
    @scala.inline
    def apply(): QRCodeToBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToBufferOptions]
    }
    
    @scala.inline
    implicit class QRCodeToBufferOptionsMutableBuilder[Self <: QRCodeToBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      @scala.inline
      def setType(value: png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[Quality] = js.native
    
    /**
      * Data URI format.
      * Default: image/png
      */
    var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.native
  }
  object QRCodeToDataURLOptions {
    
    @scala.inline
    def apply(): QRCodeToDataURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToDataURLOptions]
    }
    
    @scala.inline
    implicit class QRCodeToDataURLOptionsMutableBuilder[Self <: QRCodeToDataURLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRendererOpts(value: Quality): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      @scala.inline
      def setType(value: imageSlashpng | imageSlashjpeg | imageSlashwebp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeToFileOptions extends QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.native
    
    /**
      * Output format.
      * Default: png
      */
    var `type`: js.UndefOr[png | svg | utf8] = js.native
  }
  object QRCodeToFileOptions {
    
    @scala.inline
    def apply(): QRCodeToFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToFileOptions]
    }
    
    @scala.inline
    implicit class QRCodeToFileOptionsMutableBuilder[Self <: QRCodeToFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      @scala.inline
      def setType(value: png | svg | utf8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeToFileStreamOptions extends QRCodeRenderersOptions {
    
    var rendererOpts: js.UndefOr[DeflateLevel] = js.native
    
    /**
      * Output format. Only png supported for file stream
      */
    var `type`: js.UndefOr[png] = js.native
  }
  object QRCodeToFileStreamOptions {
    
    @scala.inline
    def apply(): QRCodeToFileStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToFileStreamOptions]
    }
    
    @scala.inline
    implicit class QRCodeToFileStreamOptionsMutableBuilder[Self <: QRCodeToFileStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
      
      @scala.inline
      def setType(value: png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeToStringOptions extends QRCodeRenderersOptions {
    
    /**
      * Output format.
      * Default: utf8
      */
    var `type`: js.UndefOr[utf8 | svg | terminal] = js.native
  }
  object QRCodeToStringOptions {
    
    @scala.inline
    def apply(): QRCodeToStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeToStringOptions]
    }
    
    @scala.inline
    implicit class QRCodeToStringOptionsMutableBuilder[Self <: QRCodeToStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: utf8 | svg | terminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
