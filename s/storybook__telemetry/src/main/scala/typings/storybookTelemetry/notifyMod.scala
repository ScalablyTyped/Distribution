package typings.storybookTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/notify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notify_(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")().asInstanceOf[js.Promise[Unit]]
}
