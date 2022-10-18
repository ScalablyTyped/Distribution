package typings.storybookTelemetry

import typings.storybookTelemetry.anon.PartialOptions
import typings.storybookTelemetry.distTs3Dot9TypesMod.TelemetryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9TelemetryMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/telemetry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendTelemetry(data: TelemetryData): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendTelemetry")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sendTelemetry(data: TelemetryData, options: PartialOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendTelemetry")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
