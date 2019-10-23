package typings.semanticDashRelease.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * semantic-release options, after normalization and defaults have been
	 * applied.
	 */
trait GlobalConfig extends Options {
  /**
  		 * The branch on which releases should happen.
  		 */
  @JSName("branch")
  var branch_GlobalConfig: String
  /**
  		 * Specifies the list of plugins to use. Plugins will run in series, in
  		 * the order specified.
  		 *
  		 * If this option is not specified, then semantic-release will use a
  		 * default list of plugins.
  		 *
  		 * Configuration options for each plugin can be defined by wrapping the
  		 * name and an options object in an array.
  		 */
  @JSName("plugins")
  var plugins_GlobalConfig: js.Array[PluginSpec]
  /**
  		 * The Git repository URL, in any supported format.
  		 */
  @JSName("repositoryUrl")
  var repositoryUrl_GlobalConfig: String
  /**
  		 * The Git tag format used by semantic-release to identify releases.
  		 */
  @JSName("tagFormat")
  var tagFormat_GlobalConfig: String
}

object GlobalConfig {
  @scala.inline
  def apply(
    branch: String,
    plugins: js.Array[PluginSpec],
    repositoryUrl: String,
    tagFormat: String,
    ci: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(branch = branch, plugins = plugins, repositoryUrl = repositoryUrl, tagFormat = tagFormat)
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    __obj.asInstanceOf[GlobalConfig]
  }
}

