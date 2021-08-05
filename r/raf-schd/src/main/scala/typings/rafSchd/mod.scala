package typings.rafSchd

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function1[/* repeated */ js.Any, Unit] */](fn: T): Schedule[T] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Schedule[T]]
  
  @JSImport("raf-schd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Schedule[T /* <: js.Function1[/* repeated */ js.Any, Unit] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
    ): Unit = js.native
    
    def cancel(): Unit = js.native
  }
}
