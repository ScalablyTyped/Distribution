package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderGridMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Grid", JSImport.Default)
  @js.native
  val default: FunctionComponent[GridProps] = js.native
  
  @JSImport("react-loader-spinner/dist/esm/loader/Grid", "Grid")
  @js.native
  val Grid: FunctionComponent[GridProps] = js.native
  
  trait GridProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[GridProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderGridMod.foo` */
  override def _to: FunctionComponent[GridProps] = default
}
