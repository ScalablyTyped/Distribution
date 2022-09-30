package typings.storybookCoreCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyTelemetryMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/notify-telemetry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notifyTelemetry(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyTelemetry")().asInstanceOf[js.Promise[Unit]]
}
