package typings.storybookTelemetry

import typings.std.Record
import typings.storybookTelemetry.anon.MainConfig
import typings.storybookTelemetry.typesMod.StorybookMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookMetadataMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/storybook-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeStorybookMetadata(hasPackageJsonMainConfig: MainConfig): js.Promise[StorybookMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStorybookMetadata")(hasPackageJsonMainConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorybookMetadata]]
  
  inline def getStorybookMetadata(_configDir: String): js.Promise[StorybookMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookMetadata")(_configDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorybookMetadata]]
  
  @JSImport("@storybook/telemetry/dist/ts3.9/storybook-metadata", "metaFrameworks")
  @js.native
  val metaFrameworks: Record[String, String] = js.native
  
  inline def sanitizeAddonName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeAddonName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
