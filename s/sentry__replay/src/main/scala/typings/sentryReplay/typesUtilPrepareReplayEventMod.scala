package typings.sentryReplay

import typings.sentryReplay.anon.Client
import typings.sentryTypes.typesReplayMod.ReplayEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilPrepareReplayEventMod {
  
  @JSImport("@sentry/replay/types/util/prepareReplayEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareReplayEvent(param0: Client): js.Promise[ReplayEvent | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareReplayEvent")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReplayEvent | Null]]
}
