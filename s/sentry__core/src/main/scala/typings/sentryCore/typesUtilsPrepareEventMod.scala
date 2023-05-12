package typings.sentryCore

import typings.sentryCore.typesScopeMod.Scope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesOptionsMod.ClientOptions
import typings.sentryTypes.typesStacktraceMod.StackParser
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsPrepareEventMod {
  
  @JSImport("@sentry/core/types/utils/prepareEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyDebugMetadata(event: Event, stackParser: StackParser): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyDebugMetadata")(event.asInstanceOf[js.Any], stackParser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prepareEvent(options: ClientOptions[BaseTransportOptions], event: Event, hint: EventHint): PromiseLike[Event | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareEvent")(options.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event | Null]]
  inline def prepareEvent(options: ClientOptions[BaseTransportOptions], event: Event, hint: EventHint, scope: Scope): PromiseLike[Event | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareEvent")(options.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Event | Null]]
}
