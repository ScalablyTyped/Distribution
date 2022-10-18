package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderMutatingDotsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/MutatingDots", JSImport.Default)
  @js.native
  val default: FunctionComponent[MutatingDotsProps] = js.native
  
  trait MutatingDotsProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object MutatingDotsProps {
    
    inline def apply(): MutatingDotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutatingDotsProps]
    }
    
    extension [Self <: MutatingDotsProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
  
  type _To = FunctionComponent[MutatingDotsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderMutatingDotsMod.foo` */
  override def _to: FunctionComponent[MutatingDotsProps] = default
}
