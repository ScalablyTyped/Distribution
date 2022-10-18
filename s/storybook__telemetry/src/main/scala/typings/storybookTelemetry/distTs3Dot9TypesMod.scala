package typings.storybookTelemetry

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.storybookCoreCommon.anon.ArgTypeTargetsV7
import typings.storybookTelemetry.anon.NameOptions
import typings.storybookTelemetry.anon.PackageName
import typings.storybookTelemetry.anon.PartialTypescriptOptions
import typings.storybookTelemetry.anon.Type
import typings.storybookTelemetry.distTs3Dot9GetMonorepoTypeMod.MonorepoType
import typings.storybookTelemetry.storybookTelemetryStrings.javascript
import typings.storybookTelemetry.storybookTelemetryStrings.typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9TypesMod {
  
  trait Dependency extends StObject {
    
    var version: String
  }
  object Dependency {
    
    inline def apply(version: String): Dependency = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency]
    }
    
    extension [Self <: Dependency](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookTelemetry.storybookTelemetryStrings.start
    - typings.storybookTelemetry.storybookTelemetryStrings.build
    - typings.storybookTelemetry.storybookTelemetryStrings.upgrade
    - typings.storybookTelemetry.storybookTelemetryStrings.init
    - typings.storybookTelemetry.storybookTelemetryStrings.`error-build`
    - typings.storybookTelemetry.storybookTelemetryStrings.`error-dev`
    - typings.storybookTelemetry.storybookTelemetryStrings.`error-metadata`
  */
  trait EventType extends StObject
  object EventType {
    
    inline def build: typings.storybookTelemetry.storybookTelemetryStrings.build = "build".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.build]
    
    inline def `error-build`: typings.storybookTelemetry.storybookTelemetryStrings.`error-build` = "error-build".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.`error-build`]
    
    inline def `error-dev`: typings.storybookTelemetry.storybookTelemetryStrings.`error-dev` = "error-dev".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.`error-dev`]
    
    inline def `error-metadata`: typings.storybookTelemetry.storybookTelemetryStrings.`error-metadata` = "error-metadata".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.`error-metadata`]
    
    inline def init: typings.storybookTelemetry.storybookTelemetryStrings.init = "init".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.init]
    
    inline def start: typings.storybookTelemetry.storybookTelemetryStrings.start = "start".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.start]
    
    inline def upgrade: typings.storybookTelemetry.storybookTelemetryStrings.upgrade = "upgrade".asInstanceOf[typings.storybookTelemetry.storybookTelemetryStrings.upgrade]
  }
  
  trait Options extends StObject {
    
    var configDir: js.UndefOr[String] = js.undefined
    
    var enableCrashReports: js.UndefOr[Boolean] = js.undefined
    
    var immediate: Boolean
    
    var retryDelay: Double
  }
  object Options {
    
    inline def apply(immediate: Boolean, retryDelay: Double): Options = {
      val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any], retryDelay = retryDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
      
      inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
      
      inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    }
  }
  
  type Payload = StringDictionary[Any]
  
  trait StorybookAddon
    extends StObject
       with Dependency {
    
    var options: Any
  }
  object StorybookAddon {
    
    inline def apply(options: Any, version: String): StorybookAddon = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorybookAddon]
    }
    
    extension [Self <: StorybookAddon](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorybookMetadata extends StObject {
    
    var addons: js.UndefOr[Record[String, StorybookAddon]] = js.undefined
    
    var builder: js.UndefOr[NameOptions] = js.undefined
    
    var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
    
    var framework: typings.storybookTelemetry.anon.Options
    
    var generatedAt: js.UndefOr[Double] = js.undefined
    
    var hasCustomBabel: js.UndefOr[Boolean] = js.undefined
    
    var hasCustomWebpack: js.UndefOr[Boolean] = js.undefined
    
    var hasStaticDirs: js.UndefOr[Boolean] = js.undefined
    
    var hasStorybookEslint: js.UndefOr[Boolean] = js.undefined
    
    var language: typescript | javascript
    
    var metaFramework: js.UndefOr[PackageName] = js.undefined
    
    var monorepo: js.UndefOr[MonorepoType] = js.undefined
    
    var packageManager: js.UndefOr[Type] = js.undefined
    
    var refCount: js.UndefOr[Double] = js.undefined
    
    var storybookPackages: js.UndefOr[Record[String, Dependency]] = js.undefined
    
    var storybookVersion: String
    
    var typescriptOptions: js.UndefOr[PartialTypescriptOptions] = js.undefined
  }
  object StorybookMetadata {
    
    inline def apply(
      framework: typings.storybookTelemetry.anon.Options,
      language: typescript | javascript,
      storybookVersion: String
    ): StorybookMetadata = {
      val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], storybookVersion = storybookVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorybookMetadata]
    }
    
    extension [Self <: StorybookMetadata](x: Self) {
      
      inline def setAddons(value: Record[String, StorybookAddon]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
      
      inline def setAddonsUndefined: Self = StObject.set(x, "addons", js.undefined)
      
      inline def setBuilder(value: NameOptions): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFramework(value: typings.storybookTelemetry.anon.Options): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setGeneratedAt(value: Double): Self = StObject.set(x, "generatedAt", value.asInstanceOf[js.Any])
      
      inline def setGeneratedAtUndefined: Self = StObject.set(x, "generatedAt", js.undefined)
      
      inline def setHasCustomBabel(value: Boolean): Self = StObject.set(x, "hasCustomBabel", value.asInstanceOf[js.Any])
      
      inline def setHasCustomBabelUndefined: Self = StObject.set(x, "hasCustomBabel", js.undefined)
      
      inline def setHasCustomWebpack(value: Boolean): Self = StObject.set(x, "hasCustomWebpack", value.asInstanceOf[js.Any])
      
      inline def setHasCustomWebpackUndefined: Self = StObject.set(x, "hasCustomWebpack", js.undefined)
      
      inline def setHasStaticDirs(value: Boolean): Self = StObject.set(x, "hasStaticDirs", value.asInstanceOf[js.Any])
      
      inline def setHasStaticDirsUndefined: Self = StObject.set(x, "hasStaticDirs", js.undefined)
      
      inline def setHasStorybookEslint(value: Boolean): Self = StObject.set(x, "hasStorybookEslint", value.asInstanceOf[js.Any])
      
      inline def setHasStorybookEslintUndefined: Self = StObject.set(x, "hasStorybookEslint", js.undefined)
      
      inline def setLanguage(value: typescript | javascript): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMetaFramework(value: PackageName): Self = StObject.set(x, "metaFramework", value.asInstanceOf[js.Any])
      
      inline def setMetaFrameworkUndefined: Self = StObject.set(x, "metaFramework", js.undefined)
      
      inline def setMonorepo(value: MonorepoType): Self = StObject.set(x, "monorepo", value.asInstanceOf[js.Any])
      
      inline def setMonorepoUndefined: Self = StObject.set(x, "monorepo", js.undefined)
      
      inline def setPackageManager(value: Type): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      
      inline def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      inline def setRefCountUndefined: Self = StObject.set(x, "refCount", js.undefined)
      
      inline def setStorybookPackages(value: Record[String, Dependency]): Self = StObject.set(x, "storybookPackages", value.asInstanceOf[js.Any])
      
      inline def setStorybookPackagesUndefined: Self = StObject.set(x, "storybookPackages", js.undefined)
      
      inline def setStorybookVersion(value: String): Self = StObject.set(x, "storybookVersion", value.asInstanceOf[js.Any])
      
      inline def setTypescriptOptions(value: PartialTypescriptOptions): Self = StObject.set(x, "typescriptOptions", value.asInstanceOf[js.Any])
      
      inline def setTypescriptOptionsUndefined: Self = StObject.set(x, "typescriptOptions", js.undefined)
    }
  }
  
  trait TelemetryData extends StObject {
    
    var eventType: EventType
    
    var metadata: js.UndefOr[StorybookMetadata] = js.undefined
    
    var payload: Payload
  }
  object TelemetryData {
    
    inline def apply(eventType: EventType, payload: Payload): TelemetryData = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryData]
    }
    
    extension [Self <: TelemetryData](x: Self) {
      
      inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StorybookMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
