package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntryExitAnimationBuilder extends StObject {
  
  def build(): EntryExitAnimationFunction
}
object IEntryExitAnimationBuilder {
  
  inline def apply(build: () => EntryExitAnimationFunction): IEntryExitAnimationBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[IEntryExitAnimationBuilder]
  }
  
  extension [Self <: IEntryExitAnimationBuilder](x: Self) {
    
    inline def setBuild(value: () => EntryExitAnimationFunction): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
  }
}
