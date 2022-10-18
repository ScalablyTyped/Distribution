package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcFrameValueMod.FrameValue
import typings.reactSpringTypes.interpolationMod.InterpolatorArgs
import typings.reactSpringTypes.interpolationMod.InterpolatorFn
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInterpolationMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/Interpolation", "Interpolation")
  @js.native
  open class Interpolation[Input, Output] protected () extends FrameValue[Output] {
    def this(/** The source of input values */
    source: Any, args: InterpolatorArgs[Input, Output]) = this()
    
    /** The inputs which are currently animating */
    /* protected */ var _active: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<any, any> */ Any
      ] = js.native
    
    /* protected */ def _get(): Output = js.native
    
    /* protected */ def _start(): Unit = js.native
    
    def advance(): Unit = js.native
    
    /** The function that maps inputs values to output */
    val calc: InterpolatorFn[Input, Output] = js.native
    
    /** Equals false when in the frameloop */
    @JSName("idle")
    var idle_FInterpolation: Boolean = js.native
    
    /** The source of input values */
    val source: Any = js.native
  }
}
