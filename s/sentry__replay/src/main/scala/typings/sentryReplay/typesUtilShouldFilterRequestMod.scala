package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilShouldFilterRequestMod {
  
  @JSImport("@sentry/replay/types/util/shouldFilterRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldFilterRequest(replay: ReplayContainer, url: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldFilterRequest")(replay.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
