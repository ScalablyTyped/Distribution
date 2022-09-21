package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponent
  extends StObject
     with IContainer {
  
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of autoSize
    * @returns Boolean
    */
  var getAutoSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of fitSurface
    * @returns Boolean
    */
  var getFitSurface: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of gradients
    * @returns Object[]
    */
  var getGradients: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of resizeHandler
    * @returns Function
    */
  var getResizeHandler: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of sprites
    * @returns Object
    */
  var getSprites: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Get a surface by the given id or create one if it doesn t exist
    * @param id String
    * @returns Ext.draw.Surface
    */
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], ISurface]] = js.undefined
  
  /** [Method] Returns the value of viewBox
    * @returns Boolean
    */
  var getViewBox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.undefined
  
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of autoSize
    * @param autoSize Boolean The new value.
    */
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of fitSurface
    * @param fitSurface Boolean The new value.
    */
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of gradients
    * @param gradients Object[] The new value.
    */
  var setGradients: js.UndefOr[js.Function1[/* gradients */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of resizeHandler
    * @param resizeHandler Function The new value.
    */
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of sprites
    * @param sprites Object The new value.
    */
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of viewBox
    * @param viewBox Boolean The new value.
    */
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}
object IComponent {
  
  inline def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  extension [Self <: IComponent](x: Self) {
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    inline def setFitSurface(value: Boolean): Self = StObject.set(x, "fitSurface", value.asInstanceOf[js.Any])
    
    inline def setFitSurfaceUndefined: Self = StObject.set(x, "fitSurface", js.undefined)
    
    inline def setGetAutoSize(value: () => Boolean): Self = StObject.set(x, "getAutoSize", js.Any.fromFunction0(value))
    
    inline def setGetAutoSizeUndefined: Self = StObject.set(x, "getAutoSize", js.undefined)
    
    inline def setGetBackground(value: () => Any): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    inline def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
    
    inline def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetFitSurface(value: () => Boolean): Self = StObject.set(x, "getFitSurface", js.Any.fromFunction0(value))
    
    inline def setGetFitSurfaceUndefined: Self = StObject.set(x, "getFitSurface", js.undefined)
    
    inline def setGetGradients(value: () => Array): Self = StObject.set(x, "getGradients", js.Any.fromFunction0(value))
    
    inline def setGetGradientsUndefined: Self = StObject.set(x, "getGradients", js.undefined)
    
    inline def setGetResizeHandler(value: () => Any): Self = StObject.set(x, "getResizeHandler", js.Any.fromFunction0(value))
    
    inline def setGetResizeHandlerUndefined: Self = StObject.set(x, "getResizeHandler", js.undefined)
    
    inline def setGetSprites(value: () => Any): Self = StObject.set(x, "getSprites", js.Any.fromFunction0(value))
    
    inline def setGetSpritesUndefined: Self = StObject.set(x, "getSprites", js.undefined)
    
    inline def setGetSurface(value: /* id */ js.UndefOr[String] => ISurface): Self = StObject.set(x, "getSurface", js.Any.fromFunction1(value))
    
    inline def setGetSurfaceUndefined: Self = StObject.set(x, "getSurface", js.undefined)
    
    inline def setGetViewBox(value: () => Boolean): Self = StObject.set(x, "getViewBox", js.Any.fromFunction0(value))
    
    inline def setGetViewBoxUndefined: Self = StObject.set(x, "getViewBox", js.undefined)
    
    inline def setGradients(value: Array): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
    
    inline def setOnPlaceWatermark(value: () => Unit): Self = StObject.set(x, "onPlaceWatermark", js.Any.fromFunction0(value))
    
    inline def setOnPlaceWatermarkUndefined: Self = StObject.set(x, "onPlaceWatermark", js.undefined)
    
    inline def setRenderFrame(value: () => Unit): Self = StObject.set(x, "renderFrame", js.Any.fromFunction0(value))
    
    inline def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
    
    inline def setResizeHandler(value: Any): Self = StObject.set(x, "resizeHandler", value.asInstanceOf[js.Any])
    
    inline def setResizeHandlerUndefined: Self = StObject.set(x, "resizeHandler", js.undefined)
    
    inline def setSetAutoSize(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSize", js.Any.fromFunction1(value))
    
    inline def setSetAutoSizeUndefined: Self = StObject.set(x, "setAutoSize", js.undefined)
    
    inline def setSetBackground(value: /* background */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetFitSurface(value: /* fitSurface */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFitSurface", js.Any.fromFunction1(value))
    
    inline def setSetFitSurfaceUndefined: Self = StObject.set(x, "setFitSurface", js.undefined)
    
    inline def setSetGradients(value: /* gradients */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setGradients", js.Any.fromFunction1(value))
    
    inline def setSetGradientsUndefined: Self = StObject.set(x, "setGradients", js.undefined)
    
    inline def setSetResizeHandler(value: /* resizeHandler */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setResizeHandler", js.Any.fromFunction1(value))
    
    inline def setSetResizeHandlerUndefined: Self = StObject.set(x, "setResizeHandler", js.undefined)
    
    inline def setSetSprites(value: /* sprites */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSprites", js.Any.fromFunction1(value))
    
    inline def setSetSpritesUndefined: Self = StObject.set(x, "setSprites", js.undefined)
    
    inline def setSetViewBox(value: /* viewBox */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setViewBox", js.Any.fromFunction1(value))
    
    inline def setSetViewBoxUndefined: Self = StObject.set(x, "setViewBox", js.undefined)
    
    inline def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
