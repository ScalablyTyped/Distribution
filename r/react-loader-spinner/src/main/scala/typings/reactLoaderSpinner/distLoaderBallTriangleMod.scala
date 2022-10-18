package typings.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactLoaderSpinner.distTypeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderBallTriangleMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/loader/BallTriangle", JSImport.Default)
  @js.native
  val default: FunctionComponent[BallTriangleProps] = js.native
  
  trait BallTriangleProps
    extends StObject
       with BaseProps {
    
    var radius: js.UndefOr[String | Double] = js.undefined
  }
  object BallTriangleProps {
    
    inline def apply(): BallTriangleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BallTriangleProps]
    }
    
    extension [Self <: BallTriangleProps](x: Self) {
      
      inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  type _To = FunctionComponent[BallTriangleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distLoaderBallTriangleMod.foo` */
  override def _to: FunctionComponent[BallTriangleProps] = default
}
