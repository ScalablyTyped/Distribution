package typings.reactSizes

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sizes", JSImport.Default)
  @js.native
  def default[SP /* <: js.Object */, P /* <: SP */](mapSizesToProps: js.Function1[/* sizes */ Sizes, SP]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
  
  @JSImport("react-sizes", "WithSizes")
  @js.native
  def WithSizes[SP /* <: js.Object */, P /* <: SP */](mapSizesToProps: js.Function1[/* sizes */ Sizes, SP]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
  
  @js.native
  trait Sizes extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Sizes {
    
    @scala.inline
    def apply(height: Double, width: Double): Sizes = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    @scala.inline
    implicit class SizesMutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
