package typings.rcOverflow

import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseEffectStateMod {
  
  @JSImport("rc-overflow/es/hooks/useEffectState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: String | Double | js.Object */](notifyEffectUpdate: NotifyEffectUpdate): js.Tuple2[T, js.Function1[/* value */ Updater[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(notifyEffectUpdate.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ Updater[T], Unit]]]
  inline def default[T /* <: String | Double | js.Object */](notifyEffectUpdate: NotifyEffectUpdate, defaultValue: T): js.Tuple2[T, js.Function1[/* value */ Updater[T], Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(notifyEffectUpdate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* value */ Updater[T], Unit]]]
  
  inline def useBatcher(): NotifyEffectUpdate = ^.asInstanceOf[js.Dynamic].applyDynamic("useBatcher")().asInstanceOf[NotifyEffectUpdate]
  
  type NotifyEffectUpdate = js.Function1[/* callback */ UpdateCallbackFunc, Unit]
  
  type UpdateCallbackFunc = VoidFunction
  
  type Updater[T] = T | (js.Function1[/* origin */ T, T])
}
