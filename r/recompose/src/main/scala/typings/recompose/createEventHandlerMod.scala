package typings.recompose

import typings.recompose.mod.EventHandlerOf
import typings.recompose.mod.ObservableConfig
import typings.recompose.mod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createeventhandler
object createEventHandlerMod {
  
  @JSImport("recompose/createEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventHandlerOf[T, TSubs]]
  
  @scala.inline
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[js.Any, Subscribable[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandlerWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[EventHandlerOf[js.Any, Subscribable[js.Any]]]]
}
