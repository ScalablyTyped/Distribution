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
    
    @scala.inline
    def apply(): IHorizontalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHorizontalGrid]
    }
    
    @scala.inline
    implicit class IHorizontalGridMutableBuilder[Self <: IHorizontalGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
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
    
    @scala.inline
    def apply(): IRadialGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadialGrid]
    }
    
    @scala.inline
    implicit class IRadialGridMutableBuilder[Self <: IRadialGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
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
    
    @scala.inline
    def apply(): IVerticalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalGrid]
    }
    
    @scala.inline
    implicit class IVerticalGridMutableBuilder[Self <: IVerticalGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
