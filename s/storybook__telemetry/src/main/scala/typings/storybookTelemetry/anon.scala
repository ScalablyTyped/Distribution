package typings.storybookTelemetry

import typings.detectPackageManager.mod.PM
import typings.std.Record
import typings.storybookCoreCommon.distTs3Dot9TypesMod.PackageJson
import typings.storybookCoreCommon.distTs3Dot9TypesMod.StorybookConfig
import typings.storybookTelemetry.storybookTelemetryBooleans.`false`
import typings.storybookTelemetry.storybookTelemetryStrings.`react-docgen-typescript`
import typings.storybookTelemetry.storybookTelemetryStrings.`react-docgen`
import typings.storybookTelemetry.storybookTelemetryStrings.lageDotconfigDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.lernaDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.nxDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.rushDotjson
import typings.storybookTelemetry.storybookTelemetryStrings.turboDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lage extends StObject {
    
    val Lage: lageDotconfigDotjson
    
    val Lerna: lernaDotjson
    
    val Nx: nxDotjson
    
    val Rush: rushDotjson
    
    val Turborepo: turboDotjson
  }
  object Lage {
    
    inline def apply(): Lage = {
      val __obj = js.Dynamic.literal(Lage = "lage.config.json", Lerna = "lerna.json", Nx = "nx.json", Rush = "rush.json", Turborepo = "turbo.json")
      __obj.asInstanceOf[Lage]
    }
    
    extension [Self <: Lage](x: Self) {
      
      inline def setLage(value: lageDotconfigDotjson): Self = StObject.set(x, "Lage", value.asInstanceOf[js.Any])
      
      inline def setLerna(value: lernaDotjson): Self = StObject.set(x, "Lerna", value.asInstanceOf[js.Any])
      
      inline def setNx(value: nxDotjson): Self = StObject.set(x, "Nx", value.asInstanceOf[js.Any])
      
      inline def setRush(value: rushDotjson): Self = StObject.set(x, "Rush", value.asInstanceOf[js.Any])
      
      inline def setTurborepo(value: turboDotjson): Self = StObject.set(x, "Turborepo", value.asInstanceOf[js.Any])
    }
  }
  
  trait MainConfig extends StObject {
    
    var mainConfig: StorybookConfig & (Record[String, Any])
    
    var packageJson: PackageJson
  }
  object MainConfig {
    
    inline def apply(mainConfig: StorybookConfig & (Record[String, Any]), packageJson: PackageJson): MainConfig = {
      val __obj = js.Dynamic.literal(mainConfig = mainConfig.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainConfig]
    }
    
    extension [Self <: MainConfig](x: Self) {
      
      inline def setMainConfig(value: StorybookConfig & (Record[String, Any])): Self = StObject.set(x, "mainConfig", value.asInstanceOf[js.Any])
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: Any
  }
  object Name {
    
    inline def apply(name: String, version: Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameOptions extends StObject {
    
    var name: String
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object NameOptions {
    
    inline def apply(name: String): NameOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameOptions]
    }
    
    extension [Self <: NameOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var name: String
    
    var options: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(name: String): Options = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait PackageName extends StObject {
    
    var name: String
    
    var packageName: String
    
    var version: String
  }
  object PackageName {
    
    inline def apply(name: String, packageName: String, version: String): PackageName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageName]
    }
    
    extension [Self <: PackageName](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@storybook/telemetry.@storybook/telemetry/dist/ts3.9/types.Dependency> */
  trait PartialDependency extends StObject {
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PartialDependency {
    
    inline def apply(): PartialDependency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDependency]
    }
    
    extension [Self <: PartialDependency](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@storybook/telemetry.@storybook/telemetry/dist/ts3.9/types.Options> */
  trait PartialOptions extends StObject {
    
    var configDir: js.UndefOr[String] = js.undefined
    
    var enableCrashReports: js.UndefOr[Boolean] = js.undefined
    
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
      
      inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@storybook/core-common.@storybook/core-common.TypescriptOptions> */
  trait PartialTypescriptOptions extends StObject {
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var checkOptions: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.^['options'] */ js.Any
      ] = js.undefined
    
    var reactDocgen: js.UndefOr[`react-docgen-typescript` | `react-docgen` | `false`] = js.undefined
    
    var reactDocgenTypescriptOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
      ] = js.undefined
  }
  object PartialTypescriptOptions {
    
    inline def apply(): PartialTypescriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypescriptOptions]
    }
    
    extension [Self <: PartialTypescriptOptions](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckOptions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.^['options'] */ js.Any
      ): Self = StObject.set(x, "checkOptions", value.asInstanceOf[js.Any])
      
      inline def setCheckOptionsUndefined: Self = StObject.set(x, "checkOptions", js.undefined)
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setReactDocgen(value: `react-docgen-typescript` | `react-docgen` | `false`): Self = StObject.set(x, "reactDocgen", value.asInstanceOf[js.Any])
      
      inline def setReactDocgenTypescriptOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
      ): Self = StObject.set(x, "reactDocgenTypescriptOptions", value.asInstanceOf[js.Any])
      
      inline def setReactDocgenTypescriptOptionsUndefined: Self = StObject.set(x, "reactDocgenTypescriptOptions", js.undefined)
      
      inline def setReactDocgenUndefined: Self = StObject.set(x, "reactDocgen", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: PM
    
    var version: String
  }
  object Type {
    
    inline def apply(`type`: PM, version: String): Type = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: PM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
