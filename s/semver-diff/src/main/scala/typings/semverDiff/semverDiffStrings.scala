package typings.semverDiff

import typings.semverDiff.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semverDiffStrings {
  
  @js.native
  sealed trait build extends Result
  @scala.inline
  def build: build = "build".asInstanceOf[build]
  
  @js.native
  sealed trait major extends Result
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  
  @js.native
  sealed trait minor extends Result
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @js.native
  sealed trait patch extends Result
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait premajor extends Result
  @scala.inline
  def premajor: premajor = "premajor".asInstanceOf[premajor]
  
  @js.native
  sealed trait preminor extends Result
  @scala.inline
  def preminor: preminor = "preminor".asInstanceOf[preminor]
  
  @js.native
  sealed trait prepatch extends Result
  @scala.inline
  def prepatch: prepatch = "prepatch".asInstanceOf[prepatch]
  
  @js.native
  sealed trait prerelease extends Result
  @scala.inline
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}
