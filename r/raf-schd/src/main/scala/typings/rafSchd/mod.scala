package typings.rafSchd

import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raf-schd", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](fn: T): Schedule[T] = js.native
  
  @js.native
  trait Schedule[T /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends js.Object {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): Unit = js.native
    
    def cancel(): Unit = js.native
  }
}
