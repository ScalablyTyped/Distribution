package typings
package semverDashDiffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object semverDashDiffLibStrings {
  @js.native
  sealed trait build extends js.Object
  
  @js.native
  sealed trait major extends js.Object
  
  @js.native
  sealed trait minor extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
  
  @js.native
  sealed trait prerelease extends js.Object
  
  def build: build = "build".asInstanceOf[build]
  def major: major = "major".asInstanceOf[major]
  def minor: minor = "minor".asInstanceOf[minor]
  def patch: patch = "patch".asInstanceOf[patch]
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}

