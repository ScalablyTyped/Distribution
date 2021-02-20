package typings.promiseMapLimit

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-map-limit", JSImport.Namespace)
  @js.native
  def apply[T, R](iterable: Iterable[T], concurrency: Double, iteratee: IIteratee[T, R]): js.Promise[js.Array[R]] = js.native
  
  type IIteratee[T, R] = js.Function1[/* value */ T, js.Promise[R] | R]
}
