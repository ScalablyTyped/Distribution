package typings.semverDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.semverDiff.semverDiffStrings.major
  - typings.semverDiff.semverDiffStrings.premajor
  - typings.semverDiff.semverDiffStrings.minor
  - typings.semverDiff.semverDiffStrings.preminor
  - typings.semverDiff.semverDiffStrings.patch
  - typings.semverDiff.semverDiffStrings.prepatch
  - typings.semverDiff.semverDiffStrings.prerelease
  - typings.semverDiff.semverDiffStrings.build
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def build: typings.semverDiff.semverDiffStrings.build = this.cast("build")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typings.semverDiff.semverDiffStrings.major = this.cast("major")
  @scala.inline
  def minor: typings.semverDiff.semverDiffStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typings.semverDiff.semverDiffStrings.patch = this.cast("patch")
  @scala.inline
  def premajor: typings.semverDiff.semverDiffStrings.premajor = this.cast("premajor")
  @scala.inline
  def preminor: typings.semverDiff.semverDiffStrings.preminor = this.cast("preminor")
  @scala.inline
  def prepatch: typings.semverDiff.semverDiffStrings.prepatch = this.cast("prepatch")
  @scala.inline
  def prerelease: typings.semverDiff.semverDiffStrings.prerelease = this.cast("prerelease")
}

