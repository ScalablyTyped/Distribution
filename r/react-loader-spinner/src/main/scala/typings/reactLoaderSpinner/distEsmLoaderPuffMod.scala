package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderPuffMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Puff", JSImport.Default)
  @js.native
  val default: FunctionComponent[PuffProps] = js.native
  
  @JSImport("react-loader-spinner/dist/esm/loader/Puff", "Puff")
  @js.native
  val Puff: FunctionComponent[PuffProps] = js.native
  
  trait PuffProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object PuffProps {
    
    inline def apply(): PuffProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PuffProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PuffProps] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PuffProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderPuffMod.foo` */
  override def _to: FunctionComponent[PuffProps] = default
}
