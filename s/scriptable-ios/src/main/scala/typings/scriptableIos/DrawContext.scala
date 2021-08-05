package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Context for drawing images._
  *
  * Constructs a new canvas to draw images, shapes and texts on.
  * @see https://docs.scriptable.app/drawcontext/#-new-drawcontext
  */
trait DrawContext extends StObject {
  
  /**
    * _Adds a path to the context._
    *
    * After adding a path to the context, the path can be stroked or filled by calling strokePath and fillPath. Note that only the path that was added latest will be affected by calls to
    * strokePath and fillPath.
    * @param path - Path to add to the context.
    * @see https://docs.scriptable.app/drawcontext/#-addpath
    */
  def addPath(path: Path): Unit
  
  /**
    * _Draws an image at the specified point._
    *
    * Draws the image at the point. The top-left corner of the image will be drawn at the specified point.
    * @param image - Image to draw.
    * @param point - Point at which to draw top-left corner of the image.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageatpoint
    */
  def drawImageAtPoint(image: Image, point: Point): Unit
  
  /**
    * _Draws an image in the specified rect._
    *
    * Draws the image in the rectangle. The image will be scaled to fit within the rectangle.
    * @param image - Image to draw.
    * @param rect - Rectangle to draw the image in.
    * @see https://docs.scriptable.app/drawcontext/#-drawimageinrect
    */
  def drawImageInRect(image: Image, rect: Rect): Unit
  
  /**
    * _Draws text at a position._
    *
    * Call this to draw a text string to the context. The top-left of the text will be drawn at the specified position.
    * @param text - Text to draw.
    * @param pos - Position to draw the top-left of the text.
    * @see https://docs.scriptable.app/drawcontext/#-drawtext
    */
  def drawText(text: String, pos: Point): Unit
  
  /**
    * _Draws text in a rectangle._
    *
    * Call this to draw a text string in a rectangle. Specify how the text should be aligned within the rectangle by calling setTextAlignedLeft, setTextAlignedCenter or
    * setTextAlignedRight before drawing the text.
    * @param text - Text to draw.
    * @param rect - Rectangle to draw text in.
    * @see https://docs.scriptable.app/drawcontext/#-drawtextinrect
    */
  def drawTextInRect(text: String, rect: Rect): Unit
  
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fill
    */
  def fill(rect: Rect): Unit
  
  /**
    * _Fills an ellipse._
    *
    * Fills the ellipse that fits within the supplied rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle incapsulating the ellipse to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillellipse
    */
  def fillEllipse(rect: Rect): Unit
  
  /**
    * _Fills the path that was added the latest._
    *
    * The path that was latest added to the context is filled with the color set using setFillColor.
    * @see https://docs.scriptable.app/drawcontext/#-fillpath
    */
  def fillPath(): Unit
  
  /**
    * _Fills a rectangle._
    *
    * Fills the rectangle with the color set when calling setFillColor.
    * @param rect - Rectangle to fill.
    * @see https://docs.scriptable.app/drawcontext/#-fillrect
    */
  def fillRect(rect: Rect): Unit
  
  /**
    * _Retrieves the image._
    *
    * Call this to retrieve the image you have drawn to the context. Note that this should be called before calling endDrawing().
    * @see https://docs.scriptable.app/drawcontext/#-getimage
    */
  def getImage(): Image
  
  /**
    * _Determines whether the context is opaque._
    *
    * When enabled your image will be rendered opaque. Default is true.
    * @see https://docs.scriptable.app/drawcontext/#opaque
    */
  var opaque: Boolean
  
  /**
    * _Enable to respect the scale of the screen._
    *
    * Devices have a screen scale that is used to convert between the logical coordinate space and the device coordinate space. For example, retina screens have a screen scale of 2 or 3
    * meaning that one point in the logical coordinate space is represented by four or nine pixels. Respecting the screen scale will multiply the specified size of the canvas by the
    * screen scale. For example a canvas of size 200 by 200 will be 600 by 600 when the image is rendered on a retina screen with a screen scale of 3. When respecting the screen scale is
    * disabled, you may experience that your images looks blurry because essentially the size you have specified will be stretched when rendered on the screen. Default is false.
    * @see https://docs.scriptable.app/drawcontext/#respectscreenscale
    */
  var respectScreenScale: Boolean
  
  /**
    * _Sets the fill color._
    *
    * Sets the fill color to be used when performing a fill operation. Any fill operation performed afterwards will fill with the specified color until another call to setFillColor is
    * made.
    * @param color - Color to set for filling.
    * @see https://docs.scriptable.app/drawcontext/#-setfillcolor
    */
  def setFillColor(color: Color): Unit
  
  /**
    * _Sets the font to use when drawing text._
    *
    * Sets the font to be used when drawing texts to the context.
    * @param font - Font to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-setfont
    */
  def setFont(font: Font): Unit
  
  /**
    * _Sets the line width for stroking._
    *
    * Sets the line width to be used when performing a stroke operation.
    * @param width - Line width to use for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setlinewidth
    */
  def setLineWidth(width: Double): Unit
  
  /**
    * _Sets the stroke color._
    *
    * Sets the stroke color to be used when performing a stroke operation. Any stroke operation performed afterwards will stroke with the specified color until another call to
    * setStrokeColor is made.
    * @param color - Color to set for stroking.
    * @see https://docs.scriptable.app/drawcontext/#-setstrokecolor
    */
  def setStrokeColor(color: Color): Unit
  
  /**
    * _Specifies that texts should be center aligned._
    *
    * Sets text alignment to center. Texts drawn after calling this will be center aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedcenter
    */
  def setTextAlignedCenter(): Unit
  
  /**
    * _Specifies that texts should be left aligned._
    *
    * Sets text alignment to left. Texts drawn after calling this will be left aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedleft
    */
  def setTextAlignedLeft(): Unit
  
  /**
    * _Specifies that texts should be right aligned._
    *
    * Sets text alignment to right. Texts drawn after calling this will be right aligned inside the provided rectangle.
    * @see https://docs.scriptable.app/drawcontext/#-settextalignedright
    */
  def setTextAlignedRight(): Unit
  
  /**
    * _Sets the text color used when drawing text._
    *
    * Sets the text color to be used when drawing text strings to the context.
    * @param color - Color to use when drawing text.
    * @see https://docs.scriptable.app/drawcontext/#-settextcolor
    */
  def setTextColor(color: Color): Unit
  
  /**
    * _Size of canvas._
    *
    * Specifies the size of the canvas on which you are drawing. The image returned by getImage() will have this exact size, except if respectScreenScale is true.
    * @see https://docs.scriptable.app/drawcontext/#size
    */
  var size: Size
  
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-stroke
    */
  def stroke(rect: Rect): Unit
  
  /**
    * _Strokes an ellipse._
    *
    * Draws a line around the ellipse that fits within the supplied rectangle. The line will have the color set when calling setStrokeColor and the width set when calling setLineWidth.
    * @param rect - Rectangle incapsulating the ellipse to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokeellipse
    */
  def strokeEllipse(rect: Rect): Unit
  
  /**
    * _Strokes the path that was added the latest._
    *
    * The path that was added the latest to the context is stroked with the color set using setStrokeColor and the line width set using setLineWidth.
    * @see https://docs.scriptable.app/drawcontext/#-strokepath
    */
  def strokePath(): Unit
  
  /**
    * _Strokes a rectangle._
    *
    * Draws a line around the rectangle using the color set when calling setStrokeColor. The line will have the width set when calling setLineWidth.
    * @param rect - Rectangle to stroke.
    * @see https://docs.scriptable.app/drawcontext/#-strokerect
    */
  def strokeRect(rect: Rect): Unit
}
object DrawContext {
  
  inline def apply(
    addPath: Path => Unit,
    drawImageAtPoint: (Image, Point) => Unit,
    drawImageInRect: (Image, Rect) => Unit,
    drawText: (String, Point) => Unit,
    drawTextInRect: (String, Rect) => Unit,
    fill: Rect => Unit,
    fillEllipse: Rect => Unit,
    fillPath: () => Unit,
    fillRect: Rect => Unit,
    getImage: () => Image,
    opaque: Boolean,
    respectScreenScale: Boolean,
    setFillColor: Color => Unit,
    setFont: Font => Unit,
    setLineWidth: Double => Unit,
    setStrokeColor: Color => Unit,
    setTextAlignedCenter: () => Unit,
    setTextAlignedLeft: () => Unit,
    setTextAlignedRight: () => Unit,
    setTextColor: Color => Unit,
    size: Size,
    stroke: Rect => Unit,
    strokeEllipse: Rect => Unit,
    strokePath: () => Unit,
    strokeRect: Rect => Unit
  ): DrawContext = {
    val __obj = js.Dynamic.literal(addPath = js.Any.fromFunction1(addPath), drawImageAtPoint = js.Any.fromFunction2(drawImageAtPoint), drawImageInRect = js.Any.fromFunction2(drawImageInRect), drawText = js.Any.fromFunction2(drawText), drawTextInRect = js.Any.fromFunction2(drawTextInRect), fill = js.Any.fromFunction1(fill), fillEllipse = js.Any.fromFunction1(fillEllipse), fillPath = js.Any.fromFunction0(fillPath), fillRect = js.Any.fromFunction1(fillRect), getImage = js.Any.fromFunction0(getImage), opaque = opaque.asInstanceOf[js.Any], respectScreenScale = respectScreenScale.asInstanceOf[js.Any], setFillColor = js.Any.fromFunction1(setFillColor), setFont = js.Any.fromFunction1(setFont), setLineWidth = js.Any.fromFunction1(setLineWidth), setStrokeColor = js.Any.fromFunction1(setStrokeColor), setTextAlignedCenter = js.Any.fromFunction0(setTextAlignedCenter), setTextAlignedLeft = js.Any.fromFunction0(setTextAlignedLeft), setTextAlignedRight = js.Any.fromFunction0(setTextAlignedRight), setTextColor = js.Any.fromFunction1(setTextColor), size = size.asInstanceOf[js.Any], stroke = js.Any.fromFunction1(stroke), strokeEllipse = js.Any.fromFunction1(strokeEllipse), strokePath = js.Any.fromFunction0(strokePath), strokeRect = js.Any.fromFunction1(strokeRect))
    __obj.asInstanceOf[DrawContext]
  }
  
  extension [Self <: DrawContext](x: Self) {
    
    inline def setAddPath(value: Path => Unit): Self = StObject.set(x, "addPath", js.Any.fromFunction1(value))
    
    inline def setDrawImageAtPoint(value: (Image, Point) => Unit): Self = StObject.set(x, "drawImageAtPoint", js.Any.fromFunction2(value))
    
    inline def setDrawImageInRect(value: (Image, Rect) => Unit): Self = StObject.set(x, "drawImageInRect", js.Any.fromFunction2(value))
    
    inline def setDrawText(value: (String, Point) => Unit): Self = StObject.set(x, "drawText", js.Any.fromFunction2(value))
    
    inline def setDrawTextInRect(value: (String, Rect) => Unit): Self = StObject.set(x, "drawTextInRect", js.Any.fromFunction2(value))
    
    inline def setFill(value: Rect => Unit): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillEllipse(value: Rect => Unit): Self = StObject.set(x, "fillEllipse", js.Any.fromFunction1(value))
    
    inline def setFillPath(value: () => Unit): Self = StObject.set(x, "fillPath", js.Any.fromFunction0(value))
    
    inline def setFillRect(value: Rect => Unit): Self = StObject.set(x, "fillRect", js.Any.fromFunction1(value))
    
    inline def setGetImage(value: () => Image): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
    
    inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setRespectScreenScale(value: Boolean): Self = StObject.set(x, "respectScreenScale", value.asInstanceOf[js.Any])
    
    inline def setSetFillColor(value: Color => Unit): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1(value))
    
    inline def setSetFont(value: Font => Unit): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    inline def setSetLineWidth(value: Double => Unit): Self = StObject.set(x, "setLineWidth", js.Any.fromFunction1(value))
    
    inline def setSetStrokeColor(value: Color => Unit): Self = StObject.set(x, "setStrokeColor", js.Any.fromFunction1(value))
    
    inline def setSetTextAlignedCenter(value: () => Unit): Self = StObject.set(x, "setTextAlignedCenter", js.Any.fromFunction0(value))
    
    inline def setSetTextAlignedLeft(value: () => Unit): Self = StObject.set(x, "setTextAlignedLeft", js.Any.fromFunction0(value))
    
    inline def setSetTextAlignedRight(value: () => Unit): Self = StObject.set(x, "setTextAlignedRight", js.Any.fromFunction0(value))
    
    inline def setSetTextColor(value: Color => Unit): Self = StObject.set(x, "setTextColor", js.Any.fromFunction1(value))
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: Rect => Unit): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
    
    inline def setStrokeEllipse(value: Rect => Unit): Self = StObject.set(x, "strokeEllipse", js.Any.fromFunction1(value))
    
    inline def setStrokePath(value: () => Unit): Self = StObject.set(x, "strokePath", js.Any.fromFunction0(value))
    
    inline def setStrokeRect(value: Rect => Unit): Self = StObject.set(x, "strokeRect", js.Any.fromFunction1(value))
  }
}
