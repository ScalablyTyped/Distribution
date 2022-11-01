package typings.sentryWebpackPlugin

import typings.sentryCli.mod.SentryCliCommitsOptions
import typings.sentryCli.mod.SentryCliNewDeployOptions
import typings.sentryCli.mod.SourceMapsPathDescriptor
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SentryCliPlugin {
    def this(options: SentryCliPluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    var options: SentryCliPluginOptions = js.native
  }
  @JSImport("@sentry/webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def cliBinaryExists(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cliBinaryExists")().asInstanceOf[String]
  
  trait SentryCliPlugin
    extends StObject
       with WebpackPluginInstance {
    
    var options: SentryCliPluginOptions
  }
  object SentryCliPlugin {
    
    inline def apply(apply: Compiler => Unit, options: SentryCliPluginOptions): SentryCliPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryCliPlugin]
    }
    
    extension [Self <: SentryCliPlugin](x: Self) {
      
      inline def setOptions(value: SentryCliPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<@sentry/cli.@sentry/cli.SentryCliOptions, 'url' | 'authToken' | 'org' | 'project' | 'vcsRemote' | 'dist' | 'silent' | 'customHeader'> */
  /* Inlined parent std.Pick<@sentry/cli.@sentry/cli.SentryCliUploadSourceMapsOptions, 'ignoreFile' | 'rewrite' | 'sourceMapReference' | 'stripPrefix' | 'stripCommonPrefix' | 'validate' | 'urlPrefix' | 'urlSuffix' | 'ext'> */
  trait SentryCliPluginOptions extends StObject {
    
    var authToken: js.UndefOr[String] = js.undefined
    
    /**
      * If true, will remove all previously uploaded artifacts from the configured release.
      */
    var cleanArtifacts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to Sentry CLI config properties, as described in https://docs.sentry.io/learn/cli/configuration/#properties-files.
      * By default, the config file is looked for upwards from the current path and defaults from ~/.sentryclirc are always loaded.
      */
    var configFile: js.UndefOr[String] = js.undefined
    
    var customHeader: js.UndefOr[String] = js.undefined
    
    /**
      * Print some useful debug information.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Creates a new release deployment
      */
    var deploy: js.UndefOr[SentryCliNewDeployOptions] = js.undefined
    
    var dist: js.UndefOr[Any] = js.undefined
    
    /**
      * Attempts a dry run (useful for dev environments).
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A filter for entry points that should be processed.
      * By default, the release will be injected into all entry points.
      */
    var entries: js.UndefOr[js.Array[String] | js.RegExp | (js.Function1[/* key */ String, Boolean])] = js.undefined
    
    /**
      * When a CLI error occurs, the plugin will call this function.
      *
      * By default, it will call `invokeErr()`, thereby stopping Webpack
      * compilation. To allow compilation to continue and log a warning instead,
      * set this to
      *   (err, invokeErr, compilation) => {
      *     compilation.warnings.push('Sentry CLI Plugin: ' + err.message)
      *   }
      *
      * Note: `compilation` is typed as `unknown` in order to preserve
      * compatibility with both Webpack 4 and Webpack 5 types, If you need the
      * correct type, in Webpack 4 use `compilation.Compilation` and in Webpack 5
      * use `Compilation`.
      */
    var errorHandler: js.UndefOr[
        js.Function3[/* err */ js.Error, /* invokeErr */ js.Function0[Unit], /* compilation */ Any, Unit]
      ] = js.undefined
    
    var ext: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Determines whether processed release should be automatically finalized after artifacts upload.
      * Defaults to `true`.
      */
    @JSName("finalize")
    var finalize_FSentryCliPluginOptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filepaths to ignore when scanning for sources and source maps
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignoreFile: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Filepaths to scan recursively for source and source map files
      */
    var include: String | SourceMapsPathDescriptor | (js.Array[String | SourceMapsPathDescriptor])
    
    @JSName("org")
    var org_ : js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Unique name of a release, must be a string, should uniquely identify your release,
      * defaults to sentry-cli releases propose-version command which should always return the correct version
      * (requires access to git CLI and root directory to be a valid repository).
      */
    var release: js.UndefOr[String] = js.undefined
    
    var rewrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether plugin should be applied not more than once during whole webpack run.
      * Useful when the process is performing multiple builds using the same config.
      * Defaults to `false`.
      */
    var runOnce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds commits to sentry
      */
    var setCommits: js.UndefOr[SentryCliCommitsOptions] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var sourceMapReference: js.UndefOr[Boolean] = js.undefined
    
    var stripCommonPrefix: js.UndefOr[Boolean] = js.undefined
    
    var stripPrefix: js.UndefOr[js.Array[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    var urlSuffix: js.UndefOr[String] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
    
    var vcsRemote: js.UndefOr[String] = js.undefined
  }
  object SentryCliPluginOptions {
    
    inline def apply(include: String | SourceMapsPathDescriptor | (js.Array[String | SourceMapsPathDescriptor])): SentryCliPluginOptions = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryCliPluginOptions]
    }
    
    extension [Self <: SentryCliPluginOptions](x: Self) {
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setCleanArtifacts(value: Boolean): Self = StObject.set(x, "cleanArtifacts", value.asInstanceOf[js.Any])
      
      inline def setCleanArtifactsUndefined: Self = StObject.set(x, "cleanArtifacts", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCustomHeader(value: String): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDeploy(value: SentryCliNewDeployOptions): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
      
      inline def setDeployUndefined: Self = StObject.set(x, "deploy", js.undefined)
      
      inline def setDist(value: Any): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setEntries(value: js.Array[String] | js.RegExp | (js.Function1[/* key */ String, Boolean])): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesFunction1(value: /* key */ String => Boolean): Self = StObject.set(x, "entries", js.Any.fromFunction1(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setErrorHandler(value: (/* err */ js.Error, /* invokeErr */ js.Function0[Unit], /* compilation */ Any) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setFinalize_(value: Boolean): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
      
      inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFile(value: String): Self = StObject.set(x, "ignoreFile", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFileNull: Self = StObject.set(x, "ignoreFile", null)
      
      inline def setIgnoreFileUndefined: Self = StObject.set(x, "ignoreFile", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: String | SourceMapsPathDescriptor | (js.Array[String | SourceMapsPathDescriptor])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (String | SourceMapsPathDescriptor)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setRunOnce(value: Boolean): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
      
      inline def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
      
      inline def setSetCommits(value: SentryCliCommitsOptions): Self = StObject.set(x, "setCommits", value.asInstanceOf[js.Any])
      
      inline def setSetCommitsUndefined: Self = StObject.set(x, "setCommits", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSourceMapReference(value: Boolean): Self = StObject.set(x, "sourceMapReference", value.asInstanceOf[js.Any])
      
      inline def setSourceMapReferenceUndefined: Self = StObject.set(x, "sourceMapReference", js.undefined)
      
      inline def setStripCommonPrefix(value: Boolean): Self = StObject.set(x, "stripCommonPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripCommonPrefixUndefined: Self = StObject.set(x, "stripCommonPrefix", js.undefined)
      
      inline def setStripPrefix(value: js.Array[String]): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      inline def setStripPrefixVarargs(value: String*): Self = StObject.set(x, "stripPrefix", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setVcsRemote(value: String): Self = StObject.set(x, "vcsRemote", value.asInstanceOf[js.Any])
      
      inline def setVcsRemoteUndefined: Self = StObject.set(x, "vcsRemote", js.undefined)
    }
  }
}
