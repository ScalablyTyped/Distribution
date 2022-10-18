package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcAnimationConfigMod.AnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimationMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Extract<keyof @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringProps<T>, @react-spring/core.@react-spring/core/dist/declarations/src/types/internal.EventKey> ]:? std.Extract<@react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringProps<T>[P], std.Function>} */ @JSImport("@react-spring/core/dist/declarations/src/Animation", "Animation")
  @js.native
  open class Animation[T] () extends StObject {
    
    var changed: Boolean = js.native
    
    var config: AnimationConfig = js.native
    
    var from: T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) = js.native
    
    var fromValues: js.Array[Double] = js.native
    
    var immediate: Boolean = js.native
    
    var to: T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) = js.native
    
    var toValues: js.Array[Double] | Null = js.native
    
    var values: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedValue */ Any
      ] = js.native
  }
}
