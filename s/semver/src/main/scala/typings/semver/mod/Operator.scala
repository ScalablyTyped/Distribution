package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.semver.semverStrings.EqualssignEqualssignEqualssign
  - typings.semver.semverStrings.ExclamationmarkEqualssignEqualssign
  - typings.semver.semverStrings._empty
  - typings.semver.semverStrings.Equalssign
  - typings.semver.semverStrings.EqualssignEqualssign
  - typings.semver.semverStrings.ExclamationmarkEqualssign
  - typings.semver.semverStrings.Greaterthansign
  - typings.semver.semverStrings.GreaterthansignEqualssign
  - typings.semver.semverStrings.Lessthansign
  - typings.semver.semverStrings.LessthansignEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typings.semver.semverStrings.Equalssign = this.cast("=")
  @scala.inline
  def EqualssignEqualssign: typings.semver.semverStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def EqualssignEqualssignEqualssign: typings.semver.semverStrings.EqualssignEqualssignEqualssign = this.cast("===")
  @scala.inline
  def ExclamationmarkEqualssign: typings.semver.semverStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def ExclamationmarkEqualssignEqualssign: typings.semver.semverStrings.ExclamationmarkEqualssignEqualssign = this.cast("!==")
  @scala.inline
  def Greaterthansign: typings.semver.semverStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.semver.semverStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.semver.semverStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.semver.semverStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def _empty: typings.semver.semverStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

