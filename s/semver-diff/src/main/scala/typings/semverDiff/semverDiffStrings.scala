package typings.semverDiff

import typings.semverDiff.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object semverDiffStrings {
  @js.native
  sealed trait build extends Result
  
  @js.native
  sealed trait major extends Result
  
  @js.native
  sealed trait minor extends Result
  
  @js.native
  sealed trait patch extends Result
  
  @js.native
  sealed trait premajor extends Result
  
  @js.native
  sealed trait preminor extends Result
  
  @js.native
  sealed trait prepatch extends Result
  
  @js.native
  sealed trait prerelease extends Result
  
  @scala.inline
  def build: build = "build".asInstanceOf[build]
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def premajor: premajor = "premajor".asInstanceOf[premajor]
  @scala.inline
  def preminor: preminor = "preminor".asInstanceOf[preminor]
  @scala.inline
  def prepatch: prepatch = "prepatch".asInstanceOf[prepatch]
  @scala.inline
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}

