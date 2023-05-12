package typings.sentryReplay

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilIsRrwebErrorMod {
  
  @JSImport("@sentry/replay/types/util/isRrwebError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRrwebError(event: Event, hint: EventHint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRrwebError")(event.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
