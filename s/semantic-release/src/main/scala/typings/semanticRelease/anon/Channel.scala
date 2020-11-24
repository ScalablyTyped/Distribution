package typings.semanticRelease.anon

import typings.semanticRelease.semanticReleaseBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
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
  var channel: js.UndefOr[String | `false`] = js.native
  
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
  var name: String = js.native
  
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
  var prerelease: js.UndefOr[String | Boolean] = js.native
  
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
  var range: js.UndefOr[String] = js.native
}
object Channel {
  
  @scala.inline
  def apply(name: String): Channel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String | `false`): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setPrerelease(value: String | Boolean): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
