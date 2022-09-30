package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a font for rendering text. This can be either RFN (Sphere raster font format) or a
  * TrueType font.
  */
@js.native
trait Font extends StObject {
  
  /**
    * Render text to a surface using this font.
    * @param surface   The surface on which to render.
    * @param x         X coordinate where the text will be drawn.
    * @param y         Y coordinate where the text will be drawn.
    * @param text      Text string to render.
    * @param color     Color of the text.
    * @param wrapWidth If the text is wider than `wrapWidth` in pixels, it will be wrapped to
    *                  multiple lines automatically.
    */
  def drawText(surface: Surface, x: Double, y: Double, text: String): Unit = js.native
  def drawText(surface: Surface, x: Double, y: Double, text: String, color: Unit, wrapWidth: Double): Unit = js.native
  def drawText(surface: Surface, x: Double, y: Double, text: String, color: Color): Unit = js.native
  def drawText(surface: Surface, x: Double, y: Double, text: String, color: Color, wrapWidth: Double): Unit = js.native
  
  /** SphereFS path of the file from which this `Font` was constructed. */
  val fileName: String = js.native
  
  /**
    * Get the width and height, in pixels, of a text as drawn with this font.
    * @param text      The text to be measured.
    * @param wrapWidth Maximum width at which to wrap the text, in pixels.
    * @returns A `Size2D` object with the measured width and height of the text.
    */
  def getTextSize(text: String): Size2D = js.native
  def getTextSize(text: String, wrapWidth: Double): Size2D = js.native
  
  /** Height of a line of text as rendered using this font, in pixels. */
  val height: Double = js.native
  
  /**
    * Get the height of a text, in pixels, as drawn with this font using a given `wrapWidth`.
    * @param text      The text to be measured.
    * @param wrapWidth The maximum width at which to wrap the text, in pixels.
    */
  def heightOf(text: String): Double = js.native
  def heightOf(text: String, wrapWidth: Double): Double = js.native
  
  /**
    * Get the width of a single line of text as drawn with this font, in pixels.
    * @param text The text to be measured.
    * @returns The width of the text when rendered, in pixels.
    */
  def widthOf(text: String): Double = js.native
  
  /**
    * Split a text into multiple lines by applying word wrapping and newlines.
    * @param text      The text string to process.
    * @param wrapWidth The maximum width at which to wrap the text, in pixels.
    * @returns An array of strings, with each string being a new line of text.
    */
  def wordWrap(text: String, wrapWidth: Double): js.Array[String] = js.native
}
