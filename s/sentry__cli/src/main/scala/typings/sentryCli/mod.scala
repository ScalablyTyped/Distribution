package typings.sentryCli

import typings.sentryCli.anon.Projects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/cli", JSImport.Default)
  @js.native
  /**
    * Creates a new instance of SentryCli class
    *
    * @param configFile Path to Sentry CLI config properties, as described in https://docs.sentry.io/learn/cli/configuration/#properties-files.
    * By default, the config file is looked for upwards from the current path and defaults from ~/.sentryclirc are always loaded.
    * This value will update `SENTRY_PROPERTIES` env variable.
    * @param options {@link SentryCliOptions}
    */
  open class default ()
    extends StObject
       with SentryCli {
    def this(configFile: String) = this()
    def this(configFile: String, options: SentryCliOptions) = this()
    def this(configFile: Null, options: SentryCliOptions) = this()
    def this(configFile: Unit, options: SentryCliOptions) = this()
    
    /* CompleteClass */
    override def execute(args: js.Array[String], live: Boolean): js.Promise[String] = js.native
    
    /* CompleteClass */
    var releases: SentryCliReleases = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@sentry/cli", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[String]
    
    inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  }
  
  trait SentryCli extends StObject {
    
    var configFile: js.UndefOr[String] = js.undefined
    
    def execute(args: js.Array[String], live: Boolean): js.Promise[String]
    
    var options: js.UndefOr[SentryCliOptions] = js.undefined
    
    var releases: SentryCliReleases
  }
  object SentryCli {
    
    inline def apply(execute: (js.Array[String], Boolean) => js.Promise[String], releases: SentryCliReleases): SentryCli = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), releases = releases.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryCli]
    }
    
    extension [Self <: SentryCli](x: Self) {
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setExecute(value: (js.Array[String], Boolean) => js.Promise[String]): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setOptions(value: SentryCliOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setReleases(value: SentryCliReleases): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryCliCommitsOptions extends StObject {
    
    /**
      * Automatically choose the associated commit (uses the current commit). Overrides other setCommit options.
      */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current (last) commit in the release. Required if auto option is not true.
      */
    var commit: js.UndefOr[String] = js.undefined
    
    /**
      * When the flag is set, command will not fail and just exit silently if no new commits for a given release have been found.
      */
    var ignoreEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the flag is set and the previous release commit was not found in the repository, will create a release
      * with the default commits count(or the one specified with `--initial-depth`) instead of failing the command.
      */
    var ignoreMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The commit before the beginning of this release (in other words, the last commit of the previous release).
      * If omitted, this will default to the last commit of the previous release in Sentry.
      * If there was no previous release, the last 10 commits will be used.
      */
    var previousCommit: js.UndefOr[String] = js.undefined
    
    /**
      * The full repo name as defined in Sentry. Required if auto option is not true.
      */
    var repo: js.UndefOr[String] = js.undefined
  }
  object SentryCliCommitsOptions {
    
    inline def apply(): SentryCliCommitsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryCliCommitsOptions]
    }
    
    extension [Self <: SentryCliCommitsOptions](x: Self) {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
      
      inline def setIgnoreMissing(value: Boolean): Self = StObject.set(x, "ignoreMissing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingUndefined: Self = StObject.set(x, "ignoreMissing", js.undefined)
      
      inline def setPreviousCommit(value: String): Self = StObject.set(x, "previousCommit", value.asInstanceOf[js.Any])
      
      inline def setPreviousCommitUndefined: Self = StObject.set(x, "previousCommit", js.undefined)
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    }
  }
  
  trait SentryCliNewDeployOptions extends StObject {
    
    /**
      * Environment for this release. Values that make sense here would be `production` or `staging`.
      */
    var env: String
    
    /**
      * Deployment finish time in Unix timestamp (in seconds) or ISO 8601 format.
      */
    var finished: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Human readable name for the deployment.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Deployment start time in Unix timestamp (in seconds) or ISO 8601 format.
      */
    var started: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Deployment duration (in seconds). Can be used instead of started and finished.
      */
    var time: js.UndefOr[Double] = js.undefined
    
    /**
      * URL that points to the deployment.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object SentryCliNewDeployOptions {
    
    inline def apply(env: String): SentryCliNewDeployOptions = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryCliNewDeployOptions]
    }
    
    extension [Self <: SentryCliNewDeployOptions](x: Self) {
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: Double | String): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStarted(value: Double | String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait SentryCliOptions extends StObject {
    
    /**
      * Authentication token for API, interchangeable with `authToken`.
      * This value will update `SENTRY_API_KEY` env variable.
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * Authentication token for API, interchangeable with `apiKey`.
      * This value will update `SENTRY_AUTH_TOKEN` env variable.
      */
    var authToken: js.UndefOr[String] = js.undefined
    
    /**
      * A header added to every outgoing network request.
      * This value will update `CUSTOM_HEADER` env variable.
      */
    var customHeader: js.UndefOr[String] = js.undefined
    
    /**
      * Sentry DSN.
      * This value will update `SENTRY_DSN` env variable.
      */
    var dsn: js.UndefOr[String] = js.undefined
    
    /**
      * Organization slug.
      * This value will update `SENTRY_ORG` env variable.
      */
    @JSName("org")
    var org_ : js.UndefOr[String] = js.undefined
    
    /**
      * Project Project slug.
      * This value will update `SENTRY_PROJECT` env variable.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * If true, all logs are suppressed.
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL of the Sentry instance you are connecting to. Defaults to https://sentry.io/.
      * This value will update `SENTRY_URL env variable.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Version control system remote name.
      * This value will update `SENTRY_VCS_REMOTE` env variable.
      */
    var vcsRemote: js.UndefOr[String] = js.undefined
  }
  object SentryCliOptions {
    
    inline def apply(): SentryCliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryCliOptions]
    }
    
    extension [Self <: SentryCliOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setCustomHeader(value: String): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setDsn(value: String): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
      
      inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
      
      inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVcsRemote(value: String): Self = StObject.set(x, "vcsRemote", value.asInstanceOf[js.Any])
      
      inline def setVcsRemoteUndefined: Self = StObject.set(x, "vcsRemote", js.undefined)
    }
  }
  
  @js.native
  trait SentryCliReleases extends StObject {
    
    def execute(args: js.Array[String], live: Boolean): js.Promise[String] = js.native
    
    def finalize(release: String): js.Promise[String] = js.native
    
    def listDeploys(release: String): js.Promise[String] = js.native
    
    def `new`(release: String): js.Promise[String] = js.native
    def `new`(release: String, options: js.Array[String]): js.Promise[String] = js.native
    def `new`(release: String, options: Projects): js.Promise[String] = js.native
    
    def newDeploy(release: String, options: SentryCliNewDeployOptions): js.Promise[String] = js.native
    
    def proposeVersion(): js.Promise[String] = js.native
    
    def setCommits(release: String, options: SentryCliCommitsOptions): js.Promise[String] = js.native
    
    def uploadSourceMaps(release: String, options: SentryCliUploadSourceMapsOptions): js.Promise[String] = js.native
  }
  
  trait SentryCliUploadSourceMapsOptions extends StObject {
    
    /**
      * Unique identifier for the distribution, used to further segment your release.
      * Usually your build number.
      */
    var dist: js.UndefOr[String] = js.undefined
    
    /**
      * This sets the file extensions to be considered.
      * By default the following file extensions are processed: js, map, jsbundle and bundle.
      */
    var ext: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * One or more paths to ignore during upload. Overrides entries in ignoreFile file.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to a file containing list of files/directories to ignore.
      * Can point to .gitignore or anything with same format.
      */
    var ignoreFile: js.UndefOr[String | Null] = js.undefined
    
    /**
      * One or more paths that Sentry CLI should scan recursively for sources.
      * It will upload all .map files and match associated .js files.
      */
    var include: js.Array[String | SourceMapsPathDescriptor]
    
    /**
      * Enables rewriting of matching sourcemaps so that indexed maps are flattened
      * and missing sources are inlined if possible. Defaults to `true`.
      */
    var rewrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This prevents the automatic detection of sourcemap references.
      */
    var sourceMapReference: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When paired with the rewrite option this will add ~ to the stripPrefix array.
      */
    var stripCommonPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When paired with the rewrite option this will remove a prefix from uploaded files.
      * For instance you can use this to remove a path that is build machine specific.
      */
    var stripPrefix: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * This sets an URL prefix at the beginning of all files.
      * This defaults to `~/` but you might want to set this to the full URL.
      * This is also useful if your files are stored in a sub folder. eg: url-prefix `~/static/js`.
      */
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * This sets an URL suffix at the end of all files.
      * Useful for appending query parameters.
      */
    var urlSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * This attempts sourcemap validation before upload when rewriting is not enabled.
      * It will spot a variety of issues with source maps and cancel the upload if any are found.
      * This is not enabled by default as this can cause false positives.
      */
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object SentryCliUploadSourceMapsOptions {
    
    inline def apply(include: js.Array[String | SourceMapsPathDescriptor]): SentryCliUploadSourceMapsOptions = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryCliUploadSourceMapsOptions]
    }
    
    extension [Self <: SentryCliUploadSourceMapsOptions](x: Self) {
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFile(value: String): Self = StObject.set(x, "ignoreFile", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFileNull: Self = StObject.set(x, "ignoreFile", null)
      
      inline def setIgnoreFileUndefined: Self = StObject.set(x, "ignoreFile", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: js.Array[String | SourceMapsPathDescriptor]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (String | SourceMapsPathDescriptor)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setSourceMapReference(value: Boolean): Self = StObject.set(x, "sourceMapReference", value.asInstanceOf[js.Any])
      
      inline def setSourceMapReferenceUndefined: Self = StObject.set(x, "sourceMapReference", js.undefined)
      
      inline def setStripCommonPrefix(value: Boolean): Self = StObject.set(x, "stripCommonPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripCommonPrefixUndefined: Self = StObject.set(x, "stripCommonPrefix", js.undefined)
      
      inline def setStripPrefix(value: js.Array[String]): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      inline def setStripPrefixVarargs(value: String*): Self = StObject.set(x, "stripPrefix", js.Array(value*))
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@sentry/cli.@sentry/cli.SentryCliUploadSourceMapsOptions, 'include'> & {  paths :std.Array<string>} */
  trait SourceMapsPathDescriptor extends StObject {
    
    var dist: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreFile: js.UndefOr[String | Null] = js.undefined
    
    var paths: js.Array[String]
    
    var rewrite: js.UndefOr[Boolean] = js.undefined
    
    var sourceMapReference: js.UndefOr[Boolean] = js.undefined
    
    var stripCommonPrefix: js.UndefOr[Boolean] = js.undefined
    
    var stripPrefix: js.UndefOr[js.Array[String]] = js.undefined
    
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    var urlSuffix: js.UndefOr[String] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object SourceMapsPathDescriptor {
    
    inline def apply(paths: js.Array[String]): SourceMapsPathDescriptor = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapsPathDescriptor]
    }
    
    extension [Self <: SourceMapsPathDescriptor](x: Self) {
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFile(value: String): Self = StObject.set(x, "ignoreFile", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFileNull: Self = StObject.set(x, "ignoreFile", null)
      
      inline def setIgnoreFileUndefined: Self = StObject.set(x, "ignoreFile", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setSourceMapReference(value: Boolean): Self = StObject.set(x, "sourceMapReference", value.asInstanceOf[js.Any])
      
      inline def setSourceMapReferenceUndefined: Self = StObject.set(x, "sourceMapReference", js.undefined)
      
      inline def setStripCommonPrefix(value: Boolean): Self = StObject.set(x, "stripCommonPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripCommonPrefixUndefined: Self = StObject.set(x, "stripCommonPrefix", js.undefined)
      
      inline def setStripPrefix(value: js.Array[String]): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      inline def setStripPrefixVarargs(value: String*): Self = StObject.set(x, "stripPrefix", js.Array(value*))
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
