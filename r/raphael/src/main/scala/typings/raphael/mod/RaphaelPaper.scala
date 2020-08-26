package typings.raphael.mod

import typings.raphael.raphaelStrings.`arrow-end`
import typings.raphael.raphaelStrings.`clip-rect`
import typings.raphael.raphaelStrings.`fill-opacity`
import typings.raphael.raphaelStrings.`font-family`
import typings.raphael.raphaelStrings.`font-size`
import typings.raphael.raphaelStrings.`font-weight`
import typings.raphael.raphaelStrings.`stroke-dasharray`
import typings.raphael.raphaelStrings.`stroke-linecap`
import typings.raphael.raphaelStrings.`stroke-linejoin`
import typings.raphael.raphaelStrings.`stroke-miterlimit`
import typings.raphael.raphaelStrings.`stroke-opacity`
import typings.raphael.raphaelStrings.`stroke-width`
import typings.raphael.raphaelStrings.`text-anchor`
import typings.raphael.raphaelStrings.cursor
import typings.raphael.raphaelStrings.cx
import typings.raphael.raphaelStrings.cy
import typings.raphael.raphaelStrings.fill
import typings.raphael.raphaelStrings.font
import typings.raphael.raphaelStrings.height
import typings.raphael.raphaelStrings.href
import typings.raphael.raphaelStrings.opacity
import typings.raphael.raphaelStrings.path
import typings.raphael.raphaelStrings.r_
import typings.raphael.raphaelStrings.rx
import typings.raphael.raphaelStrings.ry
import typings.raphael.raphaelStrings.src
import typings.raphael.raphaelStrings.stroke
import typings.raphael.raphaelStrings.target
import typings.raphael.raphaelStrings.text
import typings.raphael.raphaelStrings.title
import typings.raphael.raphaelStrings.transform
import typings.raphael.raphaelStrings.width
import typings.raphael.raphaelStrings.x
import typings.raphael.raphaelStrings.y
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelPaper[TTechnology /* <: RaphaelTechnology */] extends js.Object {
  /**
    * Points to the bottom element on the paper. `null` when there is no element.
    */
  var bottom: (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  /**
    * The SVG element used by this paper.
    */
  var canvas: /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any = js.native
  /**
    * If you have a set of attributes that you would like to represent as a function of some number you can do it
    * easily with custom attributes:
    *
    * ```javascript
    * paper.customAttributes.hue = function (num) {
    *   num = num % 1;
    *   return {fill: "hsb(" + num + ", .75, 1)"};
    * };
    *
    * // Custom attribute "hue" will change fill
    * // to be given hue with fixed saturation and brightness.
    * // Now you can use it like this:
    * var c = paper.circle(10, 10, 10).attr({hue: .45});
    * // or even like this:
    * c.animate({hue: 1}, 1e3);
    *
    * // You could also create custom attribute
    * // with multiple parameters:
    * paper.customAttributes.hsb = function (h, s, b) {
    *   return {fill: "hsb(" + [h, s, b].join(",") + ")"};
    * };
    * c.attr({hsb: ".5 .8 1"});
    * c.animate({hsb: "1 0 .5"}, 1e3);
    * ```
    *
    * __Note to TypeScript users__
    *
    * To declare your plugin, you should extend the `raphael` module and add to the {@link RaphaelAttributes}:
    *
    * ```typescript
    * import { RaphaelAttributes } from "raphael"
    * declare module "raphael" {
    *   interface RaphaelAttributes {
    *     hue: number;
    *     hsb: string;
    *   }
    * }
    * ```
    */
  var customAttributes: Record[
    `arrow-end` | `clip-rect` | cursor | cx | cy | fill | `fill-opacity` | font | `font-family` | `font-size` | `font-weight` | height | href | opacity | path | r_ | rx | ry | src | stroke | `stroke-dasharray` | `stroke-linecap` | `stroke-linejoin` | `stroke-miterlimit` | `stroke-opacity` | `stroke-width` | target | text | `text-anchor` | title | transform | width | x | y, 
    RaphaelCustomAttribute[TTechnology, _]
  ] = js.native
  /**
    * The height of this pager.
    */
  var height: Double = js.native
  /**
    * Points to the {@link RaphaelStatic|Raphael} object/function.
    */
  @JSName("raphael")
  var raphael_Original: RaphaelStatic[TTechnology] = js.native
  /**
    * Points to the topmost element on the paper. `null` when there is no element.
    */
  var top: (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  /**
    * The width of this paper.
    */
  var width: Double = js.native
  /**
    * Draws a circle.
    * @param x x coordinate of the center.
    * @param y y coordinate of the center.
    * @param radius Radius of the circle.
    * @return The newly created element representing the circle.
    */
  def circle(x: Double, y: Double, radius: Double): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGCircleElement, raphael.raphael.VMLCircleElement>[TTechnology] */ js.Any
  ] = js.native
  /**
    * Clears the paper, i.e. removes all the elements.
    */
  def clear(): Unit = js.native
  /**
    * Draws an ellipse.
    * @param x x coordinate of the center.
    * @param y y coordinate of the center.
    * @param radiusX Horizontal half-axis of the ellipse.
    * @param radiusY Vertical half-axis of the ellipse.
    * @return The newly created element representing the ellipse.
    */
  def ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGEllipseElement, raphael.raphael.VMLEllipseElement>[TTechnology] */ js.Any
  ] = js.native
  /**
    * Executes given function for each element on the paper
    *
    * If callback function returns `false` it will stop the loop running.
    * @typeparam Type of the this context for the callback.
    * @param callback Callback that is invoked with each element on the paper.
    * @param thisContext Optional this context that is passed to the callback.
    * @return this paper for chaining.
    */
  def forEach[T](
    callback: js.ThisFunction1[
      /* this */ T, 
      /* element */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Boolean | Unit
    ]
  ): this.type = js.native
  def forEach[T](
    callback: js.ThisFunction1[
      /* this */ T, 
      /* element */ RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ], 
      Boolean | Unit
    ],
    thisContext: T
  ): this.type = js.native
  /**
    * Returns an element by its internal ID.
    * @param id ID of an element to fetch.
    * @return The element with the given ID, or `null` if no such element exists.
    */
  def getById(id: Double): (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  /**
    * Return the topmost element at given point.
    *
    * ```javascript
    * paper.getElementByPoint(mouseX, mouseY).attr({stroke: "#f00"});
    * ```
    *
    * @param x x coordinate from the top left corner of the window.
    * @param y y coordinate from the top left corner of the window.
    * @return The topmost element at given point, `null` if no such element exists..
    */
  def getElementByPoint(x: Double, y: Double): (RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
  ]) | Null = js.native
  /**
    * Finds font object in the registered fonts by given parameters. You could specify only one word from the font
    * name, like `Myriad` for `Myriad Pr`.
    *
    * ```javascript
    * paper.print(100, 100, "Test string", paper.getFont("Times", 800), 30);
    * ```
    *
    * @param family Font family name or any word from it
    * @param weight Font weight
    * @param style Font style
    * @param stretch Font stretch
    * @return The font object with the given options, or `undefined` if no such font exists.
    */
  def getFont(family: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(
    family: String,
    weight: js.UndefOr[scala.Nothing],
    style: js.UndefOr[scala.Nothing],
    stretch: String
  ): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: js.UndefOr[scala.Nothing], style: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: js.UndefOr[scala.Nothing], style: String, stretch: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: String, style: js.UndefOr[scala.Nothing], stretch: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: String, style: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: String, style: String, stretch: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: Double): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: Double, style: js.UndefOr[scala.Nothing], stretch: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: Double, style: String): js.UndefOr[RaphaelFont] = js.native
  def getFont(family: String, weight: Double, style: String, stretch: String): js.UndefOr[RaphaelFont] = js.native
  /**
    * Embeds an image into this paper.
    *
    * ```javascript
    * var c = paper.image("apple.png", 10, 10, 80, 80);
    * ```
    *
    * @param src URI of the source image.
    * @param x x coordinate position
    * @param y y coordinate position
    * @param width Width of the image
    * @param height Height of the image
    * @return The newly created element representing the image.
    */
  def image(src: String, x: Double, y: Double, width: Double, height: Double): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGImageElement, raphael.raphael.VMLImageElement>[TTechnology] */ js.Any
  ] = js.native
  /**
    * Creates a path element by given path data string.
    *
    * Path string consists of one-letter commands, followed by comma separated arguments in numerical form:
    *
    * ```
    * "M10,20L30,40"
    * ```
    *
    * For example:
    *
    * ```javascript
    * var c = paper.path("M10 10L90 90");
    * // draw a diagonal line:
    * // move to 10,10, line to 90,90
    * ```
    *
    * @param pathString Path string in SVG format.
    * @return The newly created element representing the path.
    */
  def path(): RaphaelPath[TTechnology] = js.native
  def path(pathString: String): RaphaelPath[TTechnology] = js.native
  def path(pathString: js.Array[RaphaelPathSegment]): RaphaelPath[TTechnology] = js.native
  def path(pathString: RaphaelPathSegment): RaphaelPath[TTechnology] = js.native
  /**
    * Creates set of shapes to represent given font at given position with given size. Result of the method is set
    * object (see {@link set}) which contains each letter as separate path object.
    *
    * ```javascript
    * var txt = r.print(10, 50, "print", r.getFont("Arial"), 30).attr({fill: "#fff"});
    * // following line will paint first letter in red
    * txt[0].attr({fill: "#f00"});
    * ```
    *
    * @param x x Position of the text
    * @param y y Position of the text
    * @param str Text to print
    * @param font Font object, see {@link getFont}.
    * @param size Size of the font, default is 16.
    * @param origin Whether the text is centered on the baseline or middle line.
    * @param letterSpacing Number between `-1` and `1`, default is `0`.
    * @return Each letter as separate {@link RaphaelPath|path object}.
    */
  def print(x: Double, y: Double, str: String, font: RaphaelFont): RaphaelSet[TTechnology] = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    letterSpacing: Double
  ): RaphaelSet[TTechnology] = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: js.UndefOr[scala.Nothing],
    origin: RaphaelFontOrigin
  ): RaphaelSet[TTechnology] = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: js.UndefOr[scala.Nothing],
    origin: RaphaelFontOrigin,
    letterSpacing: Double
  ): RaphaelSet[TTechnology] = js.native
  def print(x: Double, y: Double, str: String, font: RaphaelFont, size: Double): RaphaelSet[TTechnology] = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: Double,
    origin: js.UndefOr[scala.Nothing],
    letterSpacing: Double
  ): RaphaelSet[TTechnology] = js.native
  def print(x: Double, y: Double, str: String, font: RaphaelFont, size: Double, origin: RaphaelFontOrigin): RaphaelSet[TTechnology] = js.native
  def print(
    x: Double,
    y: Double,
    str: String,
    font: RaphaelFont,
    size: Double,
    origin: RaphaelFontOrigin,
    letterSpacing: Double
  ): RaphaelSet[TTechnology] = js.native
  /**
    * @param onReadyCallback Function that is going to be called on DOM ready event. You can also subscribe to this
    * event via Eve's `DOMLoad` event. In this case the method returns `undefined`.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  /**
    * Points to the {@link RaphaelStatic|Raphael} object/function.
    */
  def raphael(): RaphaelPaper[TTechnology] = js.native
  /**
    * Creates a canvas object on which to draw. You must do this first, as all future calls to drawing methods
    * from this instance will be bound to this canvas.
    *
    * @param The first 3 or 4 elements in the array are equal to `[containerID, width, height]` or
    * `[x, y, width, height]`. The rest are element descriptions in format `{type: type, <attributes>}`.
    * @param callback Callback function which is going to be executed in the context of newly created paper.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  /**
    * Points to the {@link RaphaelStatic|Raphael} object/function.
    */
  def raphael(all: RaphaelConstructionOptionsArray4 | RaphaelConstructionOptionsArray5): RaphaelSet[TTechnology] = js.native
  def raphael(
    all: RaphaelConstructionOptionsArray4 | RaphaelConstructionOptionsArray5,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelSet[TTechnology] = js.native
  def raphael(container: String, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def raphael(
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
  /**
    * Points to the {@link RaphaelStatic|Raphael} object/function.
    */
  def raphael(container: HTMLElement, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def raphael(
    container: HTMLElement,
    width: Double,
    height: Double,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelPaper[TTechnology] = js.native
  def raphael(onReadyCallback: js.ThisFunction0[/* this */ Window, Unit]): RaphaelPaper[TTechnology] = js.native
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
  /**
    * Points to the {@link RaphaelStatic|Raphael} object/function.
    */
  def raphael(x: Double, y: Double, width: Double, height: Double): RaphaelPaper[TTechnology] = js.native
  def raphael(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: js.ThisFunction0[/* this */ RaphaelPaper[TTechnology], Unit]
  ): RaphaelPaper[TTechnology] = js.native
  /**
    * Draws a rectangle.
    * @param x x coordinate of the top left corner.
    * @param y y coordinate of the top left corner
    * @param width Width of th rectangle.
    * @param height Height of th rectangle.
    * @param r Radius for rounded corners, default is `0`.
    * @return The newly created element representing the rectangle.
    */
  def rect(x: Double, y: Double, width: Double, height: Double): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGRectElement, raphael.raphael.VMLRectElement>[TTechnology] */ js.Any
  ] = js.native
  def rect(x: Double, y: Double, width: Double, height: Double, r: Double): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGRectElement, raphael.raphael.VMLRectElement>[TTechnology] */ js.Any
  ] = js.native
  /**
    * Removes this paper from the DOM.
    */
  def remove(): Unit = js.native
  /**
    * Fixes the issue of Firefox and IE9 regarding subpixel rendering. If paper is dependant on other elements
    * after reflow it could shift half pixel which cause for lines to lost their crispness. This method fixes the
    * issue.
    */
  def renderfix(): Unit = js.native
  /**
    * There is an inconvenient rendering bug in Safari (WebKit): sometimes the rendering should be forced. This
    * method should help with dealing with this bug.
    */
  def safari(): Unit = js.native
  /**
    * Creates array-like object to keep and operate several elements at once. Warning: it doesn't create any
    * elements for itself in the page, it just groups existing elements. Sets act as pseudo elements - all methods
    * available to an element can be used on a set.
    *
    * ```javascript
    * var st = paper.set();
    * st.push(
    *   paper.circle(10, 10, 5),
    *   paper.circle(30, 10, 5)
    * );
    * st.attr({fill: "red"}); // changes the fill of both circles
    * ```
    *
    * @param elements Elements to add to the  set.
    * @return A newly created set with the given elements.
    */
  def set(
    elements: (RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
    ])*
  ): RaphaelSet[TTechnology] = js.native
  /**
    * Creates array-like object to keep and operate several elements at once. Warning: it doesn't create any
    * elements for itself in the page, it just groups existing elements. Sets act as pseudo elements - all methods
    * available to an element can be used on a set.
    * @param elements Elements to add to the  set.
    * @return A newly created set with the given elements.
    */
  def set(
    elements: js.Array[
      RaphaelElement[
        TTechnology, 
        /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGElement, raphael.raphael.VMLElement>[TTechnology] */ js.Any
      ]
    ]
  ): RaphaelSet[TTechnology] = js.native
  /**
    * See {@link setStart}. This method finishes catching elements and returns the resulting set.
    * @return A set with all the elements added to this paper since {@link setStart} was called.
    */
  def setFinish(): RaphaelSet[TTechnology] = js.native
  /**
    * If you need to change dimensions of the canvas, call this method.
    * @param width New width of the canvas.
    * @param height New height of the canvas.
    * @return this paper for chaining.
    */
  def setSize(width: Double, height: Double): this.type = js.native
  /**
    * Creates a {@link set}. All elements that will be created after calling this method and before calling
    * {@link setFinish} will be added to the set.
    *
    * ```javascript
    * paper.setStart();
    * paper.circle(10, 10, 5),
    * paper.circle(30, 10, 5)
    * var st = paper.setFinish();
    * st.attr({fill: "red"}); // changes the fill of both circles
    * ```
    */
  def setStart(): Unit = js.native
  /**
    * Sets the view box of the paper. Practically it gives you ability to zoom and pan whole paper surface by
    * specifying new boundaries.
    * @param x New x position, default is `0`.
    * @param y New y position, default is `0`.
    * @param w New width of the canvas.
    * @param h New height of the canvas.
    * @param fit `true` if you want graphics to fit into new boundary box
    * @return this paper for chaining.
    */
  def setViewBox(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def setViewBox(x: Double, y: Double, w: Double, h: Double, fit: Boolean): this.type = js.native
  /**
    * Draws a text string. If you need line breaks, put `\n` in the string.
    * @param x x coordinate position.
    * @param y y coordinate position.
    * @param text The text string to draw.
    * @return The newly created element representing the drawn text.
    */
  def text(x: Double, y: Double, text: String): RaphaelElement[
    TTechnology, 
    /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGTextElement, raphael.raphael.VMLTextElement>[TTechnology] */ js.Any
  ] = js.native
}

