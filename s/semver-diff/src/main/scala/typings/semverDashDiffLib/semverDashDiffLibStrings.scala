package typings
package semverDashDiffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object semverDashDiffLibStrings {
  @js.native
  sealed trait build
    extends semverDashDiffLib.semverDashDiffMod.Result
  
  @js.native
  sealed trait major
    extends semverDashDiffLib.semverDashDiffMod.Result
  
  @js.native
  sealed trait minor
    extends semverDashDiffLib.semverDashDiffMod.Result
  
  @js.native
  sealed trait patch
    extends semverDashDiffLib.semverDashDiffMod.Result
  
  @js.native
  sealed trait prerelease
    extends semverDashDiffLib.semverDashDiffMod.Result
  
  @scala.inline
  def build: build = "build".asInstanceOf[build]
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}

