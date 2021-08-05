package typings.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialDisplayOptions
import typings.rotJs.anon.TypeofRect
import typings.rotJs.anon.TypeofTileGL
import typings.rotJs.typesMod.DisplayData
import typings.rotJs.typesMod.DisplayOptions
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayMod {
  
  @JSImport("rot-js/lib/display/display", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Display {
    def this(options: PartialDisplayOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rot-js/lib/display/display", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rot-js/lib/display/display", "default.Hex")
    @js.native
    def Hex: Instantiable0[typings.rotJs.hexMod.default] = js.native
    inline def Hex_=(x: Instantiable0[typings.rotJs.hexMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hex")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js/lib/display/display", "default.Rect")
    @js.native
    def Rect: TypeofRect = js.native
    inline def Rect_=(x: TypeofRect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js/lib/display/display", "default.Term")
    @js.native
    def Term: Instantiable0[typings.rotJs.termMod.default] = js.native
    inline def Term_=(x: Instantiable0[typings.rotJs.termMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Term")(x.asInstanceOf[js.Any])
    
    @JSImport("rot-js/lib/display/display", "default.Tile")
    @js.native
    def Tile: Instantiable0[typings.rotJs.tileMod.default] = js.native
    
    @JSImport("rot-js/lib/display/display", "default.TileGL")
    @js.native
    def TileGL: TypeofTileGL = js.native
    inline def TileGL_=(x: TypeofTileGL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TileGL")(x.asInstanceOf[js.Any])
    
    inline def Tile_=(x: Instantiable0[typings.rotJs.tileMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tile")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Display extends StObject {
    
    /**
      * Debug helper, ideal as a map generator callback. Always bound to this.
      * @param {int} x
      * @param {int} y
      * @param {int} what
      */
    def DEBUG(x: Double, y: Double, what: Double): Unit = js.native
    
    var _backend: typings.rotJs.backendMod.default = js.native
    
    var _data: StringDictionary[DisplayData] = js.native
    
    var _dirty: Boolean | StringDictionary[Boolean] = js.native
    
    /**
      * @param {string} key What to draw
      * @param {bool} clearBefore Is it necessary to clean before?
      */
    def _draw(key: String, clearBefore: Boolean): Unit = js.native
    
    var _options: DisplayOptions = js.native
    
    /**
      * Timer tick: update dirty parts
      */
    def _tick(): Unit = js.native
    
    /**
      * Clear the whole display (cover it with background color)
      */
    def clear(): Unit = js.native
    
    /**
      * Compute the maximum font size to fit into a set of given constraints
      * @param {int} availWidth Maximum allowed pixel width
      * @param {int} availHeight Maximum allowed pixel height
      * @returns {int} fontSize
      */
    def computeFontSize(availWidth: Double, availHeight: Double): Double = js.native
    
    /**
      * Compute the maximum width/height to fit into a set of given constraints
      * @param {int} availWidth Maximum allowed pixel width
      * @param {int} availHeight Maximum allowed pixel height
      * @returns {int[2]} cellWidth,cellHeight
      */
    def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double] = js.native
    
    def computeTileSize(availWidth: Double, availHeight: Double): js.Array[Double] = js.native
    
    /**
      * @param {int} x
      * @param {int} y
      * @param {string || string[]} ch One or more chars (will be overlapping themselves)
      * @param {string} [fg] foreground color
      * @param {string} [bg] background color
      */
    def draw(x: Double, y: Double): Unit = js.native
    def draw(x: Double, y: Double, ch: String): Unit = js.native
    def draw(x: Double, y: Double, ch: String, fg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: String, fg: String, bg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: String, fg: Null, bg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: js.Array[String]): Unit = js.native
    def draw(x: Double, y: Double, ch: js.Array[String], fg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: js.Array[String], fg: String, bg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: js.Array[String], fg: Null, bg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: Null, fg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: Null, fg: String, bg: String): Unit = js.native
    def draw(x: Double, y: Double, ch: Null, fg: Null, bg: String): Unit = js.native
    
    /**
      * Draws a text at given position. Optionally wraps at a maximum length. Currently does not work with hex layout.
      * @param {int} x
      * @param {int} y
      * @param {string} text May contain color/background format specifiers, %c{name}/%b{name}, both optional. %c{}/%b{} resets to default.
      * @param {int} [maxWidth] wrap at what width?
      * @returns {int} lines drawn
      */
    def drawText(x: Double, y: Double, text: String): Double = js.native
    def drawText(x: Double, y: Double, text: String, maxWidth: Double): Double = js.native
    
    def eventToPosition(e: MouseEvent): js.Tuple2[Double, Double] = js.native
    /**
      * Convert a DOM event (mouse or touch) to map coordinates. Uses first touch for multi-touch.
      * @param {Event} e event
      * @returns {int[2]} -1 for values outside of the canvas
      */
    def eventToPosition(e: TouchEvent): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns the DOM node of this display
      */
    def getContainer(): HTMLElement | Null = js.native
    
    /**
      * Returns currently set options
      */
    def getOptions(): DisplayOptions = js.native
    
    /**
      * @see ROT.Display
      */
    def setOptions(options: PartialDisplayOptions): this.type = js.native
  }
}
