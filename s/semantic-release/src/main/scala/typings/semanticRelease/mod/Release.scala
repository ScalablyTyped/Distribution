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
@js.native
trait Release extends js.Object {
  /**
    * The sha of the last commit being part of the release.
    */
  var gitHead: String = js.native
  /**
    * The Git tag associated with the release.
    */
  var gitTag: String = js.native
  /**
    * The release name, only if set by the corresponding publish plugin.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The release notes for the release.
    */
  var notes: String = js.native
  /**
    * The name of the plugin that published the release.
    */
  var pluginName: String = js.native
  /**
    * The semver type of the release.
    */
  var `type`: patch | minor | major = js.native
  /**
    * The release URL, only if set by the corresponding publish plugin.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The version of the release.
    */
  var version: String = js.native
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
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
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
    def setGitHead(value: String): Self = this.set("gitHead", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitTag(value: String): Self = this.set("gitTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginName(value: String): Self = this.set("pluginName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: patch | minor | major): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

