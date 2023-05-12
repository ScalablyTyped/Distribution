package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.Session
import typings.sentryReplay.typesTypesMod.Timeouts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilIsSessionExpiredMod {
  
  @JSImport("@sentry/replay/types/util/isSessionExpired", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSessionExpired(session: Session, timeouts: Timeouts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSessionExpired")(session.asInstanceOf[js.Any], timeouts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSessionExpired(session: Session, timeouts: Timeouts, targetTime: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSessionExpired")(session.asInstanceOf[js.Any], timeouts.asInstanceOf[js.Any], targetTime.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
