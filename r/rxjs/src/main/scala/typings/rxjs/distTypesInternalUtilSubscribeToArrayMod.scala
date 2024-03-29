package typings.rxjs

import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilSubscribeToArrayMod {
  
  @JSImport("rxjs/dist/types/internal/util/subscribeToArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ Subscriber[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* subscriber */ Subscriber[T], Unit]]
}
