package typings.stackGenerator

import typings.stackframe.mod.StackFrameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stack-generator/stack-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stack-generator/stack-generator", "StackFrame")
  @js.native
  open class StackFrame protected ()
    extends typings.stackframe.mod.^ {
    def this(obj: StackFrameOptions) = this()
  }
  
  inline def backtrace(opts: StackGeneratorOptions): js.Array[typings.stackframe.mod.^] = ^.asInstanceOf[js.Dynamic].applyDynamic("backtrace")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.stackframe.mod.^]]
  
  trait StackGeneratorOptions extends StObject {
    
    /** Maximum number of StackFrames to return. Default is 10 */
    var maxStackSize: Double
  }
  object StackGeneratorOptions {
    
    inline def apply(maxStackSize: Double): StackGeneratorOptions = {
      val __obj = js.Dynamic.literal(maxStackSize = maxStackSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackGeneratorOptions]
    }
    
    extension [Self <: StackGeneratorOptions](x: Self) {
      
      inline def setMaxStackSize(value: Double): Self = StObject.set(x, "maxStackSize", value.asInstanceOf[js.Any])
    }
  }
}
