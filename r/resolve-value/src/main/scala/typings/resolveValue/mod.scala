package typings.resolveValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](boolean: T): js.Promise[DeepResolved[T]] = ^.asInstanceOf[js.Dynamic].apply(boolean.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeepResolved[T]]]
  
  @JSImport("resolve-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.PromiseLike<infer R> ? resolve-value.resolve-value.DeepResolved<R> : T extends object ? {[ K in keyof T ]: resolve-value.resolve-value.DeepResolved<T[K]>} : T
    }}}
    */
  type DeepResolved[T] = T
}
