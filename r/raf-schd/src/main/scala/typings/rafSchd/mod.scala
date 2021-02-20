package typings.rafSchd

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raf-schd", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](fn: T): Schedule[T] = js.native
  
  @js.native
  trait Schedule[T /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): Unit = js.native
    
    def cancel(): Unit = js.native
  }
}
