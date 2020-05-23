package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Context for drawing images._
  *
  * Constructs a new canvas to draw images, shapes and texts on.
  * @see https://docs.scriptable.app/drawcontext/#-new-drawcontext
  */
@JSGlobal("DrawContext")
@js.native
/**
  * _Context for drawing images._
  *
  * Constructs a new canvas to draw images, shapes and texts on.
  * @see https://docs.scriptable.app/drawcontext/#-new-drawcontext
  */
class DrawContext ()
  extends typings.scriptableIos.DrawContext {
  /**
    * _Determines whether the context is opaque._
    *
    * When enabled your image will be rendered opaque. Default is true.
    * @see https://docs.scriptable.app/drawcontext/#opaque
    */
  /* CompleteClass */
  override var opaque: Boolean = js.native
  /**
    * _Enable to respect the scale of the screen._
    *
    * Devices have a screen scale that is used to convert between the logical coordinate space and the device coordinate space. For example, retina screens have a screen scale of 2 or 3
    * meaning that one point in the logical coordinate space is represented by four or nine pixels. Respecting the screen scale will multiply the specified size of the canvas by the
    * screen scale. For example a canvas of size 200 by 200 will be 600 by 600 when the image is rendered on a retina screen with a screen scale of 3. When respecting the screen scale is
    * disabled, you may experience that your images looks blurry because essentially the size you have specified will be stretched when rendered on the screen. Default is false.
    * @see https://docs.scriptable.app/drawcontext/#respectscreenscale
    */
  /* CompleteClass */
  override var respectScreenScale: Boolean = js.native
  /**
    * _Size of canvas._
    *
    * Specifies the size of the canvas on which you are drawing. The image returned by getImage() will have this exact size, except if respectScreenScale is true.
    * @see https://docs.scriptable.app/drawcontext/#size
    */
  /* CompleteClass */
  override var size: typings.scriptableIos.Size = js.native
  /**
    * _Adds a path to the context._
    *
    * After adding a path to the context, the path can be stroked or filled by calling strokePath and fillPath. Note that only the path that was added latest will be affected by calls to
    * strokePath and fillPath.
    * @param path - Path to add to the context.
    * @see https://docs.scriptable.app/drawcontext/#-addpath
    */
  /* CompleteClass */
  override def addPath(path: typings.scriptableIos.Path): Unit = js.native
  /**
    * _Draws an image at the specified point._
    *
    * Draws the image at the point. The top-left corner of the image will be drawn at the specified point.
    * @param image - Image to draw.
    * @param point - Point at which to draw top-left corner of the image.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageatpoint
    */
  /* CompleteClass */
  override def drawImageAtPoint(image: typings.scriptableIos.Image, point: typings.scriptableIos.Point): Unit = js.native
  /**
    * _Draws an image in the specified rect._
    *
    * Draws the image in the rectangle. The image will be scaled to fit within the rectangle.
    * @param image - Image to draw.
    * @param rect - Rectangle to draw the image in.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageinrect
    */
  /* CompleteClass */
  override def drawImageInRect(image: typings.scriptableIos.Image, rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Draws text at a position._
    *
    * Call this to draw a text string to the context. The top-left of the text will be drawn at the specified position.
    * @param text - Text to draw.
    * @param pos - Position to draw the top-left of the text at.
    * @see https://docs.scriptable.app/drawcontext/#-drawtext
    */
  /* CompleteClass */
  override def drawText(text: String, pos: typings.scriptableIos.Point): Unit = js.native
  /**
    * _Draws text in a rectangle._
    *
    * Call this to draw a text string in a rectangle. Specify how the text should be aligned within the rectangle by calling setTextAlignedLeft, setTextAlignedCenter or
    * setTextAlignedRight before drawing the text.
    * @param text - Text to draw.
    * @param rect - Rectangle to draw text in.
    * @see https://docs.scriptable.app/drawcontext/#-drawtextinrect
    */
  /* CompleteClass */
  override def drawTextInRect(text: String, rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle width the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fill
    */
  /* CompleteClass */
  override def fill(rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Fills an ellipse._
    *
    * Fills the ellipse that fits within the supplied rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle incapsulating the ellipse to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillellipse
    */
  /* CompleteClass */
  override def fillEllipse(rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Fills the path that was added the latest._
    *
    * The path that was latest added to the context is filles with the color set using setFillColor.
    * @see https://docs.scriptable.app/drawcontext/#-fillpath
    */
  /* CompleteClass */
  override def fillPath(): Unit = js.native
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle width the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillrect
    */
  /* CompleteClass */
  override def fillRect(rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Retrieves the image._
    *
    * Call this to retrieve the image you have drawn to the context. Note that this should be called before calling endDrawing().
    * @see https://docs.scriptable.app/drawcontext/#-getimage
    */
  /* CompleteClass */
  override def getImage(): typings.scriptableIos.Image = js.native
  /**
    * _Sets the fill color._
    *
    * Sets the fill color to be used when performing a fill operation. Any fill operation performed afterwards will fill with the specified color until another call to setFillColor is
    * made.
    * @param color - Color to set for filling.
    * @see https://docs.scriptable.app/drawcontext/#-setfillcolor
    */
  /* CompleteClass */
  override def setFillColor(color: typings.scriptableIos.Color): Unit = js.native
  /**
    * _Sets the font size used when drawing text._
    *
    * Sets the font size to be used when drawing text strings to the context.
    * @param size - Font size to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-setfontsize
    */
  /* CompleteClass */
  override def setFontSize(size: Double): Unit = js.native
  /**
    * _Sets the line width for stroking._
    *
    * Sets the line width to be used when performing a stroke operation.
    * @param width - Line width to use for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setlinewidth
    */
  /* CompleteClass */
  override def setLineWidth(width: Double): Unit = js.native
  /**
    * _Sets the stroke color._
    *
    * Sets the stroke color to be used when performing a stroke operation. Any stroke operation performed afterwards will stroke with the specified color until another call to
    * setStrokeColor is made.
    * @param color - Color to set for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setstrokecolor
    */
  /* CompleteClass */
  override def setStrokeColor(color: typings.scriptableIos.Color): Unit = js.native
  /**
    * _Specifies that texts should be center aligned._
    *
    * Sets text alignment to center. Texts drawn after calling this will be center aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedcenter
    */
  /* CompleteClass */
  override def setTextAlignedCenter(): Unit = js.native
  /**
    * _Specifies that texts should be left aligned._
    *
    * Sets text alignment to left. Texts drawn after calling this will be left aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedleft
    */
  /* CompleteClass */
  override def setTextAlignedLeft(): Unit = js.native
  /**
    * _Specifies that texts should be right aligned._
    *
    * Sets text alignment to right. Texts drawn after calling this will be right aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedright
    */
  /* CompleteClass */
  override def setTextAlignedRight(): Unit = js.native
  /**
    * _Sets the text color used when drawing text._
    *
    * Sets the text color to be used when drawing text strings to the context.
    * @param color - Color to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-settextcolor
    */
  /* CompleteClass */
  override def setTextColor(color: typings.scriptableIos.Color): Unit = js.native
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-stroke
    */
  /* CompleteClass */
  override def stroke(rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the ellipse that fits within the supplied rectangle. The line will have the color set when calling setStrokeColor and the width set when calling setLineWidth.
    * @param rect - Rectangle incapsulating the ellipse to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokeellipse
    */
  /* CompleteClass */
  override def strokeEllipse(rect: typings.scriptableIos.Rect): Unit = js.native
  /**
    * _Strokes the path that was added the latest._
    *
    * The path that was latest added to the context is stroked with the color set using setStrokeColor and the line widht set using setLineWidth.
    * @see https://docs.scriptable.app/drawcontext/#-strokepath
    */
  /* CompleteClass */
  override def strokePath(): Unit = js.native
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokerect
    */
  /* CompleteClass */
  override def strokeRect(rect: typings.scriptableIos.Rect): Unit = js.native
}

