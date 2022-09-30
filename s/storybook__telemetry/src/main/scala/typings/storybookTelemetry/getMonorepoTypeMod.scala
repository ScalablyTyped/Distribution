package typings.storybookTelemetry

import typings.storybookTelemetry.storybookTelemetryStrings.lageDotconfigDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.lernaDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.nxDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.rushDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.turboDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMonorepoTypeMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMonorepoType(): MonorepoType = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonorepoType")().asInstanceOf[MonorepoType]
  
  object monorepoConfigs {
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Lage")
    @js.native
    val Lage: lageDotconfigDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Lerna")
    @js.native
    val Lerna: lernaDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Nx")
    @js.native
    val Nx: nxDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Rush")
    @js.native
    val Rush: rushDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Turborepo")
    @js.native
    val Turborepo: turboDotjson = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookTelemetry.storybookTelemetryStrings.Nx
    - typings.storybookTelemetry.storybookTelemetryStrings.Turborepo
    - typings.storybookTelemetry.storybookTelemetryStrings.Lerna
    - typings.storybookTelemetry.storybookTelemetryStrings.Rush
    - typings.storybookTelemetry.storybookTelemetryStrings.Lage
    - typings.storybookTelemetry.storybookTelemetryStrings.Workspaces
    - scala.Unit
  */
  type MonorepoType = js.UndefOr[_MonorepoType]
  
  trait _MonorepoType extends StObject
}
