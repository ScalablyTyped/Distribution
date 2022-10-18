package typings.reactSpringCore

import typings.react.mod.Consumer
import typings.react.mod.PropsWithChildren
import typings.react.mod.Provider
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSpringContextMod {
  
  trait SpringContext extends StObject {
    
    /** Force all new and existing animations to be immediate. */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /** Pause all new and existing animations. */
    var pause: js.UndefOr[Boolean] = js.undefined
  }
  object SpringContext {
    
    inline def apply(hasChildrenProps: PropsWithChildren[SpringContext]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@react-spring/core/dist/declarations/src/SpringContext", "SpringContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/core/dist/declarations/src/SpringContext", "SpringContext.Consumer")
    @js.native
    def Consumer: typings.react.mod.Consumer[SpringContext] = js.native
    inline def Consumer_=(x: Consumer[SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/core/dist/declarations/src/SpringContext", "SpringContext.Provider")
    @js.native
    def Provider: typings.react.mod.Provider[SpringContext] = js.native
    inline def Provider_=(x: Provider[SpringContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
    
    extension [Self <: SpringContext](x: Self) {
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    }
  }
}
