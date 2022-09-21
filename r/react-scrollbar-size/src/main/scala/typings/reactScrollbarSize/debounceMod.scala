package typings.reactScrollbarSize

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("react-scrollbar-size/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: js.Function1[/* repeated */ Any, Unit] */](fn: F, waitFor: Double): DebouncedFn[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], waitFor.asInstanceOf[js.Any])).asInstanceOf[DebouncedFn[F]]
  
  @js.native
  trait DebouncedFn[F /* <: js.Function1[/* repeated */ Any, Unit] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
    ): Unit = js.native
    
    def cancel(): Unit = js.native
  }
}
