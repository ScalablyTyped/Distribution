package typings.promiseHash

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("promise-hash", JSImport.Namespace)
  @js.native
  val ^ : PromiseHash = js.native
  
  type PromiseHash = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: std.PromiseLike<any[P]> | any[P]} */ /* promiseHash */ js.Any, 
    js.Promise[Any]
  ]
  
  type _To = PromiseHash
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PromiseHash = ^
  
  object global {
    
    trait PromiseConstructor extends StObject {
      
      def hash[T](
        promiseHash: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: std.PromiseLike<T[P]> | T[P]} */ js.Any
      ): js.Promise[T]
      @JSName("hash")
      var hash_Original: PromiseHash
    }
    object PromiseConstructor {
      
      inline def apply(
        hash: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: std.PromiseLike<any[P]> | any[P]} */ /* promiseHash */ js.Any => js.Promise[Any]
      ): PromiseConstructor = {
        val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash))
        __obj.asInstanceOf[PromiseConstructor]
      }
      
      extension [Self <: PromiseConstructor](x: Self) {
        
        inline def setHash(
          value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: std.PromiseLike<any[P]> | any[P]} */ /* promiseHash */ js.Any => js.Promise[Any]
        ): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      }
    }
  }
}
