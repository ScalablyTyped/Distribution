package typings.reactSpringAnimated

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  trait TreeContext extends StObject {
    
    /**
      * Any animated values found when updating the payload of an `AnimatedObject`
      * are also added to this `Set` to be observed by an animated component.
      */
    var dependencies: (Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ Any
      ]) | Null
  }
  object TreeContext {
    
    @JSImport("@react-spring/animated/dist/declarations/src/context", "TreeContext")
    @js.native
    val ^ : TreeContext = js.native
    
    extension [Self <: TreeContext](x: Self) {
      
      inline def setDependencies(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue */ Any
            ]
      ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    }
  }
}
