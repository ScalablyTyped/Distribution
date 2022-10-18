package typings.promiseAllsettled

import typings.promiseAllsettled.typesMod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  inline def apply(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, Any]]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PromiseResult[T, Any]]]]
  inline def apply[T /* <: Array[Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseResultTuple[T]]]
  
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    }}}
    */
  @js.native
  trait PromiseResultTuple[T /* <: Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    }}}
    */
  @js.native
  trait PromiseTuple[T /* <: Array[Any] */] extends StObject
}
