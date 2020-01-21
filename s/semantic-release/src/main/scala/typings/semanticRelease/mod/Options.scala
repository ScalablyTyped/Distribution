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
  		 * The branch on which releases should happen.
  		 */
  var branch: js.UndefOr[String] = js.undefined
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
  		 * Specifies the list of plugins to use. Plugins will run in series, in
  		 * the order specified.
  		 *
  		 * If this option is not specified, then semantic-release will use a
  		 * default list of plugins.
  		 *
  		 * Configuration options for each plugin can be defined by wrapping the
  		 * name and an options object in an array.
  		 */
  var plugins: js.UndefOr[js.Array[PluginSpec]] = js.undefined
  /**
  		 * The Git repository URL, in any supported format.
  		 */
  var repositoryUrl: js.UndefOr[String] = js.undefined
  /**
  		 * The Git tag format used by semantic-release to identify releases.
  		 */
  var tagFormat: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /**
  		 * Any other options supported by plugins.
  		 */
  /* name */ StringDictionary[js.Any] = null,
    branch: String = null,
    ci: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[PluginSpec] = null,
    repositoryUrl: String = null,
    tagFormat: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (repositoryUrl != null) __obj.updateDynamic("repositoryUrl")(repositoryUrl.asInstanceOf[js.Any])
    if (tagFormat != null) __obj.updateDynamic("tagFormat")(tagFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

