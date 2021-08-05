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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/display/types.DisplayOptions> */
  trait PartialDisplayOptions extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[Double] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var forceSquareRatio: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var layout: js.UndefOr[LayoutType] = js.undefined
    
    var spacing: js.UndefOr[Double] = js.undefined
    
    var tileColorize: js.UndefOr[Boolean] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileMap: js.UndefOr[StringDictionary[js.Tuple2[Double, Double]]] = js.undefined
    
    var tileSet: js.UndefOr[Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var transpose: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PartialDisplayOptions {
    
    inline def apply(): PartialDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDisplayOptions]
    }
    
    extension [Self <: PartialDisplayOptions](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setForceSquareRatio(value: Boolean): Self = StObject.set(x, "forceSquareRatio", value.asInstanceOf[js.Any])
      
      inline def setForceSquareRatioUndefined: Self = StObject.set(x, "forceSquareRatio", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLayout(value: LayoutType): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTileColorize(value: Boolean): Self = StObject.set(x, "tileColorize", value.asInstanceOf[js.Any])
      
      inline def setTileColorizeUndefined: Self = StObject.set(x, "tileColorize", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = StObject.set(x, "tileMap", value.asInstanceOf[js.Any])
      
      inline def setTileMapUndefined: Self = StObject.set(x, "tileMap", js.undefined)
      
      inline def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
      
      inline def setTileSetNull: Self = StObject.set(x, "tileSet", null)
      
      inline def setTileSetUndefined: Self = StObject.set(x, "tileSet", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/path/path.Options> */
  trait PartialOptions extends StObject {
    
    var topology: js.UndefOr[`4` | `6` | `8`] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/cellular.Options> */
  trait PartialOptionsBorn extends StObject {
    
    var born: js.UndefOr[js.Array[Double]] = js.undefined
    
    var survive: js.UndefOr[js.Array[Double]] = js.undefined
    
    var topology: js.UndefOr[`4` | `6` | `8`] = js.undefined
  }
  object PartialOptionsBorn {
    
    inline def apply(): PartialOptionsBorn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsBorn]
    }
    
    extension [Self <: PartialOptionsBorn](x: Self) {
      
      inline def setBorn(value: js.Array[Double]): Self = StObject.set(x, "born", value.asInstanceOf[js.Any])
      
      inline def setBornUndefined: Self = StObject.set(x, "born", js.undefined)
      
      inline def setBornVarargs(value: Double*): Self = StObject.set(x, "born", js.Array(value :_*))
      
      inline def setSurvive(value: js.Array[Double]): Self = StObject.set(x, "survive", value.asInstanceOf[js.Any])
      
      inline def setSurviveUndefined: Self = StObject.set(x, "survive", js.undefined)
      
      inline def setSurviveVarargs(value: Double*): Self = StObject.set(x, "survive", js.Array(value :_*))
      
      inline def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
      
      inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/rogue.Options> */
  trait PartialOptionsCellHeight extends StObject {
    
    var cellHeight: js.UndefOr[Double] = js.undefined
    
    var cellWidth: js.UndefOr[Double] = js.undefined
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object PartialOptionsCellHeight {
    
    inline def apply(): PartialOptionsCellHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsCellHeight]
    }
    
    extension [Self <: PartialOptionsCellHeight](x: Self) {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      inline def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      inline def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      inline def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      inline def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/digger.Options> */
  trait PartialOptionsCorridorLength extends StObject {
    
    var corridorLength: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var dugPercentage: js.UndefOr[Double] = js.undefined
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
  }
  object PartialOptionsCorridorLength {
    
    inline def apply(): PartialOptionsCorridorLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsCorridorLength]
    }
    
    extension [Self <: PartialOptionsCorridorLength](x: Self) {
      
      inline def setCorridorLength(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "corridorLength", value.asInstanceOf[js.Any])
      
      inline def setCorridorLengthUndefined: Self = StObject.set(x, "corridorLength", js.undefined)
      
      inline def setDugPercentage(value: Double): Self = StObject.set(x, "dugPercentage", value.asInstanceOf[js.Any])
      
      inline def setDugPercentageUndefined: Self = StObject.set(x, "dugPercentage", js.undefined)
      
      inline def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      inline def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      inline def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      inline def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/lighting.Options> */
  trait PartialOptionsEmissionThreshold extends StObject {
    
    var emissionThreshold: js.UndefOr[Double] = js.undefined
    
    var passes: js.UndefOr[Double] = js.undefined
    
    var range: js.UndefOr[Double] = js.undefined
  }
  object PartialOptionsEmissionThreshold {
    
    inline def apply(): PartialOptionsEmissionThreshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsEmissionThreshold]
    }
    
    extension [Self <: PartialOptionsEmissionThreshold](x: Self) {
      
      inline def setEmissionThreshold(value: Double): Self = StObject.set(x, "emissionThreshold", value.asInstanceOf[js.Any])
      
      inline def setEmissionThresholdUndefined: Self = StObject.set(x, "emissionThreshold", js.undefined)
      
      inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/stringgenerator.Options> */
  trait PartialOptionsOrder extends StObject {
    
    var order: js.UndefOr[Double] = js.undefined
    
    var prior: js.UndefOr[Double] = js.undefined
    
    var words: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptionsOrder {
    
    inline def apply(): PartialOptionsOrder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsOrder]
    }
    
    extension [Self <: PartialOptionsOrder](x: Self) {
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setPrior(value: Double): Self = StObject.set(x, "prior", value.asInstanceOf[js.Any])
      
      inline def setPriorUndefined: Self = StObject.set(x, "prior", js.undefined)
      
      inline def setWords(value: Boolean): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rot-js.rot-js/lib/map/uniform.Options> */
  trait PartialOptionsRoomDugPercentage extends StObject {
    
    var roomDugPercentage: js.UndefOr[Double] = js.undefined
    
    var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var timeLimit: js.UndefOr[Double] = js.undefined
  }
  object PartialOptionsRoomDugPercentage {
    
    inline def apply(): PartialOptionsRoomDugPercentage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptionsRoomDugPercentage]
    }
    
    extension [Self <: PartialOptionsRoomDugPercentage](x: Self) {
      
      inline def setRoomDugPercentage(value: Double): Self = StObject.set(x, "roomDugPercentage", value.asInstanceOf[js.Any])
      
      inline def setRoomDugPercentageUndefined: Self = StObject.set(x, "roomDugPercentage", js.undefined)
      
      inline def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      inline def setRoomHeightUndefined: Self = StObject.set(x, "roomHeight", js.undefined)
      
      inline def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      inline def setRoomWidthUndefined: Self = StObject.set(x, "roomWidth", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    }
  }
  
  @js.native
  trait TypeofRect
    extends StObject
       with Instantiable0[default] {
    
    var cache: Boolean = js.native
  }
  
  @js.native
  trait TypeofTileGL
    extends StObject
       with Instantiable0[typings.rotJs.tileGlMod.default] {
    
    def isSupported(): Boolean = js.native
  }
}
