package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderRingsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Rings", JSImport.Default)
  @js.native
  val default: FunctionComponent[RingsProps] = js.native
  
  @JSImport("react-loader-spinner/dist/esm/loader/Rings", "Rings")
  @js.native
  val Rings: FunctionComponent[RingsProps] = js.native
  
  trait RingsProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object RingsProps {
    
    inline def apply(): RingsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RingsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RingsProps] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[RingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderRingsMod.foo` */
  override def _to: FunctionComponent[RingsProps] = default
}
