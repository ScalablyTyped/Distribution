package typings.rcTabs

import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseUpdateMod {
  
  @JSImport("rc-tabs/es/hooks/useUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: VoidFunction): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def useUpdateState[T](defaultState: T): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateState")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]]]
  inline def useUpdateState[T](defaultState: js.Function0[T]): js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateState")(defaultState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* updater */ Callback[T], Unit]]]
  
  type Callback[T] = js.Function1[/* ori */ T, T]
}
