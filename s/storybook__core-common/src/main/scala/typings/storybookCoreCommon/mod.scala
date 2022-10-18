package typings.storybookCoreCommon

import typings.babelCore.mod.TransformOptions
import typings.express.mod.Router
import typings.std.Record
import typings.std.Set
import typings.storybookCoreCommon.anon.CLIOptionsLoadOptionsBuil
import typings.storybookCoreCommon.anon.ConfigDir
import typings.storybookCoreCommon.anon.Ext
import typings.storybookCoreCommon.anon.Handler
import typings.storybookCoreCommon.anon.Local
import typings.storybookCoreCommon.anon.Match
import typings.storybookCoreCommon.anon.NormalizeOptionsdirectory
import typings.storybookCoreCommon.anon.Production
import typings.storybookCoreCommon.anon.Raw
import typings.storybookCoreCommon.anon.Version
import typings.storybookCoreCommon.distTs3Dot9PresetsMod.InterPresetOptions
import typings.storybookCoreCommon.distTs3Dot9PresetsMod.ResolvedAddonPreset
import typings.storybookCoreCommon.distTs3Dot9PresetsMod.ResolvedAddonVirtual
import typings.storybookCoreCommon.distTs3Dot9TypesMod.LoadedPreset
import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import typings.storybookCoreCommon.distTs3Dot9TypesMod.PackageJson
import typings.storybookCoreCommon.distTs3Dot9TypesMod.PresetConfig
import typings.storybookCoreCommon.distTs3Dot9TypesMod.Presets
import typings.storybookCoreCommon.distTs3Dot9TypesMod.StoriesEntry
import typings.storybookCoreCommon.distTs3Dot9TypesMod.StorybookConfig
import typings.storybookCoreCommon.distTs3Dot9UtilsCheckAddonOrderMod.Options
import typings.storybookCoreCommon.distTs3Dot9UtilsFileCacheMod.FileSystemCache
import typings.storybookCoreCommon.distTs3Dot9UtilsGetStorybookInfoMod.StorybookInfo
import typings.storybookCoreCommon.distTs3Dot9UtilsNormalizeStoriesMod.NormalizeOptions
import typings.webpack.mod.Configuration
import typings.webpack.mod.RuleSetRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-common", "boost")
  @js.native
  val boost: Set[String] = js.native
  
  @JSImport("@storybook/core-common", "cache")
  @js.native
  val cache: FileSystemCache = js.native
  
  inline def checkAddonOrder(hasBeforeAfterConfigFileGetConfig: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAddonOrder")(hasBeforeAfterConfigFileGetConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def checkWebpackVersion(webpack: Version, specifier: String, caption: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkWebpackVersion")(webpack.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], caption.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFileSystemCache(options: typings.storybookCoreCommon.distTs3Dot9UtilsFileCacheMod.Options): FileSystemCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemCache")(options.asInstanceOf[js.Any]).asInstanceOf[FileSystemCache]
  
  inline def es6Transpiler(): RuleSetRule = ^.asInstanceOf[js.Dynamic].applyDynamic("es6Transpiler")().asInstanceOf[RuleSetRule]
  
  inline def filterPresetsConfig(presetsConfig: js.Array[PresetConfig]): js.Array[PresetConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterPresetsConfig")(presetsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Array[PresetConfig]]
  
  inline def findDistEsm(cwd: String, relativePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findDistEsm")(cwd.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDirectoryFromWorkingDir(hasConfigDirWorkingDirDirectory: NormalizeOptionsdirectory): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectoryFromWorkingDir")(hasConfigDirWorkingDirDirectory.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterpretedFile(pathToFile: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpretedFile")(pathToFile.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getInterpretedFileWithExt(pathToFile: String): Ext = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpretedFileWithExt")(pathToFile.asInstanceOf[js.Any]).asInstanceOf[Ext]
  
  inline def getManagerHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getManagerHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getManagerMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getManagerMainTemplate")().asInstanceOf[String]
  
  inline def getPresets(presets: js.Array[PresetConfig], storybookOptions: InterPresetOptions): Presets = (^.asInstanceOf[js.Dynamic].applyDynamic("getPresets")(presets.asInstanceOf[js.Any], storybookOptions.asInstanceOf[js.Any])).asInstanceOf[Presets]
  
  inline def getPreviewBodyTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewBodyTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewBodyTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewHeadTemplate(configDirPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPreviewHeadTemplate(configDirPath: String, interpolations: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewHeadTemplate")(configDirPath.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPreviewMainTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewMainTemplate")().asInstanceOf[String]
  
  inline def getProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectRoot")().asInstanceOf[String]
  
  inline def getStorybookBabelConfig(): TransformOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelConfig")().asInstanceOf[TransformOptions]
  inline def getStorybookBabelConfig(hasLocal: Local): TransformOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelConfig")(hasLocal.asInstanceOf[js.Any]).asInstanceOf[TransformOptions]
  
  inline def getStorybookBabelDependencies(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookBabelDependencies")().asInstanceOf[js.Array[String]]
  
  inline def getStorybookConfiguration(storybookScript: String, shortName: String, longName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookConfiguration")(storybookScript.asInstanceOf[js.Any], shortName.asInstanceOf[js.Any], longName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStorybookInfo(packageJson: PackageJson): StorybookInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookInfo")(packageJson.asInstanceOf[js.Any]).asInstanceOf[StorybookInfo]
  
  inline def handlebars(source: String, data: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("handlebars")(source.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def interpolate(template: String, bindings: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(template.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadAllPresets(options: CLIOptionsLoadOptionsBuil): Presets = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAllPresets")(options.asInstanceOf[js.Any]).asInstanceOf[Presets]
  
  inline def loadCustomBabelConfig(configDir: String, getDefaultConfig: js.Function0[TransformOptions]): js.Promise[TransformOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomBabelConfig")(configDir.asInstanceOf[js.Any], getDefaultConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformOptions]]
  
  inline def loadCustomPresets(hasConfigDir: ConfigDir): js.Array[PresetConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomPresets")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[PresetConfig]]
  
  inline def loadCustomWebpackConfig(configDir: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCustomWebpackConfig")(configDir.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def loadEnvs(): Raw = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvs")().asInstanceOf[Raw]
  inline def loadEnvs(options: Production): Raw = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvs")(options.asInstanceOf[js.Any]).asInstanceOf[Raw]
  
  inline def loadMainConfig(hasConfigDir: ConfigDir): StorybookConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMainConfig")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[StorybookConfig]
  
  inline def loadManagerOrAddonsFile(hasConfigDir: ConfigDir): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadManagerOrAddonsFile")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadPreset(input: PresetConfig, level: Double, storybookOptions: InterPresetOptions): js.Array[LoadedPreset] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPreset")(input.asInstanceOf[js.Any], level.asInstanceOf[js.Any], storybookOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[LoadedPreset]]
  
  inline def loadPreviewOrConfigFile(hasConfigDir: ConfigDir): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPreviewOrConfigFile")(hasConfigDir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def logConfig(caption: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logConfig")(caption.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeConfigs(config: Configuration, customConfig: Configuration): Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigs")(config.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  
  inline def nodePathsToArray(nodePath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodePathsToArray")(nodePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def normalizeStories(entries: js.Array[StoriesEntry], options: NormalizeOptions): js.Array[NormalizedStoriesSpecifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStories")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedStoriesSpecifier]]
  
  inline def normalizeStoriesEntry(entry: StoriesEntry, hasConfigDirWorkingDir: NormalizeOptions): NormalizedStoriesSpecifier = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStoriesEntry")(entry.asInstanceOf[js.Any], hasConfigDirWorkingDir.asInstanceOf[js.Any])).asInstanceOf[NormalizedStoriesSpecifier]
  
  inline def normalizeStoryPath(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStoryPath")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readTemplate(filename: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTemplate")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def resolveAddonName(configDir: String, name: String, options: Any): ResolvedAddonPreset | ResolvedAddonVirtual = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddonName")(configDir.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResolvedAddonPreset | ResolvedAddonVirtual]
  
  inline def resolvePathInStorybookCache(fileOrDirectoryName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePathInStorybookCache")(fileOrDirectoryName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serverRequire(filePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serverRequire")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def serverRequire(filePath: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("serverRequire")(filePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def serverResolve(filePath: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("serverResolve")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def serverResolve(filePath: js.Array[String]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("serverResolve")(filePath.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def stringifyEnvs(raw: Record[String, String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEnvs")(raw.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def stringifyProcessEnvs(raw: Record[String, String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyProcessEnvs")(raw.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def toImportFn(stories: js.Array[NormalizedStoriesSpecifier]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toImportFn")(stories.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toImportFnPart(specifier: NormalizedStoriesSpecifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toImportFnPart")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toRequireContext(specifier: NormalizedStoriesSpecifier): Match = ^.asInstanceOf[js.Dynamic].applyDynamic("toRequireContext")(specifier.asInstanceOf[js.Any]).asInstanceOf[Match]
  
  inline def toRequireContextString(specifier: NormalizedStoriesSpecifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRequireContextString")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useProgressReporting(router: Router, startTime: js.Tuple2[Double, Double], options: Any): js.Promise[Handler] = (^.asInstanceOf[js.Dynamic].applyDynamic("useProgressReporting")(router.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Handler]]
  
  inline def validateConfigurationFiles(configDir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfigurationFiles")(configDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def webpackIncludeRegexp(specifier: NormalizedStoriesSpecifier): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("webpackIncludeRegexp")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
}
