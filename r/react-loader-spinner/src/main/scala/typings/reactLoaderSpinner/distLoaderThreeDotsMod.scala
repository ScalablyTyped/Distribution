package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderThreeDotsMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/ThreeDots", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThreeDotsProps] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ThreeDotsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderThreeDotsMod.foo` */
  override def _to: FunctionComponent[ThreeDotsProps] = default
}
