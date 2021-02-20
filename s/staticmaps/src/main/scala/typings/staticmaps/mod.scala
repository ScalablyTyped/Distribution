package typings.staticmaps

import typings.node.Buffer
import typings.sharp.mod.JpegOptions
import typings.sharp.mod.OutputOptions
import typings.sharp.mod.PngOptions
import typings.sharp.mod.WebpOptions
import typings.staticmaps.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("staticmaps", JSImport.Default)
  @js.native
  class default protected () extends StaticMaps {
    def this(options: StaticMapsOptions) = this()
  }
  
  @js.native
  trait AddLineOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var coords: js.Array[js.Tuple2[Double, Double]] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object AddLineOptions {
    
    @scala.inline
    def apply(coords: js.Array[js.Tuple2[Double, Double]]): AddLineOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddLineOptions]
    }
    
    @scala.inline
    implicit class AddLineOptionsMutableBuilder[Self <: AddLineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCoords(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "coords", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AddMarkerOptions extends StObject {
    
    var coord: js.Tuple2[Double, Double] = js.native
    
    var height: Double = js.native
    
    var img: String = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var width: Double = js.native
  }
  object AddMarkerOptions {
    
    @scala.inline
    def apply(coord: js.Tuple2[Double, Double], height: Double, img: String, width: Double): AddMarkerOptions = {
      val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMarkerOptions]
    }
    
    @scala.inline
    implicit class AddMarkerOptionsMutableBuilder[Self <: AddMarkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoord(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AddMultiPolygonOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var coords: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object AddMultiPolygonOptions {
    
    @scala.inline
    def apply(coords: js.Array[js.Array[js.Tuple2[Double, Double]]]): AddMultiPolygonOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMultiPolygonOptions]
    }
    
    @scala.inline
    implicit class AddMultiPolygonOptionsMutableBuilder[Self <: AddMultiPolygonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCoords(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "coords", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AddPolygonOptions extends AddLineOptions {
    
    var fill: js.UndefOr[String] = js.native
  }
  object AddPolygonOptions {
    
    @scala.inline
    def apply(coords: js.Array[js.Tuple2[Double, Double]]): AddPolygonOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPolygonOptions]
    }
    
    @scala.inline
    implicit class AddPolygonOptionsMutableBuilder[Self <: AddPolygonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
  
  @js.native
  trait AddTextOptions extends StObject {
    
    /**
      * Anchor of the text
      * @default 'start'
      */
    var anchor: js.UndefOr[TextAnchor] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var coord: js.Tuple2[Double, Double] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var text: String = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object AddTextOptions {
    
    @scala.inline
    def apply(coord: js.Tuple2[Double, Double], text: String): AddTextOptions = {
      val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTextOptions]
    }
    
    @scala.inline
    implicit class AddTextOptionsMutableBuilder[Self <: AddTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: TextAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCoord(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait StaticMaps extends StObject {
    
    def addLine(options: AddLineOptions): Unit = js.native
    
    def addMarker(options: AddMarkerOptions): Unit = js.native
    
    def addMultiPolygon(options: AddMultiPolygonOptions): Unit = js.native
    
    def addPolygon(options: AddPolygonOptions): Unit = js.native
    
    def addText(options: AddTextOptions): Unit = js.native
    
    var image: StaticMapsImage = js.native
    
    def render(): js.Promise[Unit] = js.native
    def render(center: js.UndefOr[scala.Nothing], zoom: Double): js.Promise[Unit] = js.native
    def render(center: js.Array[Double]): js.Promise[Unit] = js.native
    def render(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait StaticMapsImage extends StObject {
    
    def buffer(): js.Promise[Buffer] = js.native
    def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: JpegOptions): js.Promise[Buffer] = js.native
    def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: OutputOptions): js.Promise[Buffer] = js.native
    def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: PngOptions): js.Promise[Buffer] = js.native
    def buffer(mime: js.UndefOr[scala.Nothing], outputOptions: WebpOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: JpegOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: OutputOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: PngOptions): js.Promise[Buffer] = js.native
    def buffer(mime: String, outputOptions: WebpOptions): js.Promise[Buffer] = js.native
    
    var image: Buffer = js.native
    
    def save(): js.Promise[Unit] = js.native
    def save(fileName: js.UndefOr[scala.Nothing], outputOptions: JpegOptions): js.Promise[Unit] = js.native
    def save(fileName: js.UndefOr[scala.Nothing], outputOptions: OutputOptions): js.Promise[Unit] = js.native
    def save(fileName: js.UndefOr[scala.Nothing], outputOptions: PngOptions): js.Promise[Unit] = js.native
    def save(fileName: js.UndefOr[scala.Nothing], outputOptions: WebpOptions): js.Promise[Unit] = js.native
    def save(fileName: String): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: JpegOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: OutputOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: PngOptions): js.Promise[Unit] = js.native
    def save(fileName: String, outputOptions: WebpOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait StaticMapsOptions extends StObject {
    
    var height: Double = js.native
    
    /** @deprecated Use zoomRange.max instead: */
    var maxZoom: js.UndefOr[Double] = js.native
    
    var paddingX: js.UndefOr[Double] = js.native
    
    var paddingY: js.UndefOr[Double] = js.native
    
    var reverseY: js.UndefOr[Boolean] = js.native
    
    /**
      * Subdomains of tile server
      * @default []
      */
    var subdomains: js.UndefOr[js.Array[String]] = js.native
    
    var tileRequestHeader: js.UndefOr[js.Object] = js.native
    
    /**
      * Limit concurrent connections to the tiles server
      * @default 2
      */
    var tileRequestLimit: js.UndefOr[Double] = js.native
    
    var tileRequestTimeout: js.UndefOr[Double] = js.native
    
    var tileSize: js.UndefOr[Double] = js.native
    
    var tileUrl: js.UndefOr[String] = js.native
    
    var width: Double = js.native
    
    /**
      * Defines the range of zoom levels to try
      */
    var zoomRange: js.UndefOr[Max] = js.native
  }
  object StaticMapsOptions {
    
    @scala.inline
    def apply(height: Double, width: Double): StaticMapsOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticMapsOptions]
    }
    
    @scala.inline
    implicit class StaticMapsOptionsMutableBuilder[Self <: StaticMapsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setReverseY(value: Boolean): Self = StObject.set(x, "reverseY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseYUndefined: Self = StObject.set(x, "reverseY", js.undefined)
      
      @scala.inline
      def setSubdomains(value: js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      @scala.inline
      def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value :_*))
      
      @scala.inline
      def setTileRequestHeader(value: js.Object): Self = StObject.set(x, "tileRequestHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileRequestHeaderUndefined: Self = StObject.set(x, "tileRequestHeader", js.undefined)
      
      @scala.inline
      def setTileRequestLimit(value: Double): Self = StObject.set(x, "tileRequestLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileRequestLimitUndefined: Self = StObject.set(x, "tileRequestLimit", js.undefined)
      
      @scala.inline
      def setTileRequestTimeout(value: Double): Self = StObject.set(x, "tileRequestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileRequestTimeoutUndefined: Self = StObject.set(x, "tileRequestTimeout", js.undefined)
      
      @scala.inline
      def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      @scala.inline
      def setTileUrl(value: String): Self = StObject.set(x, "tileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileUrlUndefined: Self = StObject.set(x, "tileUrl", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomRange(value: Max): Self = StObject.set(x, "zoomRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomRangeUndefined: Self = StObject.set(x, "zoomRange", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.staticmaps.staticmapsStrings.start
    - typings.staticmaps.staticmapsStrings.middle
    - typings.staticmaps.staticmapsStrings.end
  */
  trait TextAnchor extends StObject
  object TextAnchor {
    
    @scala.inline
    def end: typings.staticmaps.staticmapsStrings.end = "end".asInstanceOf[typings.staticmaps.staticmapsStrings.end]
    
    @scala.inline
    def middle: typings.staticmaps.staticmapsStrings.middle = "middle".asInstanceOf[typings.staticmaps.staticmapsStrings.middle]
    
    @scala.inline
    def start: typings.staticmaps.staticmapsStrings.start = "start".asInstanceOf[typings.staticmaps.staticmapsStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.staticmaps.staticmapsNumbers.`1`
    - typings.staticmaps.staticmapsNumbers.`2`
    - typings.staticmaps.staticmapsNumbers.`3`
    - typings.staticmaps.staticmapsNumbers.`4`
    - typings.staticmaps.staticmapsNumbers.`5`
    - typings.staticmaps.staticmapsNumbers.`6`
    - typings.staticmaps.staticmapsNumbers.`7`
    - typings.staticmaps.staticmapsNumbers.`8`
    - typings.staticmaps.staticmapsNumbers.`9`
    - typings.staticmaps.staticmapsNumbers.`10`
    - typings.staticmaps.staticmapsNumbers.`11`
    - typings.staticmaps.staticmapsNumbers.`12`
    - typings.staticmaps.staticmapsNumbers.`13`
    - typings.staticmaps.staticmapsNumbers.`14`
    - typings.staticmaps.staticmapsNumbers.`15`
    - typings.staticmaps.staticmapsNumbers.`16`
    - typings.staticmaps.staticmapsNumbers.`17`
    - typings.staticmaps.staticmapsNumbers.`18`
    - typings.staticmaps.staticmapsNumbers.`19`
    - typings.staticmaps.staticmapsNumbers.`20`
    - typings.staticmaps.staticmapsNumbers.`21`
    - typings.staticmaps.staticmapsNumbers.`22`
    - typings.staticmaps.staticmapsNumbers.`23`
  */
  trait ZoomLevel extends StObject
  object ZoomLevel {
    
    @scala.inline
    def `1`: typings.staticmaps.staticmapsNumbers.`1` = 1.asInstanceOf[typings.staticmaps.staticmapsNumbers.`1`]
    
    @scala.inline
    def `10`: typings.staticmaps.staticmapsNumbers.`10` = 10.asInstanceOf[typings.staticmaps.staticmapsNumbers.`10`]
    
    @scala.inline
    def `11`: typings.staticmaps.staticmapsNumbers.`11` = 11.asInstanceOf[typings.staticmaps.staticmapsNumbers.`11`]
    
    @scala.inline
    def `12`: typings.staticmaps.staticmapsNumbers.`12` = 12.asInstanceOf[typings.staticmaps.staticmapsNumbers.`12`]
    
    @scala.inline
    def `13`: typings.staticmaps.staticmapsNumbers.`13` = 13.asInstanceOf[typings.staticmaps.staticmapsNumbers.`13`]
    
    @scala.inline
    def `14`: typings.staticmaps.staticmapsNumbers.`14` = 14.asInstanceOf[typings.staticmaps.staticmapsNumbers.`14`]
    
    @scala.inline
    def `15`: typings.staticmaps.staticmapsNumbers.`15` = 15.asInstanceOf[typings.staticmaps.staticmapsNumbers.`15`]
    
    @scala.inline
    def `16`: typings.staticmaps.staticmapsNumbers.`16` = 16.asInstanceOf[typings.staticmaps.staticmapsNumbers.`16`]
    
    @scala.inline
    def `17`: typings.staticmaps.staticmapsNumbers.`17` = 17.asInstanceOf[typings.staticmaps.staticmapsNumbers.`17`]
    
    @scala.inline
    def `18`: typings.staticmaps.staticmapsNumbers.`18` = 18.asInstanceOf[typings.staticmaps.staticmapsNumbers.`18`]
    
    @scala.inline
    def `19`: typings.staticmaps.staticmapsNumbers.`19` = 19.asInstanceOf[typings.staticmaps.staticmapsNumbers.`19`]
    
    @scala.inline
    def `2`: typings.staticmaps.staticmapsNumbers.`2` = 2.asInstanceOf[typings.staticmaps.staticmapsNumbers.`2`]
    
    @scala.inline
    def `20`: typings.staticmaps.staticmapsNumbers.`20` = 20.asInstanceOf[typings.staticmaps.staticmapsNumbers.`20`]
    
    @scala.inline
    def `21`: typings.staticmaps.staticmapsNumbers.`21` = 21.asInstanceOf[typings.staticmaps.staticmapsNumbers.`21`]
    
    @scala.inline
    def `22`: typings.staticmaps.staticmapsNumbers.`22` = 22.asInstanceOf[typings.staticmaps.staticmapsNumbers.`22`]
    
    @scala.inline
    def `23`: typings.staticmaps.staticmapsNumbers.`23` = 23.asInstanceOf[typings.staticmaps.staticmapsNumbers.`23`]
    
    @scala.inline
    def `3`: typings.staticmaps.staticmapsNumbers.`3` = 3.asInstanceOf[typings.staticmaps.staticmapsNumbers.`3`]
    
    @scala.inline
    def `4`: typings.staticmaps.staticmapsNumbers.`4` = 4.asInstanceOf[typings.staticmaps.staticmapsNumbers.`4`]
    
    @scala.inline
    def `5`: typings.staticmaps.staticmapsNumbers.`5` = 5.asInstanceOf[typings.staticmaps.staticmapsNumbers.`5`]
    
    @scala.inline
    def `6`: typings.staticmaps.staticmapsNumbers.`6` = 6.asInstanceOf[typings.staticmaps.staticmapsNumbers.`6`]
    
    @scala.inline
    def `7`: typings.staticmaps.staticmapsNumbers.`7` = 7.asInstanceOf[typings.staticmaps.staticmapsNumbers.`7`]
    
    @scala.inline
    def `8`: typings.staticmaps.staticmapsNumbers.`8` = 8.asInstanceOf[typings.staticmaps.staticmapsNumbers.`8`]
    
    @scala.inline
    def `9`: typings.staticmaps.staticmapsNumbers.`9` = 9.asInstanceOf[typings.staticmaps.staticmapsNumbers.`9`]
  }
}
