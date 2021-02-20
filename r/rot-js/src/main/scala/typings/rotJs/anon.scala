package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.rectMod.default
import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import typings.rotJs.typesMod.LayoutType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/display/types.DisplayOptions> */
  @js.native
  trait PartialDisplayOptions extends StObject {
    
    var bg: js.UndefOr[String] = js.native
    
    var border: js.UndefOr[Double] = js.native
    
    var fg: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var forceSquareRatio: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var layout: js.UndefOr[LayoutType] = js.native
    
    var spacing: js.UndefOr[Double] = js.native
    
    var tileColorize: js.UndefOr[Boolean] = js.native
    
    var tileHeight: js.UndefOr[Double] = js.native
    
    var tileMap: js.UndefOr[StringDictionary[js.Tuple2[Double, Double]]] = js.native
    
    var tileSet: js.UndefOr[Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap] = js.native
    
    var tileWidth: js.UndefOr[Double] = js.native
    
    var transpose: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object PartialDisplayOptions {
    
    @scala.inline
    def apply(): PartialDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDisplayOptions]
    }
    
    @scala.inline
    implicit class PartialDisplayOptionsMutableBuilder[Self <: PartialDisplayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setForceSquareRatio(value: Boolean): Self = StObject.set(x, "forceSquareRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSquareRatioUndefined: Self = StObject.set(x, "forceSquareRatio", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLayout(value: LayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTileColorize(value: Boolean): Self = StObject.set(x, "tileColorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileColorizeUndefined: Self = StObject.set(x, "tileColorize", js.undefined)
      
      @scala.inline
      def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      @scala.inline
      def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = StObject.set(x, "tileMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileMapUndefined: Self = StObject.set(x, "tileMap", js.undefined)
      
      @scala.inline
      def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSetNull: Self = StObject.set(x, "tileSet", null)
      
      @scala.inline
      def setTileSetUndefined: Self = StObject.set(x, "tileSet", js.undefined)
      
      @scala.inline
      def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      @scala.inline
      def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/path/path.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var topology: js.UndefOr[`4` | `6` | `8`] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/cellular.Options> */
  @js.native
  trait PartialOptionsBorn extends StObject {
    
    var born: js.UndefOr[js.Array[Double]] = js.native
    
    var survive: js.UndefOr[js.Array[Double]] = js.native
    
    var topology: js.UndefOr[`4` | `6` | `8`] = js.native
  }
  object PartialOptionsBorn {
    
    @scala.inline
    def apply(): PartialOptionsBorn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBorn]
    }
    
    @scala.inline
    implicit class PartialOptionsBornMutableBuilder[Self <: PartialOptionsBorn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorn(value: js.Array[Double]): Self = StObject.set(x, "born", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBornUndefined: Self = StObject.set(x, "born", js.undefined)
      
      @scala.inline
      def setBornVarargs(value: Double*): Self = StObject.set(x, "born", js.Array(value :_*))
      
      @scala.inline
      def setSurvive(value: js.Array[Double]): Self = StObject.set(x, "survive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurviveUndefined: Self = StObject.set(x, "survive", js.undefined)
      
      @scala.inline
      def setSurviveVarargs(value: Double*): Self = StObject.set(x, "survive", js.Array(value :_*))
      
      @scala.inline
      def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/rogue.Options> */
  @js.native
  trait PartialOptionsCellHeight extends StObject {
    
    var cellHeight: js.UndefOr[Double] = js.native
    
    var cellWidth: js.UndefOr[Double] = js.native
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object PartialOptionsCellHeight {
    
    @scala.inline
    def apply(): PartialOptionsCellHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsCellHeight]
    }
    
    @scala.inline
    implicit class PartialOptionsCellHeightMutableBuilder[Self <: PartialOptionsCellHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      @scala.inline
      def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/digger.Options> */
  @js.native
  trait PartialOptionsCorridorLength extends StObject {
    
    var corridorLength: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var dugPercentage: js.UndefOr[Double] = js.native
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var timeLimit: js.UndefOr[Double] = js.native
  }
  object PartialOptionsCorridorLength {
    
    @scala.inline
    def apply(): PartialOptionsCorridorLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsCorridorLength]
    }
    
    @scala.inline
    implicit class PartialOptionsCorridorLengthMutableBuilder[Self <: PartialOptionsCorridorLength] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorridorLength(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "corridorLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorridorLengthUndefined: Self = StObject.set(x, "corridorLength", js.undefined)
      
      @scala.inline
      def setDugPercentage(value: Double): Self = StObject.set(x, "dugPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDugPercentageUndefined: Self = StObject.set(x, "dugPercentage", js.undefined)
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
      
      @scala.inline
      def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/lighting.Options> */
  @js.native
  trait PartialOptionsEmissionThreshold extends StObject {
    
    var emissionThreshold: js.UndefOr[Double] = js.native
    
    var passes: js.UndefOr[Double] = js.native
    
    var range: js.UndefOr[Double] = js.native
  }
  object PartialOptionsEmissionThreshold {
    
    @scala.inline
    def apply(): PartialOptionsEmissionThreshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsEmissionThreshold]
    }
    
    @scala.inline
    implicit class PartialOptionsEmissionThresholdMutableBuilder[Self <: PartialOptionsEmissionThreshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmissionThreshold(value: Double): Self = StObject.set(x, "emissionThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmissionThresholdUndefined: Self = StObject.set(x, "emissionThreshold", js.undefined)
      
      @scala.inline
      def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
      
      @scala.inline
      def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/stringgenerator.Options> */
  @js.native
  trait PartialOptionsOrder extends StObject {
    
    var order: js.UndefOr[Double] = js.native
    
    var prior: js.UndefOr[Double] = js.native
    
    var words: js.UndefOr[Boolean] = js.native
  }
  object PartialOptionsOrder {
    
    @scala.inline
    def apply(): PartialOptionsOrder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsOrder]
    }
    
    @scala.inline
    implicit class PartialOptionsOrderMutableBuilder[Self <: PartialOptionsOrder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setPrior(value: Double): Self = StObject.set(x, "prior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorUndefined: Self = StObject.set(x, "prior", js.undefined)
      
      @scala.inline
      def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/uniform.Options> */
  @js.native
  trait PartialOptionsRoomDugPercentage extends StObject {
    
    var roomDugPercentage: js.UndefOr[Double] = js.native
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var timeLimit: js.UndefOr[Double] = js.native
  }
  object PartialOptionsRoomDugPercentage {
    
    @scala.inline
    def apply(): PartialOptionsRoomDugPercentage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsRoomDugPercentage]
    }
    
    @scala.inline
    implicit class PartialOptionsRoomDugPercentageMutableBuilder[Self <: PartialOptionsRoomDugPercentage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomDugPercentage(value: Double): Self = StObject.set(x, "roomDugPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomDugPercentageUndefined: Self = StObject.set(x, "roomDugPercentage", js.undefined)
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
      
      @scala.inline
      def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    }
  }
  
  @js.native
  trait TypeofRect extends Instantiable0[default] {
    
    var cache: Boolean = js.native
  }
  
  @js.native
  trait TypeofTileGL
    extends Instantiable0[typings.rotJs.tileGlMod.default] {
    
    def isSupported(): Boolean = js.native
  }
}
