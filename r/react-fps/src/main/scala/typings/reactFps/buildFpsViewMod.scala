package typings.reactFps

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFpsViewMod extends Shortcut {
  
  @JSImport("react-fps/build/FpsView", JSImport.Default)
  @js.native
  val default: FC[ComponentProps] = js.native
  
  trait ComponentProps extends StObject {
    
    var bottom: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var right: js.UndefOr[Double | String] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ComponentProps {
    
    inline def apply(): ComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentProps]
    }
    
    extension [Self <: ComponentProps](x: Self) {
      
      inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FC[ComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `buildFpsViewMod.foo` */
  override def _to: FC[ComponentProps] = default
}
