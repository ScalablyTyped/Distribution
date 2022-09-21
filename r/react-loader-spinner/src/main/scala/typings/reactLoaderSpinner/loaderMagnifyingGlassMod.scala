package typings.reactLoaderSpinner

import typings.react.mod.global.JSX.Element
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMagnifyingGlassMod {
  
  @JSImport("react-loader-spinner/dist/loader/MagnifyingGlass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasVisibleHeightWidthWrapperClassWrapperStyleAriaLabelGlassColorColor: MagnifyingGlassProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasVisibleHeightWidthWrapperClassWrapperStyleAriaLabelGlassColorColor.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait MagnifyingGlassProps
    extends StObject
       with BaseProps {
    
    var glassColor: js.UndefOr[String] = js.undefined
  }
  object MagnifyingGlassProps {
    
    inline def apply(): MagnifyingGlassProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagnifyingGlassProps]
    }
    
    extension [Self <: MagnifyingGlassProps](x: Self) {
      
      inline def setGlassColor(value: String): Self = StObject.set(x, "glassColor", value.asInstanceOf[js.Any])
      
      inline def setGlassColorUndefined: Self = StObject.set(x, "glassColor", js.undefined)
    }
  }
}
