package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleKeyboardEventMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleKeyboardEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeyboardBreadcrumb(event: KeyboardEvent): Breadcrumb | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardBreadcrumb")(event.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb | Null]
  
  inline def handleKeyboardEvent(replay: ReplayContainer, event: KeyboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleKeyboardEvent")(replay.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
