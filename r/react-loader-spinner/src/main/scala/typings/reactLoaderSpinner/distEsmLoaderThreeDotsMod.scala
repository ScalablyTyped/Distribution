package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distEsmTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderThreeDotsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/ThreeDots", JSImport.Default)
  @js.native
  val default: FunctionComponent[ThreeDotsProps] = js.native
  
  trait ThreeDotsProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object ThreeDotsProps {
    
    inline def apply(): ThreeDotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThreeDotsProps]
    }
    
    extension [Self <: ThreeDotsProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ThreeDotsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderThreeDotsMod.foo` */
  override def _to: FunctionComponent[ThreeDotsProps] = default
}
