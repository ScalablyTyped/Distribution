package typings.semanticRelease

import org.scalablytyped.runtime.StringDictionary
import typings.node.processMod.global.NodeJS.WriteStream
import typings.semanticRelease.anon.Await
import typings.semanticRelease.anon.Email
import typings.semanticRelease.anon.Long
import typings.semanticRelease.semanticReleaseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Run semantic-release and returns a Promise that resolves to a Result
    * object.
    * @async
    */
  inline def apply(options: Options): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(options: Options, environment: Config): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("semantic-release", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BranchObject extends StObject {
    
    /**
      * The distribution channel on which to publish releases from this
      * branch.
      *
      * If this field is set to `false`, then the branch will be released
      * on the default distribution channel (for example the `@latest`
      * [dist-tag](https://docs.npmjs.com/cli/dist-tag) for npm). This is
      * also the default behavior for the first
      * [release branch](https://semantic-release.gitbook.io/semantic-release/usage/workflow-configuration#release-branches)
      * if the channel property is not set.
      *
      * For all other branches, if the channel property is not set, then the
      * channel name will be the same as the branch name.
      *
      * The value of `channel`, if defined as a string, is generated with
      * [Lodash template](https://lodash.com/docs#template) with the
      * variable `name` set to the branch name.
      *
      * For example `{name: 'next', channel: 'channel-${name}'}` will be
      * expanded to `{name: 'next', channel: 'channel-next'}`.
      */
    var channel: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * The name of git branch.
      *
      * A `name` is required for all types of branch. It can be defined as a
      * [glob](https://github.com/micromatch/micromatch#matching-features)
      * in which case the definition will be expanded to one per matching
      * branch existing in the repository.
      *
      * If `name` doesn't match any branch existing in the repository, the
      * definition will be ignored. For example, the default configuration
      * includes the definition `next` and `next-major` which will become
      * active only  when the branches `next` and/or `next-major` are
      * created in the repository.
      */
    var name: String
    
    /**
      * The pre-release identifier to append to [semantic versions](https://semver.org/)
      * released from this branch.
      *
      * A `prerelease` property applies only to pre-release branches and
      * the `prerelease` value must be valid per the [Semantic Versioning
      * Specification](https://semver.org/#spec-item-9). It will determine
      * the name of versions. For example if `prerelease` is set to
      * `"beta"`, the version will be formatted like `2.0.0-beta.1`,
      * `2.0.0-beta.2`, etc.
      *
      * The value of `prerelease`, if defined as a string, is generated with
      * [Lodash template](https://lodash.com/docs#template) with the
      * variable `name` set to the name of the branch.
      *
      * If the `prerelease property is set to `true` then the name of the
      * branch is used as the pre-release identifier.
      *
      * Required for pre-release branches.
      */
    var prerelease: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The range of [semantic versions](https://semver.org/) to support on
      * this branch.
      *
      * A `range` only applies to maintenance branches and must be formatted
      * like `N.N.x` or `N.x` (`N` is a number). If no range is specified
      * but the `name` is formatted as a range, then the branch will be
      * considered a maintenance branch and the `name` value will be used
      * for the `range`.
      *
      * Required for maintenance branches, unless `name` is formatted like
      * `N.N.x` or `N.x` (`N` is a number).
      */
    var range: js.UndefOr[String] = js.undefined
  }
  object BranchObject {
    
    inline def apply(name: String): BranchObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BranchObject] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String | `false`): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrerelease(value: String | Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  /**
    * Specifies a git branch holding commits to analyze and code to release.
    *
    * Each branch may be defined either by a string or an object. Specifying
    * a string is a shortcut for specifying that string as the `name` field,
    * for example `"master"` expands to `{name: "master"}`.
    */
  type BranchSpec = String | BranchObject
  
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Email): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Long): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitter(value: Email): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
      
      inline def setCommitterDate(value: String): Self = StObject.set(x, "committerDate", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTree(value: Long): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
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
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    /**
      * Current branch being published.
      */
    var branch: BranchObject
    
    /**
      * Commits to analyze.
      */
    var commits: js.UndefOr[js.Array[Commit]] = js.undefined
    
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
    var logger: Await
    
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
    
    inline def apply(branch: BranchObject, env: StringDictionary[String], logger: Await): Context = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: BranchObject): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      inline def setCommitsUndefined: Self = StObject.set(x, "commits", js.undefined)
      
      inline def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value*))
      
      inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setLastRelease(value: LastRelease): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
      
      inline def setLastReleaseUndefined: Self = StObject.set(x, "lastRelease", js.undefined)
      
      inline def setLogger(value: Await): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setNextRelease(value: NextRelease): Self = StObject.set(x, "nextRelease", value.asInstanceOf[js.Any])
      
      inline def setNextReleaseUndefined: Self = StObject.set(x, "nextRelease", js.undefined)
      
      inline def setOptions(value: GlobalConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
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
    
    inline def apply(
      branches: js.Array[BranchSpec] | BranchSpec,
      plugins: js.Array[PluginSpec],
      repositoryUrl: String,
      tagFormat: String
    ): GlobalConfig = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tagFormat = tagFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalConfig] (val x: Self) extends AnyVal {
      
      inline def setBranches(value: js.Array[BranchSpec] | BranchSpec): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesVarargs(value: BranchSpec*): Self = StObject.set(x, "branches", js.Array(value*))
      
      inline def setPlugins(value: js.Array[PluginSpec]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: PluginSpec*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      inline def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
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
    
    inline def apply(gitHead: String, gitTag: String, version: String): LastRelease = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastRelease]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LastRelease] (val x: Self) extends AnyVal {
      
      inline def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      inline def setGitTag(value: String): Self = StObject.set(x, "gitTag", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoggerFunction extends StObject {
    
    def apply(message: Any*): Unit = js.native
  }
  
  trait NextRelease
    extends StObject
       with LastRelease {
    
    /**
      * The release channel of the release.
      */
    var channel: js.UndefOr[String] = js.undefined
    
    /**
      * The release name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The release notes of the next release.
      */
    var notes: String
    
    /**
      * The semver type of the release.
      */
    var `type`: ReleaseType
  }
  object NextRelease {
    
    inline def apply(gitHead: String, gitTag: String, notes: String, `type`: ReleaseType, version: String): NextRelease = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRelease]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextRelease] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setType(value: ReleaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  /* name */ StringDictionary[Any] {
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBranches(value: js.Array[BranchSpec] | BranchSpec): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setBranchesVarargs(value: BranchSpec*): Self = StObject.set(x, "branches", js.Array(value*))
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setExtends(value: js.Array[String] | String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setPlugins(value: js.Array[PluginSpec]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginSpec*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUrlUndefined: Self = StObject.set(x, "repositoryUrl", js.undefined)
      
      inline def setTagFormat(value: String): Self = StObject.set(x, "tagFormat", value.asInstanceOf[js.Any])
      
      inline def setTagFormatUndefined: Self = StObject.set(x, "tagFormat", js.undefined)
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
  type PluginSpec = String | (js.Tuple2[String, Any])
  
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
    var `type`: ReleaseType
    
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
    
    inline def apply(
      gitHead: String,
      gitTag: String,
      notes: String,
      pluginName: String,
      `type`: ReleaseType,
      version: String
    ): Release = {
      val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Release]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Release] (val x: Self) extends AnyVal {
      
      inline def setGitHead(value: String): Self = StObject.set(x, "gitHead", value.asInstanceOf[js.Any])
      
      inline def setGitTag(value: String): Self = StObject.set(x, "gitTag", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      inline def setType(value: ReleaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A semver release type.
    * See https://github.com/semantic-release/commit-analyzer/blob/master/lib/default-release-types.js
    */
  /* Rewritten from type alias, can be one of: 
    - typings.semanticRelease.semanticReleaseStrings.prerelease
    - typings.semanticRelease.semanticReleaseStrings.prepatch
    - typings.semanticRelease.semanticReleaseStrings.patch
    - typings.semanticRelease.semanticReleaseStrings.preminor
    - typings.semanticRelease.semanticReleaseStrings.minor
    - typings.semanticRelease.semanticReleaseStrings.premajor
    - typings.semanticRelease.semanticReleaseStrings.major
  */
  trait ReleaseType extends StObject
  object ReleaseType {
    
    inline def major: typings.semanticRelease.semanticReleaseStrings.major = "major".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.major]
    
    inline def minor: typings.semanticRelease.semanticReleaseStrings.minor = "minor".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.minor]
    
    inline def patch: typings.semanticRelease.semanticReleaseStrings.patch = "patch".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.patch]
    
    inline def premajor: typings.semanticRelease.semanticReleaseStrings.premajor = "premajor".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.premajor]
    
    inline def preminor: typings.semanticRelease.semanticReleaseStrings.preminor = "preminor".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.preminor]
    
    inline def prepatch: typings.semanticRelease.semanticReleaseStrings.prepatch = "prepatch".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.prepatch]
    
    inline def prerelease: typings.semanticRelease.semanticReleaseStrings.prerelease = "prerelease".asInstanceOf[typings.semanticRelease.semanticReleaseStrings.prerelease]
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
