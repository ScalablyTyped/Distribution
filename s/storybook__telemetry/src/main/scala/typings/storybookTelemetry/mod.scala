package typings.storybookTelemetry

import typings.std.Record
import typings.storybookTelemetry.anon.MainConfig
import typings.storybookTelemetry.anon.PartialOptions
import typings.storybookTelemetry.distTs3Dot9TypesMod.EventType
import typings.storybookTelemetry.distTs3Dot9TypesMod.Payload
import typings.storybookTelemetry.distTs3Dot9TypesMod.StorybookMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/telemetry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeStorybookMetadata(hasPackageJsonMainConfig: MainConfig): js.Promise[StorybookMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStorybookMetadata")(hasPackageJsonMainConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorybookMetadata]]
  
  inline def getStorybookMetadata(_configDir: String): js.Promise[StorybookMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookMetadata")(_configDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorybookMetadata]]
  
  @JSImport("@storybook/telemetry", "metaFrameworks")
  @js.native
  val metaFrameworks: Record[String, String] = js.native
  
  inline def sanitizeAddonName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeAddonName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def telemetry(eventType: EventType): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("telemetry")(eventType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def telemetry(eventType: EventType, payload: Unit, options: PartialOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("telemetry")(eventType.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def telemetry(eventType: EventType, payload: Payload): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("telemetry")(eventType.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def telemetry(eventType: EventType, payload: Payload, options: PartialOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("telemetry")(eventType.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
