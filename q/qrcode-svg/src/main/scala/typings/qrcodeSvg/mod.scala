package typings.qrcodeSvg

import typings.qrcodeSvg.anon.Container
import typings.qrcodeSvg.anon.Data
import typings.qrcodeSvg.qrcodeSvgStrings.H
import typings.qrcodeSvg.qrcodeSvgStrings.L
import typings.qrcodeSvg.qrcodeSvgStrings.M
import typings.qrcodeSvg.qrcodeSvgStrings.Q
import typings.qrcodeSvg.qrcodeSvgStrings.`svg-viewbox`
import typings.qrcodeSvg.qrcodeSvgStrings.g
import typings.qrcodeSvg.qrcodeSvgStrings.none
import typings.qrcodeSvg.qrcodeSvgStrings.svg
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qrcode-svg", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with QRCode {
    /**
      * Create a QRCode with the default options and the passed content.
      * @param content The content to encode in the QRCode.
      */
    def this(content: String) = this()
    /**
      * Create a QRCode by specifying its options. Any values not passed in the
      *   options object will be inferred as the defaults.
      * @param options The options with which to create the QRCode.
      */
    // tslint:disable-next-line:unified-signatures
    def this(options: Options) = this()
  }
  
  trait Model extends StObject {
    
    /**
      * Queue data up to be added to this QRCode. `make` needs to be called
      *   to actually generate the QRCode from the data.
      * @param data The data to queue up in this QRCode.
      */
    def addData(data: String): Unit
    
    /** The cache used to store data during the creation of this QRCode. */
    var dataCache: js.Array[Double] | Null
    
    /** A list of the data added to this QRCode. */
    var dataList: js.Array[Data]
    
    /** The numerical error correction level for this QRCode. */
    var errorCorrectLevel: Double
    
    /** Returns the length/width of this QRCode's matrix. */
    def getModuleCount(): Double
    
    /**
      * Whether a given coordinate is filled in in this QRCode's matrix.
      * @param  row The row to check.
      * @param  col The column to check.
      * @return True if the coordinate is filled in, false otherwise.
      */
    def isDark(row: Double, col: Double): Boolean
    
    /** Generate this QRCode's matrix from the queued data. */
    def make(): Unit
    
    /** The width/length of this QRCode's modules matrix. */
    var moduleCount: Double
    
    /**
      * This QRCode's data matrix. A square, two-dimensional boolean array
      * of `moduleCount` x `moduleCount` size. True in a given slot means
      * that spot is filled in in the QRCode visualization.
      */
    var modules: js.Array[js.Array[Boolean]]
    
    /** The calculated type number for this QRCode. */
    var typeNumber: Double
  }
  object Model {
    
    inline def apply(
      addData: String => Unit,
      dataList: js.Array[Data],
      errorCorrectLevel: Double,
      getModuleCount: () => Double,
      isDark: (Double, Double) => Boolean,
      make: () => Unit,
      moduleCount: Double,
      modules: js.Array[js.Array[Boolean]],
      typeNumber: Double
    ): Model = {
      val __obj = js.Dynamic.literal(addData = js.Any.fromFunction1(addData), dataList = dataList.asInstanceOf[js.Any], errorCorrectLevel = errorCorrectLevel.asInstanceOf[js.Any], getModuleCount = js.Any.fromFunction0(getModuleCount), isDark = js.Any.fromFunction2(isDark), make = js.Any.fromFunction0(make), moduleCount = moduleCount.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], typeNumber = typeNumber.asInstanceOf[js.Any], dataCache = null)
      __obj.asInstanceOf[Model]
    }
    
    extension [Self <: Model](x: Self) {
      
      inline def setAddData(value: String => Unit): Self = StObject.set(x, "addData", js.Any.fromFunction1(value))
      
      inline def setDataCache(value: js.Array[Double]): Self = StObject.set(x, "dataCache", value.asInstanceOf[js.Any])
      
      inline def setDataCacheNull: Self = StObject.set(x, "dataCache", null)
      
      inline def setDataCacheVarargs(value: Double*): Self = StObject.set(x, "dataCache", js.Array(value :_*))
      
      inline def setDataList(value: js.Array[Data]): Self = StObject.set(x, "dataList", value.asInstanceOf[js.Any])
      
      inline def setDataListVarargs(value: Data*): Self = StObject.set(x, "dataList", js.Array(value :_*))
      
      inline def setErrorCorrectLevel(value: Double): Self = StObject.set(x, "errorCorrectLevel", value.asInstanceOf[js.Any])
      
      inline def setGetModuleCount(value: () => Double): Self = StObject.set(x, "getModuleCount", js.Any.fromFunction0(value))
      
      inline def setIsDark(value: (Double, Double) => Boolean): Self = StObject.set(x, "isDark", js.Any.fromFunction2(value))
      
      inline def setMake(value: () => Unit): Self = StObject.set(x, "make", js.Any.fromFunction0(value))
      
      inline def setModuleCount(value: Double): Self = StObject.set(x, "moduleCount", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Array[js.Array[Boolean]]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: js.Array[Boolean]*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      inline def setTypeNumber(value: Double): Self = StObject.set(x, "typeNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Color of background, color name or hex string. Default is `#fffff`. */
    var background: js.UndefOr[String] = js.undefined
    
    /** Color of modules (squares), color name or hex string. Default is `#000000`. */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Wrapping element. Default is `svg`. \
      * `svg`: Populate squares in a SVG document with `width` and `height` attribute.
      * Recommended for converting to raster images or PDF where QR Code is being static (exact size). \
      * `svg-viewbox`: Populate squares in a SVG document with viewBox attriute.
      * **Recommended** for responsive web pages. \
      * `g`: Put squares in `g` element.
      * Useful when you need to put multiple QR Codes in a single SVG document \
      * `none`: No wrapper.
      */
    var container: js.UndefOr[svg | `svg-viewbox` | g | none] = js.undefined
    
    /** QR Code content, the only **required** parameter. */
    var content: String
    
    /** Error correction level. Default is `"M"`. */
    var ecl: js.UndefOr[L | M | H | Q] = js.undefined
    
    /** QR Code height in pixels. Default is `256`. */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Join modules (squares) into one shape, into the SVG path element, **recommended** for web and responsive use. Default is `false`. */
    var join: js.UndefOr[Boolean] = js.undefined
    
    /** White space padding. `0` for no border. Default is `4`. */
    var padding: js.UndefOr[Double] = js.undefined
    
    /** To create a squares as pattern, then populate the canvas. Default is `false`. */
    var predefined: js.UndefOr[Boolean] = js.undefined
    
    /** Apply indents and new lines. Default is `true`. */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /** Swap X and Y modules, only if you have issues with some QR readers. Default is `false`. */
    var swap: js.UndefOr[Boolean] = js.undefined
    
    /** QR Code width in pixels. Default is `256`. */
    var width: js.UndefOr[Double] = js.undefined
    
    /** Prepend XML declaration to the SVG document, i.e. ```<?xml version="1.0" standalone="yes"?>```. Default is `true`. */
    var xmlDeclaration: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(content: String): Options = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainer(value: svg | `svg-viewbox` | g | none): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEcl(value: L | M | H | Q): Self = StObject.set(x, "ecl", value.asInstanceOf[js.Any])
      
      inline def setEclUndefined: Self = StObject.set(x, "ecl", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJoin(value: Boolean): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPredefined(value: Boolean): Self = StObject.set(x, "predefined", value.asInstanceOf[js.Any])
      
      inline def setPredefinedUndefined: Self = StObject.set(x, "predefined", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSwap(value: Boolean): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      inline def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXmlDeclaration(value: Boolean): Self = StObject.set(x, "xmlDeclaration", value.asInstanceOf[js.Any])
      
      inline def setXmlDeclarationUndefined: Self = StObject.set(x, "xmlDeclaration", js.undefined)
    }
  }
  
  @js.native
  trait QRCode extends StObject {
    
    /** The options that were used to create this QRCode. */
    var options: Options = js.native
    
    /** The raw model of this QRCode. */
    var qrcode: Model = js.native
    
    /**
      * Writes this QRCode to a file. Requires `fs`.
      * @param  file The filename to write to
      * @param  callback The callback that will be called, possibly with an error, when done.
      */
    def save(file: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /**
      * Generates an SVG image of this QRCode
      * @param  opt Set the container. Defaults to `{ container: "svg" }`.
      * @return The svg string.
      */
    def svg(): String = js.native
    def svg(opt: Container): String = js.native
  }
}
