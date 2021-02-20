package typings.promiseNodeify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-nodeify", JSImport.Namespace)
  @js.native
  def apply[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]
  ): js.UndefOr[js.Promise[T]] = js.native
  
  @JSImport("promise-nodeify", "delegated")
  @js.native
  def delegated[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]
  ): js.UndefOr[js.Promise[T]] = js.native
  
  @JSImport("promise-nodeify", "nodeifyThis")
  @js.native
  def nodeifyThis[T](callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], _]): js.UndefOr[js.Promise[T]] = js.native
}
