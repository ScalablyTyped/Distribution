package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderRevolvingDotMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/RevolvingDot", JSImport.Default)
  @js.native
  val default: FunctionComponent[RevolvingDotProps] = js.native
  
  trait RevolvingDotProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object RevolvingDotProps {
    
    inline def apply(): RevolvingDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevolvingDotProps]
    }
    
    extension [Self <: RevolvingDotProps](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  type _To = FunctionComponent[RevolvingDotProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderRevolvingDotMod.foo` */
  override def _to: FunctionComponent[RevolvingDotProps] = default
}
