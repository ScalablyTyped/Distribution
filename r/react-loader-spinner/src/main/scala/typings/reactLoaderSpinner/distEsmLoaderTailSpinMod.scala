package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderTailSpinMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/TailSpin", JSImport.Default)
  @js.native
  val default: FunctionComponent[TailSpinProps] = js.native
  
  @JSImport("react-loader-spinner/dist/esm/loader/TailSpin", "TailSpin")
  @js.native
  val TailSpin: FunctionComponent[TailSpinProps] = js.native
  
  trait TailSpinProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object TailSpinProps {
    
    inline def apply(): TailSpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TailSpinProps]
    }
    
    extension [Self <: TailSpinProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TailSpinProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderTailSpinMod.foo` */
  override def _to: FunctionComponent[TailSpinProps] = default
}
