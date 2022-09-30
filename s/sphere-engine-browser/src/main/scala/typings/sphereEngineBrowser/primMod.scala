package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primMod {
  
  /**
    * Provides utility functions for rendering primitive shapes such as circles and rectangles.
    */
  object default {
    
    @JSImport("prim", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Render an entire texture as an 2D image to a surface.
      * @param surface Surface on which to render the image.
      * @param x       X coordinate of the upper-left corner on the surface.
      * @param y       Y coordinate of the upper-left corner on the surface.
      * @param texture Texture to be rendered.
      * @param mask    Optional color whose RGBA values will be multiplied with those of the
      *                texture. Use to tint the rendered image.
      */
    inline def blit(surface: Surface, x: Double, y: Double, texture: Texture): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blit")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def blit(surface: Surface, x: Double, y: Double, texture: Texture, mask: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blit")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Render a portion of a texture as an 2D image to a surface.
      * @param surface Surface on which to render the image.
      * @param x       X coordinate of the upper-left corner on the surface.
      * @param y       Y coordinate of the upper-left corner on the surface.
      * @param texture Texture to be rendered.
      * @param sx      X coordinate, in pixels, of the top-left corner of the texture portion to draw.
      * @param sy      Y coordinate, in pixels, of the top-left corner of the texture portion to draw.
      * @param width   Width, in pixels, of the texture portion to draw.
      * @param height  Height, in pixels, of the texture portion to draw.
      * @param mask    Optional color whose RGBA values will be multiplied with those of the
      *                texture. Use to tint the rendered image.
      */
    inline def blitSection(
      surface: Surface,
      x: Double,
      y: Double,
      texture: Texture,
      sx: Double,
      sy: Double,
      width: Double,
      height: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blitSection")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def blitSection(
      surface: Surface,
      x: Double,
      y: Double,
      texture: Texture,
      sx: Double,
      sy: Double,
      width: Double,
      height: Double,
      mask: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("blitSection")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawLine(surface: Surface, x1: Double, y1: Double, x2: Double, y2: Double, thickness: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawLine")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawLine(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      thickness: Double,
      color: Color,
      color2: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawLine")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawPoint(surface: Surface, x: Double, y: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawPoint")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawRectangle(
      surface: Surface,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      thickness: Double,
      color: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidCircle(surface: Surface, x: Double, y: Double, radius: Double, color: Color, color2: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidCircle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidEllipse(surface: Surface, x: Double, y: Double, rx: Double, ry: Double, color: Color, color2: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidEllipse")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], color.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidRectangle(
      surface: Surface,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      colorUL: Color,
      colorUR: Color,
      colorLR: Color,
      colorLL: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], colorUL.asInstanceOf[js.Any], colorUR.asInstanceOf[js.Any], colorLR.asInstanceOf[js.Any], colorLL.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidRectangle(surface: Surface, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidRectangle")(surface.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def drawSolidTriangle(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      color1: Color,
      color2: Color,
      color3: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidTriangle")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], color3.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def drawSolidTriangle(
      surface: Surface,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      color: Color
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSolidTriangle")(surface.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Fill an entire surface with a specified color.
      * @param surface The surface to fill.
      * @param color   Color to fill the surface with. Can be translucent, in which case the fill will be too.
      */
    inline def fill(surface: Surface, color: Color): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(surface.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
