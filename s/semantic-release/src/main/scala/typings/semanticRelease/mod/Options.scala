package typings.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * semantic-release options.
  *
  * Can be used to set any core option or plugin options.
  * Each option will take precedence over options configured in the
  * configuration file and shareable configurations.
  */
trait Options
  extends /**
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
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    branches: js.Array[BranchSpec] | BranchSpec = null,
    ci: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    `extends`: js.Array[String] | String = null,
    plugins: js.Array[PluginSpec] = null,
    repositoryUrl: String = null,
    tagFormat: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (repositoryUrl != null) __obj.updateDynamic("repositoryUrl")(repositoryUrl.asInstanceOf[js.Any])
    if (tagFormat != null) __obj.updateDynamic("tagFormat")(tagFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

