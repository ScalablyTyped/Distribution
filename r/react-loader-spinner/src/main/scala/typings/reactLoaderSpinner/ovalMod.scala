package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.typeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ovalMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Oval", JSImport.Default)
  @js.native
  val default: FunctionComponent[OvalProps] = js.native
  
  trait OvalProps
    extends StObject
       with BaseProps {
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[String | Double] = js.undefined
    
    var strokeWidthSecondary: js.UndefOr[String | Double] = js.undefined
  }
  object OvalProps {
    
    inline def apply(): OvalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OvalProps]
    }
    
    extension [Self <: OvalProps](x: Self) {
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setStrokeWidth(value: String | Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthSecondary(value: String | Double): Self = StObject.set(x, "strokeWidthSecondary", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthSecondaryUndefined: Self = StObject.set(x, "strokeWidthSecondary", js.undefined)
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  type _To = FunctionComponent[OvalProps]
  
  /* This means you don't have to write `default`, but can instead just say `ovalMod.foo` */
  override def _to: FunctionComponent[OvalProps] = default
}
