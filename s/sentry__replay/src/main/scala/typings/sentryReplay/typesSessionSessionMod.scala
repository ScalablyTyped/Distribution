package typings.sentryReplay

import typings.sentryReplay.anon.PartialSessionsampledSamp
import typings.sentryReplay.typesTypesMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionSessionMod {
  
  @JSImport("@sentry/replay/types/session/Session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeSession(session: PartialSessionsampledSamp): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSession")(session.asInstanceOf[js.Any]).asInstanceOf[Session]
}
