package typings.semver.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.semver.semverStrings.`===`
  - typings.semver.semverStrings.`!==`
  - typings.semver.semverStrings.Empty
  - typings.semver.semverStrings.`=`
  - typings.semver.semverStrings.`==`
  - typings.semver.semverStrings.`!=`
  - typings.semver.semverStrings.`>`
  - typings.semver.semverStrings.`>=`
  - typings.semver.semverStrings.`<`
  - typings.semver.semverStrings.`<=`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def `!=`: typings.semver.semverStrings.`!=` = this.cast("!=")
  @scala.inline
  def `!==`: typings.semver.semverStrings.`!==` = this.cast("!==")
  @scala.inline
  def `<`: typings.semver.semverStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typings.semver.semverStrings.`<=` = this.cast("<=")
  @scala.inline
  def `=`: typings.semver.semverStrings.`=` = this.cast("=")
  @scala.inline
  def `==`: typings.semver.semverStrings.`==` = this.cast("==")
  @scala.inline
  def `===`: typings.semver.semverStrings.`===` = this.cast("===")
  @scala.inline
  def `>`: typings.semver.semverStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typings.semver.semverStrings.`>=` = this.cast(">=")
  @scala.inline
  def Empty: typings.semver.semverStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

