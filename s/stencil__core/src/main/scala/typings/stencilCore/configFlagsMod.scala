package typings.stencilCore

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Record
import typings.stencilCore.stencilCoreStrings.logLevel
import typings.stencilCore.stencilCoreStrings.maxConcurrency
import typings.stencilCore.stencilCoreStrings.maxWorkers
import typings.stencilCore.stencilCoreStrings.port
import typings.stencilCore.stencilCoreStrings.testTimeout
import typings.stencilCore.stencilPublicCompilerMod.LogLevel
import typings.stencilCore.stencilPublicCompilerMod.TaskCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configFlagsMod {
  
  @JSImport("@stencil/core/cli/config-flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "BOOLEAN_CLI_ARGS")
  @js.native
  val BOOLEAN_CLI_ARGS: js.Array[Any] = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "CLI_ARG_ALIASES")
  @js.native
  val CLI_ARG_ALIASES: AliasMap = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "LOG_LEVEL_CLI_ARGS")
  @js.native
  val LOG_LEVEL_CLI_ARGS: js.Array[logLevel] = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "NUMBER_CLI_ARGS")
  @js.native
  val NUMBER_CLI_ARGS: js.Tuple3[port, maxConcurrency, testTimeout] = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "STRING_CLI_ARGS")
  @js.native
  val STRING_CLI_ARGS: js.Array[Any] = js.native
  
  @JSImport("@stencil/core/cli/config-flags", "STRING_NUMBER_CLI_ARGS")
  @js.native
  val STRING_NUMBER_CLI_ARGS: js.Array[maxWorkers] = js.native
  
  inline def createConfigFlags(): ConfigFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfigFlags")().asInstanceOf[ConfigFlags]
  inline def createConfigFlags(init: Partial[ConfigFlags]): ConfigFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfigFlags")(init.asInstanceOf[js.Any]).asInstanceOf[ConfigFlags]
  
  type AliasMap = Partial[Record[KnownCLIArg, String]]
  
  /**
    * A type which gives the members of a `ReadonlyArray<string>` as
    * an enum-like type which can be used for e.g. keys in a `Record`
    * (as in the `AliasMap` type below)
    */
  type ArrayValuesAsUnion[T /* <: js.Array[String] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  
  type BooleanCLIArg = ArrayValuesAsUnion[js.Array[Any]]
  
  /**
    * Type containing the possible Boolean configuration flags, to be included
    * in ConfigFlags, below
    */
  type BooleanConfigFlags = ObjectFromKeys[js.Array[Any], Boolean]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in ['build', 'cache', 'checkVersion', 'ci', 'compare', 'debug', 'dev', 'devtools', 'docs', 'e2e', 'es5', 'esm', 'headless', 'help', 'log', 'open', 'prerender', 'prerenderExternal', 'prod', 'profile', 'serviceWorker', 'screenshot', 'serve', 'skipNodeCheck', 'spec', 'ssr', 'stats', 'updateScreenshot', 'verbose', 'version', 'watch', 'all', 'automock', 'bail', 'changedFilesWithAncestor', 'clearCache', 'clearMocks', 'collectCoverage', 'color', 'colors', 'coverage', 'detectLeaks', 'detectOpenHandles', 'errorOnDeprecated', 'expand', 'findRelatedTests', 'forceExit', 'init', 'injectGlobals', 'json', 'lastCommit', 'listTests', 'logHeapUsage', 'noStackTrace', 'notify', 'onlyChanged', 'onlyFailures', 'passWithNoTests', 'resetMocks', 'resetModules', 'restoreMocks', 'runInBand', 'runTestsByPath', 'showConfig', 'silent', 'skipFilter', 'testLocationInResults', 'updateSnapshot', 'useStderr', 'watchAll', 'watchman'][number] ]:? boolean | null}
  - Dropped {[ key in ['address', 'config', 'docsApi', 'docsJson', 'emulate', 'root', 'screenshotConnector', 'cacheDirectory', 'changedSince', 'collectCoverageFrom', 'coverageDirectory', 'coverageThreshold', 'env', 'filter', 'globalSetup', 'globalTeardown', 'globals', 'haste', 'moduleNameMapper', 'notifyMode', 'outputFile', 'preset', 'prettierPath', 'resolver', 'rootDir', 'runner', 'testEnvironment', 'testEnvironmentOptions', 'testFailureExitCode', 'testNamePattern', 'testResultsProcessor', 'testRunner', 'testSequencer', 'testURL', 'timers', 'transform', 'collectCoverageOnlyFrom', 'coveragePathIgnorePatterns', 'coverageReporters', 'moduleDirectories', 'moduleFileExtensions', 'modulePathIgnorePatterns', 'modulePaths', 'projects', 'reporters', 'roots', 'selectProjects', 'setupFiles', 'setupFilesAfterEnv', 'snapshotSerializers', 'testMatch', 'testPathIgnorePatterns', 'testPathPattern', 'testRegex', 'transformIgnorePatterns', 'unmockedModulePathPatterns', 'watchPathIgnorePatterns'][number] ]:? string | null}
  - Dropped {[ key in ['port', 'maxConcurrency', 'testTimeout'][number] ]:? number | null}
  - Dropped {[ key in ['maxWorkers'][number] ]:? string | number | null}
  - Dropped {[ key in ['logLevel'][number] ]:? @stencil/core.@stencil/core/internal/stencil-public-compiler.LogLevel | null} */ trait ConfigFlags extends StObject {
    
    var args: js.Array[String]
    
    var knownArgs: js.Array[String]
    
    var task: TaskCommand | Null
    
    var unknownArgs: js.Array[String]
  }
  object ConfigFlags {
    
    inline def apply(args: js.Array[String], knownArgs: js.Array[String], unknownArgs: js.Array[String]): ConfigFlags = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], knownArgs = knownArgs.asInstanceOf[js.Any], unknownArgs = unknownArgs.asInstanceOf[js.Any], task = null)
      __obj.asInstanceOf[ConfigFlags]
    }
    
    extension [Self <: ConfigFlags](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setKnownArgs(value: js.Array[String]): Self = StObject.set(x, "knownArgs", value.asInstanceOf[js.Any])
      
      inline def setKnownArgsVarargs(value: String*): Self = StObject.set(x, "knownArgs", js.Array(value*))
      
      inline def setTask(value: TaskCommand): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTaskNull: Self = StObject.set(x, "task", null)
      
      inline def setUnknownArgs(value: js.Array[String]): Self = StObject.set(x, "unknownArgs", value.asInstanceOf[js.Any])
      
      inline def setUnknownArgsVarargs(value: String*): Self = StObject.set(x, "unknownArgs", js.Array(value*))
    }
  }
  
  type KnownCLIArg = BooleanCLIArg | StringCLIArg | NumberCLIArg | StringNumberCLIArg | LogCLIArg
  
  type LogCLIArg = ArrayValuesAsUnion[js.Array[logLevel]]
  
  /**
    * Type containing the possible LogLevel configuration flags, to be included
    * in ConfigFlags, below
    */
  type LogLevelFlags = ObjectFromKeys[js.Array[logLevel], LogLevel]
  
  type NumberCLIArg = ArrayValuesAsUnion[js.Tuple3[port, maxConcurrency, testTimeout]]
  
  /**
    * Type containing the possible numeric configuration flags, to be included
    * in ConfigFlags, below
    */
  type NumberConfigFlags = ObjectFromKeys[js.Tuple3[port, maxConcurrency, testTimeout], Double]
  
  /**
    * Given two types `K` and `T` where `K` extends `ReadonlyArray<string>`,
    * construct a type which maps the strings in `K` as keys to values of type `T`.
    *
    * Because we use types derived this way to construct an interface (`ConfigFlags`)
    * for which we want optional keys, we make all the properties optional (w/ `'?'`)
    * and possibly null.
    */
  type ObjectFromKeys[K /* <: js.Array[String] */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K[number] ]:? T | null}
    */ typings.stencilCore.stencilCoreStrings.ObjectFromKeys & TopLevel[Any]
  
  type StringCLIArg = ArrayValuesAsUnion[js.Array[Any]]
  
  /**
    * Type containing the possible String configuration flags, to be included
    * in ConfigFlags, below
    */
  type StringConfigFlags = ObjectFromKeys[js.Array[Any], String]
  
  type StringNumberCLIArg = ArrayValuesAsUnion[js.Array[maxWorkers]]
  
  /**
    * Type containing the configuration flags which may be set to either string
    * or number values.
    */
  type StringNumberConfigFlags = ObjectFromKeys[js.Array[maxWorkers], String | Double]
}
