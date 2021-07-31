package typings.semanticRelease

import org.scalablytyped.runtime.StringDictionary
import typings.node.processMod.global.NodeJS.WriteStream
import typings.semanticRelease.anon.Channel
import typings.semanticRelease.anon.Email
import typings.semanticRelease.anon.Error
import typings.semanticRelease.anon.Long
import typings.semanticRelease.semanticReleaseStrings.major
import typings.semanticRelease.semanticReleaseStrings.minor
import typings.semanticRelease.semanticReleaseStrings.patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Run semantic-release and returns a Promise that resolves to a Result
    * object.
    * @async
    */
  @scala.inline
  def apply(options: Options): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  @scala.inline
  def apply(options: Options, environment: Config): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("semantic-release", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Specifies a git branch holding commits to analyze and code to release.
    *
    * Each branch may be defined either by a string or an object. Specifying
    * a string is a shortcut for specifying that string as the `name` field,
    * for example `"master"` expands to `{name: "master"}`.
    */
  type BranchSpec = String | Channel
  
  trait Commit extends StObject {
    
    /**
      * The commit author information.
      */
    var author: Email
    
    /**
      * The commit body.
      */
    var body: String
    
    /**
      * The commit abbreviated and full hash.
      */
    var commit: Long
    
    /**
      * The committer information.
      */
    var committer: Email
    
    /**
      * The committer date.
      */
    var committerDate: String
    
    /**
      * The commit hash.
      */
    var hash: String
    
    /**
      * The commit full message (subject and body).
      */
    var message: String
    
    /**
      * The commit subject.
      */
    var subject: String
    
    /**
      * The commit abbreviated and full tree hash.
      */
    var tree: Long
  }
  object Commit {
    
    @scala.inline
    def apply(
      author: Email,
      body: String,
      commit: Long,
      committer: Email,
      committerDate: String,
      hash: String,
      message: String,
      subject: String,
      tree: Long
    ): Commit = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], committerDate = committerDate.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    @scala.inline
    implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Email): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: Long): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitter(value: Email): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitterDate(value: String): Self = StObject.set(x, "committerDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTree(value: Long): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  /** semantic-release configuration specific for API usage. */
  trait Config extends StObject {
    
    /**
      * The current working directory to use. It should be configured to
      * the root of the Git repository to release from.
      *
      * It allows to run semantic-release from a specific path without
      * having to change the local process cwd with process.chdir().
      *
      * @default process.cwd
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * The environment variables to use.
      *
      * It allows to run semantic-release with specific environment
      * variables without having to modify the local process.env.
      *
      * @default process.env
      */
    var env: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The writable stream used to log errors.
      *
      * It allows to configure semantic-release to write errors to a
      * specific stream rather than the local process.stderr.
      *
      * @default process.stderr
      */
    var stderr: js.UndefOr[WriteStream] = js.undefined
    
    /**
      * The writable stream used to log information.
      *
      * It allows to configure semantic-release to write logs to a specific
      * stream rather than the local process.stdout.
      *
      * @default process.stdout
      */
    var stdout: js.UndefOr[WriteStream] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    /**
      * Environment variables.
      */
    var env: StringDictionary[String]
    
    /**
      * The previous release details.
      */
    var lastRelease: js.UndefOr[LastRelease] = js.undefined
    
    /**
      * The shared logger instance of semantic release.
      */
    var logger: Error
    
    /**
      * The next release details.
      */
    var nextRelease: js.UndefOr[NextRelease] = js.undefined
    
    /**
      * The semantic release configuration itself.
      */
    var options: js.UndefOr[GlobalConfig] = js.undefined
  }
  object Context {
    
    @scala.inline
    def apply(env: StringDictionary[String], logger: Error): Context = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRelease(value: LastRelease): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastReleaseUndefined: Self = StObject.set(x, "lastRelease", js.undefined)
      
      @scala.inline
      def setLogger(value: Error): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRelease(value: NextRelease): Self = StObject.set(x, "nextRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextReleaseUndefined: Self = StObject.set(x, "nextRelease", js.undefined)
      
      @scala.inline
      def setOptions(value: GlobalConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /**
    * semantic-release options, after normalization and defaults have been
    * applied.
    */
  trait GlobalConfig
    extends StObject
       with Options {
    
    /**
      * The branches on which releases should happen. By default
      * **semantic-release** will release:
      *
      *  * regular releases to the default distribution channel from the
      *    branch `master`
      *  * regular releases to a distribution channel matching the branch
      *    name from any existing branch with a name matching a maintenance
      *    release range (`N.N.x` or `N.x.x` or `N.x` with `N` being a
      *    number)
      *  * regular releases to the `next` distribution channel from the
      *    branch `next` if it exists
      *  * regular releases to the `next-major` distribution channel from
      *    the branch `next-major` if it exists.
      *  * prereleases to the `beta` distribution channel from the branch
      *    `beta` if it exists
      *  * prereleases to the `alpha` distribution channel from the branch
      *    `alpha` if it exists
      *
      * **Note**: If your repository does not have a release branch, then
      * **semantic-release** will fail with an `ERELEASEBRANCHES` error
      * message. If you are using the default configuration, you can fix
      * this error by pushing a `master` branch.
      *
      * **Note**: Once **semantic-release** is configured, any user with the
      * permission to push commits on one of those branches will be able to
      * publish a release. It is recommended to protect those branches, for
      * example with [GitHub protected branches](https://help.github.com/articles/about-protected-branches).
      *
      * See [Workflow configuration](https://semantic-release.gitbook.io/semantic-release/usage/workflow-configuration#workflow-configuration)
      * for more details.
      */
    @JSName("branches")
    var branches_GlobalConfig: js.Array[BranchSpec] | BranchSpec
    
    /**
      * Define the list of plugins to use. Plugins will run in series, in
      * the order defined, for each [step](https://semantic-release.gitbook.io/semantic-release/#release-steps)
      * if they implement it.
      *
      * Plugins configuration can be defined by wrapping the name and an
      * options object in an array.
      *
      * See [Plugins configuration](https://semantic-release.gitbook.io/semantic-release/usage/plugins#plugins)
      * for more details.
      *
      * Default: `[
      *     "@semantic-release/commit-analyzer",
      *     "@semantic-release/release-notes-generator",
      *     "@semantic-release/npm",
      *     "@semantic-release/github"
      * ]`
      */
    @JSName("plugins")
    var plugins_GlobalConfig: js.Array[PluginSpec]
    
    /**
      * The git repository URL.
      *
      * Any valid git url format is supported (see
      * [git protocols](https://git-scm.com/book/en/v2/Git-on-the-Server-The-Protocols))
      *
      * Default: `repository` property in `package.json`, or git origin url.
      */
    @JSName("repositoryUrl")
    var repositoryUrl_GlobalConfig: String
    
    /**
      * The git tag format used by **semantic-release** to identify
      * releases. The tag name is generated with [Lodash template](https://lodash.com/docs#template)
      * and will be compiled with the `version` variable.
      *
      * **Note**: The `tagFormat` must contain the `version` variable
      * exactly once and compile to a
      * [valid git reference](https://git-scm.com/docs/git-check-ref-format#_description).
      */
    @JSName("tagFormat")
    var tagFormat_GlobalConfig: String
  }
  object GlobalConfig {
    
    @scala.inline
    def apply(
      branches: js.Array[BranchSpec] | BranchSpec,
      plugins: js.Array[PluginSpec],
      repositoryUrl: String,
      tagFormat: String
    ): GlobalConfig = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tagFormat = tagFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfig]
    }
    
    @scala.inline
    implicit class GlobalConfigMutableBuilder[Self <: GlobalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: js.Array[BranchSpec] | BranchSpec): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesVarargs(value: BranchSpec*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[PluginSpec]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: PluginSpec*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait LastRelease extends StObject {
    
    /**
      * The Git checksum of the last commit of the release.
      */
    var gitHead: String
    
    /**
      * The Git tag of the release.
      */
    var gitTag: String
    
    /**
      * The version name of the release.
      */
    var version: String
  }
  object LastRelease {
    
    @scala.inline
    def apply(gitHead: String, gitTag: String, version: String): LastRelease = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastRelease]
    }
    
    @scala.inline
    implicit class LastReleaseMutableBuilder[Self <: LastRelease] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitTag(value: String): Self = StObject.set(x, "gitTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NextRelease
    extends StObject
       with LastRelease {
    
    /**
      * The release notes of the next release.
      */
    var notes: String
    
    /**
      * The semver type of the release.
      */
    var `type`: patch | minor | major
  }
  object NextRelease {
    
    @scala.inline
    def apply(gitHead: String, gitTag: String, notes: String, `type`: patch | minor | major, version: String): NextRelease = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRelease]
    }
    
    @scala.inline
    implicit class NextReleaseMutableBuilder[Self <: NextRelease] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: patch | minor | major): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * semantic-release options.
    *
    * Can be used to set any core option or plugin options.
    * Each option will take precedence over options configured in the
    * configuration file and shareable configurations.
    */
  trait Options
    extends StObject
       with /**
    * Any other options supported by plugins.
    */
  /* name */ StringDictionary[js.Any] {
    
    /**
      * The branches on which releases should happen. By default
      * **semantic-release** will release:
      *
      *  * regular releases to the default distribution channel from the
      *    branch `master`
      *  * regular releases to a distribution channel matching the branch
      *    name from any existing branch with a name matching a maintenance
      *    release range (`N.N.x` or `N.x.x` or `N.x` with `N` being a
      *    number)
      *  * regular releases to the `next` distribution channel from the
      *    branch `next` if it exists
      *  * regular releases to the `next-major` distribution channel from
      *    the branch `next-major` if it exists.
      *  * prereleases to the `beta` distribution channel from the branch
      *    `beta` if it exists
      *  * prereleases to the `alpha` distribution channel from the branch
      *    `alpha` if it exists
      *
      * **Note**: If your repository does not have a release branch, then
      * **semantic-release** will fail with an `ERELEASEBRANCHES` error
      * message. If you are using the default configuration, you can fix
      * this error by pushing a `master` branch.
      *
      * **Note**: Once **semantic-release** is configured, any user with the
      * permission to push commits on one of those branches will be able to
      * publish a release. It is recommended to protect those branches, for
      * example with [GitHub protected branches](https://help.github.com/articles/about-protected-branches).
      *
      * See [Workflow configuration](https://semantic-release.gitbook.io/semantic-release/usage/workflow-configuration#workflow-configuration)
      * for more details.
      */
    var branches: js.UndefOr[js.Array[BranchSpec] | BranchSpec] = js.undefined
    
    /**
      * Set to false to skip Continuous Integration environment verifications.
      * This allows for making releases from a local machine.
      */
    var ci: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dry-run mode, skip publishing, print next version and release notes.
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of modules or file paths containing a
      * [shareable configuration](https://semantic-release.gitbook.io/semantic-release/usage/shareable-configurations).
      * If multiple shareable configurations are set, they will be imported
      * in the order defined with each configuration option taking
      * precedence over the options defined in a previous shareable
      * configuration.
      *
      * **Note**: Options defined via CLI arguments or in the configuration
      * file will take precedence over the ones defined in any shareable
      * configuration.
      */
    var `extends`: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Define the list of plugins to use. Plugins will run in series, in
      * the order defined, for each [step](https://semantic-release.gitbook.io/semantic-release/#release-steps)
      * if they implement it.
      *
      * Plugins configuration can be defined by wrapping the name and an
      * options object in an array.
      *
      * See [Plugins configuration](https://semantic-release.gitbook.io/semantic-release/usage/plugins#plugins)
      * for more details.
      *
      * Default: `[
      *     "@semantic-release/commit-analyzer",
      *     "@semantic-release/release-notes-generator",
      *     "@semantic-release/npm",
      *     "@semantic-release/github"
      * ]`
      */
    var plugins: js.UndefOr[js.Array[PluginSpec]] = js.undefined
    
    /**
      * The git repository URL.
      *
      * Any valid git url format is supported (see
      * [git protocols](https://git-scm.com/book/en/v2/Git-on-the-Server-The-Protocols))
      *
      * Default: `repository` property in `package.json`, or git origin url.
      */
    var repositoryUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The git tag format used by **semantic-release** to identify
      * releases. The tag name is generated with [Lodash template](https://lodash.com/docs#template)
      * and will be compiled with the `version` variable.
      *
      * **Note**: The `tagFormat` must contain the `version` variable
      * exactly once and compile to a
      * [valid git reference](https://git-scm.com/docs/git-check-ref-format#_description).
      */
    var tagFormat: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: js.Array[BranchSpec] | BranchSpec): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setBranchesVarargs(value: BranchSpec*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      @scala.inline
      def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setExtends(value: js.Array[String] | String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[PluginSpec]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: PluginSpec*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUrlUndefined: Self = StObject.set(x, "repositoryUrl", js.undefined)
      
      @scala.inline
      def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFormatUndefined: Self = StObject.set(x, "tagFormat", js.undefined)
    }
  }
  
  /**
    * Specifies a plugin to use.
    *
    * The plugin is specified by its module name.
    *
    * To pass options to a plugin, specify an array containing the plugin module
    * name and an options object.
    */
  type PluginSpec = String | (js.Tuple2[String, js.Any])
  
  /**
    * Details of a release published by a publish plugin.
    */
  trait Release extends StObject {
    
    /**
      * The sha of the last commit being part of the release.
      */
    var gitHead: String
    
    /**
      * The Git tag associated with the release.
      */
    var gitTag: String
    
    /**
      * The release name, only if set by the corresponding publish plugin.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The release notes for the release.
      */
    var notes: String
    
    /**
      * The name of the plugin that published the release.
      */
    var pluginName: String
    
    /**
      * The semver type of the release.
      */
    var `type`: patch | minor | major
    
    /**
      * The release URL, only if set by the corresponding publish plugin.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the release.
      */
    var version: String
  }
  object Release {
    
    @scala.inline
    def apply(
      gitHead: String,
      gitTag: String,
      notes: String,
      pluginName: String,
      `type`: patch | minor | major,
      version: String
    ): Release = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Release]
    }
    
    @scala.inline
    implicit class ReleaseMutableBuilder[Self <: Release] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitTag(value: String): Self = StObject.set(x, "gitTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: patch | minor | major): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An object with details of the release if a release was published, or
    * false if no release was published.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.semanticRelease.semanticReleaseBooleans.`false`
    - typings.semanticRelease.anon.Commits
  */
  trait Result extends StObject
}
