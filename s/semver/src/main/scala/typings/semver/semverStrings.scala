package typings.semver

import typings.semver.semverMod.Operator
import typings.semver.semverMod.ReleaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object semverStrings {
  @js.native
  sealed trait `!=` extends Operator
  
  @js.native
  sealed trait `!==` extends Operator
  
  @js.native
  sealed trait `2DOT0DOT0` extends js.Object
  
  @js.native
  sealed trait `<` extends Operator
  
  @js.native
  sealed trait `<=` extends Operator
  
  @js.native
  sealed trait `=` extends Operator
  
  @js.native
  sealed trait `==` extends Operator
  
  @js.native
  sealed trait `===` extends Operator
  
  @js.native
  sealed trait `>` extends Operator
  
  @js.native
  sealed trait `>=` extends Operator
  
  @js.native
  sealed trait Empty extends Operator
  
  @js.native
  sealed trait major extends ReleaseType
  
  @js.native
  sealed trait minor extends ReleaseType
  
  @js.native
  sealed trait patch extends ReleaseType
  
  @js.native
  sealed trait premajor extends ReleaseType
  
  @js.native
  sealed trait preminor extends ReleaseType
  
  @js.native
  sealed trait prepatch extends ReleaseType
  
  @js.native
  sealed trait prerelease extends ReleaseType
  
  @scala.inline
  def `!=`: `!=` = "!=".asInstanceOf[`!=`]
  @scala.inline
  def `!==`: `!==` = "!==".asInstanceOf[`!==`]
  @scala.inline
  def `2DOT0DOT0`: `2DOT0DOT0` = "2.0.0".asInstanceOf[`2DOT0DOT0`]
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `=`: `=` = "=".asInstanceOf[`=`]
  @scala.inline
  def `==`: `==` = "==".asInstanceOf[`==`]
  @scala.inline
  def `===`: `===` = "===".asInstanceOf[`===`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
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

