package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.engine.svgcontext.IGradient
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engine {
  
  @js.native
  trait ICanvas extends ISurface {
    
    /** [Method] Clears the current transformation state on the surface  */
    var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Returns the value of highPrecision
      * @returns Boolean
      */
    var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (Boolean) */
    var highPrecision: js.UndefOr[Boolean] = js.native
    
    /** [Method] Initialize the canvas element  */
    var initElement: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Sets the value of highPrecision
      * @param highPrecision Boolean The new value.
      */
    var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
  }
  object ICanvas {
    
    @scala.inline
    def apply(): ICanvas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvas]
    }
    
    @scala.inline
    implicit class ICanvasMutableBuilder[Self <: ICanvas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTransform(value: () => Unit): Self = StObject.set(x, "clearTransform", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearTransformUndefined: Self = StObject.set(x, "clearTransform", js.undefined)
      
      @scala.inline
      def setGetHighPrecision(value: () => Boolean): Self = StObject.set(x, "getHighPrecision", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHighPrecisionUndefined: Self = StObject.set(x, "getHighPrecision", js.undefined)
      
      @scala.inline
      def setHighPrecision(value: Boolean): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighPrecisionUndefined: Self = StObject.set(x, "highPrecision", js.undefined)
      
      @scala.inline
      def setInitElement(value: () => Unit): Self = StObject.set(x, "initElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitElementUndefined: Self = StObject.set(x, "initElement", js.undefined)
      
      @scala.inline
      def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHighPrecision", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHighPrecisionUndefined: Self = StObject.set(x, "setHighPrecision", js.undefined)
    }
  }
  
  @js.native
  trait ISvg extends ISurface {
    
    /** [Method] Clears the current transformation state on the surface  */
    var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Creates a DOM element under the SVG namespace of the given type
      * @param type String The type of the SVG DOM element.
      * @returns * The created element.
      */
    var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], _]] = js.native
    
    /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
      * @param path Object
      * @param matrix Object
      * @param band Object
      */
    @JSName("destroy")
    var destroy_ISvg: js.UndefOr[
        js.Function3[
          /* path */ js.UndefOr[js.Any], 
          /* matrix */ js.UndefOr[js.Any], 
          /* band */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Returns the value of highPrecision
      * @returns Boolean
      */
    var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (Boolean) */
    var highPrecision: js.UndefOr[Boolean] = js.native
    
    /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
      * @param sprite Object
      * @param destroySprite Object
      */
    @JSName("remove")
    var remove_ISvg: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Renders a single sprite into the surface
      * @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
      * @returns Boolean returns false to stop the rendering to continue.
      */
    var renderSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Boolean]] = js.native
    
    /** [Method] Sets the value of highPrecision
      * @param highPrecision Boolean The new value.
      */
    var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
  }
  object ISvg {
    
    @scala.inline
    def apply(): ISvg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISvg]
    }
    
    @scala.inline
    implicit class ISvgMutableBuilder[Self <: ISvg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTransform(value: () => Unit): Self = StObject.set(x, "clearTransform", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearTransformUndefined: Self = StObject.set(x, "clearTransform", js.undefined)
      
      @scala.inline
      def setCreateSvgNode(value: /* type */ js.UndefOr[String] => _): Self = StObject.set(x, "createSvgNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateSvgNodeUndefined: Self = StObject.set(x, "createSvgNode", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: (/* path */ js.UndefOr[js.Any], /* matrix */ js.UndefOr[js.Any], /* band */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetHighPrecision(value: () => Boolean): Self = StObject.set(x, "getHighPrecision", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHighPrecisionUndefined: Self = StObject.set(x, "getHighPrecision", js.undefined)
      
      @scala.inline
      def setHighPrecision(value: Boolean): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighPrecisionUndefined: Self = StObject.set(x, "highPrecision", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRenderSprite(value: /* sprite */ js.UndefOr[ISprite] => Boolean): Self = StObject.set(x, "renderSprite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSpriteUndefined: Self = StObject.set(x, "renderSprite", js.undefined)
      
      @scala.inline
      def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHighPrecision", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHighPrecisionUndefined: Self = StObject.set(x, "setHighPrecision", js.undefined)
    }
  }
  
  @js.native
  trait ISvgContext extends IBase {
    
    /** [Method] Adds points to the subpath such that the arc described by the circumference of the circle described by the arguments
      * @param x Number
      * @param y Number
      * @param radius Number
      * @param startAngle Number
      * @param endAngle Number
      * @param anticlockwise Number
      */
    var arc: js.UndefOr[
        js.Function6[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* radius */ js.UndefOr[Double], 
          /* startAngle */ js.UndefOr[Double], 
          /* endAngle */ js.UndefOr[Double], 
          /* anticlockwise */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Arc command using svg parameters
      * @param r1 Number
      * @param r2 Number
      * @param rotation Number
      * @param large Number
      * @param swipe Number
      * @param x2 Number
      * @param y2 Number
      */
    var arcSvg: js.UndefOr[
        js.Function7[
          /* r1 */ js.UndefOr[Double], 
          /* r2 */ js.UndefOr[Double], 
          /* rotation */ js.UndefOr[Double], 
          /* large */ js.UndefOr[Double], 
          /* swipe */ js.UndefOr[Double], 
          /* x2 */ js.UndefOr[Double], 
          /* y2 */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Adds an arc with the given control points and radius to the current subpath connected to the previous point by a str
      * @param x1 Number
      * @param y1 Number
      * @param x2 Number
      * @param y2 Number
      * @param radiusX Number
      * @param radiusY Number
      * @param rotation Number
      */
    var arcTo: js.UndefOr[
        js.Function7[
          /* x1 */ js.UndefOr[Double], 
          /* y1 */ js.UndefOr[Double], 
          /* x2 */ js.UndefOr[Double], 
          /* y2 */ js.UndefOr[Double], 
          /* radiusX */ js.UndefOr[Double], 
          /* radiusY */ js.UndefOr[Double], 
          /* rotation */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Resets the current default path  */
    var beginPath: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Adds the given point to the current subpath connected to the previous one by a cubic B zier curve with the given con
      * @param x1 Number
      * @param y1 Number
      * @param x2 Number
      * @param y2 Number
      * @param x3 Number
      * @param y3 Number
      */
    var bezierCurveTo: js.UndefOr[
        js.Function6[
          /* x1 */ js.UndefOr[Double], 
          /* y1 */ js.UndefOr[Double], 
          /* x2 */ js.UndefOr[Double], 
          /* y2 */ js.UndefOr[Double], 
          /* x3 */ js.UndefOr[Double], 
          /* y3 */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Clears the context  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Marks the current subpath as closed and starts a new subpath with a point the same as the start and end of the newly  */
    var closePath: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Returns an object that represents a linear gradient that paints along the line given by the coordinates represented b
      * @param x0 Number
      * @param y0 Number
      * @param x1 Number
      * @param y1 Number
      * @returns Ext.draw.engine.SvgContext.Gradient
      */
    var createLinearGradient: js.UndefOr[
        js.Function4[
          /* x0 */ js.UndefOr[Double], 
          /* y0 */ js.UndefOr[Double], 
          /* x1 */ js.UndefOr[Double], 
          /* y1 */ js.UndefOr[Double], 
          IGradient
        ]
      ] = js.native
    
    /** [Method] Returns a CanvasGradient object that represents a radial gradient that paints along the cone given by the circles rep
      * @param x0 Number
      * @param y0 Number
      * @param r0 Number
      * @param x1 Number
      * @param y1 Number
      * @param r1 Number
      * @returns Ext.draw.engine.SvgContext.Gradient
      */
    var createRadialGradient: js.UndefOr[
        js.Function6[
          /* x0 */ js.UndefOr[Double], 
          /* y0 */ js.UndefOr[Double], 
          /* r0 */ js.UndefOr[Double], 
          /* x1 */ js.UndefOr[Double], 
          /* y1 */ js.UndefOr[Double], 
          /* r1 */ js.UndefOr[Double], 
          IGradient
        ]
      ] = js.native
    
    /** [Method] Draws the given image onto the canvas
      * @param image HTMLElement
      * @param sx Number
      * @param sy Number
      * @param sw Number
      * @param sh Number
      * @param dx Number
      * @param dy Number
      * @param dw Number
      * @param dh Number
      */
    var drawImage: js.UndefOr[
        js.Function9[
          /* image */ js.UndefOr[HTMLElement], 
          /* sx */ js.UndefOr[Double], 
          /* sy */ js.UndefOr[Double], 
          /* sw */ js.UndefOr[Double], 
          /* sh */ js.UndefOr[Double], 
          /* dx */ js.UndefOr[Double], 
          /* dy */ js.UndefOr[Double], 
          /* dw */ js.UndefOr[Double], 
          /* dh */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Adds points to the subpath such that the arc described by the circumference of the ellipse described by the arguments
      * @param x Number
      * @param y Number
      * @param radiusX Number
      * @param radiusY Number
      * @param rotation Number
      * @param startAngle Number
      * @param endAngle Number
      * @param anticlockwise Number
      */
    var ellipse: js.UndefOr[
        js.Function8[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* radiusX */ js.UndefOr[Double], 
          /* radiusY */ js.UndefOr[Double], 
          /* rotation */ js.UndefOr[Double], 
          /* startAngle */ js.UndefOr[Double], 
          /* endAngle */ js.UndefOr[Double], 
          /* anticlockwise */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Fills the subpaths of the current default path or the given path with the current fill style  */
    var fill: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Paints the given rectangle onto the canvas using the current fill style
      * @param x Number
      * @param y Number
      * @param width Number
      * @param height Number
      */
    var fillRect: js.UndefOr[
        js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Note After the method guarantees the transform matrix will be inverted
      * @param attr Object The attribute object
      * @param transformFillStroke Boolean Indicate whether to transform fill and stroke. If this is not given, then uses attr.transformFillStroke instead.
      */
    var fillStroke: js.UndefOr[
        js.Function2[/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Fills the given text at the given position
      * @param text String
      * @param x Number
      * @param y Number
      */
    var fillText: js.UndefOr[
        js.Function3[
          /* text */ js.UndefOr[String], 
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Adds the given point to the current subpath connected to the previous one by a straight line
      * @param x Number
      * @param y Number
      */
    var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Creates a new subpath with the given point
      * @param x Number
      * @param y Number
      */
    var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Adds a new closed subpath to the path representing the given rectangle
      * @param x Number
      * @param y Number
      * @param width Number
      * @param height Number
      */
    var rect: js.UndefOr[
        js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Pops the state stack and restores the state  */
    var restore: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Pushes the context state to the state stack  */
    var save: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Changes the transformation matrix to the matrix given by the arguments as described below
      * @param xx Number
      * @param yx Number
      * @param xy Number
      * @param yy Number
      * @param dx Number
      * @param dy Number
      */
    var setTransform: js.UndefOr[
        js.Function6[
          /* xx */ js.UndefOr[Double], 
          /* yx */ js.UndefOr[Double], 
          /* xy */ js.UndefOr[Double], 
          /* yy */ js.UndefOr[Double], 
          /* dx */ js.UndefOr[Double], 
          /* dy */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Strokes the subpaths of the current default path or the given path with the current stroke style  */
    var stroke: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Paints the box that outlines the given rectangle onto the canvas using the current stroke style
      * @param x Number
      * @param y Number
      * @param width Number
      * @param height Number
      */
    var strokeRect: js.UndefOr[
        js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* width */ js.UndefOr[Double], 
          /* height */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Strokes the given text at the given position
      * @param text String
      * @param x Number
      * @param y Number
      */
    var strokeText: js.UndefOr[
        js.Function3[
          /* text */ js.UndefOr[String], 
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Changes the transformation matrix to apply the matrix given by the arguments as described below
      * @param xx Number
      * @param yx Number
      * @param xy Number
      * @param yy Number
      * @param dx Number
      * @param dy Number
      */
    var transform: js.UndefOr[
        js.Function6[
          /* xx */ js.UndefOr[Double], 
          /* yx */ js.UndefOr[Double], 
          /* xy */ js.UndefOr[Double], 
          /* yy */ js.UndefOr[Double], 
          /* dx */ js.UndefOr[Double], 
          /* dy */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
  }
  object ISvgContext {
    
    @scala.inline
    def apply(): ISvgContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISvgContext]
    }
    
    @scala.inline
    implicit class ISvgContextMutableBuilder[Self <: ISvgContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArc(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "arc", js.Any.fromFunction6(value))
      
      @scala.inline
      def setArcSvg(
        value: (/* r1 */ js.UndefOr[Double], /* r2 */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* large */ js.UndefOr[Double], /* swipe */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "arcSvg", js.Any.fromFunction7(value))
      
      @scala.inline
      def setArcSvgUndefined: Self = StObject.set(x, "arcSvg", js.undefined)
      
      @scala.inline
      def setArcTo(
        value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "arcTo", js.Any.fromFunction7(value))
      
      @scala.inline
      def setArcToUndefined: Self = StObject.set(x, "arcTo", js.undefined)
      
      @scala.inline
      def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
      
      @scala.inline
      def setBeginPath(value: () => Unit): Self = StObject.set(x, "beginPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeginPathUndefined: Self = StObject.set(x, "beginPath", js.undefined)
      
      @scala.inline
      def setBezierCurveTo(
        value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* x3 */ js.UndefOr[Double], /* y3 */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "bezierCurveTo", js.Any.fromFunction6(value))
      
      @scala.inline
      def setBezierCurveToUndefined: Self = StObject.set(x, "bezierCurveTo", js.undefined)
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClosePath(value: () => Unit): Self = StObject.set(x, "closePath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
      
      @scala.inline
      def setCreateLinearGradient(
        value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double]) => IGradient
      ): Self = StObject.set(x, "createLinearGradient", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCreateLinearGradientUndefined: Self = StObject.set(x, "createLinearGradient", js.undefined)
      
      @scala.inline
      def setCreateRadialGradient(
        value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* r0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* r1 */ js.UndefOr[Double]) => IGradient
      ): Self = StObject.set(x, "createRadialGradient", js.Any.fromFunction6(value))
      
      @scala.inline
      def setCreateRadialGradientUndefined: Self = StObject.set(x, "createRadialGradient", js.undefined)
      
      @scala.inline
      def setDrawImage(
        value: (/* image */ js.UndefOr[HTMLElement], /* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* sw */ js.UndefOr[Double], /* sh */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double], /* dw */ js.UndefOr[Double], /* dh */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "drawImage", js.Any.fromFunction9(value))
      
      @scala.inline
      def setDrawImageUndefined: Self = StObject.set(x, "drawImage", js.undefined)
      
      @scala.inline
      def setEllipse(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "ellipse", js.Any.fromFunction8(value))
      
      @scala.inline
      def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      @scala.inline
      def setFill(value: () => Unit): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFillRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "fillRect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFillRectUndefined: Self = StObject.set(x, "fillRect", js.undefined)
      
      @scala.inline
      def setFillStroke(value: (/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "fillStroke", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFillStrokeUndefined: Self = StObject.set(x, "fillStroke", js.undefined)
      
      @scala.inline
      def setFillText(
        value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "fillText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFillTextUndefined: Self = StObject.set(x, "fillText", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "lineTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLineToUndefined: Self = StObject.set(x, "lineTo", js.undefined)
      
      @scala.inline
      def setMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
      
      @scala.inline
      def setRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "rect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      @scala.inline
      def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setSetTransform(
        value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "setTransform", js.Any.fromFunction6(value))
      
      @scala.inline
      def setSetTransformUndefined: Self = StObject.set(x, "setTransform", js.undefined)
      
      @scala.inline
      def setStroke(value: () => Unit): Self = StObject.set(x, "stroke", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStrokeRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStrokeRectUndefined: Self = StObject.set(x, "strokeRect", js.undefined)
      
      @scala.inline
      def setStrokeText(
        value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "strokeText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStrokeTextUndefined: Self = StObject.set(x, "strokeText", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "transform", js.Any.fromFunction6(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  object svgcontext {
    
    @js.native
    trait IGradient extends IBase {
      
      /** [Method] Adds a color stop with the given color to the gradient at the given offset
        * @param offset Number
        * @param color String
        */
      var addColorStop: js.UndefOr[
            js.Function2[/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String], Unit]
          ] = js.native
    }
    object IGradient {
      
      @scala.inline
      def apply(): IGradient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGradient]
      }
      
      @scala.inline
      implicit class IGradientMutableBuilder[Self <: IGradient] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddColorStop(value: (/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAddColorStopUndefined: Self = StObject.set(x, "addColorStop", js.undefined)
      }
    }
  }
}
