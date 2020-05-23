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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/display/display", JSImport.Namespace)
@js.native
object displayMod extends js.Object {
  @js.native
  trait Display extends js.Object {
    var _backend: typings.rotJs.backendMod.default = js.native
    var _data: StringDictionary[DisplayData] = js.native
    var _dirty: Boolean | StringDictionary[Boolean] = js.native
    var _options: DisplayOptions = js.native
    /**
      * Debug helper, ideal as a map generator callback. Always bound to this.
      * @param {int} x
      * @param {int} y
      * @param {int} what
      */
    def DEBUG(x: Double, y: Double, what: Double): Unit = js.native
    /**
      * @param {string} key What to draw
      * @param {bool} clearBefore Is it necessary to clean before?
      */
    def _draw(key: String, clearBefore: Boolean): Unit = js.native
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
    def draw(x: Double, y: Double): Unit = js.native
    def draw(x: Double, y: Double, ch: String): Unit = js.native
    def draw(x: Double, y: Double, ch: String, fg: String): Unit = js.native
    /**
      * @param {int} x
      * @param {int} y
      * @param {string || string[]} ch One or more chars (will be overlapping themselves)
      * @param {string} [fg] foreground color
      * @param {string} [bg] background color
      */
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
  
  @js.native
  class default () extends Display {
    def this(options: PartialDisplayOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Hex: Instantiable0[typings.rotJs.hexMod.default] = js.native
    var Rect: TypeofRect = js.native
    var Term: Instantiable0[typings.rotJs.termMod.default] = js.native
    var Tile: Instantiable0[typings.rotJs.tileMod.default] = js.native
    var TileGL: TypeofTileGL = js.native
  }
  
}

