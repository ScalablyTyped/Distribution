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
  var getBackground: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getResizeHandler: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of sprites
    * @returns Object
    */
  var getSprites: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var resizeHandler: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of autoSize
    * @param autoSize Boolean The new value.
    */
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.undefined
  
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
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of sprites
    * @param sprites Object The new value.
    */
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of viewBox
    * @param viewBox Boolean The new value.
    */
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.undefined
}
object IComponent {
  
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  @scala.inline
  implicit class IComponentMutableBuilder[Self <: IComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setFitSurface(value: Boolean): Self = StObject.set(x, "fitSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitSurfaceUndefined: Self = StObject.set(x, "fitSurface", js.undefined)
    
    @scala.inline
    def setGetAutoSize(value: () => Boolean): Self = StObject.set(x, "getAutoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoSizeUndefined: Self = StObject.set(x, "getAutoSize", js.undefined)
    
    @scala.inline
    def setGetBackground(value: () => js.Any): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    @scala.inline
    def setGetFitSurface(value: () => Boolean): Self = StObject.set(x, "getFitSurface", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFitSurfaceUndefined: Self = StObject.set(x, "getFitSurface", js.undefined)
    
    @scala.inline
    def setGetGradients(value: () => Array): Self = StObject.set(x, "getGradients", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGradientsUndefined: Self = StObject.set(x, "getGradients", js.undefined)
    
    @scala.inline
    def setGetResizeHandler(value: () => js.Any): Self = StObject.set(x, "getResizeHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResizeHandlerUndefined: Self = StObject.set(x, "getResizeHandler", js.undefined)
    
    @scala.inline
    def setGetSprites(value: () => js.Any): Self = StObject.set(x, "getSprites", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpritesUndefined: Self = StObject.set(x, "getSprites", js.undefined)
    
    @scala.inline
    def setGetSurface(value: /* id */ js.UndefOr[String] => ISurface): Self = StObject.set(x, "getSurface", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSurfaceUndefined: Self = StObject.set(x, "getSurface", js.undefined)
    
    @scala.inline
    def setGetViewBox(value: () => Boolean): Self = StObject.set(x, "getViewBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewBoxUndefined: Self = StObject.set(x, "getViewBox", js.undefined)
    
    @scala.inline
    def setGradients(value: Array): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
    
    @scala.inline
    def setOnPlaceWatermark(value: () => Unit): Self = StObject.set(x, "onPlaceWatermark", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPlaceWatermarkUndefined: Self = StObject.set(x, "onPlaceWatermark", js.undefined)
    
    @scala.inline
    def setRenderFrame(value: () => Unit): Self = StObject.set(x, "renderFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
    
    @scala.inline
    def setResizeHandler(value: js.Any): Self = StObject.set(x, "resizeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeHandlerUndefined: Self = StObject.set(x, "resizeHandler", js.undefined)
    
    @scala.inline
    def setSetAutoSize(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoSizeUndefined: Self = StObject.set(x, "setAutoSize", js.undefined)
    
    @scala.inline
    def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    @scala.inline
    def setSetFitSurface(value: /* fitSurface */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFitSurface", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFitSurfaceUndefined: Self = StObject.set(x, "setFitSurface", js.undefined)
    
    @scala.inline
    def setSetGradients(value: /* gradients */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setGradients", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGradientsUndefined: Self = StObject.set(x, "setGradients", js.undefined)
    
    @scala.inline
    def setSetResizeHandler(value: /* resizeHandler */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResizeHandlerUndefined: Self = StObject.set(x, "setResizeHandler", js.undefined)
    
    @scala.inline
    def setSetSprites(value: /* sprites */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSprites", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSpritesUndefined: Self = StObject.set(x, "setSprites", js.undefined)
    
    @scala.inline
    def setSetViewBox(value: /* viewBox */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setViewBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetViewBoxUndefined: Self = StObject.set(x, "setViewBox", js.undefined)
    
    @scala.inline
    def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
  }
}
