package typings.semanticRelease.mod

import typings.semanticRelease.semanticReleaseStrings.major
import typings.semanticRelease.semanticReleaseStrings.minor
import typings.semanticRelease.semanticReleaseStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Details of a release published by a publish plugin.
	 */
trait Release extends js.Object {
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
    version: String,
    name: String = null,
    url: String = null
  ): Release = {
    val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
}

