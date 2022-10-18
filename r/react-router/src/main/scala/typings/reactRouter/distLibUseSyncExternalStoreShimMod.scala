package typings.reactRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUseSyncExternalStoreShimMod {
  
  @JSImport("react-router/dist/lib/use-sync-external-store-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSyncExternalStore[T](
    subscribe: js.Function1[/* fn */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useSyncExternalStore[T](
    subscribe: js.Function1[/* fn */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[T],
    getServerSnapshot: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[T]
}
