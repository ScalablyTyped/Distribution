package typings.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * semantic-release options, after normalization and defaults have been
  * applied.
  */
trait GlobalConfig extends Options {
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
    tagFormat: String,
    ci: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    `extends`: js.Array[String] | String = null
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tagFormat = tagFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

