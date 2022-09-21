package typings.sentryNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorhandlingMod {
  
  @JSImport("@sentry/node/types/integrations/utils/errorhandling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logAndExitProcess(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logAndExitProcess")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
