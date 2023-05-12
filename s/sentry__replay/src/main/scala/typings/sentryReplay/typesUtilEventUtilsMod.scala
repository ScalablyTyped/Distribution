package typings.sentryReplay

import typings.sentryTypes.typesEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilEventUtilsMod {
  
  @JSImport("@sentry/replay/types/util/eventUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isErrorEvent(event: Event): /* is @sentry/types.@sentry/types/types/event.ErrorEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/event.ErrorEvent */ Boolean]
  
  inline def isReplayEvent(event: Event): /* is @sentry/types.@sentry/types/types/replay.ReplayEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReplayEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/replay.ReplayEvent */ Boolean]
  
  inline def isTransactionEvent(event: Event): /* is @sentry/types.@sentry/types/types/event.TransactionEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransactionEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/event.TransactionEvent */ Boolean]
}
