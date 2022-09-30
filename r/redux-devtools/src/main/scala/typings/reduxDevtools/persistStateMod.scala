package typings.reduxDevtools

import typings.redux.mod.Action
import typings.redux.mod.StoreEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistStateMod {
  
  @JSImport("redux-devtools/lib/persistState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */, MonitorState](): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: String): StoreEnhancer[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](
    sessionId: String,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: String, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Null,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: Null, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: js.Function1[/* state */ S, S]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](
    sessionId: Unit,
    deserializeState: js.Function1[/* state */ S, S],
    deserializeAction: js.Function1[/* action */ A, A]
  ): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
  inline def default[S, A /* <: Action[Any] */, MonitorState](sessionId: Unit, deserializeState: Unit, deserializeAction: js.Function1[/* action */ A, A]): StoreEnhancer[js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sessionId.asInstanceOf[js.Any], deserializeState.asInstanceOf[js.Any], deserializeAction.asInstanceOf[js.Any])).asInstanceOf[StoreEnhancer[js.Object, js.Object]]
}
