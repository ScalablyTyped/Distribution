package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.stencilCore.anon.After
import typings.stencilCore.stencilCoreStrings.async
import typings.stencilCore.stencilCoreStrings.congestionAsync
import typings.stencilCore.stencilCoreStrings.immediate
import typings.stencilCore.stencilCoreStrings.prod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StencilConfig extends StObject {
  
  /**
    * By default, Stencil will attempt to optimize small scripts by inlining them in HTML. Setting
    * this flag to `false` will prevent this optimization and keep all scripts separate from HTML.
    */
  var allowInlineScripts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By setting `autoprefixCss` to `true`, Stencil will use the appropriate config to automatically
    * prefix css. For example, developers can write modern and standard css properties, such as
    * "transform", and Stencil will automatically add in the prefixed version, such as "-webkit-transform".
    * As of Stencil v2, autoprefixing CSS is no longer the default.
    * Defaults to `false`
    */
  var autoprefixCss: js.UndefOr[Boolean | Any] = js.undefined
  
  var buildDist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets if the ES5 build should be generated or not. Stencil generates a modern build without ES5,
    * whereas this setting to `true` will also create es5 builds for both dev and prod modes. Setting
    * `buildEs5` to `prod` will only build ES5 in prod mode. Basically if the app does not need to run
    * on legacy browsers (IE11 and Edge 18 and below), it's safe to not build ES5, which will also speed
    * up build times. Defaults to `false`.
    */
  var buildEs5: js.UndefOr[Boolean | prod] = js.undefined
  
  var buildLogFilePath: js.UndefOr[String] = js.undefined
  
  /**
    * By default, Stencil will statically analyze the application and generate a component graph of
    * how all the components are interconnected.
    *
    * From the component graph it is able to best decide how components should be grouped
    * depending on their usage with one another within the app.
    * By doing so it's able to bundle components together in order to reduce network requests.
    * However, bundles can be manually generated using the bundles config.
    *
    * The bundles config is an array of objects that represent how components are grouped together
    * in lazy-loaded bundles.
    * This config is rarely needed as Stencil handles this automatically behind the scenes.
    */
  var bundles: js.UndefOr[js.Array[ConfigBundle]] = js.undefined
  
  var cacheDir: js.UndefOr[String] = js.undefined
  
  /**
    * Passes custom configuration down to the "@rollup/plugin-commonjs" that Stencil uses under the hood.
    * For further information: https://stenciljs.com/docs/module-bundling
    */
  var commonjs: js.UndefOr[BundlingConfig] = js.undefined
  
  var devInspector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces Stencil to run in `dev` mode if the value is `true` and `production` mode
    * if it's `false`.
    *
    * Defaults to `false` (ie. production) unless the `--dev` flag is used in the CLI.
    */
  var devMode: js.UndefOr[Boolean] = js.undefined
  
  var devServer: js.UndefOr[StencilDevServerConfig] = js.undefined
  
  /**
    * Stencil will cache build results in order to speed up rebuilds.
    * To disable this feature, set enableCache to false.
    */
  var enableCache: js.UndefOr[Boolean] = js.undefined
  
  var enableCacheStats: js.UndefOr[Boolean] = js.undefined
  
  var entryComponentsHint: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Provide a object of key/values accessible within the app, using the `Env` object.
    */
  var env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var excludeUnusedDependencies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Config to add extra runtime for DOM features that require more polyfills. Note
    * that not all DOM APIs are fully polyfilled when using the slot polyfill. These
    * are opt-in since not all users will require the additional runtime.
    */
  var extras: js.UndefOr[ConfigExtras] = js.undefined
  
  var globalScript: js.UndefOr[String] = js.undefined
  
  /**
    * Stencil is traditionally used to compile many components into an app,
    * and each component comes with its own compartmentalized styles.
    * However, it's still common to have styles which should be "global" across all components and the website.
    * A global CSS file is often useful to set CSS Variables.
    *
    * Additionally, the globalStyle config can be used to precompile styles with Sass, PostCss, etc.
    * Below is an example folder structure containing a webapp's global sass file, named app.css.
    */
  var globalStyle: js.UndefOr[String] = js.undefined
  
  /**
    * During production builds, the content of each generated file is hashed to represent the content,
    * and the hashed value is used as the filename. If the content isn't updated between builds,
    * then it receives the same filename. When the content is updated, then the filename is different.
    *
    * By doing this, deployed apps can "forever-cache" the build directory and take full advantage of
    * content delivery networks (CDNs) and heavily caching files for faster apps.
    */
  var hashFileNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the hashFileNames config is set to true, and it is a production build,
    * the hashedFileNameLength config is used to determine how many characters the file name's hash should be.
    */
  var hashedFileNameLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The hydrated flag identifies if a component and all of its child components
    * have finished hydrating. This helps prevent any flash of unstyled content (FOUC)
    * as various components are asynchronously downloaded and rendered. By default it
    * will add the `hydrated` CSS class to the element. The `hydratedFlag` config can be used
    * to change the name of the CSS class, change it to an attribute, or change which
    * type of CSS properties and values are assigned before and after hydrating. This config
    * can also be used to not include the hydrated flag at all by setting it to `null`.
    */
  var hydratedFlag: js.UndefOr[HydratedFlag] = js.undefined
  
  /**
    * Ionic prefers to hide all components prior to hydration with a style tag appended
    * to the head of the document containing some `visibility: hidden;` css rules.
    *
    * Disabling this will remove the style tag that sets `visibility: hidden;` on all
    * unhydrated web components. This more closely follows the HTML spec, and allows
    * you to set your own fallback content.
    *
    */
  var invisiblePrehydration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Object to provide a custom logger. By default a `logger` is already provided for the
    * platform the compiler is running on, such as NodeJS or a browser.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  var maxConcurrentWorkers: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets if the CSS is minified or not.
    * Defaults to `false` in dev mode and `true` in production mode.
    */
  var minifyCss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets if the JS browser files are minified or not. Stencil uses `terser` under the hood.
    * Defaults to `false` in dev mode and `true` in production mode.
    */
  var minifyJs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The namespace config is a string representing a namespace for the app.
    * For apps that are not meant to be a library of reusable components,
    * the default of App is just fine. However, if the app is meant to be consumed
    * as a third-party library, such as Ionic, a unique namespace is required.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * Passes custom configuration down to the "@rollup/plugin-node-resolve" that Stencil uses under the hood.
    * For further information: https://stenciljs.com/docs/module-bundling
    */
  var nodeResolve: js.UndefOr[NodeResolveConfig] = js.undefined
  
  /**
    * Stencil is able to take an app's source and compile it to numerous targets,
    * such as an app to be deployed on an http server, or as a third-party library
    * to be distributed on npm. By default, Stencil apps have an output target type of www.
    *
    * The outputTargets config is an array of objects, with types of www and dist.
    */
  var outputTargets: js.UndefOr[js.Array[OutputTarget]] = js.undefined
  
  /**
    * The plugins config can be used to add your own rollup plugins.
    * By default, Stencil does not come with Sass or PostCss support.
    * However, either can be added using the plugin array.
    */
  var plugins: js.UndefOr[js.Array[Any]] = js.undefined
  
  var preamble: js.UndefOr[String] = js.undefined
  
  /**
    * Passes custom configuration down to rollup itself, not all rollup options can be overridden.
    */
  var rollupConfig: js.UndefOr[RollupConfig] = js.undefined
  
  var rollupPlugins: js.UndefOr[After] = js.undefined
  
  /**
    * Generate js source map files for all bundles
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The srcDir config specifies the directory which should contain the source typescript files
    * for each component. The standard for Stencil apps is to use src, which is the default.
    */
  var srcDir: js.UndefOr[String] = js.undefined
  
  var srcIndexHtml: js.UndefOr[String] = js.undefined
  
  var stencilCoreResolvedId: js.UndefOr[String] = js.undefined
  
  var sys: js.UndefOr[CompilerSystem] = js.undefined
  
  /**
    * Sets the task queue used by stencil's runtime. The task queue schedules DOM read and writes
    * across the frames to efficiently render and reduce layout thrashing. By default,
    * `async` is used. It's recommended to also try each setting to decide which works
    * best for your use-case. In all cases, if your app has many CPU intensive tasks causing the
    * main thread to periodically lock-up, it's always recommended to try
    * [Web Workers](https://stenciljs.com/docs/web-workers) for those tasks.
    *
    * - `async`: DOM read and writes are scheduled in the next frame to prevent layout thrashing.
    *   During intensive CPU tasks it will not reschedule rendering to happen in the next frame.
    *   `async` is ideal for most apps, and if the app has many intensive tasks causing the main
    *   thread to lock-up, it's recommended to try [Web Workers](https://stenciljs.com/docs/web-workers)
    *   rather than the congestion async queue.
    *
    * - `congestionAsync`: DOM reads and writes are scheduled in the next frame to prevent layout
    *   thrashing. When the app is heavily tasked and the queue becomes congested it will then
    *   split the work across multiple frames to prevent blocking the main thread. However, it can
    *   also introduce unnecessary reflows in some cases, especially during startup. `congestionAsync`
    *   is ideal for apps running animations while also simultaneously executing intensive tasks
    *   which may lock-up the main thread.
    *
    * - `immediate`: Makes writeTask() and readTask() callbacks to be executed synchronously. Tasks
    *   are not scheduled to run in the next frame, but do note there is at least one microtask.
    *   The `immediate` setting is ideal for apps that do not provide long running and smooth
    *   animations. Like the async setting, if the app has intensive tasks causing the main thread
    *   to lock-up, it's recommended to try [Web Workers](https://stenciljs.com/docs/web-workers).
    */
  var taskQueue: js.UndefOr[async | immediate | congestionAsync] = js.undefined
  
  var testing: js.UndefOr[TestingConfig] = js.undefined
  
  var tsconfig: js.UndefOr[String] = js.undefined
  
  var validateTypes: js.UndefOr[Boolean] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of RegExp patterns that are matched against all source files before adding
    * to the watch list in watch mode. If the file path matches any of the patterns, when it
    * is updated, it will not trigger a re-run of tests.
    */
  var watchIgnoredRegex: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
}
object StencilConfig {
  
  inline def apply(): StencilConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StencilConfig]
  }
  
  extension [Self <: StencilConfig](x: Self) {
    
    inline def setAllowInlineScripts(value: Boolean): Self = StObject.set(x, "allowInlineScripts", value.asInstanceOf[js.Any])
    
    inline def setAllowInlineScriptsUndefined: Self = StObject.set(x, "allowInlineScripts", js.undefined)
    
    inline def setAutoprefixCss(value: Boolean | Any): Self = StObject.set(x, "autoprefixCss", value.asInstanceOf[js.Any])
    
    inline def setAutoprefixCssUndefined: Self = StObject.set(x, "autoprefixCss", js.undefined)
    
    inline def setBuildDist(value: Boolean): Self = StObject.set(x, "buildDist", value.asInstanceOf[js.Any])
    
    inline def setBuildDistUndefined: Self = StObject.set(x, "buildDist", js.undefined)
    
    inline def setBuildEs5(value: Boolean | prod): Self = StObject.set(x, "buildEs5", value.asInstanceOf[js.Any])
    
    inline def setBuildEs5Undefined: Self = StObject.set(x, "buildEs5", js.undefined)
    
    inline def setBuildLogFilePath(value: String): Self = StObject.set(x, "buildLogFilePath", value.asInstanceOf[js.Any])
    
    inline def setBuildLogFilePathUndefined: Self = StObject.set(x, "buildLogFilePath", js.undefined)
    
    inline def setBundles(value: js.Array[ConfigBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: ConfigBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
    
    inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
    
    inline def setCommonjs(value: BundlingConfig): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    inline def setDevInspector(value: Boolean): Self = StObject.set(x, "devInspector", value.asInstanceOf[js.Any])
    
    inline def setDevInspectorUndefined: Self = StObject.set(x, "devInspector", js.undefined)
    
    inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
    
    inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
    
    inline def setDevServer(value: StencilDevServerConfig): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
    
    inline def setEnableCacheStats(value: Boolean): Self = StObject.set(x, "enableCacheStats", value.asInstanceOf[js.Any])
    
    inline def setEnableCacheStatsUndefined: Self = StObject.set(x, "enableCacheStats", js.undefined)
    
    inline def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
    
    inline def setEntryComponentsHint(value: js.Array[String]): Self = StObject.set(x, "entryComponentsHint", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsHintUndefined: Self = StObject.set(x, "entryComponentsHint", js.undefined)
    
    inline def setEntryComponentsHintVarargs(value: String*): Self = StObject.set(x, "entryComponentsHint", js.Array(value*))
    
    inline def setEnv(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExcludeUnusedDependencies(value: Boolean): Self = StObject.set(x, "excludeUnusedDependencies", value.asInstanceOf[js.Any])
    
    inline def setExcludeUnusedDependenciesUndefined: Self = StObject.set(x, "excludeUnusedDependencies", js.undefined)
    
    inline def setExtras(value: ConfigExtras): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setGlobalScript(value: String): Self = StObject.set(x, "globalScript", value.asInstanceOf[js.Any])
    
    inline def setGlobalScriptUndefined: Self = StObject.set(x, "globalScript", js.undefined)
    
    inline def setGlobalStyle(value: String): Self = StObject.set(x, "globalStyle", value.asInstanceOf[js.Any])
    
    inline def setGlobalStyleUndefined: Self = StObject.set(x, "globalStyle", js.undefined)
    
    inline def setHashFileNames(value: Boolean): Self = StObject.set(x, "hashFileNames", value.asInstanceOf[js.Any])
    
    inline def setHashFileNamesUndefined: Self = StObject.set(x, "hashFileNames", js.undefined)
    
    inline def setHashedFileNameLength(value: Double): Self = StObject.set(x, "hashedFileNameLength", value.asInstanceOf[js.Any])
    
    inline def setHashedFileNameLengthUndefined: Self = StObject.set(x, "hashedFileNameLength", js.undefined)
    
    inline def setHydratedFlag(value: HydratedFlag): Self = StObject.set(x, "hydratedFlag", value.asInstanceOf[js.Any])
    
    inline def setHydratedFlagUndefined: Self = StObject.set(x, "hydratedFlag", js.undefined)
    
    inline def setInvisiblePrehydration(value: Boolean): Self = StObject.set(x, "invisiblePrehydration", value.asInstanceOf[js.Any])
    
    inline def setInvisiblePrehydrationUndefined: Self = StObject.set(x, "invisiblePrehydration", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentWorkersUndefined: Self = StObject.set(x, "maxConcurrentWorkers", js.undefined)
    
    inline def setMinifyCss(value: Boolean): Self = StObject.set(x, "minifyCss", value.asInstanceOf[js.Any])
    
    inline def setMinifyCssUndefined: Self = StObject.set(x, "minifyCss", js.undefined)
    
    inline def setMinifyJs(value: Boolean): Self = StObject.set(x, "minifyJs", value.asInstanceOf[js.Any])
    
    inline def setMinifyJsUndefined: Self = StObject.set(x, "minifyJs", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNodeResolve(value: NodeResolveConfig): Self = StObject.set(x, "nodeResolve", value.asInstanceOf[js.Any])
    
    inline def setNodeResolveUndefined: Self = StObject.set(x, "nodeResolve", js.undefined)
    
    inline def setOutputTargets(value: js.Array[OutputTarget]): Self = StObject.set(x, "outputTargets", value.asInstanceOf[js.Any])
    
    inline def setOutputTargetsUndefined: Self = StObject.set(x, "outputTargets", js.undefined)
    
    inline def setOutputTargetsVarargs(value: OutputTarget*): Self = StObject.set(x, "outputTargets", js.Array(value*))
    
    inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreamble(value: String): Self = StObject.set(x, "preamble", value.asInstanceOf[js.Any])
    
    inline def setPreambleUndefined: Self = StObject.set(x, "preamble", js.undefined)
    
    inline def setRollupConfig(value: RollupConfig): Self = StObject.set(x, "rollupConfig", value.asInstanceOf[js.Any])
    
    inline def setRollupConfigUndefined: Self = StObject.set(x, "rollupConfig", js.undefined)
    
    inline def setRollupPlugins(value: After): Self = StObject.set(x, "rollupPlugins", value.asInstanceOf[js.Any])
    
    inline def setRollupPluginsUndefined: Self = StObject.set(x, "rollupPlugins", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSrcDir(value: String): Self = StObject.set(x, "srcDir", value.asInstanceOf[js.Any])
    
    inline def setSrcDirUndefined: Self = StObject.set(x, "srcDir", js.undefined)
    
    inline def setSrcIndexHtml(value: String): Self = StObject.set(x, "srcIndexHtml", value.asInstanceOf[js.Any])
    
    inline def setSrcIndexHtmlUndefined: Self = StObject.set(x, "srcIndexHtml", js.undefined)
    
    inline def setStencilCoreResolvedId(value: String): Self = StObject.set(x, "stencilCoreResolvedId", value.asInstanceOf[js.Any])
    
    inline def setStencilCoreResolvedIdUndefined: Self = StObject.set(x, "stencilCoreResolvedId", js.undefined)
    
    inline def setSys(value: CompilerSystem): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    inline def setSysUndefined: Self = StObject.set(x, "sys", js.undefined)
    
    inline def setTaskQueue(value: async | immediate | congestionAsync): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
    
    inline def setTaskQueueUndefined: Self = StObject.set(x, "taskQueue", js.undefined)
    
    inline def setTesting(value: TestingConfig): Self = StObject.set(x, "testing", value.asInstanceOf[js.Any])
    
    inline def setTestingUndefined: Self = StObject.set(x, "testing", js.undefined)
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    inline def setValidateTypes(value: Boolean): Self = StObject.set(x, "validateTypes", value.asInstanceOf[js.Any])
    
    inline def setValidateTypesUndefined: Self = StObject.set(x, "validateTypes", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchIgnoredRegex(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "watchIgnoredRegex", value.asInstanceOf[js.Any])
    
    inline def setWatchIgnoredRegexUndefined: Self = StObject.set(x, "watchIgnoredRegex", js.undefined)
    
    inline def setWatchIgnoredRegexVarargs(value: js.RegExp*): Self = StObject.set(x, "watchIgnoredRegex", js.Array(value*))
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
