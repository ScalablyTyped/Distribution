package typings.raphael.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.raphael.anon.PartialRaphaelAttributes
import typings.raphael.anon.RaphaelPotentialFailureRa
import typings.raphael.anon.RaphaelPotentialFailureRaB
import typings.raphael.raphaelStrings.`null`
import typings.raphael.raphaelStrings.`object`
import typings.raphael.raphaelStrings.array
import typings.raphael.raphaelStrings.boolean
import typings.raphael.raphaelStrings.function
import typings.raphael.raphaelStrings.number
import typings.raphael.raphaelStrings.string
import typings.raphael.raphaelStrings.symbol
import typings.raphael.raphaelStrings.undefined
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelStatic[TTechnology /* <: RaphaelTechnology */]
  extends StObject
     with /**
  * @param onReadyCallback Function that is going to be called on DOM ready event. You can also subscribe to this
  * event via Eve's `DOMLoad` event. In this case the method returns `undefined`.
  * @return A new raphael paper that can be used for drawing shapes to the canvas.
  */
Instantiable0[RaphaelPaper[TTechnology]]
     with /**
  * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
  * from this instance will be bound to this canvas.
  *
  * @param The first 3 or 4 elements in the array are equal to `[containerID, width, height]` or
  * `[x, y, width, height]`. The rest are element descriptions in format `{type: type, <attributes>}`.
  * @param callback Callback function which is going to be executed in the context of newly created paper.
  * @return A new raphael paper that can be used for drawing shapes to the canvas.
  */
Instantiable1[
      (/* all */ RaphaelConstructionOptionsArray4) | (/* all */ RaphaelConstructionOptionsArray5) | (/* onReadyCallback */ js.ThisFunction0[/* this */ Window, Unit]), 
      RaphaelPaper[TTechnology] | RaphaelSet[TTechnology]
    ]
     with /**
  * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
  * from this instance will be bound to this canvas.
  *
  * @param container DOM element or its ID which is going to be a parent for drawing surface.
  * @param width Width for the canvas.
  * @param height Height for the canvas.
  * @param callback Callback function which is going to be executed in the context of newly created paper.
  * @return A new raphael paper that can be used for drawing shapes to the canvas.
  */
Instantiable3[
      (/* container */ HTMLElement) | (/* container */ String), 
      /* width */ Double, 
      /* height */ Double, 
      RaphaelPaper[TTechnology]
    ]
     with /**
  * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
  * from this instance will be bound to this canvas.
  *
  * @param x x coordinate of the viewport where the canvas is created.
  * @param y y coordinate of the viewport where the canvas is created.
  * @param width Width for the canvas.
  * @param height Height for the canvas.
  * @param callback Callback function which is going to be executed in the context of newly created paper.
  * @return A new raphael paper that can be used for drawing shapes to the canvas.
  */
Instantiable4[
      (/* x */ Double) | (/* container */ HTMLElement) | (/* container */ String), 
      /* y */ Double, 
      /* width */ Double, 
      (/* height */ Double) | (/* callback */ js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]), 
      RaphaelPaper[TTechnology]
    ]
     with Instantiable2[
      (/* all */ RaphaelConstructionOptionsArray4) | (/* all */ RaphaelConstructionOptionsArray5), 
      /* callback */ js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit], 
      RaphaelSet[TTechnology]
    ]
     with Instantiable5[
      /* x */ Double, 
      /* y */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      /* callback */ js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit], 
      RaphaelPaper[TTechnology]
    ] {
  
  /**
    * @param onReadyCallback Function that is going to be called on DOM ready event. You can also subscribe to this
    * event via Eve's `DOMLoad` event. In this case the method returns `undefined`.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  def apply(): RaphaelPaper[TTechnology] = js.native
  /**
    * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
    * from this instance will be bound to this canvas.
    *
    * @param The first 3 or 4 elements in the array are equal to `[containerID, width, height]` or
    * `[x, y, width, height]`. The rest are element descriptions in format `{type: type, <attributes>}`.
    * @param callback Callback function which is going to be executed in the context of newly created paper.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  def apply(all: RaphaelConstructionOptionsArray4 | RaphaelConstructionOptionsArray5): RaphaelSet[TTechnology] = js.native
  def apply(
    all: RaphaelConstructionOptionsArray4 | RaphaelConstructionOptionsArray5,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelSet[TTechnology] = js.native
  def apply(container: String, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def apply(
    container: String,
    width: Double,
    height: Double,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelPaper[TTechnology] = js.native
  /**
    * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
    * from this instance will be bound to this canvas.
    *
    * @param container DOM element or its ID which is going to be a parent for drawing surface.
    * @param width Width for the canvas.
    * @param height Height for the canvas.
    * @param callback Callback function which is going to be executed in the context of newly created paper.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  def apply(container: HTMLElement, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def apply(
    container: HTMLElement,
    width: Double,
    height: Double,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelPaper[TTechnology] = js.native
  def apply(onReadyCallback: js.ThisFunction0[/* this */ Window, Unit]): RaphaelPaper[TTechnology] = js.native
  /**
    * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
    * from this instance will be bound to this canvas.
    *
    * @param x x coordinate of the viewport where the canvas is created.
    * @param y y coordinate of the viewport where the canvas is created.
    * @param width Width for the canvas.
    * @param height Height for the canvas.
    * @param callback Callback function which is going to be executed in the context of newly created paper.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  def apply(x: Double, y: Double, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def apply(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelPaper[TTechnology] = js.native
  
  /**
    * Returns angle between two or three points
    * @param x1 x coordinate of first point
    * @param y1 y coordinate of first point
    * @param x2 x coordinate of second point
    * @param y2 y coordinate of second point
    * @param x3 x coordinate of third point
    * @param y3 y coordinate of third point
    * @return The angle in degrees.
    */
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Unit, y3: Double): Double = js.native
  
  /**
    * Creates an animation object that can be passed to the {@link RaphaelElement.animate} or
    * {@link RaphaelElement.animateWith} methods. See also the {@link RaphaelAnimation.delay} and
    * {@link RaphaelAnimation.repeat} methods.
    * @param params
    * @param milliseconds Number of milliseconds for animation to run
    * @param easing easing type. Accept one of {@link RaphaelStatic.easing_formulas} or CSS format:
    * `cubic‐bezier(XX, XX, XX, XX)`
    * @param callback Callback function. Will be called at the end of animation.
    */
  def animation(params: PartialRaphaelAttributes, milliseconds: Double): RaphaelAnimation = js.native
  def animation(
    params: PartialRaphaelAttributes,
    milliseconds: Double,
    easing: Unit,
    callback: js.ThisFunction0[
      /* this */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Unit
    ]
  ): RaphaelAnimation = js.native
  def animation(params: PartialRaphaelAttributes, milliseconds: Double, easing: RaphaelBuiltinEasingFormula): RaphaelAnimation = js.native
  def animation(
    params: PartialRaphaelAttributes,
    milliseconds: Double,
    easing: RaphaelBuiltinEasingFormula,
    callback: js.ThisFunction0[
      /* this */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Unit
    ]
  ): RaphaelAnimation = js.native
  def animation(params: PartialRaphaelAttributes, milliseconds: Double, easing: RaphaelCustomEasingFormula): RaphaelAnimation = js.native
  def animation(
    params: PartialRaphaelAttributes,
    milliseconds: Double,
    easing: RaphaelCustomEasingFormula,
    callback: js.ThisFunction0[
      /* this */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Unit
    ]
  ): RaphaelAnimation = js.native
  
  /**
    * Parses the color string and returns object with all values for the given color.
    * @param color Color string in one of the supported formats, see {@link RaphaelStatic.getRGB}.
    * @return Combined RGB & HSB object with the information about the color.
    */
  def color(color: String): RaphaelPotentialFailureRa = js.native
  
  /**
    * Transform angle from radians to degrees.
    * @param radians An angle in radians.
    * @return The given angle in degrees.
    */
  def deg(radians: Double): Double = js.native
  
  /**
    * Object that contains easing formulas for animation. You could extend it with your own. By default it has
    * the easing methods as defined in {@link RaphaelBuiltinEasingFormula}.
    */
  var easing_formulas: Record[RaphaelBuiltinEasingFormula | RaphaelCustomEasingFormula, RaphaelEasingFormula] = js.native
  
  /**
    * You can add your own method to elements. This is useful when you want to hack default functionality or want
    * to wrap some common transformation or attributes in one method. In contrast to canvas methods, you can
    * redefine element method at any time. Expending element methods would not affect set.
    *
    * ```javascript
    * Raphael.el.red = function () {
    *   this.attr({fill: "#f00"});
    * };
    * // then use it
    * paper.circle(100, 100, 20).red();
    * ```
    *
    * __Note to TypeScript users__
    *
    * To declare your plugin, you should extend the `raphael` module and add to the {@link RaphaelElement}:
    *
    * ```typescript
    * import { RaphaelElement } from "raphael"
    * declare module "raphael" {
    *   interface RaphaelElement {
    *     red(): void;
    *     colored(r: number, g: number, b: number): this;
    *    }
    * }
    * ```
    */
  var el: RaphaelElementPluginRegistry[TTechnology] = js.native
  
  /**
    * Utility method to find dot coordinates on the given cubic bezier curve at the given position.
    * @param startPointX x of the first point of the curve.
    * @param startPointY y of the first point of the curve.
    * @param anchor1X x of the first anchor of the curve.
    * @param anchor1Y y of the first anchor of the curve.
    * @param anchor2X x of the second anchor of the curve.
    * @param anchor2Y y of the second anchor of the curve.
    * @param endPointX x of the second point of the curve.
    * @param endPointY y of the second point of the curve.
    * @param positionOnCurve Position on the curve, between `0` and `1`.
    * @return The point at the specified cubic bezier curve at the given position.
    */
  def findDotsAtSegment(
    startPointX: Double,
    startPointY: Double,
    anchor1X: Double,
    anchor1Y: Double,
    anchor2X: Double,
    anchor2Y: Double,
    endPointX: Double,
    endPointY: Double,
    positionOnCurve: Double
  ): RaphaelCubicBezierCurvePointInfo = js.native
  
  /**
    * You can add your own method to the canvas. For example if you want to draw a pie chart, you can create your
    * own pie chart function and ship it as a Raphaël plugin. To do this you need to extend the `Raphael.fn`
    * object.
    *
    * Please note that you can create your own namespaces inside the fn object, methods will be run in the context
    * of the canvas. You should alter the fn object before a Raphaël instance is created, otherwise it will take no
    * effect.
    *
    * ```javascript
    * Raphael.fn.arrow = function (x1, y1, x2, y2, size) {
    *   return this.path( ... );
    * };
    * // or create namespace
    * Raphael.fn.mystuff = {
    *   arrow: function () {…},
    *   star: function () {…},
    *   // etc...
    * };
    *
    * var paper = Raphael(10, 10, 630, 480);
    * // then use it
    * paper.arrow(10, 10, 30, 30, 5).attr({fill: "#f00"});
    * paper.mystuff.arrow();
    * paper.mystuff.star();
    * ```
    *
    * __Note to TypeScript users__
    *
    * To declare your plugin, you should extend the `raphael` module and add to the {@link RaphaelPaper}:
    *
    * ```typescript
    * import { RaphaelPaper, RaphaelPath } from "raphael"
    * declare module "raphael" {
    *   interface RaphaelPaper {
    *     arrow(x1: number, y1: number, x2: number, y2: number, size: number): RaphaelPath;
    *     mystuff: {
    *       arrow(flag: boolean): number;
    *       star(): void;
    *     };
    *   }
    * }
    * ```
    */
  var fn: RaphaelPaperPluginRegistry[TTechnology, RaphaelPaper[TTechnology]] = js.native
  
  /**
    * Simple format function. Replaces construction of type `{<number>}` with the corresponding argument.
    *
    * ```javascript
    * var x = 10;
    * var y = 20;
    * var width = 40;
    * var height = 50;
    *
    * // this will draw a rectangular shape equivalent to "M10,20h40v50h-40z"
    * paper.path(Raphael.format("M{1},{2}h{3}v{4}h{5}z", x, y, width, height, -width));
    * ```
    *
    * See also {@link format}.
    *
    * @param token String to format.
    * @param parameters Arguments that will be treated as parameters for replacement. They will be coerced to type
    * `string`.
    * @return The formatted string.
    */
  def format(token: String, parameters: js.Any*): String = js.native
  
  /**
    * A little bit more advanced format function than {@link format}. Replaces construction of type `{<name>}`
    * with the corresponding argument.
    *
    * ```javascript
    * // this will draw a rectangular shape equivalent to "M10,20h40v50h-40z"
    * paper.path(Raphael.format("M{x},{y}h{dim.width}v{dim.height}h{dim['negative width']}z", {
    *   x: 10,
    *   y: 20,
    *   dim: {
    *     width: 40,
    *     height: 50,
    *     "negative width": -40
    *   }
    * }));
    * ```
    *
    * @param token String to format.
    * @param json Object with properties that will be used as a replacement.
    * @return The formatted string.
    */
  def fullfill(token: String, json: Record[String, js.Any]): String = js.native
  
  /**
    * On each call returns next colour in the spectrum. To reset it back to red call
    * {@link RaphaelStaticGetColor.reset|Raphael.getColor.reset}.
    * @param Brightness, default is `0.75`.
    * @return Hex representation of the color.
    */
  /**
    * On each call returns next colour in the spectrum. Also contains a utility method to reset it back to red via
    * {@link RaphaelStaticGetColor.reset|Raphael.getColor.reset}
    */
  def getColor(): String = js.native
  def getColor(brightness: Double): String = js.native
  /**
    * On each call returns next colour in the spectrum. Also contains a utility method to reset it back to red via
    * {@link RaphaelStaticGetColor.reset|Raphael.getColor.reset}
    */
  @JSName("getColor")
  var getColor_Original: RaphaelStaticGetColor = js.native
  
  /**
    * Return coordinates of the point located at the given length on the given path.
    * @param path SVG path string.
    * @param length Length at which to get the point.
    * @return The point located at the given length on the given path.
    */
  def getPointAtLength(path: String, length: Double): RaphaelCartesianCurvePoint = js.native
  
  /**
    * Parses a color string as an RGB object. Takes a color string in one of the following formats:
    *
    * - Colour name (`red`, `green`, `cornflowerblue`, etc)
    * - `#RGB` - shortened HTML colour: (`#000`, `#fc0`, etc)
    * - `#RRGGBB` - full length HTML colour: (`#000000`, `#bd2300`)
    * - `rgb(RRR, GGG, BBB)` - red, green and blue channels' values: (`rgb(200, 100, 0)`)
    * - `rgb(RRR%, GGG%, BBB%)` - same as above, but in %: (`rgb(100%, 175%, 0%)`)
    * - `hsb(HHH, SSS, BBB)` - hue, saturation and brightness values: (`hsb(0.5, 0.25, 1)`)
    * - `hsb(HHH%, SSS%, BBB%)` - same as above, but in %
    * - `hsl(HHH, SSS, LLL)` - same as hsb
    * - `hsl(HHH%, SSS%, LLL%)` - same as hsb
    *
    * @param color Color string to be parsed.
    * @return The RGB components of the parsed color string.
    */
  def getRGB(color: String): RaphaelPotentialFailureRaB = js.native
  
  /**
    * Return sub path of a given path from given length to given length.
    * @param path SVG path string
    * @param from Position of the start of the segment
    * @param to Position of the end of the segment
    * @return Path string for the segment.
    */
  def getSubpath(path: String, from: Double, to: Double): String = js.native
  
  /**
    * Returns length of the given path in pixels.
    * @param path SVG path string.
    * @return The length of the path.
    */
  def getTotalLength(path: String): Double = js.native
  
  /**
    * Converts HSB values to hex representation of the color.
    * @param hue Hue channel
    * @param saturation Saturation channel.
    * @param brightness Brightness channel.
    * @return Hex representation of the color.
    */
  def hsb(hue: Double, saturation: Double, brightness: Double): String = js.native
  
  /**
    * Converts HSB values to RGB object.
    * @param hue Hue channel.
    * @param saturation Saturation channel.
    * @param brightness Brightness channel.
    * @return The color in the RGB color system.
    */
  def hsb2rgb(hue: Double, saturation: Double, brightness: Double): RaphaelRgbComponentInfo = js.native
  
  /**
    * Converts HSL values to hex representation of the colour.
    * @param hue Hue channel.
    * @param saturation Saturation channel.
    * @param luminosity Luminosity channel.
    * @return Hex representation of the color.
    */
  def hsl(hue: Double, saturation: Double, luminosity: Double): String = js.native
  
  /**
    * Converts HSL values to RGB object.
    * @param hue Hue channel.
    * @param saturation Saturation channel.
    * @param luminosity Luminosity channel.
    * @return The color in the RGB color system.
    */
  def hsl2rgb(hue: Double, saturation: Double, luminosity: Double): RaphaelRgbComponentInfo = js.native
  
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check for.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  def is(`object`: js.Any, `type`: String): Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_array(`object`: js.Any, `type`: array): /* is std.Array<any> */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_boolean(`object`: js.Any, `type`: boolean): /* is boolean */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_function(`object`: js.Any, `type`: function): Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_null(`object`: js.Any, `type`: `null`): /* is null */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_number(`object`: js.Any, `type`: number): /* is number */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_object(`object`: js.Any, `type`: `object`): Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_string(`object`: js.Any, `type`: string): /* is string */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_symbol(`object`: js.Any, `type`: symbol): /* is symbol */ Boolean = js.native
  /**
    * Handy replacement for typeof operator.
    * @param object An object whose type to check.
    * @param type Type to check.
    * @return `true` if the object is of the given type, or `false` otherwise.
    */
  @JSName("is")
  def is_undefined(`object`: js.Any, `type`: undefined): /* is undefined */ Boolean = js.native
  
  /**
    * Utility method for creating a 2x3 matrix based on given parameters:
    *
    * ```
    * +---+---+---+
    * | a | c | e |
    * | b | d | f |
    * +---+---+---+
    * ```
    *
    * @param a The matrix component at the first row, first column.
    * @param b The matrix component at the second row, first column.
    * @param c The matrix component at the first row, second column.
    * @param d The matrix component at the second row, second column.
    * @param e The matrix component at the third row, first column.
    * @param f The matrix component at the third row, second column.
    * @return A matrix based on the given parameters.
    */
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): RaphaelMatrix = js.native
  
  /**
    * If you want to leave no trace of Raphaël (Well, Raphaël creates only one global variable `Raphael`, but
    * anyway.) You can use ninja method. Beware, that in this case plugins could stop working, because they are
    * depending on the existence of the global variable.
    * @return The Raphael object with all available methods.
    */
  def ninja(): this.type = js.native
  
  /**
    * Utility method that parses given path string into an array of arrays of path segments.
    * @param pathString Path string or array of segments (in the last case it will be returned straight away).
    * @return Array of path segments.
    */
  def parsePathString(pathString: String): js.Array[RaphaelPathSegment] = js.native
  def parsePathString(pathString: js.Array[RaphaelPathSegment]): js.Array[RaphaelPathSegment] = js.native
  def parsePathString(pathString: RaphaelPathSegment): js.Array[RaphaelPathSegment] = js.native
  
  /**
    * Utility method that parses given path string into an array of transformations.
    * @param transformString Transform string or array of transformations (in the last case it will be returned
    * straight away).
    * @return Array of transformations.
    */
  def parseTransformString(transformString: String): js.Array[RaphaelTransformSegment] = js.native
  def parseTransformString(transformString: js.Array[RaphaelTransformSegment]): js.Array[RaphaelTransformSegment] = js.native
  def parseTransformString(transformString: RaphaelTransformSegment): js.Array[RaphaelTransformSegment] = js.native
  
  /**
    * Utility method that converts path to a new path where all segments are cubic bezier curves.
    * @param pathString A path string or array of segments.
    * @return Array of path segments.
    */
  def path2curve(pathString: String): js.Array[RaphaelPathSegment] = js.native
  def path2curve(pathString: js.Array[RaphaelPathSegment]): js.Array[RaphaelPathSegment] = js.native
  def path2curve(pathString: RaphaelPathSegment): js.Array[RaphaelPathSegment] = js.native
  
  /**
    * Utility method that converts a path to its relative form.
    * @param pathString A path string or array of segments.
    * @return Array of path segments.
    */
  def pathToRelative(pathString: String): js.Array[RaphaelPathSegment] = js.native
  def pathToRelative(pathString: js.Array[RaphaelPathSegment]): js.Array[RaphaelPathSegment] = js.native
  def pathToRelative(pathString: RaphaelPathSegment): js.Array[RaphaelPathSegment] = js.native
  
  /**
    * Transform angle from degrees to radians.
    * @param degrees An angle in degrees.
    * @return The given angle in radians.
    */
  def rad(degrees: Double): Double = js.native
  
  /**
    * Adds given font to the registered set of fonts for Raphaël. Should be used as an internal call from within
    * Cufón's font file. Returns original parameter, so it could be used with chaining.
    *
    * See http://wiki.github.com/sorccu/cufon/about
    *
    * @param font The font to register.
    * @return The font you passed in
    */
  def registerFont(font: RaphaelFont): RaphaelFont = js.native
  
  /**
    * Converts RGB values to hex representation of the colour.
    * @param red The red channel.
    * @param green The green channel.
    * @param blue The blue channel.
    * @return Hex representation of the color.
    */
  def rgb(red: Double, green: Double, blue: Double): String = js.native
  
  /**
    * Converts RGB values to HSB values.
    * @param red The red channel.
    * @param green The green channel.
    * @param blue The blue channel.
    * @return The given color in the HSB color format.
    */
  def rgb2hsb(red: Double, green: Double, blue: Double): RaphaelHsbComponentInfo = js.native
  
  /**
    * Converts RGB values to HSB values.
    * @param red The red channel.
    * @param green The green channel.
    * @param blue The blue channel.
    * @return The given color in the HSL color format.
    */
  def rgb2hsl(red: Double, green: Double, blue: Double): RaphaelHslComponentInfo = js.native
  
  /**
    * Used when you need to draw in IFRAME. Switches window to the iframe one.
    * @param newWindow The new window object
    */
  def setWindow(newWindow: Window): Unit = js.native
  
  def snapTo(values: js.Array[Double], value: Double): Double = js.native
  def snapTo(values: js.Array[Double], value: Double, tolerance: Double): Double = js.native
  /**
    * Snaps the given value to the given grid.
    * @param values Array of grid values or step of the grid.
    * @param value Value to adjust.
    * @param tolerance Tolerance for snapping. Default is `10`.
    * @return The adjusted value.
    */
  def snapTo(values: Double, value: Double): Double = js.native
  def snapTo(values: Double, value: Double, tolerance: Double): Double = js.native
  
  /**
    * You can add your own method to elements and sets. It is wise to add a set method for each element method you
    * added, so you will be able to call the same method on sets too. See also {@link el}.
    *
    * ```javascript
    * Raphael.el.red = function() {
    *   this.attr({fill: "#f00"});
    * };
    *
    * Raphael.st.red = function() {
    *   this.forEach(function () {
    *     this.red();
    *   });
    * };
    *
    * // then use it
    * paper.set(paper.circle(100, 100, 20), paper.circle(110, 100, 20)).red();
    * ```
    *
    * __Note to TypeScript users__
    *
    * To declare your plugin, you should extend the `raphael` module and add to the {@link RaphaelSet}:
    *
    * ```typescript
    * import { RaphaelSet } from "raphael"
    * declare module "raphael" {
    *   interface RaphaelSet {
    *     green(): void;
    *     colorized(r: number, g: number, b: number): this;
    *   }
    * }
    * ```
    */
  var st: RaphaelSetPluginRegistry[TTechnology] = js.native
  
  /**
    * `true` if browser supports SVG (scalable vector graphics), or `false` otherwise.
    */
  var svg: Boolean = js.native
  
  /**
    * The technology used by Raphaël for the graphics.
    */
  var `type`: TTechnology = js.native
  
  /**
    * True if browser supports VML (vector markup language).
    */
  var vml: Boolean = js.native
}
