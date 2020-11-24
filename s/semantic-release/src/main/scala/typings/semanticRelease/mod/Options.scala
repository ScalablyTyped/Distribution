package typings.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * semantic-release options.
  *
  * Can be used to set any core option or plugin options.
  * Each option will take precedence over options configured in the
  * configuration file and shareable configurations.
  */
@js.native
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
  var branches: js.UndefOr[js.Array[BranchSpec] | BranchSpec] = js.native
  
  /**
    * Set to false to skip Continuous Integration environment verifications.
    * This allows for making releases from a local machine.
    */
  var ci: js.UndefOr[Boolean] = js.native
  
  /**
    * Dry-run mode, skip publishing, print next version and release notes.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  
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
  var `extends`: js.UndefOr[js.Array[String] | String] = js.native
  
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
  var plugins: js.UndefOr[js.Array[PluginSpec]] = js.native
  
  /**
    * The git repository URL.
    *
    * Any valid git url format is supported (see
    * [git protocols](https://git-scm.com/book/en/v2/Git-on-the-Server-The-Protocols))
    *
    * Default: `repository` property in `package.json`, or git origin url.
    */
  var repositoryUrl: js.UndefOr[String] = js.native
  
  /**
    * The git tag format used by **semantic-release** to identify
    * releases. The tag name is generated with [Lodash template](https://lodash.com/docs#template)
    * and will be compiled with the `version` variable.
    *
    * **Note**: The `tagFormat` must contain the `version` variable
    * exactly once and compile to a
    * [valid git reference](https://git-scm.com/docs/git-check-ref-format#_description).
    */
  var tagFormat: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranchesVarargs(value: BranchSpec*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: js.Array[BranchSpec] | BranchSpec): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    
    @scala.inline
    def setCi(value: Boolean): Self = this.set("ci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCi: Self = this.set("ci", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[String] | String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginSpec*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[PluginSpec]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryUrl: Self = this.set("repositoryUrl", js.undefined)
    
    @scala.inline
    def setTagFormat(value: String): Self = this.set("tagFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFormat: Self = this.set("tagFormat", js.undefined)
  }
}
