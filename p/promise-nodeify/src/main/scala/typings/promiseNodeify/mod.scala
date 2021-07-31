package typings.promiseNodeify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], js.Any]
  ): js.UndefOr[js.Promise[T]] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[T]]]
  
  @JSImport("promise-nodeify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def delegated[T](
    promise: js.Promise[T],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], js.Any]
  ): js.UndefOr[js.Promise[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("delegated")(promise.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[T]]]
  
  @scala.inline
  def nodeifyThis[T](callback: js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[T], js.Any]): js.UndefOr[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeifyThis")(callback.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[T]]]
}
