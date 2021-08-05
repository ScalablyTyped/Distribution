package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.draw.sprite.ICircle
import typings.senchaTouch.Ext.draw.sprite.IPath
import typings.senchaTouch.Ext.draw.sprite.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grid {
  
  type ICircularGrid = ICircle
  
  trait IHorizontalGrid
    extends StObject
       with ISprite {
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IHorizontalGrid: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          js.Any
        ]
      ] = js.undefined
  }
  object IHorizontalGrid {
    
    inline def apply(): IHorizontalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHorizontalGrid]
    }
    
    extension [Self <: IHorizontalGrid](x: Self) {
      
      inline def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait IRadialGrid
    extends StObject
       with IPath {
    
    /** [Method] Render method
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IRadialGrid: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Update the path
      * @param path Object
      * @param attr Object
      */
    @JSName("updatePath")
    var updatePath_IRadialGrid: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IRadialGrid {
    
    inline def apply(): IRadialGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadialGrid]
    }
    
    extension [Self <: IRadialGrid](x: Self) {
      
      inline def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
      
      inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
    }
  }
  
  trait IVerticalGrid
    extends StObject
       with ISprite {
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IVerticalGrid: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          js.Any
        ]
      ] = js.undefined
  }
  object IVerticalGrid {
    
    inline def apply(): IVerticalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalGrid]
    }
    
    extension [Self <: IVerticalGrid](x: Self) {
      
      inline def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
