package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILayoutAnimationBuilder extends StObject {
  
  def build(): LayoutAnimationFunction
}
object ILayoutAnimationBuilder {
  
  inline def apply(build: () => LayoutAnimationFunction): ILayoutAnimationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[ILayoutAnimationBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILayoutAnimationBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => LayoutAnimationFunction): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
  }
}
