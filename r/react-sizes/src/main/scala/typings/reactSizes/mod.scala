package typings.reactSizes

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sizes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[SP /* <: js.Object */, P /* <: SP */](mapSizesToProps: js.Function1[/* sizes */ Sizes, SP]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapSizesToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
  
  inline def WithSizes[SP /* <: js.Object */, P /* <: SP */](mapSizesToProps: js.Function1[/* sizes */ Sizes, SP]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("WithSizes")(mapSizesToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], ComponentType[P]]]
  
  trait Sizes extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Sizes {
    
    inline def apply(height: Double, width: Double): Sizes = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
