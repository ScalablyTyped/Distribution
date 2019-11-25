package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.semver.semverStrings.major
  - typings.semver.semverStrings.premajor
  - typings.semver.semverStrings.minor
  - typings.semver.semverStrings.preminor
  - typings.semver.semverStrings.patch
  - typings.semver.semverStrings.prepatch
  - typings.semver.semverStrings.prerelease
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typings.semver.semverStrings.major = this.cast("major")
  @scala.inline
  def minor: typings.semver.semverStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typings.semver.semverStrings.patch = this.cast("patch")
  @scala.inline
  def premajor: typings.semver.semverStrings.premajor = this.cast("premajor")
  @scala.inline
  def preminor: typings.semver.semverStrings.preminor = this.cast("preminor")
  @scala.inline
  def prepatch: typings.semver.semverStrings.prepatch = this.cast("prepatch")
  @scala.inline
  def prerelease: typings.semver.semverStrings.prerelease = this.cast("prerelease")
}

