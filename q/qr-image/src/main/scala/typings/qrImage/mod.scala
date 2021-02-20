package typings.qrImage

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qr-image", "image")
  @js.native
  def image(text: String): ReadableStream = js.native
  @JSImport("qr-image", "image")
  @js.native
  def image(text: String, level: ecLevel): ReadableStream = js.native
  @JSImport("qr-image", "image")
  @js.native
  def image(text: String, options: Options): ReadableStream = js.native
  
  @JSImport("qr-image", "imageSync")
  @js.native
  def imageSync(text: String): String | Buffer = js.native
  @JSImport("qr-image", "imageSync")
  @js.native
  def imageSync(text: String, level: ecLevel): Buffer = js.native
  @JSImport("qr-image", "imageSync")
  @js.native
  def imageSync(text: String, options: Options): String | Buffer = js.native
  @JSImport("qr-image", "imageSync")
  @js.native
  def imageSync_Buffer(text: String): Buffer = js.native
  
  @JSImport("qr-image", "matrix")
  @js.native
  def matrix(text: String): js.Array[js.Array[_]] = js.native
  @JSImport("qr-image", "matrix")
  @js.native
  def matrix(text: String, level: ecLevel): js.Array[js.Array[_]] = js.native
  
  @JSImport("qr-image", "svgObject")
  @js.native
  def svgObject(text: String): js.Any = js.native
  @JSImport("qr-image", "svgObject")
  @js.native
  def svgObject(text: String, level: ecLevel): js.Any = js.native
  @JSImport("qr-image", "svgObject")
  @js.native
  def svgObject(text: String, options: Options): js.Any = js.native
  
  @js.native
  trait Bitmap extends StObject {
    
    /**
      * @summary
      * Buffer with image data. It's a linear representation
      * of image in format:
      *
      * @example
      * <00> <xx> <xx> ..        <xx>
      * <00> <xx> <xx> ..        <xx>
      * ..
      * <00> <xx> <xx> ..        <xx>
      * ^    | size number of bytes |
      * \ do not modify. Must be 00
      *
      * @description
      * Each `<xx>` is a pixel of image.
      * It's value `0` — black, `255` — white, everything between are shades of gray.
      */
    var data: Buffer = js.native
    
    /**
      * width (and height) of resulting image in pixels
      */
    var size: Double = js.native
  }
  object Bitmap {
    
    @scala.inline
    def apply(data: Buffer, size: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    @scala.inline
    implicit class BitmapMutableBuilder[Self <: Bitmap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    // (experimental, default false) try to optimize QR-code for URLs.
    /**
      * (only png) — function to customize qr bitmap before encoding to PNG
      */
    var customize: js.UndefOr[js.Function1[/* bitmap */ Bitmap, Unit]] = js.native
    
    var ec_level: js.UndefOr[ecLevel] = js.native
    
    // (png and svg only) for png and undefined for svg.-(png and svg only) — size of one module in pixels.
    var margin: js.UndefOr[Double] = js.native
    
    // (only png)for png and 1 for others.-white space around QR image in modules.
    var parse_url: js.UndefOr[Boolean] = js.native
    
    // image type. Possible values png(default), svg, pdf and eps.
    var size: js.UndefOr[Double] = js.native
    
    // error correction level. One of L, M, Q, H. Default M.
    var `type`: js.UndefOr[imageType] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomize(value: /* bitmap */ Bitmap => Unit): Self = StObject.set(x, "customize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
      
      @scala.inline
      def setEc_level(value: ecLevel): Self = StObject.set(x, "ec_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc_levelUndefined: Self = StObject.set(x, "ec_level", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setParse_url(value: Boolean): Self = StObject.set(x, "parse_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse_urlUndefined: Self = StObject.set(x, "parse_url", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: imageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qrImage.qrImageStrings.L
    - typings.qrImage.qrImageStrings.M
    - typings.qrImage.qrImageStrings.Q
    - typings.qrImage.qrImageStrings.H
  */
  trait ecLevel extends StObject
  object ecLevel {
    
    @scala.inline
    def H: typings.qrImage.qrImageStrings.H = "H".asInstanceOf[typings.qrImage.qrImageStrings.H]
    
    @scala.inline
    def L: typings.qrImage.qrImageStrings.L = "L".asInstanceOf[typings.qrImage.qrImageStrings.L]
    
    @scala.inline
    def M: typings.qrImage.qrImageStrings.M = "M".asInstanceOf[typings.qrImage.qrImageStrings.M]
    
    @scala.inline
    def Q: typings.qrImage.qrImageStrings.Q = "Q".asInstanceOf[typings.qrImage.qrImageStrings.Q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qrImage.qrImageStrings.png
    - typings.qrImage.qrImageStrings.svg
    - typings.qrImage.qrImageStrings.pdf
    - typings.qrImage.qrImageStrings.eps
  */
  trait imageType extends StObject
  object imageType {
    
    @scala.inline
    def eps: typings.qrImage.qrImageStrings.eps = "eps".asInstanceOf[typings.qrImage.qrImageStrings.eps]
    
    @scala.inline
    def pdf: typings.qrImage.qrImageStrings.pdf = "pdf".asInstanceOf[typings.qrImage.qrImageStrings.pdf]
    
    @scala.inline
    def png: typings.qrImage.qrImageStrings.png = "png".asInstanceOf[typings.qrImage.qrImageStrings.png]
    
    @scala.inline
    def svg: typings.qrImage.qrImageStrings.svg = "svg".asInstanceOf[typings.qrImage.qrImageStrings.svg]
  }
}
