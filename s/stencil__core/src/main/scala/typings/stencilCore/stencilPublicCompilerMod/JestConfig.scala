package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JestConfig extends StObject {
  
  /**
    * This option tells Jest that all imported modules in your tests should be mocked automatically.
    * All modules used in your tests will have a replacement implementation, keeping the API surface. Default: false
    */
  var automock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Jest runs all tests and produces all errors into the console upon completion.
    * The bail config option can be used here to have Jest stop running tests after the first failure. Default: false
    */
  var bail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The directory where Jest should store its cached dependency information. Jest attempts to scan your dependency tree once (up-front)
    * and cache it in order to ease some of the filesystem raking that needs to happen while running tests. This config option lets you
    * customize where Jest stores that cache data on disk. Default: "/tmp/<path>"
    */
  var cacheDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * Automatically clear mock calls and instances between every test. Equivalent to calling jest.clearAllMocks()
    * between each test. This does not remove any mock implementation that may have been provided. Default: false
    */
  var clearMocks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the coverage information should be collected while executing the test. Because this retrofits all
    * executed files with coverage collection statements, it may significantly slow down your tests. Default: false
    */
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of glob patterns indicating a set of files for which coverage information should be collected.
    * If a file matches the specified glob pattern, coverage information will be collected for it even if no tests exist
    * for this file and it's never required in the test suite. Default: undefined
    */
  var collectCoverageFrom: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The directory where Jest should output its coverage files. Default: undefined
    */
  var coverageDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * An array of regexp pattern strings that are matched against all file paths before executing the test. If the file path matches
    * any of the patterns, coverage information will be skipped. These pattern strings match against the full path.
    * Use the <rootDir> string token to include the path to your project's root directory to prevent it from accidentally
    * ignoring all of your files in different environments that may have different root directories.
    * Example: ["<rootDir>/build/", "<rootDir>/node_modules/"]. Default: ["/node_modules/"]
    */
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A list of reporter names that Jest uses when writing coverage reports. Any istanbul reporter can be used.
    * Default: ["json", "lcov", "text"]
    */
  var coverageReporters: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * This will be used to configure minimum threshold enforcement for coverage results. Thresholds can be specified as global,
    * as a glob, and as a directory or file path. If thresholds aren't met, jest will fail. Thresholds specified as a positive
    * number are taken to be the minimum percentage required. Thresholds specified as a negative number represent the maximum
    * number of uncovered entities allowed. Default: undefined
    */
  var coverageThreshold: js.UndefOr[Any] = js.undefined
  
  var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
  
  var forceCoverageMatch: js.UndefOr[js.Array[Any]] = js.undefined
  
  var globalSetup: js.UndefOr[String] = js.undefined
  
  var globalTeardown: js.UndefOr[String] = js.undefined
  
  var globals: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of directory names to be searched recursively up from the requiring module's location. Setting this option will
    * override the default, if you wish to still search node_modules for packages include it along with any other
    * options: ["node_modules", "bower_components"]. Default: ["node_modules"]
    */
  var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of file extensions your modules use. If you require modules without specifying a file extension,
    * these are the extensions Jest will look for. Default: ['ts', 'tsx', 'js', 'json']
    */
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var moduleNameMapper: js.UndefOr[Any] = js.undefined
  
  var modulePathIgnorePatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var modulePaths: js.UndefOr[js.Array[Any]] = js.undefined
  
  var notifyMode: js.UndefOr[String] = js.undefined
  
  @JSName("notify")
  var notify_FJestConfig: js.UndefOr[Boolean] = js.undefined
  
  var preset: js.UndefOr[String] = js.undefined
  
  var prettierPath: js.UndefOr[String] = js.undefined
  
  var projects: js.UndefOr[Any] = js.undefined
  
  var reporters: js.UndefOr[Any] = js.undefined
  
  var resetMocks: js.UndefOr[Boolean] = js.undefined
  
  var resetModules: js.UndefOr[Boolean] = js.undefined
  
  var resolver: js.UndefOr[String] = js.undefined
  
  var restoreMocks: js.UndefOr[String] = js.undefined
  
  var rootDir: js.UndefOr[String] = js.undefined
  
  var roots: js.UndefOr[js.Array[Any]] = js.undefined
  
  var runner: js.UndefOr[String] = js.undefined
  
  /**
    * The paths to modules that run some code to configure or set up the testing environment before each test.
    * Since every test runs in its own environment, these scripts will be executed in the testing environment
    * immediately before executing the test code itself. Default: []
    */
  var setupFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var setupFilesAfterEnv: js.UndefOr[js.Array[String]] = js.undefined
  
  var snapshotSerializers: js.UndefOr[js.Array[Any]] = js.undefined
  
  var testEnvironment: js.UndefOr[String] = js.undefined
  
  var testEnvironmentOptions: js.UndefOr[Any] = js.undefined
  
  var testMatch: js.UndefOr[js.Array[String]] = js.undefined
  
  var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var testPreset: js.UndefOr[String] = js.undefined
  
  var testRegex: js.UndefOr[String] = js.undefined
  
  var testResultsProcessor: js.UndefOr[String] = js.undefined
  
  var testRunner: js.UndefOr[String] = js.undefined
  
  var testURL: js.UndefOr[String] = js.undefined
  
  var timers: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var transformIgnorePatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var unmockedModulePathPatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var watchPathIgnorePatterns: js.UndefOr[js.Array[Any]] = js.undefined
}
object JestConfig {
  
  inline def apply(): JestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JestConfig]
  }
  
  extension [Self <: JestConfig](x: Self) {
    
    inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
    
    inline def setAutomockUndefined: Self = StObject.set(x, "automock", js.undefined)
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
    
    inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
    
    inline def setClearMocksUndefined: Self = StObject.set(x, "clearMocks", js.undefined)
    
    inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFrom(value: js.Array[Any]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
    
    inline def setCollectCoverageFromVarargs(value: Any*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
    
    inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
    
    inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
    
    inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[Any]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
    
    inline def setCoveragePathIgnorePatternsVarargs(value: Any*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCoverageReporters(value: js.Array[Any]): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
    
    inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
    
    inline def setCoverageReportersVarargs(value: Any*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
    
    inline def setCoverageThreshold(value: Any): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
    
    inline def setCoverageThresholdUndefined: Self = StObject.set(x, "coverageThreshold", js.undefined)
    
    inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
    
    inline def setErrorOnDeprecatedUndefined: Self = StObject.set(x, "errorOnDeprecated", js.undefined)
    
    inline def setForceCoverageMatch(value: js.Array[Any]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatchUndefined: Self = StObject.set(x, "forceCoverageMatch", js.undefined)
    
    inline def setForceCoverageMatchVarargs(value: Any*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value*))
    
    inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
    
    inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
    
    inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
    
    inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
    
    inline def setGlobals(value: Any): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectoriesUndefined: Self = StObject.set(x, "moduleDirectories", js.undefined)
    
    inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
    
    inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleFileExtensionsUndefined: Self = StObject.set(x, "moduleFileExtensions", js.undefined)
    
    inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
    
    inline def setModuleNameMapper(value: Any): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
    
    inline def setModuleNameMapperUndefined: Self = StObject.set(x, "moduleNameMapper", js.undefined)
    
    inline def setModulePathIgnorePatterns(value: js.Array[Any]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setModulePathIgnorePatternsUndefined: Self = StObject.set(x, "modulePathIgnorePatterns", js.undefined)
    
    inline def setModulePathIgnorePatternsVarargs(value: Any*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value*))
    
    inline def setModulePaths(value: js.Array[Any]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
    
    inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
    
    inline def setModulePathsVarargs(value: Any*): Self = StObject.set(x, "modulePaths", js.Array(value*))
    
    inline def setNotifyMode(value: String): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
    
    inline def setNotifyModeUndefined: Self = StObject.set(x, "notifyMode", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
    
    inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
    
    inline def setProjects(value: Any): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setReporters(value: Any): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
    
    inline def setResetMocksUndefined: Self = StObject.set(x, "resetMocks", js.undefined)
    
    inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
    
    inline def setResetModulesUndefined: Self = StObject.set(x, "resetModules", js.undefined)
    
    inline def setResolver(value: String): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setRestoreMocks(value: String): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
    
    inline def setRestoreMocksUndefined: Self = StObject.set(x, "restoreMocks", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    
    inline def setRoots(value: js.Array[Any]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    inline def setRootsVarargs(value: Any*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
    
    inline def setSetupFiles(value: js.Array[String]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnv(value: js.Array[String]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnvUndefined: Self = StObject.set(x, "setupFilesAfterEnv", js.undefined)
    
    inline def setSetupFilesAfterEnvVarargs(value: String*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value*))
    
    inline def setSetupFilesUndefined: Self = StObject.set(x, "setupFiles", js.undefined)
    
    inline def setSetupFilesVarargs(value: String*): Self = StObject.set(x, "setupFiles", js.Array(value*))
    
    inline def setSnapshotSerializers(value: js.Array[Any]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSerializersUndefined: Self = StObject.set(x, "snapshotSerializers", js.undefined)
    
    inline def setSnapshotSerializersVarargs(value: Any*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
    
    inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptions(value: Any): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptionsUndefined: Self = StObject.set(x, "testEnvironmentOptions", js.undefined)
    
    inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchUndefined: Self = StObject.set(x, "testMatch", js.undefined)
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTestPathIgnorePatternsUndefined: Self = StObject.set(x, "testPathIgnorePatterns", js.undefined)
    
    inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
    
    inline def setTestPreset(value: String): Self = StObject.set(x, "testPreset", value.asInstanceOf[js.Any])
    
    inline def setTestPresetUndefined: Self = StObject.set(x, "testPreset", js.undefined)
    
    inline def setTestRegex(value: String): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    
    inline def setTestRegexUndefined: Self = StObject.set(x, "testRegex", js.undefined)
    
    inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
    
    inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
    
    inline def setTestURL(value: String): Self = StObject.set(x, "testURL", value.asInstanceOf[js.Any])
    
    inline def setTestURLUndefined: Self = StObject.set(x, "testURL", js.undefined)
    
    inline def setTimers(value: String): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
    
    inline def setTransform(value: StringDictionary[String]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatterns(value: js.Array[Any]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatternsUndefined: Self = StObject.set(x, "transformIgnorePatterns", js.undefined)
    
    inline def setTransformIgnorePatternsVarargs(value: Any*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUnmockedModulePathPatterns(value: js.Array[Any]): Self = StObject.set(x, "unmockedModulePathPatterns", value.asInstanceOf[js.Any])
    
    inline def setUnmockedModulePathPatternsUndefined: Self = StObject.set(x, "unmockedModulePathPatterns", js.undefined)
    
    inline def setUnmockedModulePathPatternsVarargs(value: Any*): Self = StObject.set(x, "unmockedModulePathPatterns", js.Array(value*))
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWatchPathIgnorePatterns(value: js.Array[Any]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatternsUndefined: Self = StObject.set(x, "watchPathIgnorePatterns", js.undefined)
    
    inline def setWatchPathIgnorePatternsVarargs(value: Any*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value*))
  }
}
