package typings.shakacodeRecompose

import typings.shakacodeRecompose.mod.EventHandlerOf
import typings.shakacodeRecompose.mod.ObservableConfig
import typings.shakacodeRecompose.mod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#createeventhandler
object createEventHandlerMod {
  
  @JSImport("@shakacode/recompose/createEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventHandlerOf[T, TSubs]]
  
  inline def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[Any, Subscribable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandlerWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[EventHandlerOf[Any, Subscribable[Any]]]]
}
