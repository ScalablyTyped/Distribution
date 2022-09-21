package typings.raphael.mod

import typings.raphael.mod.^
import typings.raphael.raphaelStrings.SVG
import typings.raphael.raphaelStrings.VML
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("raphael", JSImport.Default)
@js.native
/**
  * @param onReadyCallback Function that is going to be called on DOM ready event. You can also subscribe to this
  * event via Eve's `DOMLoad` event. In this case the method returns `undefined`.
  * @return A new raphael paper that can be used for drawing shapes to the canvas.
  */
open class default ()
  extends StObject
     with RaphaelPaper[SVG | VML] {
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
object default {
  
  inline def apply: RaphaelStatic[SVG | VML] = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[RaphaelStatic[SVG | VML]]
}
