package typings.promiseMapLimit

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T, R](iterable: Iterable[T], concurrency: Double, iteratee: IIteratee[T, R]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  
  @JSImport("promise-map-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IIteratee[T, R] = js.Function1[/* value */ T, js.Promise[R] | R]
}
