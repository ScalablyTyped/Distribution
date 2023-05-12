package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionSaveSessionMod {
  
  @JSImport("@sentry/replay/types/session/saveSession", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveSession(session: Session): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveSession")(session.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
