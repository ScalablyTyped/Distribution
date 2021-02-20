package typings.raphael.mod

import typings.raphael.raphaelStrings.SVG
import typings.raphael.raphaelStrings.VML
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Raphael")
  @js.native
  /**
    * @param onReadyCallback Function that is going to be called on DOM ready event. You can also subscribe to this
    * event via Eve's `DOMLoad` event. In this case the method returns `undefined`.
    * @return A new raphael paper that can be used for drawing shapes to the canvas.
    */
  class Raphael () extends RaphaelPaper[SVG | VML] {
    def this(onReadyCallback: js.ThisFunction0[/* this */ Window, Unit]) = this()
    def this(container: String, width: Double, height: Double) = this()
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
    def this(container: HTMLElement, width: Double, height: Double) = this()
    def this(
      container: String,
      width: Double,
      height: Double,
      callback: js.ThisFunction0[/* this */ RaphaelPaper[SVG | VML], Unit]
    ) = this()
    def this(
      container: HTMLElement,
      width: Double,
      height: Double,
      callback: js.ThisFunction0[/* this */ RaphaelPaper[SVG | VML], Unit]
    ) = this()
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
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      callback: js.ThisFunction0[/* this */ RaphaelPaper[SVG | VML], Unit]
    ) = this()
  }
  /**
    * The global entry point for all features offered by the Raphaël library.
    *
    * Raphaël is a small JavaScript library that should simplify your work with vector graphics on the web. If you want
    * to create your own specific chart or image crop and rotate widget, for example, you can achieve it simply and
    * easily with this library.
    *
    * You use this library via the globally available {@link RaphaelStatic|Raphael} object:
    *
    * ```javascript
    * // Creates canvas 320 × 200 at 10, 50
    * var paper = Raphael(10, 50, 320, 200);
    *
    * // Creates circle at x = 50, y = 40, with radius 10
    * var circle = paper.circle(50, 40, 10);
    *
    * // Sets the fill attribute of the circle to red (#f00)
    * circle.attr("fill", "#f00");
    *
    * // Sets the stroke attribute of the circle to white
    * circle.attr("stroke", "#fff");
    * ```
    *
    * See https://dmitrybaranovskiy.github.io/raphael/
    */
  @JSGlobal("Raphael")
  @js.native
  val Raphael: RaphaelStatic[SVG | VML] = js.native
}
