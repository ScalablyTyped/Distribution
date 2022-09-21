package typings.promiseAny

import org.scalablytyped.runtime.Shortcut
import typings.promiseAny.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("promise.any", JSImport.Namespace)
  @js.native
  val ^ : ExportedImplementationType = js.native
  
  @js.native
  trait ExportedImplementationType extends StObject {
    
    def apply[T](iterable: js.Array[T | js.Thenable[T]]): js.Promise[T] = js.native
    def apply[T](iterable: js.Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
    
    def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
    @JSName("getPolyfill")
    var getPolyfill_Original: js.Function0[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
      ] = js.native
    
    def implementation[T](iterable: js.Array[T | js.Thenable[T]]): js.Promise[T] = js.native
    def implementation[T](iterable: js.Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
    @JSName("implementation")
    var implementation_Original: FnCall = js.native
    
    def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
    @JSName("shim")
    var shim_Original: js.Function0[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
      ] = js.native
  }
  
  type _To = ExportedImplementationType
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExportedImplementationType = ^
}
